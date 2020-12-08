<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link href="Registration.css" rel="stylesheet" type="text/css">


<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>




<!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">Online Examination portal</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>


      <div class="main" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="about.html">About Us</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Services</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="contact.html">Contact</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="register.jsp">Registration</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="Login.jsp">Login</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>











<div class="container register">
                <div class="row">
                    <div class="col-md-3 register-left">
                        <img src="images/exam.jpg" alt=""/>
                        <h3>Welcome</h3>
                        <p>Lets register for the brighter future..!</p>
                        <form method="get" action="login.jsp">
                        <input type="submit" name="" value="Login" /><br/>
                          </form>
                    </div>
                    <div class="col-md-9 register-right">
                        <ul class="nav nav-tabs nav-justified" id="myTab" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Student</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false" >Teacher</a>
                            </li>
                        </ul>
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <h3 class="register-heading">Register as a Student</h3>
                                <form action="StudentRegistrationServlet" method="post">
                                <div class="row register-form">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="First Name *" value="" name="firstn" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Last Name *" value="" name="lastn" />
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" id="password" placeholder="Password *" name="pass" />
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" id="confirm_password" placeholder="Confirm Password *"  name="confirmpass"/>
                                        </div>
                                        
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="email" class="form-control" placeholder="Your Email *" value=""  name="emailid"/>
                                        </div>
                                        
                                        
                                        <input type="submit" class="btnRegister"  value="Register"/>
                                    </div>
                                </div>
                            </div>
                            </form>
                           <div class="tab-content" id="myTabContent">
                                 <div class="tab-pane fade show active" id="profile" role="tabpanel" aria-labelledby="home-tab">
                                              
                                       <!-- <div class="tab-pane fade show" id="profile" role="tabpanel" aria-labelledby="profile-tab"> -->
                                <h3  class="register-heading">Register as a Teacher</h3>
                                 <form action="TeacherRegistrationServlet" method="post">
                                
                                <div class="row register-form">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="First Name *" value="" name="tfirstname" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Last Name *" value="" name="tlastname" />
                                        </div>
                                         <div class="form-group">
                                            <input type="password" class="form-control" id="password1" placeholder="Password *" name="tpassword" />
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" id="confirm_password1" placeholder="Confirm Password *"  name="tconfirmpass"/>
                                        </div>
                                        
                                        


                                    </div>
                                        <div class="col-md-6">
                                        <div class="form-group">
                                        
                                            <input type="email" class="form-control" placeholder="Your Email *" value=""  name="temailid"/>
                                        </div>
                                        
                                        <input type="submit" class="btnRegister"  value="Register"/>
                                       
                                        
                                    </div>
                                </div>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>

            </div>

  <script src='https://code.jquery.com/jquery-2.2.4.min.js'></script>

    <script src="Registration.js"></script> 

</body>
</html>

 

