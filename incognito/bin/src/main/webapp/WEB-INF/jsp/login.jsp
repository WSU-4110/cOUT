<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>cOUT Home</title>

  <!-- Font Awesome Icons -->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700" rel="stylesheet">
  <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic' rel='stylesheet' type='text/css'>

  <!-- Plugin CSS -->
  <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

  <!-- Theme CSS - Includes Bootstrap -->
  <link href="css/creative.min.css" rel="stylesheet">
  
  <!-- login pop window  -->
<link href= "css/index.css" rel= "stylesheet">
</head>

<body id="page-top">
		
  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-light fixed-top py-3" id="mainNav">
    <div class="container">
      <a class="navbar-brand js-scroll-trigger" href="#page-top">Incognito</a>
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto my-2 my-lg-0">
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="#about">About</a>
          </li>
          
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="#myModal" class="trigger-btn" data-toggle="modal" >Login</a>
          </li>
    
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="#contact">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Masthead -->
  <header class="masthead">
    <div class="container h-100">
      <div class="row h-100 align-items-center justify-content-center text-center">
        <div class="col-lg-10 align-self-end">
          <h1 class="text-uppercase text-white font-weight-bold">ChatBot</h1>
          <c:if test="${not empty errorMessage}">
						<div id=test style="color:red; font-weight: bold; margin: 30px 0px;">${errorMessage}</div>
					</c:if>
          <hr class="divider my-4">
        </div>
        <div class="col-lg-8 align-self-baseline">

				<form action="/login" method="POST">
					<div class="form-group">
					Email
						<input type="text" class="form-control" name="email" placeholder="Enter Email" required>		
					</div>
					Password
					<div class="form-group">
						<input type="password" class="form-control" name="password" placeholder="Enter Password" required >	
					</div>        
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-xl js-scroll-trigger">Login</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>     
        </div>
      </div>
    </div>
  </header>
  
  <!-- Footer -->
  <footer class="bg-light py-5">
    <div class="container">
      <div class="small text-center text-muted">Copyright &copy; 2019 - cOUT</div>
    </div>
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Plugin JavaScript -->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
  <script src="vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

  <!-- Custom scripts for this template -->
  <script src="js/creative.min.js"></script>
  <script>

  $(function(){

      $('#test').show();

      setTimeout(function(){
          $('#test').fadeOut('slow');
      },3000);

  });
  </script>
</body>

</html>
