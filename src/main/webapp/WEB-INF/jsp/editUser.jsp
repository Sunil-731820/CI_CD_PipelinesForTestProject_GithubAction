<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="../update" method="post">
    <input type="hidden" name="id" value="${user.id}"/>
    First Name: <input type="text" name="firstName" value="${user.firstName}"/><br/>
    Last Name: <input type="text" name="lastName" value="${user.lastName}"/><br/>
    <input type="submit" value="Update"/>
</form>


</body>
</html>