package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer 
{
	Connection conn = null;
	public Connection connect() throws ClassNotFoundException, SQLException 
	{
	
		String url = "jdbc:mysql://localhost:3306/mydb";
		String userName = "root";
		String password = "password";
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, userName, password);
		return conn;
	}
	public void insertProduct(int id, String name,String category) throws ClassNotFoundException 
    {
	Connection conn=null;
	PreparedStatement pstmt = null;
	String sql = "insert into Product values(?,?,?)";
	try 
	{
		conn=connect();
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2,name);
		pstmt.setString(3,category);
		int count = pstmt.executeUpdate();
			
		System.out.println("No. of rows inserted= " + count);
		
	} catch (SQLException e) {
		
		System.out.println("Already Product with that id is present ");
	}
	finally
	{
		try 
		{
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}
}
	public  void insertCustomer(int id, String name) throws ClassNotFoundException 
    {
	Connection conn=null;
	PreparedStatement pstmt = null;
	String sql = "insert into CustomerDetails values(?,?)";
	try {
		conn=connect();
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2,name);
	
		int count = pstmt.executeUpdate();
			
		System.out.println("No. of rows inserted= " + count);
		
	} catch (SQLException e) {
		
		System.out.println("Already Customer with that id is present ");
	}
	finally
	{
		try 
		{
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}
}
	public void selectProduct() 
	{
		Connection conn=null;
		Statement stmt = null;
		ResultSet rs=null;
		String sql = "select * from Product";
		try {
			conn = connect();
			if(null != conn)
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next())
				{
					System.out.println("ProductId: " + rs.getInt(1) + " ,ProductName: " +rs.getString(2) + " Category: " +rs.getString(3));
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
	}
	public ResultSet selectOrders() 
	{
		Connection conn=null;
		Statement stmt = null;
		ResultSet rs=null;
		String sql = "select * from Orders";
		try {
			conn = connect();
			if(null != conn)
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				return rs;
			}
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			/*try 
			{
				rs.close();
				stmt.close();
				conn.close();
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}*/			
		}
		return rs;
	}
	public void selectOrderV(int id) 
	{
		Connection conn=null;
		Statement stmt = null;
		ResultSet rs=null;
		String sql = "select * from Orders where Custid='" + id+"'";
		try {
			conn = connect();
			if(null != conn)
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next())
				{
					System.out.println("ProductId " + rs.getInt(2)+ "ProductName: " +rs.getString(3) + " Category: " +rs.getString(4)+"Quantity"+rs.getInt(5));
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
	}
	public boolean selectCustomer(int id,String name)
	{
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		boolean result=false;
		String sql = "select * from CustomerDetails where id=? and name=?";
		CustomerDetails cus=null;
		try {
			conn = connect();
			if(null != conn)
			{
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1,id);
				pstmt.setString(2,name);
				rs = pstmt.executeQuery();
				if(rs.next())
				{
					result=true;
					return result;
				}
				else
				{
					return false;
				}
		
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL State" + e.getSQLState());
		}
		finally
		{
			try 
			{
				
			pstmt.close();
			conn.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}			
		}
		return result;
	}
	public ResultSet selectProduct(int id)
	{
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
	
		String sql = "select * from Product where id=?";
		CustomerDetails cus=null;
		try {
			conn = connect();
			if(null != conn)
			{
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1,id);
				rs = pstmt.executeQuery();
				if(rs.next())
				{
					
					return rs;
				}
				
		
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL State" + e.getSQLState());
		}
		finally
		{
		/*try 
			{
				rs.close();
				pstmt.close();
			conn.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}*/		
		}
		return rs;
	}
	public ResultSet selectOrders(int id)
	{
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
	
		String sql = "select * from Orders where ProductId=?";
		try {
			conn = connect();
			if(null != conn)
			{
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1,id);
				rs = pstmt.executeQuery();
				if(rs.next())
				{
					
					return rs;
				}
				
		
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL State" + e.getSQLState());
		}
		finally
		{
		/*try 
			{
				rs.close();
				pstmt.close();
			conn.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}*/		
		}
		return rs;
	}
	public boolean selectOrder(int id)
	{
		boolean result=false;
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
	
		String sql = "select * from Orders where ProductId=?";
		
		try {
			conn = connect();
			if(null != conn)
			{
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1,id);
				rs = pstmt.executeQuery();
				if(rs.next())
				{
					result=true;
					return result;
				}
				
		
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL State" + e.getSQLState());
		}
		finally
		{
		/*try 
			{
				rs.close();
				pstmt.close();
			conn.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}*/		
		}
		return result;
	}
	public  void insertOrder(int custid,int productid,String name,String category,int quantity) throws ClassNotFoundException 
    {
	Connection conn=null;
	PreparedStatement pstmt = null;
	String sql = "insert into Orders values(?,?,?,?,?)";
	try {
		conn=connect();
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, custid);
		pstmt.setInt(2,productid);
	    pstmt.setString(3,name);
	    pstmt.setString(4,category);
	    pstmt.setInt(5,quantity);
	    
		int count = pstmt.executeUpdate();
			
		System.out.println("No. of rows inserted= " + count);
		
	} catch (SQLException e) {
		
		System.out.println("Already Customer with that id is present ");
	}
	finally
	{
		try 
		{
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}
}
	public  void deleteOrder(int productid,int quantity) throws ClassNotFoundException 
    {
	Connection conn=null;
	PreparedStatement pstmt = null;
	String sql = "delete from Orders where ProductId=? and quantity=?";
	try {
		conn=connect();
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, productid);
		pstmt.setInt(2,quantity);
	    int count = pstmt.executeUpdate();
			
		System.out.println("No. of rows deleted= " + count);
		
	} catch (SQLException e) {
		
		System.out.println("Already Customer with that id is present ");
	}
	finally
	{
		try 
		{
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}
}
	public  void deleteOrderP(int productid) throws ClassNotFoundException 
    {
	Connection conn=null;
	PreparedStatement pstmt = null;
	String sql = "delete from Orders where ProductId=?";
	try {
		conn=connect();
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, productid);
	
	    int count = pstmt.executeUpdate();
			
		System.out.println("No. of rows deleted= " + count);
		
	} catch (SQLException e) {
		
		System.out.println("Already Customer with that id is present ");
	}
	finally
	{
		try 
		{
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}
}
	public  void deleteOrderC(int custid) throws ClassNotFoundException 
    {
	Connection conn=null;
	PreparedStatement pstmt = null;
	String sql = "delete from Orders where custid=?";
	try {
		conn=connect();
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, custid);
	
	    int count = pstmt.executeUpdate();
			
		System.out.println("No. of rows deleted= " + count);
		
	} catch (SQLException e) {
		
		System.out.println("Already Customer with that id is present ");
	}
	finally
	{
		try 
		{
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}
}
public  void updateOrder(int productid,int quantity) throws ClassNotFoundException 
    {
	Connection conn=null;
	PreparedStatement pstmt = null;
	String sql = "update Orders set quantity=? where ProductId=?";
	try {
		conn=connect();
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, quantity);
		pstmt.setInt(2,productid);
	    int count = pstmt.executeUpdate();
			
		System.out.println("No. of rows updated= " + count);
		
	} catch (SQLException e) {
		
		System.out.println("Already Customer with that id is present ");
	}
	finally
	{
		try 
		{
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}
}
}
