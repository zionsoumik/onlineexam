<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
    <%@ page import="java.util.*"%>
    <%@ page import="master.DTO.useranswerDTO" %>
    <%@ page import="master.DAO.QuestionPaperDAO" %>
    <%@ page import="master.utilities.counter" %>
    <%@ page import="master.DAO.Useranswer" %>
    <%@ page import="master.DTO.Questions" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


 <% 
 
    if(counter.getCount()>0)
    {
    	
    	String coun=Integer.toString(counter.getCount()+1);
    	String option=request.getParameter("option");
    	session.setAttribute("ans"+coun,option);
    }
   
    %>
    <% useranswerDTO uans=new useranswerDTO();
    
    Questions q=new Questions();
    ArrayList arr=(ArrayList) session.getAttribute("res");
    
    
 %>

 
 
 <body >
<form name="f3" method="post" action="Scoreservlet">
  <table width="279" border="0">
  
    <tr>
      <td width="62">
      <% q=(Questions) arr.get(0); %><%=q.getQuestionno() %>
      </td>
      <td width="62"><%=session.getAttribute("ans"+"1") %></td>

    </tr>
    <tr>
      <td width="62">
      <% q=(Questions) arr.get(1); %><%=q.getQuestionno() %>
      </td>
      <td width="62"><%=session.getAttribute("ans"+"2") %></td>
      
    </tr>
    <tr>
      <td width="62">
      <% q=(Questions) arr.get(2); %><%=q.getQuestionno() %>
      </td>
      <td width="62"><%=session.getAttribute("ans"+"3") %></td>
     
    </tr>
    <tr>
      <td width="62">
      <% q=(Questions) arr.get(3); %><%=q.getQuestionno() %>
      </td>
      <td width="62"><%=session.getAttribute("ans"+"4") %></td>
      
    </tr>
    <tr>
      <td width="62">
      <% q=(Questions) arr.get(4); %><%=q.getQuestionno() %>
      </td>
      <td width="62"><%=session.getAttribute("ans"+"5") %></td>
      
    </tr>
    <tr>
    <td>
    <input type="submit" name="Submit"></td></tr>
    
  </table>
  
</form>
</body>
</html>