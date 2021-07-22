<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 7/22/2021
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<h1>Test Login.</h1>
<form action="/login.html" method="post">
    <label>用户名：</label><input type="text" name="email" placeholder="电子邮箱">
    <br>
    <label>密码：</label><input type="password" name="password" placeholder="密码">
    <input type="submit" value="登陆">
    <br>
    ${msg}
</form>
</body>
</html>
