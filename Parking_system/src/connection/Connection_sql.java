package connection;

import java.sql.*;

public class Connection_sql {
	Connection con;
	
	public Connection begin_connection() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Parkingjava","root", "0123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public void close_connection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
