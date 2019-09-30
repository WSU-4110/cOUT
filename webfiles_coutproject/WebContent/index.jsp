<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<meta name="viewport"
content="width=device-width,initial-scale=1.0">
<head>
<link rel="stylesheet" href="index.css">


<title>Home</title>
</head>
<body>

<h1>

<b>Incognito</b>
</h1>



<main>
<br><br>

<br><br><br><br><br><br>
<br>
<center>
<h2>I'm a ...</h2>
<br>

<button class="button button1" onclick="window.location.href = 'StudentSU.jsp';">Student</button>
<button class="button button2" onclick="window.location.href = 'TeacherSU.jsp';">Teacher</button>
<h4>Already have an account. 
<a href = "#" class="open-button" onclick="openForm()">Click Here to Login here!</a></h4>
<div class="form-popup" id="myForm">
  		<form action="/action_page.php" class="form-container">
    <span class="close">&times;</span>
	<br><br>
	<h1>Login portal</h1>
	<br>
	<label for = "email" style="text-align:left;"> Email: </label> 
    <input type="text" placeholder="Enter Email" name="email" required>
	
	<label for = "psw" style="text-align:left;"> Password:  </label> 
    <input type="password" placeholder="Enter Password" name="psw" required>

    <button type="submit" class="btn">Login</button>
  </form>
</div>
</center>
<br><br><br><br><br><br>
<br>
</main>
<script>
function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}
var span = document.getElementsByClassName("close")[0];
span.onclick = function() 
{
  myForm.style.display = "none";
}
window.onclick = function(event)
{
  if (event.target == myForm) 
  {
    myForm.style.display = "none";
  }
}

</script>
</body>


<br>
<footer><center>Copyright &copy;2019 cOUT</center></footer>
</html>
