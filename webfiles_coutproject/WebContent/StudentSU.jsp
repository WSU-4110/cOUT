<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Sign-up!</title>
</head>
<body>
<%@ page import="java.sql.DriverManager" %>
<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>

<%@ page import = "java.util.Properties" %>
<%@ page import = "javax.mail.*" %>
<%@ page import = "javax.mail.Message" %>
<%@ page import = "javax.mail.MessagingException" %>
<%@ page import = "javax.mail.PasswordAuthentication" %>
<%@ page import = "javax.mail.Session" %>
<%@ page import = "javax.mail.Transport" %>
<%@ page import = "javax.mail.internet.InternetAddress" %>
<%@ page import = "javax.mail.internet.MimeMessage" %>
 

<%
String name = request.getParameter("Name");
<<<<<<< HEAD
session.putValue("Name",name); 
=======
>>>>>>> fed6c227f39b6485f3ab2d0361db7b0023850ce0
String pwd = request.getParameter("psw");  
String EMAIL = request.getParameter("email"); 
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cout", "root", "Sangeeta%1972"); 
Statement st = con.createStatement(); 
ResultSet rs; 
int i = st.executeUpdate("insert into students(Name,password,email)values('" + name + "','" + pwd + "','" + EMAIL + "')"); 
<<<<<<< HEAD

System.out.println("Registered"); 

=======
System.out.println("Registered"); 
//recipients email address will be replaced using database attributes
		
		//the email address that will appear as sender ( will be replaced with a donotreply email) 
		String sender = "teamcout12@gmail.com";
		final String username = "teamcout12@gmail.com";
		final String password ="teamCOUT1";
		
		String host = "smtp.gmail.com";
		
		Properties props = new Properties();
		
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		
		
		//get the session object
		
		Session mail = Session.getInstance(props,
				new javax.mail.Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication(username,password);
			}
		});
		
		try {
			///Create default mime message object 
			Message message = new MimeMessage(mail);
			
			
			//setting From: header field
			message.setFrom(new InternetAddress(sender));
			//setting To: Header field
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(EMAIL));
			
			//Set subject : header field
			message.setSubject("TEST");
			//Now for the actual message
			message.setText("Hello, this is a test email");
			
			//Send message
			Transport.send(message);
			System.out.print("Sent message successfully....");
			
		}
		catch (MessagingException e){
			throw new RuntimeException(e);
		}
response.sendRedirect("index.html");
%>
>>>>>>> fed6c227f39b6485f3ab2d0361db7b0023850ce0

//recipients email address will be replaced using database attributes

		
		//the email address that will appear as sender ( will be replaced with a donotreply email) 
		String sender = "teamcout12@gmail.com";
		final String username = "teamcout12@gmail.com";
		final String password ="teamCOUT1";
		
		String host = "smtp.gmail.com";
		
		Properties props = new Properties();
		
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		
		
		//get the session object
		
		Session mail = Session.getInstance(props,
				new javax.mail.Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication(username,password);
			}
		});
		
		try {
			///Create default mime message object 
			Message message = new MimeMessage(mail);
			
			
			//setting From: header field
			message.setFrom(new InternetAddress(sender));
			//setting To: Header field
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(EMAIL));
			
			//Set subject : header field
			message.setSubject("TEST");
			//Now for the actual message
			message.setText("Hello, this is a test email");
			
			//Send message
			Transport.send(message);
			System.out.print("Sent message successfully....");
			
		}
		catch (MessagingException e){
			throw new RuntimeException(e);
		}

<<<<<<< HEAD
%>


=======
>>>>>>> fed6c227f39b6485f3ab2d0361db7b0023850ce0
</body>
</html>