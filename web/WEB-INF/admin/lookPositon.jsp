<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/19
  Time: 16:00
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
        <td>职位id</td>
        <td>职位名字</td>
        <td>所在部门</td>
    </tr>
    <c:forEach items="${sessionScope.positon}" var="positon">
        <tr>
            <td>${positon.id}</td>
            <td>${positon.name}</td>
            <%--<td>${sessionScope.dept}</td>--%>
            <td><a href="/admin/lookEmployee?positon=${positon.name}">查看${positon.name}员工</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
