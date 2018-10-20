<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/20
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/admin/addPositon">
    <input type="hidden" value="${sessionScope.id}" name="deptId">
    职位名字<input type="text" name="name">
    <input type="submit" value="添加职位">
</form>

</body>
</html>
