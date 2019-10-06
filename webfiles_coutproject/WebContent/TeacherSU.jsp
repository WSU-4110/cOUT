<%@page import="java.sql.Connection" %>
<%@page import="aaa.DbManager" %>
<%@ page import ="java.sql.*" %>
<%@page import="java.sql.DriverManager" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Signup!</title>
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
String name=request.getParameter("Name")
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