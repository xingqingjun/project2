<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/13
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        $(function () {
           $(".delete").click(function () {
               var $a = $(this);
               var $td = $(this).parent().parent().children();
               var id=$td[0].innerHTML
               $.ajax({
                  url:"${pageContext.request.contextPath}/admin/remove",
                   type:"post",
                   datatype:"test",
                   data:{"id":id},
                   success:function (data) {
                      if(data==success){
                          var q=confirm("是否删除id为"+id+"的简历")
                          if(q==true){
                              $a.parent().parent().remove();
                          }else {
                              alert("删除失败")
                          }
                      }
                   }
               })
           })
        })
    </script>
</head>
<body>
<table>
<tr>
    <td>ID</td>
    <td>姓名</td>
    <td>提交时间</td>
    <td>查看状态</td>
    <td>面试状态</td>
    <td colspan="2">操作</td>
</tr>
    <c:forEach items="${sessionScope.resume}" var="resume">
        <tr>
            <td>${resume.id}</td>
            <td>${resume.name}</td>
            <td>${resume.time}</td>
            <td>${resume.look}</td>
            <td>${resume.interview}</td>
            <td><a href="visitor/showResume?id=${resume.id}">查看</a></td>
            <td><a id="delete">删除</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
