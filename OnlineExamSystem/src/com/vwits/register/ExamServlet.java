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


@WebServlet("/ExamServlet")
public class ExamServlet extends HttpServlet {
       private static final long serialVersionUID = 1L;
       
    
    public ExamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

       
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             this.doPost(request, response);
       }

       
       
       
       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             MyDBConnection con= new MyDBConnection();
             PrintWriter out= response.getWriter();
             
             HttpSession session = request.getSession(false);         

               String name=(String) session.getAttribute("currentSessionUser");
              // String password=request.getParameter("password"); 
                

             
             int Answer = 0;
             String A=request.getParameter("A");
             String B=request.getParameter("B");
             String C=request.getParameter("C");
             String D=request.getParameter("D");
             
             String A2=request.getParameter("A2");
             String B2=request.getParameter("B2");
             String C2=request.getParameter("C2");
             String D2=request.getParameter("D2");
             
             String A3=request.getParameter("A3");
             String B3=request.getParameter("B3");
             String C3=request.getParameter("C3");
             String D3=request.getParameter("D3");

             String A4=request.getParameter("A4");
             String B4=request.getParameter("B4");
             String C4=request.getParameter("C4");
             String D4=request.getParameter("D4");
             
             String A5=request.getParameter("A5");
             String B5=request.getParameter("B5");
             String C5=request.getParameter("C5");
             String D5=request.getParameter("D5");


             if("C".equals(A))
              {
                  Answer=Answer+5;
              }
             if("C".equals(B))
              {
                  Answer=Answer+5;
              }
            if("C".equals(C))
              {
                  Answer=Answer+5;
              }
            if("C".equals(D))
              {
                  Answer=Answer+5;
              }
             
              if("A".equals(A2))
              {
                  Answer=Answer+5;
              }
               if("A".equals(B2))
              {
                  Answer=Answer+5;
              }
               if("A".equals(C2))
              {
                  Answer=Answer+5;
              }
               if("A".equals(D2))
              {
                  Answer=Answer+5;
              }
             
              if("A".equals(A3))
              {
                  Answer=Answer+5;
              }
             if("A".equals(B3))
              {
                  Answer=Answer+5;
              }
               if("A".equals(C3))
              {
                  Answer=Answer+5;
              }
                if("A".equals(D3))
              {
                  Answer=Answer+5;
              }
             
              if("B".equals(A4))
              {
                  Answer=Answer+5;
              }
               if("B".equals(B4))
              {
                  Answer=Answer+5;
              }
             if("B".equals(C4))
              {
                  Answer=Answer+5;
              }
               if("B".equals(D4))
              {
                  Answer=Answer+5;
              }
             
              if("B".equals(A5))
              {
                  Answer=Answer+5;
              }
               if("B".equals(B5))
              {
                  Answer=Answer+5;
              }
               if("B".equals(C5))
              {
                  Answer=Answer+5;
              }
               if("B".equals(D5))
              {
                  Answer=Answer+5;
              }
             
              

              
            	   out.println("<html>");
            	                  out.println("<head>");
            	                  out.print("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n" + 
            	                  		"<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n" + 
            	                  		"<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
            	                  
            	                  out.print("<link rel=\"stylesheet\" type=\"text/css\" href=\"ExamServlet.css\" />");
            	                  out.print("</head>");

            	                  out.println("<body>");
            	                  out.print("<div class='center'>");

            	                  out.println("Your Score is "+Answer);
            	                  
            	                  	out.print("</div>");
            	                  	out.println("</body>");
            	                   out.println("</html>"); 
            	    

               
               
                                           Marks m = new Marks();
                                           m.setFirstname(name);
                                          // m.setPassword(password);
                                           m.setMarks(Answer);
                                           ExamRepo.Insert(m); 
                                           
                      //  HttpSession session = request.getSession(false);         
                                        	    if(session.getAttribute("currentSessionUser")!=null)
                                        	                         {
                                        	                         	//session.invalidate();
                                        	                         	out.println("<html>");
                                        	                           out.println("<head>");
                                        	                           out.print("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n" + 
                                        	                           		"<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n" + 
                                        	                           		"<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
                                        	                           
                                        	                           out.print("<link rel=\"stylesheet\" type=\"text/css\" href=\"ExamServlet.css\" />");
                                        	                           out.print("</head>");

                                        	                           out.println("<body>");
                                        	                           out.print("<div>");
                                        	                           out.print("<nav class=\"navbar navbar-inverse\">\r\n" + 
                                        	                           		"  <div class=\"container-fluid\">\r\n" + 
                                        	                           		"    <div class=\"navbar-header\">");
                                        	                         	out.println("<a href=\"Login.jsp\" class=\"btn btn-info\" role=\"button\" style=\"position:absolute;right:120px;\">Logout</a>");
                                        	                         	
                                        	                         	out.print("</div>");
                                        	                         	out.print("</div>\r\n" + 
                                        	                         			"</div>\r\n" + 
                                        	                         			"</nav>");
                                        	                           
                                        	                           
                                        	                           
                                        	                           
                                        	                           out.println("</body>");
                                        	                           out.println("</html>");
                                        	                         	
                                        	                         }else
                                        	                         {
                                        	                         	out.println("-------");
                                        	                         }  
                                        	    

                    
                                           
                  

               
               

             
       /*     String question=request.getParameter("question");
             PreparedStatement ps = con.getPreparedStatement("select * from exam where question=?");
             
              try {
              ps.setString(1, question);
                    
                    ResultSet res;
                    
                          res = ps.executeQuery();
                          if(res.next())
                          {
                                 if("A".equals(A))
                                 {
                                     Answer=Answer+5;
                                 }
                                 else  if("A".equals(B))
                                 {
                                     Answer=Answer+5;
                                 }
                                 else  if("A".equals(C))
                                 {
                                     Answer=Answer+5;
                                 }
                                 else  if("A".equals(D))
                                 {
                                     Answer=Answer+5;
                                 }
                                 else {
                                       Answer=0;
                                 }     
                          }
                          
                          out.println("Your Score is "+Answer);
                          
              }catch (SQLException s)
              {
                  out.println("<h2>Data Base Error...</h2>");
              }
              

*/
/*try {
       ResultSet rs=ps.executeQuery();
       out.println("in ");*/

       
/*     while(rs.next())
             
     {
             out.println("in while");
             if("A".equals(A))
              {
                  Answer=Answer+5;
              }
             else  if("A".equals(B))
              {
                  Answer=Answer+5;
              }
             else  if("A".equals(C))
              {
                  Answer=Answer+5;
              }
             else  if("A".equals(D))
              {
                  Answer=Answer+5;
              }
             else {
                    Answer=0;
             }
   }
       
        
        out.println("Your Score is "+Answer);
       
        
     if(Answer>=10)
      {
          out.println("Congratulation's Your Pass");
      }
      else 
      {
          out.println(" Try Next Time !");
      }
        con.closeConnection();;
    }
    catch (SQLException s)
    {
        out.println("<h2>Data Base Error...</h2>");
    }
    
        
 catch(NullPointerException e)
{
   System.out.print("NullPointerException Caught");
}    
*/
}            
             
             
       }

