<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ page import="java.sql.*"%>
    
    
    <%@ page import="java.util.*"%>
    
    
    <%@ page import="master.DTO.Questions" %>
    
    
    <%@ page import="master.DAO.QuestionPaperDAO" %>
    
    
    <%@ page import="master.utilities.counter" %>
    
    
     <%@ page import="master.DTO.useranswerDTO" %>
     
     
    <%@ page import="master.DAO.Useranswer" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


 
    <%
    //QuestionPaperDAO qpdao=new QuestionPaperDAO();
    		 
    		  
    		  counter c=new counter();
    		  c.countdecrease();
    		  int count=c.getCount()+1;
    		  int a;
    		  ArrayList result=(ArrayList) session.getAttribute("res");
    		  Iterator itr=result.iterator();
    		  Questions q=(Questions) result.get(c.getCount());
    		  Useranswer uans=new Useranswer();
    			  
    		  
    %>
    <script> 

    var c=<%=count%>;


function gonext()
{	
	
	if(c<5){
	document.f2.action="questiondispnext.jsp?sr="+total;
	document.f2.method="post";
	document.f2.submit();
	}
	
	
	
	}
function goBack()
{
	document.f2.action="questiondispprev.jsp?sr="+total;
	document.f2.method="post";
	document.f2.submit();
	
	}
function gosubmit()
{

	
		document.f2.action="submit.jsp";
		document.f2.method="post";
		document.f2.submit();
		return true;
    
}
	alert(c);

	</script>
    <% 
    
    
    if(count>=1)
    {
    	
    	String coun=Integer.toString(count);
    	
    	
    	String option=request.getParameter("option");
    	
    	
    	session.setAttribute("ans"+coun,option);
    	
    	
    	a=Integer.parseInt(request.getParameter("sr"));
    	

    //out.println(uans.getUans(c.getCount()).getQuestionno());
    // out.println(uans.getUans(c.getCount()).getAnswerno());

    }else { a=120;} %>
    <script>





    var total=<%=a %>;

    var ctr=0;

    var dom=document.getElementById("kulu");
    function ram(){
    	var cmin=total/60;
    	var secs=total%60;
    var dom=document.getElementById("kulu");
    dom.value=(Math.round(cmin))+"minutes"+(secs)+"seconds";


    total=total-1;ctr++;
    if(ctr==60){ctr=0;cmin=cmin-1;}
    if(total==0){
    gosubmit();}
    
    setTimeout("ram()", 1000);
                  }

    </script>

    <body onload="ram()">

<form name="f2" method="post" action="">
  <table width="200" border="0">
  <tr>
<td>
<input type="text" id="kulu"/></td></tr>
       <tr>
       <tr>
      <td><%= q.getQuestionno() %></td>
      <td><%=q.getQuestion() %></td>
    </tr>
    <tr>
      <td><input type="radio" name="option" id="radio" value="a" />
      <label for="radio"></label></td>
      <td><%=q.getOption1() %></td>
    </tr>
    <tr>
      <td><input type="radio" name="option" id="radio2" value="b" />
      <label for="radio2"></label></td>
      <td><%=q.getOption2() %></td>
    </tr>
    <tr>
      <td><input type="radio" name="option" id="radio3" value="c" />
      <label for="radio3"></label></td>
      <td><%=q.getOption3() %></td>
    </tr>
    <tr>
      <td><input type="radio" name="option" id="radio4" value="d" />
      <label for="radio4"></label></td>
      <td><%=q.getOption4() %></td>
    </tr>
   
    
    <tr>
    <td><% if(count!=1){ %><input type="button" name="Previous" value="Previous" onclick="goBack()"/><% } %></td>
     <td>
        <% if(count!=5) {%><input type="button" name="Next" id="button" value="Next" onclick="gonext()"/><% } %>
      </td>
      <td>
      <input type="submit" name="Submit" id="button" value="Submit" onclick="gosubmit()"/>
    </tr>
  
  </table>
  
</form>
</body>
</html>