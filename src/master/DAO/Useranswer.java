package master.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.RequestUtil;

import master.DTO.Questions;
import master.DTO.useranswerDTO;
import master.utilities.ConnectionFactory;

public class Useranswer {

	
	
	Connection cn=null;
	Statement st=null;
	ResultSet rs=null;
	PreparedStatement ps=null;
    String username;
    String answerno;
    int paperno;
    int questiono;
    
    
    int i=0;
	
	String sql1="insert into useranswer values(?,?,?,?)";
	String sql2="select max(paperno) from useranswer";
	
	public static void setuseranswerarray(int questionno,String answerno)
	{
		try{
			
		
		
		}
		catch(NullPointerException ne)
		{
			ne.printStackTrace();
		}
	}

	public void insertData(useranswerDTO udto,int size){
		try
		{
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConnection();
		    ps=cn.prepareStatement(sql1);
		    int i=0;
		    st=cn.createStatement();
		    rs=st.executeQuery(sql2);
		    /*if(rs==null)
		    	paperno=1;
		    else
		    	if (rs.next()) {
		    		   paperno=rs.getInt(1)+1;}*/
		   paperno=this.getPaperno()+1;
		    udto.setPaperno(paperno);
		    System.out.println(rs.getInt("max(paperno)"));
		    while(i<size){
		    	ps.setInt(1, paperno);
		    	System.out.println(paperno);
		    	System.out.println(size);
		    	
		    	System.out.println(udto.getQuestionno(i));
		    	System.out.println(udto.getAnswerno(i));
		    	ps.setInt(2, udto.getQuestionno(i));
		    	ps.setString(3, udto.getAnswerno(i));
		    	ps.setString(4, udto.getUsername());
		    	ps.executeUpdate();
		    	i++;
		    }
		    
		    
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	
	}
public int getPaperno(){
	int pno = 0;
	try
	{
		
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConnection();
		st=cn.createStatement();
	  rs=st.executeQuery(sql2);
	    if(rs==null)
	    	paperno=1;
	    else
	    	if (rs.next()) {
	    		   pno=rs.getInt(1);}
}catch(SQLException se)
{
	se.printStackTrace();
}
	return pno;
}

}
	