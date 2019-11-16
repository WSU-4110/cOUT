<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
 <!-- Theme CSS - Includes Bootstrap -->
<link href="css/creative.min.css" rel="stylesheet">
<style>
body {
  background: url('http://www.designlovefest.com/wp-content/uploads/downloads/2018/01/000_647011.jpg') no-repeat center center fixed;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  background-size: cover;
  -o-background-size: cover;
}
 /* Split the screen in half */
.split {
  height: 100%;
  width: 50%;
  z-index: 1;
  top: 0;
  position: absolute;
  overflow-x: hidden;
  padding-top: 20px;
}
/* Control the left side */
.left {
  left: 0;
}
/* Control the right side */
.right {
  right: 0;
}
/* If you want the content centered horizontally and vertically */
.centered {
  position: absolute;
  top: 20%;
  left: 15%;
  transform: translate(-50%, -50%,);
  text-align: center;
}
</style>
<title>Message Board</title>
</head>
<body>
<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light bg-light static-top mb-5 shadow">
  <div class="container">
    <a class="navbar-brand" href="#">Incognito</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item active">
          <a class="nav-link" href="index.html">Home
                <span class="sr-only">(current)</span>
              </a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" href="#">Sign Out</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Contact</a>
        </li>
	 <li class="nav-item">
        <a href="index.html" class="btn btn-info btn-logout">
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
      <h1 class="font-weight-light">Teacher Messaging Board</h1>
      <hr>
      <div class="split left">
  		<div class="centered">
    		<h2 class = "font-weight-light">Answered Questions:</h2>
    		<p>Display of questions that have already been answered by Teacher</p>
   <c:if test="${not empty question}">
   
    <table>
        <c:forEach var="o" items="${question}">
        <c:if test="${o.is_answered == true}">
            <tr>
                <td position:absolute>
                <div class="btn question-primary btn-lg" >
                	${o.QUESTION}
        </c:if>
 		<div>
 	   </div>
        </c:forEach>
    </table>

</c:if>
  		</div>
	</div>
	
      <div class="split right">
  		<div class="centered">
	    <h2 class = "font-weight-light">Unanswered Questions:</h2>
	    <p>Display of questions that still need to be answered</p>
	    	<table border="1" cellpadding="2" cellspacing="2">
		<div>
			<c:if test="${not empty question}">
    <table>
        <c:forEach var="o" items="${question}">
        <c:if test="${o.is_answered == false}">
            <tr>
                <td position:absolute>
                <div class="btn question-primary btn-lg" >
                	${o.QUESTION}
               
 <div>
 <form id="form1" method="post" action="/TeacherDashClicked">
  <textarea name="comment">
    Enter your comment here
  </textarea>
</form>
 </div>
     <div>
                 <button position:relative type="button" class="btn btn-primary btn-lg" float="right" type="submit" >Answer</button>
	    		 <button position:relative type="button" class="btn btn-primary btn-lg" float="right">Delete</button>
                </div>
                </div>
 </c:if>
            
                </td>
            </tr>
           
        </c:forEach>
    </table>
</c:if>

		</div>
	</table>
	  
  		</div>
	</div>
      
      
      <div style="height: 700px"></div>
      <p class="lead mb-0">You've reached the end!</p>
    </div>
  </div>
</div>
</body>
</html>