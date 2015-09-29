<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>
<script>
function gonext()
{
	document.forms[0].action="question2.jsp";
	document.forms[0].method="post";
	document.forms[0].submit();
	
	}</script>
<form id="form1" name="form1" method="post" >
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <div align="center">
    <table width="284" border="0">
      <tr>
        <td colspan="2">1. who is the prime minister of india?</td>
      </tr>
      <tr>
        <td width="70"><input type="radio" name="101" id="radio" value="radio" />
          <label for="radio"></label></td>
        <td width="204">Narendra Modi </td>
      </tr>
      <tr>
        <td><input type="radio" name="102" id="radio2" value="radio2" />
          <label for="radio2"></label></td>
        <td>Dr. Manmohan Singh</td>
      </tr>
      <tr>
        <td><input type="radio" name="103" id="radio3" value="radio3" />
          <label for="radio3"></label></td>
        <td>Sonia Gandhi</td>
      </tr>
      <tr>
        <td><input type="radio" name="104" id="radio4" value="radio4" />
          <label for="radio4"></label></td>
        <td>Atal Vihari Vajpayee</td>
      </tr>
      <tr>
        
        <td><a href="question2.jsp"><input type="button" name="button2" id="button2" value="Next" onclick="gonext()"/></a></td>
      </tr>
    </table>
  </div>
  <p>&nbsp;</p>
</form>
</body>
</html>
