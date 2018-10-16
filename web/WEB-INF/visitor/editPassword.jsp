<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/13
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="visitor/editPassword">
<input type="hidden" name="id" value="${sessionScope.id}">
密码:<input name="password" type="text">
</form>
</body>
</html>
