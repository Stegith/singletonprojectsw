package com;
import java.sql.*;
import java.util.*;
import java.util.Date;
import com.*;
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        PreparedStatement pst=null;
		ResultSet rs=null;
		Connection con=DBsingleton.getDBconnects();
		try
		{
			 pst=con.prepareStatement("select * from swtestdata");
		
		 rs=pst.executeQuery();
		ArrayList<Integer> ob=new ArrayList<Integer>();
		ArrayList<String> ob1=new ArrayList<String>();
		ArrayList<Date> ob2=new ArrayList<Date>();
		ArrayList<String> ob3=new ArrayList<String>();
	
		while(rs.next())
		{
		ob.add(rs.getInt("id"));
		ob1.add(rs.getString("name"));
		ob2.add(rs.getDate("dob"));
		ob3.add(rs.getString("dept"));

		
		}
		int i=ob2.indexOf(Collections.min(ob2));
		System.out.println(ob.get(i)+"\t"+ob1.get(i)+"\t"+ob2.get(i)+"\t"+ob3.get(i));
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
	 if(rs!=null && pst!=null && con!=null)
			{
			
		rs.close();	
		pst.close();
		con.close();
			}
		
			
			
			System.out.println("Exception handled and connection close");
		}
		

	}

}

   

