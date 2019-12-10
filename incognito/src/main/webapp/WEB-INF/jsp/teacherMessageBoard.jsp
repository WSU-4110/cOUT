<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
 <!-- Theme CSS - Includes Bootstrap -->
<link href="/css/creative.min.css" rel="stylesheet">


  <!-- login pop window  -->
<link href= "/css/index.css" rel= "stylesheet">
  <!-- Theme CSS - Includes Bootstrap -->

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
.btn {
   border-color:#f4623a; 
   background-color: white;
   color: #f4623a;
   }
.btn1 {
border-color:#f4623a; 
   background-color: white;
}
.btn:hover {
         background-color:#f4623a;
         color: white;
         border-color:#f4623a; 
         }
         
</style>
<title>Message Board</title>
</head>
<body>
<!-- Navigation -->
<body>
<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light bg-light static-top mb-5 shadow">
  <div class="container">
    <a class="navbar-brand" href="/">Incognito</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item active">
          <a class="nav-link" href="/teacherDash">Dashboard
                <span class="sr-only">(current)</span>
              </a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" href="/logout">Log Out</a>
        </li>
      
      </ul>
    </div>
  </div>
</nav>

<!-- Page Content -->
<div class="container">
  <div class="card border-0 shadow my-5">
    <div class="card-body p-5">
      <h1 class="font-weight-light">${course.crsName}</h1>

      <hr>
      <div class="split left">
  		<div class="centered">
    		<h2 class = "font-weight-light">Course Message Board</h2>
    		<br>
    		<p style = "border-radius: 20px; padding: 10px; border: 2px solid #f4623a;"><i>Class's Answered Questions</i></p>
    		  		 <c:if test="${not empty question}">
   <div>
   <br>
    <table align = "center">
        <c:forEach var="o" items="${question}">
			<c:if test="${o.is_answered == true}">
            <tr>
                <td position:absolute>            
                	<p><b><font face = "Arial">Question: ${o.QUESTION}</font></b></p>
                	<p><i><font face = "Arial" color = "#f4623a">Answer: ${o.ANSWER}</font></i></p>
				</td>
				</tr>
				</c:if>
        </c:forEach>
    </table>

</c:if>
</div>
  		</div>
	</div>
	
      <div class="split right">
  		<div class="centered">
	    <h2 class = "font-weight-light">Asked Questions:</h2>
	    <br>
	    <p style = "border-radius: 20px; padding: 10px; border: 2px solid #f4623a;"><i>Class's Unanswered Questions</i></p>
	   <c:if test="${not empty question}">
<br>
    <table align = "center">
        <c:forEach var="o" items="${question}">
        	<c:if test="${o.is_answered==false}">
            <tr>
                <td position:absolute>               
               <div style = "border-radius: 20px; padding: 10px; border: 1px solid #f4623a;" >
                	<div>${o.QUESTION}</div>
                	<button type="button" class="btn btn-primary btn-xs" data-target="#addClass" data-toggle="collapse" >Answer</button>
                	
		  		<form action= "/teacherQuestionDelete" method="POST">
		         	<input type = "hidden" name="questionId" value="${o.id}">
		            <input type="hidden" name="accessCode" value="${course.accessCode}">
					<button type="submit" class="btn btn-danger btn-xs" name="action">Delete</button>
		        </form>
                </div>
	      <div id = "addClass" class = "collapse">
				      <form action= "/answeredQuestion" method = "POST">
				     	<div class = "modal-body">
				     		<h5>Answer:</h5>
				     		<input type = "hidden" name="questionId" value="${o.id}">
				     		<input type="text" class="form-control" name="answerQuestion" placeholder="Answer Here"required >
				     	</div>
				     	<div class="form-group">
				     	      <input type="hidden" name="accessCode" value="${course.accessCode}">
							 <input type="submit" class="btn btn-primary btn-xs" float="right" name="action" value="Submit Answer">
					 </div>
					 </form>     
			    </div>			    	
              <hr>
	</td>
            </tr>
</c:if>
        </c:forEach>
    </table>
</c:if>


	      		</div>
	</div>
      
      
      <div style="height: 700px"></div>
    </div>
  </div>
</div>
</body>
</html>
