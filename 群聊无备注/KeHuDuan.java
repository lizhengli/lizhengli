package zuoye0503_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class KeHuDuan {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("192.168.199.119",20000);
			System.out.println("----- �ͻ��� -----");
			//����Ϣ
			new Thread(new InRunnable(socket)).start();
			//����Ϣ
			new Thread(new OutRunnable(socket)).start();
			
			
//			while(true){
//				//�������������Ϣ
//				String s2 = sc.next();
//				PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
//				printWriter.write(s2+"\n");
//				printWriter.flush();
//				
//				//���ط������ķ�����Ϣ
//				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//				String s = bufferedReader.readLine();
//				
//				System.out.println("�ͻ��˷��ص���Ϣ=="+s);
//			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(socket!=null){
				if(socket.isClosed()){
					try {
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

}
