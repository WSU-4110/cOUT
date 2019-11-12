package aaa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
	
	private static DbManager instance;
	private Connection connection;
	private String url = "jdbc:mysql://localhost:3306/cout";
	private String userName = "root";
	private String password = "23paddock";
	
	private DbManager() throws SQLException {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, userName, password);
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
