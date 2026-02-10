<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User List</title>
    
</head>
<body>
    <h2>List of Users</h2>
    <div style="font-weight:bold;">
    Styling is Done for Bolding The Text
</div>

    
   <h2>List of Employees</h2>
<table border="1" cellpadding="8">
    <tr>
        <th>ID</th><th>First Name</th><th>Last Name</th><th>Actions</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>
                <a href="viewUser/${user.id}">View</a> |
                <a href="editUser/${user.id}">Edit</a> |
                <a href="deleteUser/${user.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>

 
    <c:forEach var="emp" items="${employees}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.firstName}</td>
            <td>${emp.lastName}</td>
            <td>
                <a href="employee/${emp.id}">View</a> 
                <a href="editEmployee/${emp.id}">Edit</a>
                <a href="deleteEmployee/${emp.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

    
        <!-- Button that navigates to employees list -->
    <form action="employees" method="get">
        <button type="submit">View Employees</button>
    </form>
    
    <form action="addEmployee" method="get"> <button type="submit">Add Employee</button> </form>
    
    <a href="users/new">Add New User</a>
</body>
</html>
