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
            $("#in").click(function () {
                var id=$("#eid").val()
                alert(id)
                $.ajax({
                    url:"${pageContext.request.contextPath}/employee/clockIn",
                    type:"post",
                    data:{"id":id},
                    dataType:"text",
                    success:function (data) {
                        if(data=="success"){
                            alert("打卡成功")
                        }
                        if(data=="hour"){
                            alert("你已迟到"+data+"小时")
                        }
                        if(data=="absent"){
                            alert("你已旷工")
                        }
                        else {
                            alert("你已打过卡")
                        }
                    }

                })
            })
            $("#out").click(function () {
                var id=$("#eid").val()
                alert(id)
                $.ajax({
                    url:"${pageContext.request.contextPath}/employee/clockOut",
                    type:"post",
                    data:{"id":id},
                    dataType:"text",
                    success:function (data) {
                        if(data=="a1"){
                            alert("你今天已记录旷工")
                        }
                        if(data=="a2"){
                            alert("正常打卡")
                        }
                        if(data=="a3"){
                            alert("你已早退")
                        }
                        if(data=="a4"){
                            alert("你已旷工")
                        }
                        if(data=="minute"){
                            alert("加班")
                        }if(data=="fal"){
                            alert("上班卡没打")
                        }
                        else {
                            alert("你已打卡")
                        }
                    }

                })
            })
        })
    </script>
</head>
<body>
<input type="hidden" value="${sessionScope.id}"id="eid">
<h5 style="color: red">员工:${sessionScope.id}</h5>
<a href="/employee/look?id=${sessionScope.id}">查看个人信息</a>
<a href="/employee/check?id=${sessionScope.id}">查看考勤</a><br>
<a id="in" href="#">上班签到</a>
<a id="out" href="#">下班签到</a>
</body>
</html>
