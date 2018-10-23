<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/20
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/admin/editPositon">
    <input type="hidden" value="${sessionScope.positon.id}" name="id">
    职位名字<input type="text" name="name" value="${sessionScope.positon.name}"><br>
    部门id<input type="text" name="deptId" value="${sessionScope.positon.deptId}">
    <input type="submit" value="修改职位">
</form>

</body>
</html>
