<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.IOException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.vwits.register.MyDBConnection"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<link href="WelcomeExam.css" rel="stylesheet" type="text/css"> 

<title>Insert title here</title>

</head>

<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    <h3 style="color: white;font-family: cursive;">

<%

session = request.getSession();
if(session.getAttribute("currentSessionUser") != null)
{
	out.println("Welcome " + session.getAttribute("currentSessionUser"));
	
	
	}else{
		response.sendRedirect("Login.jsp");
	}

			
	
%>
<a href="Login.jsp" class="btn btn-info" role="button" style="position:absolute;right:120px;">Logout</a>
</h3>






</div>
</div>
</nav> 





<!-- <table align="center" border="1"> -->

<div class="container">
  <div class="row">
    <div class="col-12">
<table class="table table-bordered">

		<thead>
          <tr>
            <th scope="col">Question</th>
           
            <th scope="col">Option1</th>
                        <th scope="col">Option2</th>
                        <th scope="col">Option3</th>
                        <th scope="col">Option4</th>
                        <th scope="col">Answer</th>
            
            
          </tr>
        </thead>
        <tbody>

			
<%
{
			PrintWriter ou = response.getWriter();
					MyDBConnection con= new MyDBConnection();
					Statement st=con.getStatement();
					
							//out.println("Welcome");
							String sql;
							sql=("SELECT question,option1,option2,option3,option4,answer from EXAM");
							
							try {
								ResultSet rs=st.executeQuery(sql);
								while(rs.next())
								{
									String question=rs.getString("question");
									String op1=rs.getString("option1");
									String op2=rs.getString("option2");
									String op3=rs.getString("option3");
									String op4=rs.getString("option4");
									String answer=rs.getString("answer");

									
									//String password=rs.getString("password");
									
									/*out.println("name :" + firstname);
									out.println("password:" + password);
									out.println("marks : " + marks);
									*/
									
								
									
									out.println("<tr><td>" + question + "</td><td>" + op1 + "</td><td>" + op2
											+ "</td><td>" + op3+ "</td><td>" + op4 + "</td><td>" + answer

									+ "</td><tr>");
									
									
									
								}
								con.closeConnection();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					
							} 
			 
							
			
			
			

	
%>
</tbody>
	</table>
	</div>
	</div>
	</div>


</body>

</html> 
 
