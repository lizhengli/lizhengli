package zuoye0503_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class OutRunnable implements Runnable{
	private Socket socket;
	public OutRunnable(Socket socket){
		this.socket=socket;
	}
	@Override
	public void run() {
		while(true){
			//���ط������ķ�����Ϣ
			BufferedReader bufferedReader;
			try {
				bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String s = bufferedReader.readLine();
				System.out.println("\n�ͻ��˷��ص���Ϣ=="+s);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
