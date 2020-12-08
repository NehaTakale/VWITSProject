package com.vwits.register;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TeacherRepo {

	public static int Insert(Teacher t){
		int x=0;
		MyDBConnection con= new MyDBConnection();
	
   PreparedStatement ps = con.getPreparedStatement("insert into teacher values(?,?,?,?,?)");
    try {
       
    ps.setString(1, t.getTfirstname());
    ps.setString(2, t.getTlastname());
    ps.setString(3, t.getTpassword());
    ps.setString(4, t.getTconfirmpassword());
    ps.setString(5, t.getTemail());
        x=ps.executeUpdate();  

  } 
    catch (SQLException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    } 
    return x;
}
}
