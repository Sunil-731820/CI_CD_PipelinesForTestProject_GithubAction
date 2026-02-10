<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Employee Details</h2>
	<p>ID: ${employee.id}</p>
	<p>Name: ${employee.firstName} ${employee.lastName}</p>
	<p>Email: ${employee.email}</p>
	<p>Department: ${employee.department}</p>
	<p>Salary: ${employee.salary}</p>

</body>
</html>