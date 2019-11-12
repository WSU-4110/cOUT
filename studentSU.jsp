<%@page import="Classes.student" %>
 <%@include file = "Connection.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Signup!</title>
</head>
<body>
<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%
String name=request.getParameter("Name");
String pwd=request.getParameter("psw");  
String email=request.getParameter("email"); 

ResultSet rs; 
student first = new student();
boolean a= student.registration(name, pwd, email, st);

int i=st.executeUpdate("insert into students(Name,password,email)values('"+name+"','"+pwd+"','"+email+"')"); 

out.println("Registered"); 


%>

</body>
</html>