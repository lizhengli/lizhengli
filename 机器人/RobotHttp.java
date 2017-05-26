package Com.Dzhi;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class RobotHttp {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("开始和刘凡聊天吧");
			String ss = sc.next();
			String url = "http://www.tuling123.com/openapi/api?key=d1f3adbc6fa946d599284aea1ffe19ff&info="+"ss";
			try {
				URL url2 = new URL(url);//创建URl对象
					URLConnection urc = url2.openConnection();//打开URL
					urc.connect();//发起请求链接
					BufferedReader br = new BufferedReader(new InputStreamReader(urc.getInputStream()));
					String s =(String) br.readLine();
					System.out.println(s);
					/*InputStream in = urc.getInputStream();
					byte[] by = new byte[1024];
					int len = 0;
					File f = new File("f:/java/1.jpg");
					FileOutputStream fo = new FileOutputStream(f);
					while((len = in.read(by))!=-1){
						fo.write(by,0,len);
					}*/
					//获取内容
					//BufferedReader br = new BufferedReader(new InputStreamReader(urc.getInputStream()));
	
					//System.out.println(br.readLine());
					//System.out.println(br.readLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
