<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>
<%
Class.forName("com.mysql.jdbc.Driver"); 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cOUT", "root", "23paddock");  
Statement st= con.createStatement();
String userid=request.getParameter("email"); 
session.putValue("email",userid); 
String pwd=request.getParameter("psw"); 
ResultSet rs=st.executeQuery("select * from students where EMAIL='"+userid+"'"); 
if(rs.next()) 
{ 
if(rs.getString(6).equals(pwd)) 
{ 
String 	name = rs.getString(2);	
out.println("welcome     "+ name); 

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
=======
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
>>>>>>> fed6c227f39b6485f3ab2d0361db7b0023850ce0
