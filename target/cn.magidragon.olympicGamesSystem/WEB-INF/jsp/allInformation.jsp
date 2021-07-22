<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 7/21/2021
  Time: 12:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>test page for Allinformation.jsp</title>
</head>
<body>
test page for Allinformation.jsp

<table>
<thead>
<tr>
    <th>id</th>
    <th>name</th>
    <th>password</th>
    <th>email</th>
    <th>phone</th>
    <th>major</th>
    <th>limit</th>
</tr>
</thead>

<tbody>
<%--    <c:forEach var="info" items="${information}" />--%>
    <c:forEach var="info" items="${information}">
    <tr>
        <td>${info.id}</td>
        <td>${info.name}</td>
        <td>${info.password}</td>
        <td>${info.email}</td>
        <td>${info.phone}</td>
        <td>${info.major}</td>
        <td>${info.limit}</td>
    </tr>
</c:forEach>
</tbody>
</table>
</body>
</html>
