<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/12
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h5 style="color:red">游客:${sessionScope.id}</h5>
<a href="visitor.jsp">添加简历</a>
<a href="visitor/showResume?id=${sessionScope.id}">查看简历</a>
</body>
</html>
