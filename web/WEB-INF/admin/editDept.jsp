<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/20
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/admin/editDept">
    <input type="hidden" value="${sessionScope.dept.id}" name="id">
    部门名字<input name="name" value="${sessionScope.dept.name}">
    <input type="submit" value="修改部门">
</form>

</body>
</html>
