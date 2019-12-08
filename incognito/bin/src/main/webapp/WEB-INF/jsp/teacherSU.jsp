<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<meta charset="ISO-8859-1">
<head>
  <script src="js/creative.min.js"></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
  <link href="css/signup.css" rel="stylesheet" type="text/css">

<link href="css/creative.min.css" rel="stylesheet">

<style>
.errorMessage {
	color:red; 
	font-weight: bold; 
}
</style>
  
</head>


<title>Teacher Registration</title>
<body>

 
 <div class="container">
    <div class="row">
      <div class="col-lg-10 col-xl-9 mx-auto">
        <div class="card card-signin flex-row my-5">
          <div class="card-img-left d-none d-md-flex">
             <!-- Background image for card set in CSS! -->
          </div>
          <div class="card-body">
            <h5 class="card-title text-center">Teacher Sign-Up</h5>
            <div>
<<<<<<< Updated upstream
            <form class="form-signin" method = "POST" action="/registered-User">
=======
            <form class="form-signin" method = "POST" action="/registered-Teacher">
>>>>>>> Stashed changes
            <input type="hidden" name="id" value="${User.ID}">
            <input type="hidden" name="role" value="teacher">
              <div class="form-label-group">
                <label for="inputName">Name</label>
                <input type="text" name="NAME" class="form-control" placeholder="Full Name"  required autofocus>
              </div>

	              <div class = "errorMessage" id = "test">
	              	${emailError}
	              </div>
	              
              <div class="form-label-group">
                <label for="inputEmail">Email</label>
                <input pattern=".*@wayne.edu" title="Wayne State Email Only" type="email" name="EMAIL" class="form-control" placeholder="Email address"  required>
              </div>
              
              <hr>

              <div class="form-label-group">
                <label for="password">Password</label>
                <input type="password" id="password"  name="password" class="form-control" placeholder="Password"  onchange='validatePassword()' required>
              </div>
              
              <div class="form-label-group">
              	<label for="confirm_password">Confirm password</label>
                <input type="password" id="confirm_password" class="form-control" placeholder="Password" onkeyup='validatePassword()' required >
              </div>

              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Register</button>
              <a class="d-block text-center mt-2 small" href="index">Sign In</a>
              
             
            </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <script>

  $(function(){

      $('#test').show();

      setTimeout(function(){
          $('#test').fadeOut('slow');
      },3000);

  });
  </script>
  <script type ="text/javascript">
      var password = document.getElementById("password");
      var confirm_password = document.getElementById("confirm_password");

    function validatePassword(){
      if(password.value != confirm_password.value) {
        confirm_password.setCustomValidity("Passwords Don't Match");
      } else {
        confirm_password.setCustomValidity('');
      }
    }
      </script> 
</body>
<<<<<<< Updated upstream
</html>
=======
</html>
>>>>>>> Stashed changes
