<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/12
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            $("#e1").blur(function () {
                var dept=$("#e1").val()
                alert(111)
                $.ajax({
                    url:"/visitor/positon",
                    type:"post",
                    data:{"dept":dept},
                    dataType:"json",
                    success:function (data) {
                        alert(data)
                        $.each(data,function (i,item) {
                            $("#e2").append("<option>"+item.name+"</option>")

                        })
                    }
                })
            })
        })
    </script>
</head>
<body>
<form action="/visitor/editResume">
    ${sessionScope.resume.id}
    <input  type="hidden" name="id" value="${sessionScope.resume.id}">
    <table>
        <tr>
            <td colspan="4">简历</td>
        </tr>
        <tr>
            <td>真实姓名</td>
            <td><input type="text" name="name" value="${sessionScope.resume.name}"></td>
            <td>性别</td>
            <td>
                <c:choose>
                    <c:when test="${'男'eq sessionScope.resume.sex}">
                        男:<input id="a1" type="radio" name="sex" value="男" checked="checked">
                        女:<input id="a2" type="radio"name="sex" value="女">
                    </c:when>
                </c:choose>
                <c:choose>
                    <c:when test="${'女'eq sessionScope.resume.sex}">
                        男:<input id="a1" type="radio" name="sex" value="男">
                        女:<input id="a2" type="radio"name="sex" value="女" checked="checked">
                    </c:when>
                </c:choose>
            </td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age" value="${sessionScope.resume.age}"></td>
            <td>学历</td>
            <td><select name="education">
                <option value="大专"<c:if test="${sessionScope.resume.education eq '大专'}">selected</c:if>>大专</option>
                <option value="本科"<c:if test="${sessionScope.resume.education eq '本科'}">selected</c:if>>本科</option>
                <option value="研究生"<c:if test="${sessionScope.resume.education eq '研究生'}">selected</c:if>>研究生</option>
                <option value="博士"<c:if test="${sessionScope.resume.education eq '博士'}">selected</c:if>>博士</option>
            </select></td>
        </tr>
        <tr>
            <td>联系方式</td>
            <td><input type="text" name="phone" value="${sessionScope.resume.phone}"></td>
            <td>e-mail</td>
            <td><input type="text" name="email" value="${sessionScope.resume.email}"></td>
        </tr>
        <tr>
            <td>应聘职位</td>
            <td>
                <select id="e1" name="dept">
                    <c:forEach items="${sessionScope.dept}" var="dept">
                        <option value="${dept.name}"<c:if test="${sessionScope.resume.dept eq dept.name}">selected</c:if>>${dept.name}</option>
                    </c:forEach>
                </select>
                <select id="e2" name="positon">
                </select>
            </td>
            <td>
                <select name="political">
                    <option value="普通群众"<c:if test="${sessionScope.resume.political eq '普通群众'}">selected</c:if>>普通群众</option>
                    <option value="共青团员"<c:if test="${sessionScope.resume.political eq '共青团员'}">selected</c:if>>共青团员</option>
                    <option value="中共党员" <c:if test="${sessionScope.resume.political eq '中共党员'}">selected</c:if>>中共党员</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>上份工作</td>
            <td><input type="text" name="lastJob" value="${sessionScope.resume.lastJob}"></td>
            <td>工作经验</td>
            <td><input type="text" name="workExperience" value="${sessionScope.resume.workExperience}"></td>
        </tr>
        <tr>
            <td>期望薪资</td>
            <td>
                <select name="salary">
                    <option value="3000-4000" <c:if test="${sessionScope.resume.salary eq '3000-4000'}">selected</c:if>>3000-4000</option>
                    <option value="4000-5000"<c:if test="${sessionScope.resume.salary eq '4000-5000'}">selected</c:if>>4000-5000</option>
                    <option value="5000-6000"<c:if test="${sessionScope.resume.salary eq '5000-6000'}">selected</c:if>>5000-6000</option>
                </select>
            </td>
            <td>兴趣爱好</td>
            <td><input type="text" name="habby" value="${sessionScope.resume.habby}"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="保存"></td>
            <td colspan="2"><a href="/visitor/visitorView">返回</a> </td>
        </tr>
    </table>
</form>

</body>
</html>
