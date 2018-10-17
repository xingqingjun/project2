<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/17
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h5>${sessionScope.id}</h5>
<a href="employee/look?id=${sessionScope.id}">查看个人信息</a>

</body>
</html>
