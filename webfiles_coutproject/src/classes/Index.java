package classes;
import java.sql.*;
public abstract class Index  {
	public abstract boolean SQLcheck(String userid,Statement st)throws SQLException ;
	public abstract boolean passwordCheck(String userid, String pwd,Statement st)throws SQLException ;
	public final boolean process(String userid, String pwd, Statement st) throws ClassNotFoundException, SQLException
	{

		if(SQLcheck(userid, st))
		{
			return passwordCheck(userid, pwd,st);
		}
		else
			return false;
	}
}
class students extends Index
{
	@Override
	public boolean SQLcheck(String userid, Statement st) throws SQLException {
		String sqlS = "select * from students where EMAIL='"+userid+"'";
		if (st.execute(sqlS))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean passwordCheck(String userid, String pwd, Statement st) throws SQLException {
		ResultSet sa=st.executeQuery("select * from students where EMAIL='"+userid+"'");
		if(sa.next())
		{
			if(sa.getString(6).equals(pwd)) 
			{ 
			return true;
			}
			else
			{ 
			return false;
			} 
		}
		else
			return false;
	
}
}
class teachers extends Index{

	@Override
	public boolean SQLcheck(String userid, Statement st) throws SQLException {
		String sqlS = "select * from teachers where EMAIL='"+userid+"'";
		if (st.execute(sqlS))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean passwordCheck(String userid, String pwd, Statement st) throws SQLException {
		ResultSet sa=st.executeQuery("select * from teachers where EMAIL='"+userid+"'");
		if(sa.next())
		{
			if(sa.getString(6).equals(pwd)) 
			{ 
			return true;
			}
			else
			{ 
			return false;
			} 
		}
		else
			return false;
	
}
}