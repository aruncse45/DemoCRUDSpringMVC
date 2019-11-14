<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: arunkundu
  Date: 11/13/19
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form:form action="/addPerson" method="post">

        <label>First name</label>
        <input type="text" name="firstName">
        <label>Last name</label>
        <input type="text" name="lastName">
        <label>Age</label>
        <input type="text" name="age">
        <input type="submit" name="submit" value="SUBMIT">
    </form:form>

</body>
</html>
