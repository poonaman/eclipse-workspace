package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseDAO
{
	public static Connection connect() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/dbd";
		String userName = "root";
		String password = "sanjay@9423468997";
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, userName, password);
		return conn;
	}

	public static List<Employee> select() {
		Connection conn=null;
		Statement stmt = null;
		ResultSet rs=null;
		String sql = "select * from Employee";
		System.out.println("Hello");
		List<Employee>employee=new ArrayList<>();
		try 
		{
			conn = connect();
			System.out.println("Hello");
			if(null != conn)
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next())
				{
					int id=rs.getInt(1);
					String name=rs.getString(2);
					int age=rs.getInt(3);
					Employee emp=new Employee(id,name,age);
					employee.add(emp);
					
				}
				return employee;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("exception");
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
		return employee;
	}
	
/*public static void main(String[] args)
{
	DatabaseDAO dao=new DatabaseDAO();
	List<Employee> emp=dao.select();
	for(Employee emp12:emp)
	{
		System.out.println(emp12.getId());
	}
}*/
	}

