package com;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBsingleton {

	 static Connection con=null;
	 private DBsingleton()
	 {
	 }
		 public static Connection getDBconnects()
		 {
			 try
			 {
				 if(con==null)
				 {
					 Class.forName("com.mysql.cj.jdbc.Driver");
					 con=DriverManager.getConnection("jdbc:mysql://localhost/swtest","root","");
				 }
				 
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 return con;
		 }
	 }


