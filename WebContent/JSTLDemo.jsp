<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
SQL Demo
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost/employee" user="root" password="" />
	<sql:query var="rs" dataSource="${db}">select * from students</sql:query>
	<c:forEach items="${rs.rows}" var="data">
		<table border="1px">
			<tr>
				<td><c:out value="${data.student_no}"></c:out></td>
				<td><c:out value="${data.surname}"></c:out></td>
				<td><c:out value="${data.forename}"></c:out></td>
			</tr>
		</table>
	</c:forEach>
Function Demo	
<c:set var="String" value="My name is Alkesh Sakhare"></c:set>
<c:if test="${fn:contains(String, 'Alkesh')}">  
   <p>Found Alkesh string<p>  
</c:if> 
</body>
</html>