<html lang="en">
<head>
<meta charset="ISO-8859-1">


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
<%@page import="java.sql.DriverManager" %>
<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%@ page import ="java.util.Random" %>
<%@ include file = "Connection.jsp"%>

<%
  String userid = session.getAttribute("email").toString(); 
  ResultSet rs=st.executeQuery("select * from Teacher where EMAIL='"+userid+"'");
  rs.next();
	Random rand = new Random();
	int accessCode = rand.nextInt(1000000)+1000000;

	Class.forName("com.mysql.jdbc.Driver"); 
	java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cOUT","root","23paddock");
	Statement st= con.createStatement(); 
	ResultSet rs; 
	int i=st.executeUpdate("insert into Teachers(accessCode)values('"+accessCode+"')"); 

	out.println("Registered"); 
%>
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
          <a class="nav-link" href="#">Home
                <span class="sr-only">(current)</span>
              </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">About</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Services</a>
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
      <h1 class="font-weight-light">Access Code</h1>
      <hr>
      <%=accessCode %>
    </div>
  </div>
</div>
</body>
</html>