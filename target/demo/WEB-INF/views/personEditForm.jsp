<%--
  Created by IntelliJ IDEA.
  User: arunkundu
  Date: 11/13/19
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h2>Person Edit Form</h2>
    <form:form method="post" action="/editSave">

        <form:hidden path="pId"/>

        <label>First name</label>
        <form:input path="firstName"/>
        <label>Last name</label>
        <form:input path="lastName"/>
        <label>Age</label>
        <form:input path="age"/>
        <input type="submit" name="submit" value="Edit save">
    </form:form>

</body>
</html>
