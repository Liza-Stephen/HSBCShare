<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>List of Employees</h2>
	<table border='1'>
		<tr>
			<th>Emp Id</th>
			<th>Name</th>
			<th>Salary</th>

		</tr>

		<c:forEach var="x" items="${emps}">
			<tr>
				<td>${x.empId}</td>
				<td>${x.name}</td>
				<td>${x.salary}</td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>