package lzhengl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class MyFileThread3 implements Runnable{
	int a;
	int b;
	public MyFileThread3(int a,int b){
		this.a = a;
		this.b = b;
	}
	public void run(){
		File f = new File("f:/java/Test.txt");
		File f2 = new File("f:/java/lf.txt");
		try {
			RandomAccessFile rdf = new RandomAccessFile(f,"rw");
			RandomAccessFile rdf2 = new RandomAccessFile(f2,"rw");
			rdf.seek(a);
			rdf2.seek(b);
			byte[] bytes = new byte[1024];
			int len = 0,count = 0;
			while((len = rdf.read(bytes))!=-1){
				rdf2.write(bytes,0,len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
