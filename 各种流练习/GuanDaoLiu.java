package FileInout;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Send implements Runnable{//发送端
	private PipedOutputStream pos = null;
	public Send() {
			pos = new PipedOutputStream();
	}
	public PipedOutputStream getPos() {
		return pos;
	}
	public void run() {
		String s = "峰峰邀请班花去看村长家的猪";

		try {
			pos.write(s.getBytes());
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		try {
			pos.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
class Receive implements Runnable{//接受端
	private PipedInputStream pis = null;
	public Receive() {
		pis = new PipedInputStream();
	}
	public PipedInputStream getPis() {
		return pis;
	}
	public void run() {
		byte[] bys = new byte[1024];
		int len = 0;
		try {
			len = pis.read(bys);
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		try {
			pis.close();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		System.out.println("-->" + new String(bys,0,len));
	}
}
public class GuanDaoLiu {
	public static void main(String[] args) {
		Send send = new Send();
		Receive rec = new Receive();
		try {
			send.getPos().connect(rec.getPis());
		} catch (IOException e) {
			e.printStackTrace();
		}
		new Thread(send).start();
		new Thread(rec).start();
	}
}
