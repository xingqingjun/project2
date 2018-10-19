<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/18
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息</title>
</head>
<body>
<form action="/employee/edit">
    <input type="hidden" value="${sessionScope.employee.id}" name="id">
<table border="2px">
    <tr>
        <td>真实姓名</td>
        <td>${sessionScope.employee.name}></td>
        <td>性别</td>
        <td>${sessionScope.employee.sex}</td>
    </tr>
    <tr>
        <td>年龄</td>
        <td><input type="text" name="age" value="${sessionScope.employee.age}"></td>
        <td>学历</td>
        <td>${sessionScope.employee.education}</td>
    </tr>
    <tr>
        <td>联系方式</td>
        <td><input type="text" name="phone" value="${sessionScope.employee.phone}"></td>
        <td>薪水范围</td>
        <td>${sessionScope.employee.salary}</td>
    </tr>
    <tr>
        <td>入职时间</td>
        <td>${sessionScope.employee.time}</td>
        <td><input type="submit" value="修改"></td>
        <td><a href="/employee/inputMainview">返回员工主界面</a></td>
    </tr>
</table>
</form>

</body>
</html>
