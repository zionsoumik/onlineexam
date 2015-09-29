package master.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import master.DTO.Questions;
import master.utilities.ConnectionFactory;

public class QuestionPaperDAO {

	 static Connection cn=null;
		static Statement st=null;
		 static ResultSet rs=null;
		 ResultSet rs1=null;
		 PreparedStatement ps=null;
		// String sql="select * from questionnaire where questionno=?";
		// String sql1="select count(*) from questionnaire";
		 static String sql2="select * from questionnaire order by rand() limit 5";
		// Questions q=new Questions();
		int rnd;
		static ArrayList<Questions> arr=new ArrayList<Questions>();
		
		public void flush(){
			arr.clear();
		}
		public static ArrayList getQuestions()
		{
			
			try
			{
				ConnectionFactory con=new ConnectionFactory();
				cn=con.getConnection();
				st=cn.createStatement();
				
				
				//rs1=st.executeQuery(sql1);
				
				/*for(int i=1;i<4;i++)
				{
					
					ps=cn.prepareStatement(sql);
					ps.setInt(1, i);
					rs=ps.executeQuery();
					
				}
				while(rs.next()){
					for(int i=0;i<3;i++)
					{
						q[i].setQuestionno(rs.getInt(1));
						q[i].setAnswerno(rs.getString(7));
						q[i].setOption1(rs.getString(3));
						q[i].setOption2(rs.getString(4));
						q[i].setOption3(rs.getString(5));
						q[i].setOption4(rs.getString(6));
						q[i].setQuestion(rs.getString(2));
						System.out.println(q[i].getQuestionno());
						System.out.println(q[i].getQuestion());
						System.out.println(q[i].getOption1());
						System.out.println(q[i].getOption2());
						System.out.println(q[i].getOption3());
						System.out.println(q[i].getOption4());
						System.out.println(q[i].getAnswerno());
						
				
						
						
						
						
					}
				
			
				}*/
				
				/*for(int i=1;i<4;i++)
				{
				rnd = ( int )( Math.random() *i );
				ps=cn.prepareStatement(sql);
				ps.setInt(1, rnd);*/
				//Random randomGenerator = new Random();
				
				/*for (int idx = 1; idx <= 2; idx++){
				     rnd = randomGenerator.nextInt(10);
				      
				      ps=cn.prepareStatement(sql);
						ps.setInt(1, rnd);
				
				rs=ps.executeQuery();*/
				rs=st.executeQuery(sql2);
				while(rs.next())
				{
                   Questions q=new Questions();
					q.setQuestionno(rs.getInt(1));
					q.setAnswerno(rs.getString(7));
					q.setOption1(rs.getString(3));
					q.setOption2(rs.getString(4));
					q.setOption3(rs.getString(5));
					q.setOption4(rs.getString(6));
					q.setQuestion(rs.getString(2));
					arr.add(q);
					
				}
		
				
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		
		
			return arr;
	
			
		}
		
		
}
