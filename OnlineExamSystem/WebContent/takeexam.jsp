
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="takeexam.css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
      <style>
h2 {
  text-align: left;
  font-size: 60px;
  margin-top: 0px;
}
</style>  
    </head>
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
 

    
    <body>
    
    <h2 id="demo"></h2>
    
    
    <script>
// Set the date we're counting down to
var countDownDate = new Date("Jan 5, 2021 15:37:25").getTime();

// Update the count down every 1 second
var x = setInterval(function() {

  // Get today's date and time
  var now = new Date().getTime();
    
  // Find the distance between now and the count down date
  var distance = countDownDate - now;
    
  // Time calculations for days, hours, minutes and seconds
  var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
  var seconds = Math.floor((distance % (1000 * 60)) / 1000);
    
  // Output the result in an element with id="demo"
  document.getElementById("demo").innerHTML =
   minutes + "m " + seconds + "s ";
    
  // If the count down is over, write some text 
  if (distance < 0) {
    clearInterval(x);
    document.getElementById("demo").innerHTML = "EXPIRED";
  }
}, 1000);
</script>
    
    
    
    
       <div id="page-wrap">

             <h1>Core Java</h1>
             
             <form action="ExamServlet" method="post" id="quiz">
             
      
             
            <ol>
            
                <li>
                
                
                    <p style="color: blue">Which of the following is not a Java features?</p>
                    
                    <div>
                        <input type="radio" id="qus" name="A" value="A" />
                        <label for="question-1-answers-A">A) Dynamic </label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-B" name="B" value="B" />
                        <label for="question-1-answers-B">B) Architecture Neutral </label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-C" name="C" value="C" />
                        <label for="question-1-answers-C">C) Use of pointers</label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-D" name="D" value="D" />
                        <label for="question-1-answers-D">D) Object-oriented</label>
                    </div>
                
                </li>
                
                
                
                <li>
                
                    <p>Java is...</p>
                    
                    <div>
                        <input type="radio" id="qus" name="A2" value="A" />
                        <label for="question-1-answers-A">A) Object oriented programming language </label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-B" name="B2" value="B" />
                        <label for="question-1-answers-B">B) partially object oriented programming language</label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-C" name="C2" value="C" />
                        <label for="question-1-answers-C">C) scripting  programming language</label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-D" name="D2" value="D" />
                        <label for="question-1-answers-D">D) None of the above</label>
                    </div>
                
                </li>
        
                <li>
                
                    <p>"Which is irrecoverable? </p>
                    
                    <div>
                        <input type="radio" id="qus" name="A3" value="A" />
                        <label for="question-1-answers-A">A) Error  </label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-B" name="B3" value="B" />
                        <label for="question-1-answers-B">B) Checked Exception</label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-C" name="C3" value="C" />
                        <label for="question-1-answers-C">C)  Unchecked Exception</label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-D" name="D3" value="D" />
                        <label for="question-1-answers-D">D) Both B & C</label>
                    </div>
                
                </li>
                
                <li>
                
                    <p>"How many reserved keywords are currently defined in the Java language?</p>
                    
                    <div>
                        <input type="radio" id="qus" name="A4" value="A" />
                        <label for="question-1-answers-A">A) 40 </label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-B" name="B4" value="B" />
                        <label for="question-1-answers-B">B) 49</label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-C" name="C4" value="C" />
                        <label for="question-1-answers-C">C) 50</label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-D" name="D4" value="D" />
                        <label for="question-1-answers-D">D) 57</label>
                    </div>
                
                </li>
        
        
                 <li>
                
                    <p>"Which method is used to change the name of a thread?</p>
                    
                    <div>
                        <input type="radio" id="qus" name="A5" value="A" />
                        <label for="question-1-answers-A">A) public String getName() </label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-B" name="B5" value="B" />
                        <label for="question-1-answers-B">B) public void setName(String name)</label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-C" name="C5" value="C" />
                        <label for="question-1-answers-C">C) public void getName()</label>
                    </div>
                    
                    <div>
                        <input type="radio"  id="question-1-answers-D" name="D5" value="D" />
                        <label for="question-1-answers-D">D) public String setName(String name)</label>
                    </div>
                
                                                            
                </li>
        
        
                
               
            </ol>
            
            <p></p><br>
             
            <p></p><br>
            
            <h3 style="color: red">Please confirm before submiiting the test</h3>
          <br>
          <br>
         
                        
          
            
                  <!--   <input type="submit" value="Submit Quiz"  name="btnext"/> -->
                    
                    
                   
                     
                    <input type="submit" class="btn btn-info"  value="Submit"/ >
                    
                    <button onclick="myFunction()"></button>

                    
             
               <p></p><br>
                 <p></p><br>
             
             
             </form>
       
       </div>
       
   
</body>

    </body>
</html>


