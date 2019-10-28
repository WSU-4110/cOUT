<%@page import="java.sql.DriverManager" %>
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
session.putValue("Name",name); 
String pwd=request.getParameter("psw");  
String email=request.getParameter("email"); 
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cOUT","root","goldPa!nt51");
Statement st= con.createStatement(); 
ResultSet rs; 
int i=st.executeUpdate("insert into students(Name,password,email)values('"+name+"','"+pwd+"','"+email+"')"); 

out.println("Registered"); 


%>

</body>
</html>