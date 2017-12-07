<%@taglib uri="/tags/struts-html" prefix="html"%>
<%@ taglib uri="/tags/struts-bean" prefix="bean"%>
<%@ taglib uri="/tags/struts-logic" prefix="logic"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="default.css"/>
<title>Payroll System</title>
</head>

<body>
<div id="login">
<jsp:include page="language.jsp"></jsp:include>
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
<table id="menu">
</table>
</td>
</tr>
<tr>
<td>
<table id="content">
<tr>
<td>
<html:form action="/checklogin" method="post">
<table id="contentdata" align="center">
<tr>
<td colspan="2">
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.userid"></bean:message></font></b>
</td>
<td>
<html:text property="userid"></html:text>
<html:errors property="no.userid"/>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.password"></bean:message></font></b>
</td>
<td>
<html:password property="password"></html:password>
<html:errors property="no.password"/>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.logintypes"/></font></b>
</td>
<td>
<html:radio property="logintypes" value="user">User</html:radio>
<html:radio property="logintypes" value="admin">SystemAdmin</html:radio>
<html:errors property="no.logintypes"/>
</td>
</tr>
<tr>
<td></td>
<td align="center">
<html:submit>Login</html:submit>
</td>
</tr>
</table>
</html:form>
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