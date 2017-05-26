package Com.Dzhi;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ObjectClient {

	public static void main(String[] args) throws IOException {
		Socket soc = null;
		Scanner sc = new Scanner(System.in);
		OutputStream out = null;
		
		PrintWriter pw = null;
		try {
			
			soc = new Socket("192.168.199.154",10005);
			pw = new PrintWriter(soc.getOutputStream());
			pw.write("刘凡"+"\n");
			pw.flush();
			//发送消息
			new Thread(new OutObject(soc)).start();
			//接收消息
			new Thread(new InObJect(soc)).start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
