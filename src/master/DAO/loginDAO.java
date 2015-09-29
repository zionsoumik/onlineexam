package master.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import master.utilities.ConnectionFactory;

public class loginDAO {
	 Connection cn=null;
	Statement st=null;
	 ResultSet rs=null;
	 PreparedStatement ps=null;
	 String sql="select * from userinfo where username=? and password=?";
	
	
	ArrayList arr=new ArrayList();
	public  boolean isuserexist(String uname,String pword){
		boolean flag=false;
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConnection();
			System.out.println(cn);
			ps=cn.prepareStatement(sql);
			ps.setString(1, uname);
			ps.setString(2, pword);
			rs=ps.executeQuery();
			flag=rs.next();
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return flag;
		
	}
}