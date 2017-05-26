package Com.Dzhi;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ClieRunnable implements Runnable {
	Socket soc = null;
	List<Socket> sockets;
	 Map<String,Socket> socketHashMap = new HashMap<String,Socket>();
	ClieRunnable(Socket soc,List<Socket> sockets,Map<String,Socket> socketHashMap){
		this.soc = soc;
		this.sockets = sockets;
		this.socketHashMap = socketHashMap;
	}
	
		
	public void run(){
			PrintWriter pw = null;
			Connection con = MyConnection.getInstance();
	        PreparedStatement rs  = null;
			while(true){
				String xiaoxi = null;
				try {
					pw = new PrintWriter(soc.getOutputStream());
					BufferedReader buf = new BufferedReader(new InputStreamReader(soc.getInputStream()));
					xiaoxi = buf.readLine();
				}catch (IOException e) {
					e.printStackTrace();
				} catch(Exception e){
					e.printStackTrace();
				}
				String name="";
				String fh = "";
				Set<String> keys = socketHashMap.keySet(); 
				for(String s:keys){
					Socket socket = socketHashMap.get(s);
					if(soc==socket){
						name=s;
						fh = name+":"+xiaoxi;
						try {
			       			rs  = con.prepareStatement("insert into msg (mesg) "+"values(?)");
			       			rs.setString(1,fh);
			       			rs.executeUpdate();
			       		} catch (SQLException e) {
			       			e.printStackTrace();
			       		}
					}
				}
	        	
				for(Socket socket1:sockets){
					if(socket1.isConnected()){
						try {
							pw = new PrintWriter(socket1.getOutputStream());
						} catch (IOException e) {
							e.printStackTrace();
						}
						pw.write(fh+"\n");
						pw.flush();
					}else{
						System.out.println("离线请留言");
					}
				}
				System.out.println("服务器返回消息--->"+fh);
				
			}
		}

}
