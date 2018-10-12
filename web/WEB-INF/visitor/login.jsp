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
        $("#v1").blur(function () {
            var name=$("#v1").value()
            var password=$("#v2").value()
            var url="${pageContext.request.context}/visitor/findVisitor"
            var args={"name":name,"password":password}
            $.post(url,args,function (date) {
                if(date==""){
                    //用户存在
                    $("#s1").innerHTML="用户已存在"
                }
                if(date=="emtity"){
                    $("#s1").innerHTML="用户不能为空"
                }
                $("#s1").innerHTML="";
            })
        })
        $(function () {
            $("#but").click(function () {
                var name=$("#v1").value
                var password=$("#v2").value
                $.ajax({
                    type: 'post',
                    url:"${pageContext.request.context}/visitor/log",
                    data: {"name":name,"password":password},
                    dataType:"test",
                    success:function (date) {
                        if(date==fail){
                            $("#s2").innerHTML="登录失败"
                            return false
                        }
                        $("#s2").innerHTML="";
                    }
                })
            })
        })
    </script>

</head>
<body>
<form action="visitor/login">
    <input id="v1" type="text" name="name"><span id="s1"></span><br>
    <input id="v2" type="text" name="password">
    <span id="s2" style="color: red"></span>
    <input type="submit" value="登录" >
</form>

</body>
</html>
