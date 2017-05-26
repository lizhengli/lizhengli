package Com.Dzhi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class InRunnable implements Runnable{
	Socket socket = null;
	public InRunnable(Socket socket){
		this.socket = socket;
	}
	public void run(){
		try {
			while(true){
				BufferedReader buf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String xiaoxi = buf.readLine();
				
				String s = "·þÎñÆ÷·µ»Ø"+xiaoxi;
				System.out.println(s);
			} 
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
