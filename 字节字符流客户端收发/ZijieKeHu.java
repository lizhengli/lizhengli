package Com.Dzhi;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

import javax.swing.*;

import java.net.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class ZijieKeHu {
				
	public static void main(String[] args){
		try {
		Socket	soc = new Socket("192.168.199.154",11000);
			PrintWriter pw = new PrintWriter(soc.getOutputStream());
			Connection con = MyConnection.getInstance();
			Statement sta  = con.createStatement();
			String sql = "select * from msg";
			ResultSet rs = sta.executeQuery(sql);
			System.out.println("=======��ʷ��Ϣ=======");
			String lishi = "";
			while(rs.next()){
				lishi = rs.getString("mesg");
				System.out.println(lishi);
			}
			pw.write("liufa666\n"+"\n");
			pw.flush();
			//��
			new Thread(new OutRunnable(soc)).start();
			//��	
			new Thread(new InRunnable(soc)).start();
				/*PrintWriter pw = new PrintWriter(soc.getOutputStream());
				System.out.println("��������Ϣ����");
				String xiaoxi = sc.next();
				pw.write(xiaoxi+"\n");
				pw.flush();
				BufferedReader buf = new BufferedReader(new InputStreamReader(soc.getInputStream()));
				String fanhui = buf.readLine();
				System.out.println("���������ص���ϢΪ"+fanhui);*/
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
