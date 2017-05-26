package Com.Dzhi;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;

public class InObJect implements Runnable {
	Socket socket = null;
	@Override
	public void run() {
		ObjectInputStream oi = null;
		Scanner sc = new Scanner(System.in);
		String fname;
		String xiaoxi;
		while(true){
			try {
				oi = new ObjectInputStream(socket.getInputStream());
				DuiXiang s = (DuiXiang) oi.readObject();
				fname = s.getToName();
				xiaoxi = s.getXiaoxi();
				System.out.println(fname+":"+xiaoxi);
			} catch (IOException | ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	public InObJect(Socket socket){
		this.socket = socket;
	}

}
