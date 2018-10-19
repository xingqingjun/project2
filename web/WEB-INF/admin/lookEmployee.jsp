<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/19
  Time: 16:17
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
        <td>员工id</td>
        <td>员工姓名</td>
        <td>员工年龄</td>
        <td>员工性别</td>
        <td>员工部门</td>
        <td>员工职位</td>
        <td>员工联系电话</td>
        <td>员工学历</td>
        <td>员工薪资范围</td>
        <td>员工入职时间</td>
        <td>员工状态</td>
    </tr>
    <c:forEach items="${sessionScope.employees}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.age}</td>
            <td>${employee.sex}</td>
            <td>${employee.dept}</td>
            <td>${employee.positon}</td>
            <td>${employee.phone}</td>
            <td>${employee.education}</td>
            <td>${employee.salary}</td>
            <td>${employee.time}</td>
            <td>${employee.state}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
