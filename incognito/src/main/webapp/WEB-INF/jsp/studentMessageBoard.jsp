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
<link href="/css/teacherMsgBoard.css" rel="stylesheet">

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
</style>
<title>Message Board</title>
</head>
<body>
<!-- Navigation -->
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
          <a class="nav-link" href="/studentDash">Dashboard
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
    		<h2 class = "font-weight-light">Answered Questions</h2>
    		<p>Display of questions that have already been answered by Teacher</p>
    		  		 <c:if test="${not empty question}">
   <div>
    <table>
        <c:forEach var="o" items="${question}">
			<c:if test="${o.is_answered == true}">
            <tr>
                <td position:absolute>
                <div class="btn question-primary btn-lg" >
                	<p>Question: ${o.QUESTION}</p>
                	<p>Answer: ${o.ANSWER}</p>
				</div>
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
	    <p>Display of questions that student has asked</p>
	   <c:if test="${not empty question}">

    <table>
        <c:forEach var="o" items="${question}">
        	<c:if test="${o.is_answered==false}">
            <tr>
                <td position:absolute>
                <div class="btn question-primary btn-lg" >
                	${o.QUESTION}
                </div>
                <button type="button" class="btn btn-primary btn-md" data-target="#addClass" data-toggle="collapse" >Inspect</button>
	      <div id = "addClass" class = "collapse">
				      <form action= "/answeredQuestion" method = "POST">
				     	<div class = "modal-body">
				     		<h5>Answer:</h5>
				     		<input type = "hidden" name="questionId" value="${o.id}">
				     		<input type="text" class="form-control" name="answerQuestion" placeholder="Answer Here"required >
				     	</div>
				     	<div class="form-group">
				     	      <input type="hidden" name="accessCode" value="${course.accessCode}">
							 <input type="submit" class="btn btn-primary btn-lg" float="right" name="action" value="answer">
			 				 <input type="submit" class="btn btn-primary btn-lg" float="right" name="action" value="delete" >
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
      <p class="lead mb-0">You've reached the end!</p>
    </div>
  </div>
</div>
</body>
</html>