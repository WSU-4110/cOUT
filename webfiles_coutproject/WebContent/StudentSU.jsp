<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="index.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">s
<title>Student Signup!</title>
</head>

<body>
<h1>Incognito</h1>
<main> 

<form style="border:1px solid #ccc">
  <div class="container">
    <h2>Student Sign Up</h2>
    <h4>Please fill in this form to create an account.</h4>
    

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Example@wayne.edu" name="email" required>
<br><br>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" id = "password" name="psw" required>
<br><br>
    <label for="psw-repeat"><b>Repeat Password</b></label>&nbsp<span id='message  ></span>
    <input type="password" placeholder="Repeat Password" id = "confirm_password" name="psw-repeat" required onkeyup='check();'>
  <br>  <br>
    <label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>
    <br><br>
    <h4>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</h4>

    <div class="clearfix">
      <button type="button" class="cancelbtn" onclick="window.location.href = 'index.jsp';">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>



</main>
<script>
var check = function() {
  if (document.getElementById('password').value ==
    document.getElementById('confirm_password').value) {
    document.getElementById('message').style.color = 'green';
    document.getElementById('message').innerHTML = '&#10004';
  } else 
  {
    document.getElementById('message').style.color = 'red';
    document.getElementById('message').innerHTML = '&times';
  }
}
</script>
</body>
</html>