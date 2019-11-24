<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<meta charset="ISO-8859-1">
<link href="css/signup.css" rel="stylesheet" type="text/css">

<link href="css/creative.min.css" rel="stylesheet">

<title>Student Registration</title>
<body>

 
 <div class="container">
    <div class="row">
      <div class="col-lg-10 col-xl-9 mx-auto">
        <div class="card card-signin flex-row my-5">
          <div class="card-img-left d-none d-md-flex">
             <!-- Background image for card set in CSS! -->
          </div>
          <div class="card-body">
            <h5 class="card-title text-center">Student Sign-Up</h5>
            <div>
            <form class="form-signin" method = "POST" action="/registered-student">
            <input type="hidden" name="id" value="${student.ID}">
            <input type="hidden" name="role" value="student">
              <div class="form-label-group">
                <label for="inputName">Name</label>
                <input type="text" value="${student.NAME}" name="NAME" class="form-control" placeholder="Full Name"  required autofocus>
              </div>

              <div class="form-label-group">
                <label for="inputEmail">Email</label>
                <input type="email" value="${student.EMAIL}" name="EMAIL" class="form-control" placeholder="Email address"  required>
              </div>
              
              <hr>

              <div class="form-label-group">
                <label for="inputPassword">Password</label>
                <input type="password" id="password"  name="password" class="form-control" placeholder="Password" required>
              </div>
              
              <div class="form-label-group">
              	<label for="inputConfirmPassword">Confirm password</label>
                <input type="password" id="inputConfirmPassword" class="form-control" placeholder="Password" required onkeyup='check()'>
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
</body>

</html>