package cOUT10;


import java.util.Properties;
import javax.mail.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage; 

public class SendEmail {
	public static void main(String[] args){
		//recipients email address will be replaced using database attributes
		String destinationEmail = "teamcout12@gmail.com";
		
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
		
		
		//get the session object
		
		Session session = Session.getInstance(props,
				new javax.mail.Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication(username,password);
			}
		});
		
		try {
			///Create default mime message object 
			Message message = new MimeMessage(session);
			
			
			//setting From: header field
			message.setFrom(new InternetAddress(sender));
			//setting To: Header field
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinationEmail));
			
			//Set subject : header field
			message.setSubject("TEST");
			//Now for the actual message
			message.setText("Hello, this is a test email");
			
			//Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");
			
		}
		catch (MessagingException e){
			throw new RuntimeException(e);
		}
	}
}

