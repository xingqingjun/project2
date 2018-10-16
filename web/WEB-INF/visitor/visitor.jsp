<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/12
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        $(function () {
          $("#e1").click(function () {
              var id=$(".e1").value
             $.ajax({
                 url:"${pageContext.request.context}/visitor/positon",
                 type:"post",
                 data:{"id":id},
                 datatype:"json",
                 sucess:function (data) {
                     for(i=0;i<data.length;i++){
                         $("#e3").append("<option value='"+data[i]+"'>"+data[i]+"</option>")
                     }

                 }

             })
          })
        })
    </script>
</head>
<body>
<form action="visitor/addResume">
    <input type="hidden" value="${sessionScope.id}" name="id">
<table>
    <tr>
        <td colspan="4">简历</td>
    </tr>
    <tr>
        <td>真实姓名</td>
        <td><input type="text" name="name"></td>
        <td>性别</td>
        <td><input type="radio" name="sex" value="男">
        <input type="radio"name="sex" value="女"></td>
    </tr>
    <tr>
        <td>年龄</td>
        <td><input type="text" name="age"></td>
        <td>学历</td>
        <td><select name="education">
            <option>大专</option>
            <option>本科</option>
            <option>研究生</option>
            <option>博士</option>
        </select></td>
    </tr>
    <tr>
        <td>联系方式</td>
        <td><input type="text" name="number"></td>
        <td>e-mail</td>
        <td><input type="text" name="email"></td>
    </tr>
    <tr>
        <td>应聘职位</td>
        <td>
            <select id="e1" name="dept">
                <c:forEach items="${sessionScope.dept}" var="dept">
                    <option value="${dept.id}">${dept.name}</option>
                </c:forEach>
            </select>
            <select id="e2" name="positon">
                <option id="e3"></option>
            </select>
        </td>
        <td>
            <select name="political">
                <option>普通群众</option>
                <option>共青团员</option>
                <option>中共党员</option>
            </select>
        </td>
    </tr>
    <tr>
        <td>上份工作</td>
        <td><input type="text" name="lastJob"></td>
        <td>工作经验</td>
        <td><input type="text" name="workExperience"></td>
    </tr>
    <tr>
        <td>期望薪资</td>
        <td>
            <select name="salary">
            <option>3000-4000</option>
            <option>4000-5000</option>
            <option>5000-6000</option>
            </select>
        </td>
        <td>兴趣爱好</td>
        <td><input type="text" name="habby"></td>
    </tr>
    <tr>
        <td colspan="1"><input type="submit" value="保存"></td>
        <td colspan="1"><a href="visitor/put?id=${sessionScope.resume.id}" id="t1">提交</a></td>
        <td colspan="2"><a href="visitor/visitorView">返回</a> </td>
    </tr>
</table>
</form>

</body>
</html>
