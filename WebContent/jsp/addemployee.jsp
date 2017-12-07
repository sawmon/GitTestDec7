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
<div id="logout">
<a href="/PayrollSystem/logout.do">Logout</a>
</div>
<br>
<table id="whole2" align="center">
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
<html:form action="/addemployeepage" method="post">
<table id="contentdata" align="center">
<tr>
<td>
<b><font color="yellow"><bean:message key="label.employeeId"></bean:message></font></b>
</td>
<td>
<html:text property="employeeId"></html:text>
<font color="red">
<html:errors property="employeeId"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.employeeName"></bean:message></font></b>
</td>
<td>
<html:text property="employeeName"></html:text>
<font color="red">
<html:errors property="employeeName"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.deptId"></bean:message></font></b>
</td>
<td>
<html:select property="deptId">
<html:option value="HR">HR</html:option>
<html:option value="development">Development</html:option>
</html:select>
<font color="red">
<html:errors property="deptId"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.position"></bean:message></font></b>
</td>
<td>
<html:select property="position">
<html:option value="jse">JSE</html:option>
<html:option value="se">SE</html:option>
<html:option value="sse">SSE</html:option>
<html:option value="assistant">Assistant</html:option>
<html:option value="manager">Manager</html:option>
<html:option value="ceo">CEO</html:option>
</html:select>
<font color="red">
<html:errors property="position"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.fn"></bean:message></font></b>
</td>
<td>
<html:text property="fatherName"></html:text>
<font color="red">
<html:errors property="fatherName"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.mn"></bean:message></font></b>
</td>
<td>
<html:text property="motherName"></html:text>
<font color="red">
<html:errors property="motherName"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.permenent"></bean:message></font></b>
</td>
<td>
<html:text property="permentAddress"></html:text>
<font color="red">
<html:errors property="permentAddress"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.current"></bean:message></font></b>
</td>
<td>
<html:text property="currentAddress"></html:text>
<font color="red">
<html:errors property="currentAddress"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.nrc"></bean:message></font></b>
</td>
<td>
<html:text property="nationalId"></html:text>
<font color="red">
<html:errors property="nationalId"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.contactno"></bean:message></font></b>
</td>
<td>
<html:text property="contactNo"></html:text>
<font color="red">
<html:errors property="contactNo"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.email"></bean:message></font></b>
</td>
<td>
<html:text property="email"></html:text>
<font color="red">
<html:errors property="email"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.salary"></bean:message></font></b>
</td>
<td>
<html:text property="salaryPerDay"></html:text>
<font color="red">
<html:errors property="salaryPerDay"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.overtime"></bean:message></font></b>
</td>
<td>
<html:text property="overtimeRatePerHour"></html:text>
<font color="red">
<html:errors property="overtimeRatePerHour"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.bankacc"></bean:message></font></b>
</td>
<td>
<html:text property="accNumber"></html:text>
<font color="red">
<html:errors property="accNumber"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.status"></bean:message></font></b>
</td>
<td>
<html:text property="status"></html:text>
<font color="red">
<html:errors property="status"/></font>
</td>
</tr>
<tr>
<td>
<b><font color="yellow"><bean:message key="label.password"></bean:message></font></b>
</td>
<td>
<html:password property="password"></html:password>
<font color="red">
<html:errors property="password"/></font>
</td>
</tr>
<tr>
<td>
</td>
<td colspan="2">
<html:submit>AddEmployee</html:submit>
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