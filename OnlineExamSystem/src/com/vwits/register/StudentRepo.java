package com.vwits.register;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class StudentRepo {

	
		
		
		public static int Insert(Student s){
			int x=0;
			MyDBConnection con= new MyDBConnection();
		
	   PreparedStatement ps = con.getPreparedStatement("insert into student values(?,?,?,?,?)");
	    try {
	       
	    	ps.setString(1, s.getFirstn());
	        ps.setString(2,s.getLastn());  
	        ps.setString(3,s.getPass()); 
	        ps.setString(4,s.getConfirmpass());  
	        ps.setString(5,s.getEmail());  

	        x=ps.executeUpdate();  

	  } 
	    catch (SQLException e1) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
	    } 
	    return x;
	}
}		
		
		// update:
		
		