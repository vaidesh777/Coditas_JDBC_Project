package crud;

import java.sql.*;
import database.mydb;
import Model.Student;

public class studentcrud {

	public int insert(Student s)

	{
		int check = 0;
		PreparedStatement pst = null;
		Connection con = mydb.myConnection();
		String sql = "insert into studentinfo(id,name,marks) values(?,?,?)";
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, s.getId());
			pst.setString(2, s.getName());
			pst.setInt(3, s.getMarks());
			check=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (check > 0)
			return 1;
		else 
			{
			return 0;
			}
	}
	
	public void update(int id)
	{
		int check=0;
		PreparedStatement pst=null;
		Connection con = mydb.myConnection();
		String sql="update studentinfo set name=?,marks=? where id=?";
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1,"vaibh");
			pst.setInt(2,90);
			pst.setInt(3,1);
			check=pst.executeUpdate();
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				pst.close();
				con.close();
			}catch(SQLException e)	
			{
				e.printStackTrace();	
			}
		}
		     if(check>0)
		     {
		    	 System.out.println("record is updated successfully");
		     }
		    
	}

		
	
	public void delete()
	{
	int check=0;
	PreparedStatement pst=null;
	Connection con = mydb.myConnection();
	String sql="delete from studentinfo where id=?";
	try {
		pst=con.prepareStatement(sql);
		pst.setInt(1,1);
	}catch(SQLException e)
	{
	e.printStackTrace();
	}
	finally
	{
		try {
			pst.close();
			con.close();
		}catch(SQLException e)	
		{
			e.printStackTrace();	
		}
	}
		if(check>0)
		{
			System.out.println("record is deleted successfully");
		}
		else 
		{
			System.out.println("not");
		}
	
	
	
	
	}	
}


