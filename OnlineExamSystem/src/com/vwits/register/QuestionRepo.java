package com.vwits.register;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QuestionRepo {

	public static int Insert(Question q){
		int x=0;
		MyDBConnection con= new MyDBConnection();
	
   PreparedStatement ps = con.getPreparedStatement("insert into exam values(?,?,?,?,?,?)");
    try {
    	ps.setString(1, q.getQuestion());
       
    	ps.setString(2, q.getOption1());
        ps.setString(3,q.getOption2());  
        ps.setString(4,q.getOption3()); 
        ps.setString(5,q.getOption4());  
        ps.setString(6,q.getAnswer());  

        x=ps.executeUpdate();  

  } 
    catch (SQLException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    } 
    return x;
}
	
	public static List<Question> getAll() { 
		MyDBConnection con= new MyDBConnection();

		 		List<Question> list = new ArrayList<Question>(); 
		 		Statement st = con.getStatement(); 
		 
		 
		 		try { 
		 			ResultSet rs = st.executeQuery("Select * from exam"); 
		 			while (rs.next()) { 
		 				list.add(new Question(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7))); 
		 			} 
		 			con.closeConnection(); 
		 		} catch (SQLException e) { 
		 			// TODO Auto-generated catch block 
		 			e.printStackTrace(); 
		 		} 
		 		return list; 
		 	} 

	
	
}
