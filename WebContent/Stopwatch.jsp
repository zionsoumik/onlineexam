<html>
<%@page session="false" %>




<% int a=25; %>
<head><title></title>
<script type="text/javascript">
var cmin=<%= a %>;
var total=cmin*60;
cmin=cmin-1;
var ctr=0;
var dom=document.getElementById("kulu");
function ram(){
var dom=document.getElementById("kulu");
dom.value=(cmin)+"minutes"+(total%60)+"seconds";



total=total-1;ctr++;
if(ctr==60){ctr=0;cmin=cmin-1;}
if(total==0){
ram1();}
setTimeout("ram()", 1000);
              }
function ram1(){

window.location.replace("/hcl/TTimeUp.jsp");

                }
</script>
</head>
<body onload="ram()">
<form name="form1">
<input type="text" id="kulu"/>
</form>

</body>
</html>

