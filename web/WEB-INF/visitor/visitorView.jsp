<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/12
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        $(function () {
            $("#exit").click(function () {
                var ex=confirm("是否确定退出")
                if(ex==true){
                   alert("成功退出")
                }else {
                    return false
                    alert("取消退出")
                }
            })
        })
    </script>
</head>
<body>
<h5 style="color:red">游客:${sessionScope.id}</h5>
<a href="/visitor/aResume?id=${sessionScope.id}">添加简历</a>
<a href="/visitor/showResume?id=${sessionScope.id}">查看简历</a>
<a href="/visitor/edt?id=${sessionScope.id}">修改简历</a>
<a href="/visitor/ePassword?${sessionScope.id}">修改密码</a>
<a href="/visitor/inform?id=${sessionScope.id}">查看通知</a>
<a href="/visitor/inputMainView" id="exit">退出</a>
</body>
</html>
