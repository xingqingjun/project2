<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/23
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>培训id</td>
        <td>培训名</td>
        <td>培训部门</td>
        <td>培训时间</td>
    </tr>
    <c:forEach items="${sessionScope.train}" var="train">
        <tr>
            <td>${train.id}</td>
            <td>${train.name}</td>
            <td>${train.dept}</td>
            <td>${train.time}</td>
            <td><a href="#" id="delete">删除</a></td>
            <td><a href="/admin/editTrain?id=${train.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
