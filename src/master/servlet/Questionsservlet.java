package master.servlet;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import master.DAO.QuestionPaperDAO;

import java.sql.*;
 
public class Questionsservlet extends HttpServlet{
    
  protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
 
     {
           
          response.sendRedirect("questiondispnext.jsp");
         
          
  
     }
  
}
