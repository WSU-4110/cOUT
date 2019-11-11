package classes;
import java.util.Random;
import java.sql.SQLException;
import java.sql.*;
public class Classes {
	
	public int AddClass(String CourseID, String Classname, String name) throws ClassNotFoundException, SQLException {
	Random rand = new Random();
	int randint = rand.nextInt(100000);
	Class.forName("com.mysql.jdbc.Driver"); 
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cout", "root", "Sangeeta%1972"); 
	Statement st= con.createStatement();
	String sql = "insert into Courses (CrsId, CrsName, Professor, AccessCode)  values ('" +CourseID +"','" +Classname +"', '" +name +"' ," + randint + " )";
	int ta=st.executeUpdate(sql);
	ResultSet rs=st.executeQuery("select * from teachers where NAME='"+name+"'");
	rs.next();
	String email = rs.getString(3);
	rs.close();
	String sqt = "insert into Link_Courses(Student_Email, Courses_ID) values ('"+email+"', '"+randint+"')";
	int fa=st.executeUpdate(sqt);
	return randint;
	}
	
	
	
	public void JoinClass(String randint, String name) throws ClassNotFoundException, SQLException{
		
		String sqt = "select * from courses where AccessCode='"+randint+"'";
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cout", "root", "Sangeeta%1972"); 
		Statement st= con.createStatement();
		if (st.execute(sqt))
		{

		ResultSet sa=st.executeQuery("select * from students where NAME='"+name+"'");
		sa.next();
		String email = sa.getString(3);
		sa.close();
		String sqt2 = "insert into Link_Courses(Student_Email, Courses_ID) values ('"+email+"', '"+randint+"')";
		int fa=st.executeUpdate(sqt2);
		}
	
	}
}
