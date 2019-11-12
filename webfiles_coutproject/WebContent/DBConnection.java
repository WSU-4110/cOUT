<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>
	<%
	
	
Class.forName("com.mysql.jdbc.Driver"); 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cout", "root", "Sangeeta%1972"); 
Statement st= con.createStatement();
	
%>
	public class DBConnection {
	
	private static DBConnection instance;
	private Connection connection;
	private String url = "jdbc:mysql://localhost:3306/cout";
	private String userName = "root";
	private String password = "Sangeeta%1972";
	private Statement st;
	
	private DBConnection() throws SQLException {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, userName, password);
			this.connection = st.createStatement();
		}catch (ClassNotFoundException e){
			e.printStackTrace();
			return null;
		} catch(SQLException e){
			e.printStackTrace();
			return null;
		}
		
	}
	public Connection getConnection(){
		return connection;	
	}
	
	public Statement createStatement(){
		return st;
	}

	public static DbManager getInstance() throws SQLException {
		if (instance == null) {
			instance = new DbManager();
		} 
		else if (instance.getConnection().isClosed()) {
			instance = new DbManager();
		}
		
		return instance;
	}
}
	
</body>
</html>
