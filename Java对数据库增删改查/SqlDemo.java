package Biao;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class SqlDemo {

	public static void main(String[] args) {
	    //����Connection����
		Connection con;
		//����������
		String driver = "com.mysql.jdbc.Driver";
		//URLָ��Ҫ���ʵ����ݿ���mydata
		String url = "jdbc:mysql://localhost:3306/java";
		//MySQL����ʱ���û���
		String user = "root";
		//MySQL����ʱ������
		 String password = "123456";
		//������ѯ�����
		try {
			//������������
			Class.forName(driver);
			//1.getConnection()����������MySQL���ݿ⣡��
			con = DriverManager.getConnection(url,user,password);
			if(!con.isClosed())
			System.out.println("���ӳɹ�");
			//2.����statement���������ִ��SQL��䣡��
			Statement statement = con.createStatement();
			//Ҫִ�е�SQL���
			String sql = "select * from msg";
			String del = "select *  from emp where ename like '��%'";
			String sql2 = "show databases";
			//3.ResultSet�࣬������Ż�ȡ�Ľ��������
		    ResultSet rs = statement.executeQuery(sql);
		   // ResultSet rs3 = statement.executeQuery(sql2);
		   // ResultSet rs2 = statement.executeQuery(del);
			System.out.println("-----------------");
			System.out.println("ִ�н��������ʾ:");  
			System.out.println("-----------------");  
			System.out.println("����" + "\t" + "ְ��"+"\t"+"н��"+"\t"+"���ݿ�");  
			System.out.println("-----------------");       
			String job = null;
			String id = null;
			Float gz = null;
			while(rs.next()){
				//��ȡstuname��������
				job = rs.getString("mesg");
				//��ȡstuid��������
				//id = rs.getString("ename");
				//��ȡsal��������
				//gz = rs.getFloat("sal");
				//������
				//System.out.println(id + "\t" + job+"\t"+gz);
			}
			//PreparedStatement psql;
			//ResultSet res;
			//Ԥ����������ݣ���������������--������
			/*psql = con.prepareStatement("insert into emp (empno,ename,job,hiredate,sal)"
			+ "values(?,?,?,?,?)");
			psql.setInt(1,0004);
			psql.setString(2,"����2");
			psql.setString(3,"С����");*/
			//psql.setInt(1, 3212);      //���ò���1������idΪ3212������
			//psql.setString(2, "����");      //���ò���2��name Ϊ����
			//psql.setString(3, "�ܲ�");
			/*DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date myDate2 = dateFormat2.parse("2010-09-14");
			psql.setDate(4,new java.sql.Date(myDate2.getTime()));
			psql.setFloat(5, (float) -6666.3);*/
			//Ԥ�����������
			//psql = con.prepareStatement("update emp set sal = ? where ename = ?");
			//psql.setFloat(1,(float)5000.0);
			//psql.setString(2,"����");
			//psql.executeUpdate();  //ִ�и���
			//Ԥ����ɾ������
			//psql = con.prepareStatement("delete from emp where sal > ?");
			//psql.setFloat(1,4500);
			//psql.executeUpdate();  //ִ�и���
			//psql.close();
			rs.close();
			con.close();
		}catch(ClassNotFoundException e) {   
			//���ݿ��������쳣����
			System.out.println("Sorry,can`t find the Driver!");   
			e.printStackTrace();   
		}catch(SQLException e) {
		//���ݿ�����ʧ���쳣����
			e.printStackTrace();  
		}catch (Exception e) {
		
			e.printStackTrace();
		}finally{
			System.out.println("���ݿ����ݳɹ���ȡ����");
		}
	 }

	}

