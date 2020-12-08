package com.vwits.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/StudentLoginServlet")
public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StudentLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		MyDBConnection con= new MyDBConnection();

		String firstname = request.getParameter("name");
		String password = request.getParameter("password");
		
		

		
	       PreparedStatement ps = con.getPreparedStatement("select * from student where firstname=? and password=?");
	       try {
	       ps.setString(1, firstname);
			ps.setString(2, password);
			
			ResultSet res;
			
				res = ps.executeQuery();
				if(res.next() )
				{
					HttpSession session=request.getSession(true);
					session.setAttribute("currentSessionUser",firstname);
					session.setAttribute("sessionUserId", firstname);
					response.sendRedirect("WelcomeExam.jsp");
				}
				else
				{
					out.println("Incorrect data");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
