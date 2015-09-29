package master.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import master.DTO.userinfoDTO;
import master.utilities.ConnectionFactory;

public class regisDAO {
	Connection cn=null;
	Statement st=null;
	ResultSet rs=null;
	PreparedStatement ps=null;
	String sql="insert into userinfo values(?,?,?,?,?)";
	String sql1="select * from userinfo where username=?";
	ArrayList arr=new ArrayList();
	public boolean isuserexist(String uname){
		boolean flag=false;
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConnection();
			System.out.println(cn);
			ps=cn.prepareStatement(sql1);
			ps.setString(1, uname);
			rs=ps.executeQuery();
			flag=rs.next();
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return flag;
		
	}
	public void insertData(userinfoDTO udto)
	{
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConnection();
			System.out.println(cn);
			ps=cn.prepareStatement(sql);
			
			ps.setString(1,udto.getFirstname());
			ps.setString(2,udto.getLastname());
			ps.setString(3, udto.getEmailid());
			ps.setString(4,udto.getUsername());
			ps.setString(5,udto.getPassword());
			ps.executeUpdate();
			cn.commit();
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	
			
	
}
