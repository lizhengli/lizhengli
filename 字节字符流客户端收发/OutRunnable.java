package Com.Dzhi;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class OutRunnable implements Runnable {
	Socket soc = null;
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = null;
		String xiaoxi = "";
		try {
			while(true){
				System.out.println("«Î ‰»Îœ˚œ¢");
				xiaoxi = sc.next();
				pw = new PrintWriter(soc.getOutputStream());
				pw.write(xiaoxi);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public OutRunnable(Socket soc){
		this.soc = soc;
	}

}
