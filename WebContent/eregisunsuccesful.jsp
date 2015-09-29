<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Student Registration Form</title>
<link type="text/css"  rel="stylesheet" href="estyle1.css">

</head>
 
<body>
Sorry the Username already exists!<br>
<img alt="full screen background image" src="imagesform.jpeg" id="full-screen-background-image" /> 
<h3>STUDENT REGISTRATION FORM</h3>
<form name="form1" action="regisservlet"  method="POST">
 
<table align="center" cellpadding = "10">
 
<!----- First Name ---------------------------------------------------------->

<tr>
<td>FIRST NAME *</td>
<td><input type="text" name="firstname" maxlength="25"/>
(max 25 characters a-z and A-Z)
</td>
</tr>
 
<!----- Last Name ---------------------------------------------------------->

<tr>
<td>LAST NAME *</td>
<td><input type="text" name="lastname" maxlength="25"/>
(max 25 characters a-z and A-Z)
</td>
</tr>
 
<!----- Date Of Birth -------------------------------------------------------->


 
<!----- Email Id ---------------------------------------------------------->

<tr>
<td>EMAIL ID *</td>
<td><input type="text" name="emailid" maxlength="25" /></td>
</tr>
 


 
<!------------Username & Password------------------------------------->
<tr>
<td>Choose your Username *</td>
<td><input type="text" name="username" />
             <span id="status"></span> <br/></td>
</tr>


<tr>
<td>Enter your Password *</td>
<td><input type="password" name="password"  /></td>
</tr>


 

<!----- Submit and Reset ------------------------------------------------->
<tr>
<td colspan="2" align="center">
<input name="submit" type="submit" value="Submit" id="submit">
<input type="reset" value="Reset">
</td>
</tr>
</table>
 
</form>
 <a href="examhome.jsp">Back To Home Page</a>
</body>
</html>
