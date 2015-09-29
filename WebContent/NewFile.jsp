<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<%  


int delay = 1000;
int period = 1000;
Timer timer = new Timer();

public int setInterval()
{
	
}


timer.scheduleAtFixedRate(new TimerTask() {
int interval=25;
    public void run() {
       System.out.println(setInterval());

    }
}, delay, period);

 %>

<body>

</body>
</html>