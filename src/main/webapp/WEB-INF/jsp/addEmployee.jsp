<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Add Employee</h2>
<form action="addEmployee" method="post">
    First Name: <input type="text" name="firstName"/><br/>
    Last Name: <input type="text" name="lastName"/><br/>
    Email: <input type="text" name="email"/><br/>
    Department: <input type="text" name="department"/><br/>
    Salary: <input type="number" name="salary"/><br/>
    <button type="submit">Save</button>
</form>
