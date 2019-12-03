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
  background: url('https://source.unsplash.com/twukN12EN7c/1920x1080') no-repeat center center fixed;
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
        <li class="nav-item active">
          <a class="nav-link" href="">Home
                <span class="sr-only">(current)</span>
              </a>
        </li>
        
        
        <li class="nav-item">
        <a href="/logout" class="btn btn-info btn-logout">
          Log out
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
      <h1 class="font-weight-light">Welcome ${name}</h1>
      <hr>
      
      <div>
     <c:if test = "${not empty courses}">
     <table>
     <c:forEach var="o" items="${courses}">
     <tr>
     <td>
     <div>
         
     	<p>Course Name: ${o.crsName} </p>
     
     </div>
     </td>
          <td>
               <div>
         
       <p>accessCode: ${o.accessCode} </p>
     
     </div>
   
     </td>
     </tr>
     </c:forEach>
     </table>
     </c:if>
      	<button type="button" class="btn btn-primary btn-lg" data-target="#addClass" data-toggle="collapse" >Add Class</button>
	      <div id = "addClass" class = "collapse">
				      <form action= "/addCourse" method = "POST">
				     	<div class= "modal-header">
				     		<h4 class = "modal-title">Add Class</h4>
				     		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				     	</div>
				     	<div class = "modal-body">
				     		<h5>Class Name:</h5><input type="text" class="form-control" name="crsName" placeholder="Enter Class name" required >
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
