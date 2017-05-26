package Com.Dzhi;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DanLiaoRunnable implements Runnable{
	Socket soc = null;
	List<Socket> sockets;
	Map<String,Socket> socketHashMap = new HashMap<String,Socket>();
	public DanLiaoRunnable(Socket soc,List sockets,Map socketHashMap){
		this.soc = soc;
		this.sockets = sockets;
		this.socketHashMap = socketHashMap;
	}
	@Override
	public void run() {
		
		PrintWriter pw = null;
		String xiaoxi = null;
		String tname = null;
		String fname = null;
		while(true){
			try {
				ObjectOutputStream out = null;
				ObjectInputStream oin = null;
				oin = new ObjectInputStream(soc.getInputStream());
				DuiXiang s1 = (DuiXiang) oin.readObject();
				System.out.println(s1);
				xiaoxi = s1.getXiaoxi();
				tname = s1.getToName()+"\n";
				Set<String> keys = socketHashMap.keySet();
				Iterator iter = keys.iterator();
				for(String s:keys){
					Socket socket = socketHashMap.get(s);
					if(soc == socket){
						fname = s;
					}
				}
				while(iter.hasNext()){
					String key = (String) iter.next();
					System.out.println("消息正在发送");
					if(!soc.isClosed() && key.equals(tname)){
						out = new ObjectOutputStream(soc.getOutputStream());
						out.writeObject(new DuiXiang(fname,xiaoxi));
						out.flush();
					}
				}
			
				//oin.close();
				System.out.println(fname+"说："+xiaoxi);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
