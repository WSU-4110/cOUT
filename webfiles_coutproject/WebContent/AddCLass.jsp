<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ page import="classes.Classes"%>
<jsp:include page="TeacherDash.html"/>
</head>
<body>
  <%
String CourseID =request.getParameter("CourseID");
String Classname =request.getParameter("ClassName");
String name = session.getAttribute("name").toString();

<%--implementing Factory Method--%>
classesFactory classesFactory = new classesFactory();
classes class1 = classesFactory.getUserType("TEACHERS");
int AccessCode = class1.addOrJoinClass(CourseID, Classname, name);
<%--end of code regarding Factory Method --%>
	
session.setAttribute("AccessCode", AccessCode);
%>
<div class = "container">
<div id = "myModal2" >
      <div class = "modal-dialog">
      <div class = "modal-content">
     	<div class= "modal-header">
     	<h4 class = "modal-title">Add Class</h4>
     	</div>
     	<div class = "modal-body">
     	<h5>Access Code:</h5>
     	<div class = "modal-body">
     	<h5><%=AccessCode%></h5>
     	</div>
     	<div class="form-group">
<a href = "TeacherDash.jsp" class="btn btn-primary btn-xl" style="float: right;">Close</a>
		</div>              
    </div> 
  </div>
  </div>
  </div>
  </div>
</body>
</html>
