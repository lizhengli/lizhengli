package Com.Dzhi;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class OutObject implements Runnable {
	Socket soc = null;
	@Override
	public void run() {
		ObjectOutputStream os = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			System.out.println("请输入发送消息的人");
			String tname = sc.next();
			System.out.println("请输入发送的内容");
			String xiaoxi = sc.next();
			try {
				os = new ObjectOutputStream(soc.getOutputStream());
				os.writeObject(new DuiXiang(tname,xiaoxi));
				os.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public OutObject(Socket soc){
		this.soc = soc;
	}

}
