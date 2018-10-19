<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/17
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工主界面</title>
    <script type="text/javascript" src="/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            $("#but").click(function () {
                $.ajax({

                })
            })
        })
    </script>
</head>
<body>
<h5 style="color: red">员工:${sessionScope.id}</h5>
<a href="/employee/look?id=${sessionScope.id}">查看个人信息</a>
<a href="/employee/check?id=${sessionScope.id}">查看考勤</a><br>
<button id="but1">上班签到</button><br>
<button id="but2">下班签到</button><br>

</body>
</html>
