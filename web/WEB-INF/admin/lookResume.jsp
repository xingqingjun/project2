<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/13
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        $(function () {
            $(".time").click(function () {
                return false;
                var $id=$(".s1").val()
                var $interview=$(".interview").val()
                $.ajax({
                    url:"${pageContext.request.contextPath}/admin/editInterview",
                    data:{"id":$id,"interview":$interview},
                    type:"post",
                    datatype:"test",
                    success:function (data) {
                        if(data==fail){
                            return false;
                            alert("时间有误")
                        }
                    }
                })
            })
        })
    </script>
</head>
<body>
<form action="admin/editInterviewTime">

<table>
    <tr>
        <td colspan="4">${sessionScope.resume.name}的简历</td>
    </tr>
    <tr>
        <td>真实姓名</td>
        <td>${sessionScope.resume.name}</td>
        <td>性别</td>
        <td>${sessionScope.resume.sex}</td>
    </tr>
    <tr>
        <td>年龄</td>
        <td>${sessionScope.resume.age}</td>
        <td>学历</td>
        <td>${sessionScope.resume.education}</td>
    </tr>
    <tr>
        <td>联系方式</td>
        <td>${sessionScope.resume.phone}</td>
        <td>e-mail</td>
        <td>${sessionScope.resume.email}</td>
    </tr>
    <tr>
        <td>应聘职位</td>
        <td>部门:${sessionScope.resume.positon}职位:${sessionScope.resume.dept}</td>
        <td>政治面貌</td>
        <td>${sessionScope.resume.political}</td>
    </tr>
    <tr>
        <td>上份工作</td>
        <td>${sessionScope.resume.lastJob}</td>
        <td>工作经验</td>
        <td>${sessionScope.resume.workExperience}</td>
    </tr>
    <tr>
        <td>期望薪资</td>
        <td>${sessionScope.resume.salary}</td>
        <td>兴趣爱好</td>
        <td>${sessionScope.resume.habby}</td>
    </tr>
    <tr>
        <td><input id="s1" type="hidden" name="id" value="${sessionScope.id}"></td>
        <td colspan="1">面试时间:<input type="date" name="interviewTime"></td>
        <td colspan="1"><input id="time" type="submit"value="面试"></td>
        <td colspan="1"><a href="/admin/inputMainView">返回</a> </td>
    </tr>
</table>
</form>

</body>
</html>
