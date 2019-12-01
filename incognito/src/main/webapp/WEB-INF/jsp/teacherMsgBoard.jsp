<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <!-- Theme CSS - Includes Bootstrap -->
  <link href="css/teacherMsgBoard.css" rel="stylesheet">
<style>
body {
  background: url('https://source.unsplash.com/twukN12EN7c/1920x1080') no-repeat center center fixed;
  -webkit-background-size: cover;
  -moz-background-size: cover;
  background-size: cover;
  -o-background-size: cover;
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
  		</div>
	</div>
	
      <div class="split right">
  		<div class="centered">
	    <h2 class = "font-weight-light">Unanswered Questions:</h2>
	    <p>Display of questions that still need to be answered</p>
	   <button type="button" class="btn btn-primary btn-lg" float="right">Answer</button>
	    <button type="button" class="btn btn-primary btn-lg" float="right">Delete</button>
  		</div>
	</div>
      
      
      <div style="height: 700px"></div>
      <p class="lead mb-0">You've reached the end!</p>
    </div>
  </div>
</div>
</body>
</html>