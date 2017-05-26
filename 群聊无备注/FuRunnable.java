package zuoye0503_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class FuRunnable implements Runnable{
	private Socket socket;
	private List<Socket> l;
	public FuRunnable(Socket socket,List<Socket> l){
		this.socket = socket;
		this.l = l;
	}
	@Override
	public void run() {
		synchronized (socket) {
			while(true){
				//BufferedReader   ������    //���ؿͻ��˴�������Ϣ
				BufferedReader bufferedReader;
				try {
					bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String s = bufferedReader.readLine();
					System.out.println("�ͻ��˴�������Ϣ=="+s);
					
					//��ͻ��˷�����Ϣ
					for(Socket socket1:l){
						PrintWriter printWriter = new PrintWriter(socket1.getOutputStream());
						printWriter.write(socket1.getInetAddress().getHostAddress()+s+"\n");
						printWriter.flush();	
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
		
	}

}
