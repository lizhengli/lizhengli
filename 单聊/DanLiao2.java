package Com.Dzhi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DanLiao2 {
	public static void main(String[] args){
		ServerSocket ses = null;
		Socket soc = null;
		List<Socket> list = new ArrayList<Socket>();
		Map<String,Socket> socketMap = new HashMap<String,Socket>();
		try {
			ses = new ServerSocket(10005);
			System.out.println("服务器启动");
			while(true){
				soc = ses.accept();
				BufferedReader bfr = new BufferedReader(new InputStreamReader(soc.getInputStream()));
				String name = bfr.readLine();
				socketMap.put(name,soc);
				list.add(soc);
				new Thread(new DanLiaoRunnable(soc,list,socketMap)).start();
				/*oin = new ObjectInputStream(soc.getInputStream());
				DuiXiang s = (DuiXiang)oin.readObject();
				System.out.println("客户端发来消息"+s);*/
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
