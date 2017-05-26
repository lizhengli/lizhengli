package lzhengl;

import java.io.*;

public class Main {
	public static void main(String[] args){
		File f = new File("f:/java/Test.txt");
		int len = 0;
		len = (int) (f.length()%3==0 ? f.length()/3:f.length()/3+1);
		MyFileThread3 m1 = new MyFileThread3(0,len);
		MyFileThread3 m2 = new MyFileThread3(len,len);
		MyFileThread3 m3 = new MyFileThread3(len*2,len*2);
		new Thread(m1).start();
		new Thread(m2).start();
		new Thread(m3).start();
		
		
	}
}
