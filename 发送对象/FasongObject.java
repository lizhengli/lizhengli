package Com.Dzhi;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FasongObject {
	
	public static void main(String[] args) throws Exception{
	ServerSocket ser = null;
	Socket soc = null;
	ObjectInputStream oin = null;
	ObjectOutputStream out = null;
	try{
		ser = new ServerSocket(20001);
		System.out.println("服务器启动");
		soc = ser.accept();
		oin = new ObjectInputStream(soc.getInputStream());
		DuiXiang s = (DuiXiang)oin.readObject();
		System.out.println("客户端发来消息"+s);
		out = new ObjectOutputStream(soc.getOutputStream());
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(oin!=null){
			oin.close();
		}
		if(out!=null){
			out.close();
		}
	}
	}
}
