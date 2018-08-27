package dbutil;

import java.sql.*;

public class DBUtil {

	public static Connection getConnection()
	{
		Connection conn = null;
		try 
		{

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" +
				     "instance=./SQLEXPRESS;databaseName=payment;integratedSecurity=true;");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void closeConnection(Connection conn)
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
