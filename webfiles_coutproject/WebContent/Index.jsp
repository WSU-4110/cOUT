<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>
	  <%@include file = "Connection.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>

<%

String userid=request.getParameter("email");
session.setAttribute("email",userid);
String pwd=request.getParameter("psw"); 
ResultSet rs=st.executeQuery("select * from students where EMAIL='"+userid+"'"); 
if(rs.next()) 
{ 
if(rs.getString(6).equals(pwd)) 
{ 
String 	name = rs.getString(2);
response.sendRedirect("studentDash.jsp");
} 
else 
{ 
out.println("Invalid password try again");

} 
} 
else 
%>
</body>
</html>
