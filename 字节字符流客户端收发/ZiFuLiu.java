package Com.Dzhi;
import java.io.*;
import java.net.*;
import java.util.*;
public class ZiFuLiu {
	public static void main(String[] args) throws Exception{
		ServerSocket ses = null;
		Socket so = null;
		List<Socket> list = new ArrayList<Socket>();
		Map<String,Socket> socketMap = new HashMap<String,Socket>();
		try{
			ses = new ServerSocket(11000);
			System.out.println("·þÎñÆ÷Æô¶¯");
			while(true){
				try{
					so = ses.accept();
					BufferedReader bfr = new BufferedReader(new InputStreamReader(so.getInputStream()));
					String name = bfr.readLine();
					socketMap.put(name,so);
					list.add(so);
					new Thread(new ClieRunnable(so,list,socketMap)).start();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
