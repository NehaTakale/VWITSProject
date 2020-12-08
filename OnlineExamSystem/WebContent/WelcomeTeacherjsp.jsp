<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	
<link href="WelcomeExam.css" rel="stylesheet" type="text/css"> 	
<title>Welcome Teacher</title>
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
<a href="LogoutServlet" class="btn btn-info" role="button" style="position:absolute;right:120px;">Logout</a>
</h3>

</div>
</div>
</nav> 
 
<div class="container">
  <div class="row">
    <div class="col-12">
      <table class="table table-bordered">
        <thead>
          <tr>
            
            <th scope="col">Create Quiz</th>
            <th scope="col">Display All Questions</th>
            <th scope="col">Display Results of all students</th>
          </tr>
        </thead>
        <tbody>
          <tr>
          
            <td>
            <a href="CreateQuiz.jsp" class="btn btn-info" role="button">Create Quiz</a>
            </td>
            
            <td>
              
              <a href="SelectQuestions.jsp" class="btn btn-info" role="button">Display All Questions</a>
             
            </td>
            
            <td>
              
              <a href="WelcomeData.jsp" class="btn btn-info" role="button">Display result</a>
             
            </td>
          </tr>
          
         
        </tbody>
      </table>
    </div>
  </div>
</div>








</body>
</html> 
 
