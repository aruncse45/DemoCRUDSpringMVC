<%--
  Created by IntelliJ IDEA.
  User: arunkundu
  Date: 11/7/19
  Time: 5:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Display</title>
</head>
<body>


    <table>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
            <th colspan="2">Operation</th>
        </tr>

        <c:forEach var="person" items="${persons}">
            <tr>
                <td>${person.pId}</td>
                <td>${person.firstName}</td>
                <td>${person.lastName}</td>
                <td>${person.age}</td>
                <td><a href="/editPerson/${person.pId}">Edit</a></td>
                <td><a href="/deletePerson/${person.pId}">Delete</a></td>
            </tr>
        </c:forEach>


    </table>
</body>
</html>
