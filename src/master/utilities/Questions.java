// Loading required libraries
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
 
public class Questions extends HttpServlet{
    
  protected void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
  
  
       response.setContentType("text/html");
        //Get the course in which user wants to take a test!!
     int course=Integer.parseInt(request.getParameter("course_id"));
       
      // JDBC driver name and database URL
      static final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
      static final String DB_URL="jdbc:mysql://localhost/EXAM";

      //  Database credentials
      static final String USER = "root";
      static final String PASS = "shree";
      
    
      try{
         // Register JDBC driver
         Class.forName("com.mysql.jdbc.Driver");

         // Open a connection
         conn = DriverManager.getConnection(DB_URL,USER,PASS);

         // Execute SQL query
         stmt = conn.createStatement();
         String sql,sqlanswer;
         sql = "SELECT * FROM Question_Details WHERE c_id=course";
         ResultSet rs = stmt.executeQuery(sql);
         
         int questionarray[]=new int[100];
         int answerarray[]=new int[100];
         String questions[]=new String[100];
         int c=0,count=0;
         // Extract data from result set
         while(rs.next()){
            //Retrieve by column name
            //and insert the question ids in questionarray of the course_id
            questionarray[c++]=rs.getInt("Q_ID");
           
           }
           // randomly generate question id without any duplicacy
           
     int f=1;
     int l=10; // total no of questions in a set 
    int finalquestion[]=new int[l];
    for(int j=0;j<l;j++)
    {
       int rnd = new Random().nextInt(questionarray.length);
       for(int k=0;k<finalquestion.length;k++)
       {
           if(rnd==finalquestion[k])
          {
            //  System.out.println("in duplicate true :)");
             f=0;
             break;
           }
        }
       if(f==1)      
           finalquestion[j]=questionarray[rnd];
       else
          {
              j--;
              f=1;
           }       
    }
       
//now finalquestion array contains the questionid...     
 for(int k=0;k<finalquestion.length;k++)
 {     
         int ques_id=finalquestion[k];
         sqlanswer = "SELECT ans_id,Questions FROM Question_Details WHERE Q_ID=ques_id";
         ResultSet rs = stmt.executeQuery(sqlanswer);
         answerarray[count]=rs.getInt("ans_id");
         questions[count++]=rs.getString("Questions");
 }         
           
           
           
            //Display values
           //here  comes the question answer page code or can redirect it too....
 
 }
         // Clean-up environment
         rs.close();
         stmt.close();
         conn.close();
      }catch(SQLException se){
         //Handle errors for JDBC
         se.printStackTrace();
      }catch(Exception e){
         //Handle errors for Class.forName
         e.printStackTrace();
      }finally{
         //finally block used to close resources
         try{
            if(stmt!=null)
               stmt.close();
         }catch(SQLException se2){
         }// nothing we can do
         try{
            if(conn!=null)
            conn.close();
         }catch(SQLException se){
            se.printStackTrace();
         }//end finally try
      } //end try
   }
