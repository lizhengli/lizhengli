package Biao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MySqlDemo {
	private static Connection con = null;
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","123456");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public MySqlDemo(){
		
	}
	public static Connection getInstance(){
		return con;
	}
}
