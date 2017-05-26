package lzhengl;

import java.io.*;

public class DuQu2{
	
	public void duqu(int a,int b){
		File f = new  File("f:/java/test.txt");
		File f2 = new File("f:/java/liufan.txt");
		FileInputStream fi = null;
		FileOutputStream fo = null;
		try {
			fi = new FileInputStream(f);
			fo = new FileOutputStream(f2,true);
			byte[] by = new byte[1024];
			fi.read(by,a,b);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fi!=null){
				try {
					fi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fo!=null){
			}
		}
		
	}
	
}
