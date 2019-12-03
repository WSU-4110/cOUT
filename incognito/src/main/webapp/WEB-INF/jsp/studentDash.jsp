<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

  <!-- login pop window  -->
<link href= "css/index.css" rel= "stylesheet">
  <!-- Theme CSS - Includes Bootstrap -->
  
  <link href="css/creative.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
<style>
body {
  background: url('https://www.pomona.edu/sites/default/files/styles/home_page_slide/public/images/paragraphs/burke-classroom.jpg?itok=wJ2bfbaV') no-repeat center center fixed;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  background-size: cover;
  -o-background-size: cover;
}
</style>
<title>Teacher Dashboard</title>
</head>
<body>
<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light bg-light static-top mb-5 shadow">
  <div class="container">
    <a class="navbar-brand" href="index.html">Incognito</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item">
        <a href="/logout" class="nav-link">
        <span class="sr-only">(current)</span>
          Log Out
        </a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<!-- Page Content -->
<div class="container">
  <div class="card border-0 shadow my-5">
    <div class="card-body p-5">
      <h1 class="font-weight-light">Welcome, ${name}</h1>
      <hr>
      
      <div>
     <c:if test = "${not empty courses}">
     <table>
     <c:forEach var="o" items="${courses}">
      <td style = "padding: 25px">
    <button type = "button" style = "background-color: white; border-radius: 8px" onclick = "window.location.href = '/studentMessageBoard/courses/${o.accessCode}'" onMouseOver = "this.style.color = '#81c5de'" onMouseOut = "this.style.color = 'black'">
     <div>
         
     	<h4 class = "font-weight-bold"> Course Name: </h4> <a style = "color: black; font-size: 20px"> ${o.crsName} </a>
     
       <p class = "font-weight-bold" font color = "gray"> Access Code: ${o.accessCode} </p>
     
     </div>
   </button>
   
   <br> </br>
     </td>
     </c:forEach>
     </table>
     </c:if>
     
   <hr style = "height: 1px; color: black"></hr>
      	<button type="button" class="btn btn-primary btn-lg" data-target="#addClass" data-toggle="collapse" >Join Class</button>
	      <div id = "addClass" class = "collapse">
				      <form action= "/joinCourse" method = "POST">
				     	<div class= "modal-header">
				     		<h4 class = "modal-title">Join Class</h4>
				     		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				     	</div>
				     	<div class = "modal-body">
				     		<h5>Access Code:</h5><input type="number" class="form-control" name="accessCode" placeholder="Enter Course Access Code" min="0" step="1" required />
				     	</div>
				     	<div class="form-group">
							<button type="submit" class="btn btn-primary btn-xl" class="trigger-btn" style="float: right;">Submit</button>
						</div>  
					  </form>           
			    	</div>  
	      </div>
      
  </div>
</div>
</body>
</html>
