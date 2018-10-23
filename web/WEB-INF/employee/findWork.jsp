<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/22
  Time: 23:26
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
        <td>id</td>
        <td>员工姓名</td>
        <td>日期</td>
        <td>上班打卡时间</td>
        <td>下班打卡时间</td>
        <td>迟到分钟</td>
        <td>旷工次数</td>
        <td>早退分钟</td>
        <td>加班小时</td>
    </tr>
    <c:forEach items="${sessionScope.workRecord}" var="work">
        <tr>
            <td>${work.id}</td>
            <td>${work.name}</td>
            <td>${work.time}</td>
            <td>${work.clockIn}</td>
            <td>${work.clockOut}</td>
            <td>${work.late}</td>
            <td>${work.absent}</td>
            <td>${work.leave}</td>
            <td>${work.overTime}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
