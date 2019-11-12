
package Classes;
import java.sql.*;

public abstract class teacher implements signup{

	
	public static boolean registration(String name, String pwd, String email, Statement st) throws SQLException{
		
		int i=st.executeUpdate("insert into teachers(Name,password,email)values('"+name+"','"+pwd+"','"+email+"')"); 

	return true;
	}

}

