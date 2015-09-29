package master.utilities;
import java.sql.*;
public class ConnectionFactory {
Connection cn=null;

public Connection getConnection()
{
	try
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","animatrix");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return cn;
}

}
