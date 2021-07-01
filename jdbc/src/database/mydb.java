package database;

import java.sql.*;

public class mydb {
	public static Connection myConnection()

	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/jdbc","","");
			
		}catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
	

}