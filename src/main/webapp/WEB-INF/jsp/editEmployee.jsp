<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Edit Employee</h2>
<form action="../editEmployee" method="post">
    <input type="hidden" name="id" value="${employee.id}"/>
    First Name: <input type="text" name="firstName" value="${employee.firstName}"/><br/>
    Last Name: <input type="text" name="lastName" value="${employee.lastName}"/><br/>
    Email: <input type="text" name="email" value="${employee.email}"/><br/>
    Department: <input type="text" name="department" value="${employee.department}"/><br/>
    Salary: <input type="number" name="salary" value="${employee.salary}"/><br/>
    <button type="submit">Update</button>
</form>


</body>
</html>