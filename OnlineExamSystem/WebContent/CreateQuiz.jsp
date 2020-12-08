 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="WelcomeExam.css" rel="stylesheet" type="text/css">
</head>
<body>

<form action="CreateQuesServlet" method="post">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    <h3 style="color: black;font-family: cursive;">

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
<div class="container">
  <div class="row">
    <div class="col-12">
      <table class="table table-bordered">
        <thead>



					<tr><td>Question:</td><td><textarea rows="3" cols="" name="question" ></textarea></td></tr>
					<tr><td>Option1:</td><td><input type="text" name="option1" /></td></tr>	
					<tr><td>Option2:</td><td><input type="text" name="option2" /></td></tr>
					<tr><td>Option3:</td><td><input type="text" name="option3" /></td></tr>
					<tr><td>Option4:</td><td><input type="text" name="option4" /></td></tr>
					<tr><td>Answer:</td><td><input type="text" name="answer" /></td></tr>	
					
					 
                    <tr><td></td><td><input type="submit" class="btn btn-info"  value="Submit"/ ></td></tr>
                    <tr><td></td><td><a href="WelcomeTeacherjsp.jsp" class="btn btn-info" role="button">Finish</a></td></tr>
                    
                   
                   
                    </thead>
                    </table>
                     </div>
                    </div>
                    </div>
                    
                     </form>
                     
</body>
</html> 
  
 
