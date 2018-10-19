<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/12
  Time: 14:59
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
        <td>部门:${sessionScope.resume.dept}职位:${sessionScope.resume.positon}</td>
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
        <td><a href="/visitor/edt?id=${sessionScope.resume.id}">修改简历</a></td>
        <td colspan="1"><a href="/visitor/put?id=${sessionScope.resume.id}" id="t1">提交</a></td>
        <td colspan="2"><a href="/visitor/visitorView">返回</a> </td>
    </tr>
</table>

</body>
</html>
