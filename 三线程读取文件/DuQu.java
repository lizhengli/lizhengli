package lzhengl;

import java.io.*;

public class DuQu {
	
	public void du1(int a,int b){
		File f = new File("f:/javaDemo/test.txt");
		File f2  = new  File("f:/javaDemo/liufan.txt");
		 byte[] by = new byte[1024];
		 FileInputStream fi = null;
		 FileOutputStream fo = null;
		//if(number==1){
			try{
				fi = new FileInputStream(f);
				fi.read(by,a,b);
			   // FileOutputStream fo = new FileOutputStream(f2,true);
				
				//fo.write(by,a,b);
				
				//fo.close();
				//StringBuffer snb = new StringBuffer();
				//String ss = "";
				/*while((len = rdf.read(by))!=-1){
					snb.append(new String(by,0,len));
					ss+=snb.toString();
					ss.getBytes();
					if(ss.length()>MainDuoXian.a){
						break;
					}
				}
				String ss2 = snb.toString();
				rdf2.write(ss2.getBytes());*/
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if(fi!=null){
					try {
						fi.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			try{
				fo = new FileOutputStream(f2,true);
				fo.write(by,a,b);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if(fo!=null){
					try {
						fo.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		//}else if(number==2){
			/*try{
				rdf = new RandomAccessFile(f1,"r");
				rdf2 = new RandomAccessFile(f2,"rw");
				byte[] by = new byte[1024];
				int len  = 0;
				StringBuffer snb = new StringBuffer();
				String ss = "";
				rdf.seek(f1.length());
				while((len = rdf.read(by))!=-1){
					snb.append(new String(by,0,len));
					ss+=snb.toString();
					ss.getBytes();
					if(ss.length()>MainDuoXian.b){
						break;
					}
				}
				String ss2 = snb.toString();
				rdf2.write(ss2.getBytes());
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if(rdf!=null){
					try {
						rdf.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(rdf2!=null){
					try {
						rdf2.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		//}else if(number==3){
			try{
				rdf = new RandomAccessFile(f1,"r");
				rdf2 = new RandomAccessFile(f2,"rw");
				byte[] by = new byte[1024];
				int len  = 0;
				StringBuffer snb = new StringBuffer();
				String ss = "";
				rdf.seek(f1.length());
				while((len = rdf.read(by))!=-1){
					snb.append(new String(by,0,len));
					ss+=snb.toString();
					ss.getBytes();
					if(ss.length()>MainDuoXian.c){
						break;
					}
				}
				String ss2 = snb.toString();
				rdf2.write(ss2.getBytes());
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if(rdf!=null){
					try {
						rdf.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(rdf2!=null){
					try {
						rdf2.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}*/
		//}
	}
