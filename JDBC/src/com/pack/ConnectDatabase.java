package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase
{
	private static Connection connect;
    private static ConnectDatabase instance;
     
    private ConnectDatabase()
    {
         
        try {
             
        	String url = "jdbc:mysql://localhost:3306/mydb";
    		String userName = "root";
    		String password = "password";
    		Class.forName("com.mysql.jdbc.Driver");
    		connect = DriverManager.getConnection(url, userName, password);
             
        }
         
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
             
        }
         
        catch(ClassNotFoundException e)
        {
             
            System.err.println(e.getMessage());
             
        }
         
 
         
    }
     
      public static ConnectDatabase getInstance()
      {
           
          if(instance == null) {
               
              instance = new ConnectDatabase();
               
          }
           
          return instance;
 
           
      }
}
