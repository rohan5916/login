<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<h2>Agent Details</h2>


	<table border='1'>
		<tr>
			<th>AGENT CODE</th>
			<th>AGENT NAME</th>
			<th>WORKING AREA</th>
			<th>COMMISSION</th>
			<th>PHONE NO</th>
			<th>COUNTRY</th>
		</tr>

		<c:forEach items="${agent}" var="agent">
			<tr>
				<td>${agent.AGENT_CODE}</td>
				<td>${agent.AGENT_NAME}</td>
				<td>${agent.WORKING_AREA}</td>
				<td>${agent.COMMISSION}</td>
				<td>${agent.PHONE_NO}</td>
				<td>${agent.COUNTRY}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>