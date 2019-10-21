<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>
	     <%@include file = "Connection.jsp" %>
	 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/creative.min.css" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Dashboard</title>
</head>
<body>
<jsp:include page="TeacherDash.html"/><br><br>
<%
String userid = session.getAttribute("email").toString();
ResultSet rs=st.executeQuery("select * from Teacher where EMAIL='"+userid+"'");
rs.next();
%>
<div class="container">
  <div class="card border-0 shadow my-5">
    <div class="card-body p-5">
      <h1 class="font-weight-light">Welcome Teacher Name...</h1>
      <hr>
      <button type="button" class="btn btn-primary btn-lg" float="right">Add Class</button>
      <p class="lead">In this snippet, the background image is fixed to the body element. Content on the page will scroll, but the image will remain in a fixed position!</p>
      <p class="lead">Scroll down...</p>
      <div style="height: 700px"></div>
      <p class="lead mb-0">You've reached the end!</p>
    </div>
  </div>
</div>
</body>
</html>