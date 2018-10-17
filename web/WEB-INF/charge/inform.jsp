<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/17
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="jquery-1.10.2.min.js"></script>
    <script>

    </script>
</head>
<body>
<table>
    <tr>
        <td>姓名</td>
        <td>面试部门</td>
        <td>面试职位</td>
        <td>面试时间</td>
        <td>联系电话</td>
    </tr>
    <c:forEach items="${sessionScope.resume}" var="resume">
        <tr>

            <td>${resume.name}</td>
            <td>${resume.dept}</td>
            <td>${resume.positon}</td>
            <td>${resume.interviewTime}</td>
            <td>${resume.phone}</td>
            <td>录用状态:${resume.record}</td>
            <td><a href="/charge/record?id=${resume.id}">录用</a></td>
            <td><a>不录用</a></td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
