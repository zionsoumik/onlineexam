package master.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import master.DTO.useranswerDTO;
import master.DTO.userscore;
import master.utilities.ConnectionFactory;

public class scoredao {
	Connection cn=null;
	
	ResultSet rs=null;
	ResultSet rs1=null;
	ResultSet rs2=null;
	PreparedStatement ps=null;
	Statement st=null;
    String username;
    String answerno;
    int paperno;
    
    int i=0;
	
	String sql3="insert into userscore values(?,?,?)";
	int score=0;
	public void setScore(userscore usc,Useranswer uans){
		 try
			{
		    	
			 ConnectionFactory con=new ConnectionFactory();
				cn=con.getConnection();
			    ps=cn.prepareStatement(sql3);
			    ps.setString(1,usc.getUsername());
			    ps.setInt(2,usc.getPaperno());
			    ps.setInt(3, this.getscore(uans));
			    ps.executeUpdate();
			    	
			    
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		
	
		    
		}
	
	public int getscore(Useranswer uans) {

	    try
		{
	    	String pno=Integer.toString(uans.getPaperno());
	    	String sql="select count(*) from useranswer u,questionnaire q where u.questionno=q.questionno and u.answerno=q.answerno and paperno="+pno;
	    	ConnectionFactory con=new ConnectionFactory();
			cn=con.getConnection();
		    st=cn.createStatement();
		    
		    rs=st.executeQuery(sql);
		    if(rs.next())
		    	score=rs.getInt(1);
		    
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	return score;
	    
	}
		
}
	

