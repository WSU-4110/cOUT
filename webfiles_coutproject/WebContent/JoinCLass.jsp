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
String AccessCode =request.getParameter("AccessCode");
String name = session.getAttribute("name").toString();

<%--Implementing Factory Method--%>
classesFactory classesFactory = new classesFactory();
classes class1 = classesFactory.getUserType("STUDENTS");
int rand = class1.addOrJoinClass(AccessCode, name);
<%--end of code regarding Factory Method --%>

%>
<div class = "container">
<div id = "myModal2" >
      <div class = "modal-dialog">
      <div class = "modal-content">
     	<div class= "modal-header">
     	<h4 class = "modal-title">Add Class</h4>
     	</div>
     	<div class = "modal-body">
     	<h5>Class Added</h5>
     	<div class="form-group">
<a href = "studentDash.jsp" class="btn btn-primary btn-xl" style="float: right;">Close</a>
		</div>              
    </div> 
  </div>
  </div>
  </div>
  </div>
</body>
</html>
