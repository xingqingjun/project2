<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/19
  Time: 15:29
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
        <td>部门id</td>
        <td>部门名字</td>
        <td>创建时间</td>
    </tr>
    <c:forEach items="${sessionScope.dept}" var="dept">
        <tr>
            <td>${dept.id}</td>
            <td>${dept.name}</td>
            <td>${dept.time}</td>
            <td><a href="/admin/lookPositon?id=${dept.id}">查看${dept.name}职位</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
