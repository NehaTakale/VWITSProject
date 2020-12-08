package com.vwits.register;

import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ExamRepo {

	
		public static int Insert(Marks m){
			int x=0;
			MyDBConnection con= new MyDBConnection();
		
	   PreparedStatement ps = con.getPreparedStatement("insert into marks values(?,?,?)");
	    try {
	       
	    	ps.setString(1, m.getFirstname());
	    	ps.setString(2, m.getPassword());
	    	ps.setInt(3, m.getMarks());
	  
	        x=ps.executeUpdate();  

	  } 
	    catch (SQLException e1) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
	    } 
	    return x;
	}
	}


