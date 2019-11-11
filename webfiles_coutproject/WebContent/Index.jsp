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
String UserID = request.getParameter("user");
String userid=request.getParameter("email");
session.setAttribute("email",userid);
String pwd=request.getParameter("psw");
String sqlT = "select * from teachers where EMAIL='"+userid+"'";
String sqlS = "select * from students where EMAIL='"+userid+"'";
if (st.execute(sqlS))
{
ResultSet sa=st.executeQuery("select * from students where EMAIL='"+userid+"'");
if(sa.next())
{
	if(sa.getString(6).equals(pwd)) 
	{ 
	response.sendRedirect("studentDash.jsp");
	}
	else
	{ 
	out.println("Invalid password try again");
	} 
}
else if(st.execute(sqlT))
{
	ResultSet ta=st.executeQuery("select * from teachers where EMAIL='"+userid+"'");
	if(ta.next())
	{
		if(ta.getString(6).equals(pwd)) 
		{ 
		response.sendRedirect("TeacherDash.jsp");
		}
		else
		{ 
		out.println("Invalid password try again");
		} 
	}
	
}
else 
{
out.println("wrong username or Password");
response.sendRedirect("index.html");
}
}
%>
</body>
</html>
