package com.vwits.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentRegistrationServlet")
public class StudentRegistrationServlet extends HttpServlet {
       private static final long serialVersionUID = 1L;
   
    public StudentRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

       
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             this.doPost(request, response);
       }

       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

             PrintWriter out=response.getWriter();
             
             String fname=request.getParameter("firstn");
             String lname=request.getParameter("lastn");
             String password=request.getParameter("pass");
             String conpass=request.getParameter("confirmpass");
             String email=request.getParameter("emailid");
      
             
             Student s=new Student();
             s.setFirstn(fname);
             s.setLastn(lname);
             s.setPass(password);
             s.setConfirmpass(conpass);
           s.setEmail(email);
             
             
             StudentRepo.Insert(s);
             
             RequestDispatcher r=request.getRequestDispatcher("Login.jsp");
   		  r.forward(request, response);
             
             
             
             
             
             
             
       }

}
