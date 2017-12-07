<%@taglib uri="/tags/struts-html" prefix="html"%>
<%@ taglib uri="/tags/struts-bean" prefix="bean"%>
<%@ taglib uri="/tags/struts-logic" prefix="logic"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="default.css"/>
<title>Payroll System</title>
</head>
<html:errors/>
<body>
<div id="login">
<jsp:include page="language.jsp"></jsp:include>
</div>
<div id="logout">
<a href="/PayrollSystem/logout.do">Logout</a>
</div>
<br>
<table id="whole" align="center">
<tr>
<td>
<table id="title" align="center">
<tr>
<td>
<div id="ntt" align="center"><h1>NTTDATA PayRoll Management System</h1></div>
<td>
</tr>
</table>
</td>
</tr>
<tr>
<td>
<jsp:include page="/jsp/admintaskmenu.jsp"></jsp:include>
</td>
</tr>
<tr>
<td>
<table id="content">
<tr>
<td>
<%-- <html:form action="/checklogin" method="post"> --%>
<table align="center">
<tr>
<td colspan="2">
<p id="tasks" align="center">
<b><font color="yellow">There are tasks of one admin.<br>
He can add employee,search employee and add allowance.</font></b>
</p>
</td>
</tr>
<tr>
<td colspan="2" align="center">
<img src="fp_04.jpg">
</td>
</tr>
</table>
</td>
</tr>
<tr>
<td>
</td>
</table>

</td>
</tr>
</table>
</body>
</html>