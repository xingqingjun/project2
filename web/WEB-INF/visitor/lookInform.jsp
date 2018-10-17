<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/15
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>通知</title>
</head>
<body>
<table>
    <tr>
        <td>姓名</td>
        <td>部门</td>
        <td>职位</td>
        <td>面试时间</td>
    </tr>
    <tr>
        <td>${sessionScope.resume.name}</td>
        <td>${sessionScope.resume.dept}</td>
        <td>${sessionScope.resume.positon}</td>
        <td>${sessionScope.resume.interview}</td>
    </tr>
</table>

</body>
</html>
