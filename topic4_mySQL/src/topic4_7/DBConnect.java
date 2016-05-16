package topic4_7;

import java.sql.*;

public class DBConnect {

	Connection conn = null;
	
	public DBConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/high-school?useSSL=false","root", "admin");
			if(conn!=null) {
                System.out.println("Database connected.");
            }
		}
		catch(SQLException e) {
            System.out.println(e);
        }
		catch(ClassNotFoundException e) {
            System.out.println(e);
        }
	}

	public Connection getConnection() {
        return conn;
    }
  
	public void Disconnect() {
        conn=null;
    }
}
