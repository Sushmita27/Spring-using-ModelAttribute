<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<%@ page isELIgnored="false" %>
<h1>Congratulations!!!!!You have successfully submitted the admission form</h1>
<h2>${msg}</h2>
<h1>Details submitted by you :</h1>
<table><tr><td>Student  name :</td><td>${student1.studentName}</td></tr>
<tr><td>Student hobby</td><td>${student1.studentHobby}</td></tr>
</table>
</body>
</html>