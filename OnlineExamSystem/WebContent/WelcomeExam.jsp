<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
       
<link href="WelcomeExam.css" rel="stylesheet" type="text/css"> 
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
 

 

<div class="container">
  <div class="row justify-content-center">
    <h1>Subject Tests</h1>
  </div>
</div>





<div class="container">
  <div class="row">
    <div class="col-12">
      <table class="table table-bordered">
        <thead>
          <tr>
            <th scope="col">No</th>
            <th scope="col">Subject Name</th>
            <th scope="col">Author</th>
            <th scope="col">Tests</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <th scope="row">1</th>
            <td>Java</td>
            <td>S.R.Sharma</td>
            <td>
              
              <a href="takeexam.jsp" class="btn btn-info" role="button">Take exam</a>
             
            </td>
          </tr>
          <tr>
            <th scope="row">2</th>
            <td>C++</td>
            <td>N.G.rao</td>
            
            <td>
               <a href="takeexam.jsp" class="btn btn-info" role="button">Take exam</a>
            </td>
          </tr>
          <tr>
            <th scope="row">3</th>
            <td>Bootstrap</td>
            <td>M.G.Mittal</td>
            
            <td>
               <a href="takeexam.jsp" class="btn btn-info" role="button">Take exam</a>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</div>


</body>
</html>