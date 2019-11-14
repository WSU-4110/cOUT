<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/tsignup.css" rel="stylesheet" type="text/css">

<link href="css/creative.min.css" rel="stylesheet">

<title>Register</title>
</head>
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
            <form class="form-signin" method = "post" action="/teacher/registered">
            <input type="hidden" name="id" value= value="${Teacher.ID}">
            <input type="hidden" name="role">
              <div class="form-label-group">
              <label for="Name">Full Name</label>
               <input type="text" value="${Teacher.NAME}" name="NAME" class="form-control" placeholder="Full Name" required autofocus>
                
              </div>

              <div class="form-label-group">
              <label for="inputEmail">Email address</label>
              <input  value="${Teacher.EMAIL}" type="email" name="EMAIL" class="form-control" placeholder="Email address" required>
                
              </div>
              
              <hr>

              <div class="form-label-group">
                <label for="inputPassword">Password</label>
                <input  value="${Teacher.password}" type="password" name="password" class="form-control" placeholder="Password" required>
              </div>
              
              <div class="form-label-group">
              	<label for="inputConfirmPassword">Confirm password</label>
                <input type="password" id="inputConfirmPassword" class="form-control" placeholder="Password" required>
              </div>

              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Register</button>
              <a class="d-block text-center mt-2 small" href="index.html">Sign In</a>
              
             
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>