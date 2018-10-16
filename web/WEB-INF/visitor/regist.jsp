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
    <title>$Title$</title>
    <script type="text/javascript" src="jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            $("#v1").blur(function () {
                var name=$("#v1").val();
                var url="${pageContext.request.contextPath}/visitor/findVisitor"
                var args={"name":name}
                $.post(url,args,function (data) {
                    alert(data)

                    if(data=="emtity"){
                        $("#s1").text("用户不能为空")

                    }else {
                        if(data=="no"){
                            //用户存在
                            $("#s1").text("用户已存在")
                        }else {
                            $("#s1").text("")
                        }
                    }
                })
            })
        })
    </script>
</head>
<body>
<form action="visitor/regist">
    用户:<input id="v1" type="text" name="name">
    <span id="s1" style="color: red"></span><br>
    密码:<input type="text" name="password">
    <input type="submit"value="注册">
</form>
</body>
</html>
