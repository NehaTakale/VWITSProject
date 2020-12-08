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


@WebServlet("/TeacherLoginServlet")
public class TeacherLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public TeacherLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		MyDBConnection con= new MyDBConnection();

		String firstname = request.getParameter("name1");
		String password = request.getParameter("password1");

		
	       PreparedStatement ps = con.getPreparedStatement("select * from teacher where tfirstname=? and tpassword=?");
	       try {
	       ps.setString(1, firstname);
			ps.setString(2, password);
			
			ResultSet res;
			
				res = ps.executeQuery();
				if(res.next() )
				{
					HttpSession session=request.getSession();
					session.setAttribute("currentSessionUser",firstname);
					session.setAttribute("sessionUserId", firstname);
					response.sendRedirect("WelcomeTeacherjsp.jsp");
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
