<%@page import="java.sql.Connection" %>
<%@page import="aaa.DbManager" %>
<%@ page import ="java.sql.*" %>
<%@page import="java.sql.DriverManager" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Signup!</title>
</head>

<body>
<%
DbManager db= new DbManager();
Connection conn = db.getConnection();
if(conn==null){
	out.print("connection failed");
}
else{
	out.print("connection succeeded!");
}
String name=request.getParameter("name")
String pwd=request.getParameter("pwd");  
String email=request.getParameter("email"); 
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
"root","root"); 
Statement st= con.createStatement(); 
ResultSet rs; 
int i=st.executeUpdate("insert into users values ('"+pwd+"','"+email+"')"); 

out.println("Registered"); 


%>
</body>
</html>