<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>
	  <%@include file = "Connection.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>	
<%@ page import="classes.Index"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>

<%
String UserID = request.getParameter("user");
String userid=request.getParameter("email");
session.setAttribute("email",userid);
String pwd=request.getParameter("psw");
Index student = new students();
boolean abc = student.process(userid, pwd, st);

Index teacher = new teachers();
boolean cde = teacher.process(userid, pwd, st);

if (abc)
{
	response.sendRedirect("studentDash.jsp");
}
else if (cde)
{
	response.sendRedirect("TeacherDash.jsp");
}
else 
{
	out.println("wrong username or Password");
	response.sendRedirect("index.html");
}	
%>
</body>
</html>
