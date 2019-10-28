<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>
	     <%@include file = "Connection.jsp" %>
	 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Dashboard</title>

<!--pop window  -->
<link href= "index.css" rel= "stylesheet">
<%@ page import="classes.Classes"%>
</head>
<body>
<jsp:include page="TeacherDash.html"/><br><br>

<%
String userid = session.getAttribute("email").toString();
ResultSet rs=st.executeQuery("select * from teachers where EMAIL='"+userid+"'");
rs.next();
%>
<div class="container">
  <div class="card border-0 shadow my-5">
    <div class="card-body p-5">
      <h1 class="font-weight-light">Welcome <%=rs.getString(2)%></h1>
      <hr>
      <button type="button" class="btn btn-primary btn-lg" href="#myModal" class="trigger-btn" data-toggle="modal" >Add Class</button>
      <div id = "myModal" class = "modal fade">
      <div class = "modal-dialog modal-login">
      <div class = "modal-content">
     	<div class= "modal-header">
     	<h4 class = "modal-title">Add	 Class</h4>
     	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
     	</div>
     	<div class = "modal-body">
     	<h5>Class Name:</h5><input type="text" class="form-control" name="ClassName" placeholder="Enter Class name" required>
     	</div>
     	<div class="form-group">
		<button type="submit" class="btn btn-primary btn-xl js-scroll-trigger" style="float: right;">Submit</button>
		</div>              
    </div> 
  </div>
  </div>
  </div>
  </div>
</div>

</body>
 <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Plugin JavaScript -->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
  <script src="vendor/magnific-popup/jquery.magnific-popup.min.js"></script>


</html>