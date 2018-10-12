<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/11
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript"src="jquery-1.10.2.min.js"></script>
    <script>

        $(function () {
            $("#v1").blur(function () {
                var name=$("#v1").value()
                var url="${pageContext.request.context}/visitor/findVisitor"
                var args={"name":name}
                $.post(url,args,function (date) {
                    if(date=="no"){
                        //用户存在
                        $("#s1").innerHTML="用户已存在"
                    }
                    if(date=="emtity"){
                        $("#s1").innerHTML="用户不能为空"
                    }
                    $("#s1").innerHTML="";
                })
            })
        })
    </script>
</head>
<body>
<form action="visitor/regist">
    <input id="v1" type="text" name="name"><span id="s1"></span><br>
    <input type="text" name="password">
    <input type="submit" value="注册">
</form>

</body>
</html>
