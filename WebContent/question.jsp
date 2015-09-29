<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="master.utilities.counter" %>
    <%@ page import="master.DAO.QuestionPaperDAO" %>
     <%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome <%=session.getAttribute("uname") %>!
<% counter c=new counter();
c.countSet();
QuestionPaperDAO qpdao=new QuestionPaperDAO();
qpdao.flush();
ArrayList result=QuestionPaperDAO.getQuestions();
session.setAttribute("res", result);


%>
<form action="Questionsservlet" method="post">
<input type="submit" value="Submit">
</form>
</body>
</html>