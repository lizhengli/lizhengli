package zuoye0503_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FuWuQi {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			System.out.println("----- ���������� -----");
			serverSocket = new ServerSocket(20000);
			//��ȡ�ͻ���
			List<Socket> list = new ArrayList();
 			while(true){
				System.out.println("���ڶ�ȡ�ͻ���...");
				socket = serverSocket.accept();
				list.add(socket);
				//��ȡ�ͻ���ip
	//			String ip = socket.getInetAddress().getHostAddress();
	//			System.out.println("��ȡ�ɹ�"+ip);
				
				new Thread(new FuRunnable(socket,list)).start();
				
//				while(true){
//					//BufferedReader   ������    //���ؿͻ��˴�������Ϣ
//					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//					String s = bufferedReader.readLine();
//					System.out.println("�ͻ��˴�������Ϣ=="+s);
//					
//					//��ͻ��˷�����Ϣ
//					PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
//					printWriter.write(s+"\n");
//					printWriter.flush();	
//				}
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{//�ر�
			if(serverSocket!=null){
				if(serverSocket.isClosed()){
					try {
						serverSocket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}
