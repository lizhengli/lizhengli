package lzhengl;

import java.io.*;

public class Read_Thread {
	public static int a,b,c;
	public static File f = new File("f:/javaDemo/test.txt");
	public static File f2  = new  File("f:/javaDemo/liufan.txt"); 
	public static void main(String[] args){
			int l = (int)f.length();
			System.out.println("文件长度为"+l+"字节");
			float d=0;
			d = (float)l/3;
			int a1=0;
			a1 = (int)d;
			int h = a1*3;
			int y = l-h;
			a=a1+y;
			b=a1;
			c=a1;
	}
}
