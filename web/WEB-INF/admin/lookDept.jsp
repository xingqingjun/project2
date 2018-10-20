<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/19
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
           $(".dept").click(function () {
               alert("www")
               var $d=$(this)
               var $td=$(this).parent().parent().children()
               var id=$td[0].innerHTML
               alert(id)
               $.ajax({
                   url:"${pageContext.request.contextPath}/admin/deleteDept",
                   data:{"id":id},
                   type:"post",
                   dataType:"text",
                   success:function (data) {
                       if(data=="delete"){
                           alert("删除成功")
                       }
                       if(data==""){
                           alert("有在职人员")
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
        <td>部门id</td>
        <td>部门名字</td>
        <td>创建时间</td>
    </tr>
    <c:forEach items="${sessionScope.dept}" var="dept">
        <tr>
            <td>${dept.id}</td>
            <td>${dept.name}</td>
            <td>${dept.time}</td>
            <td><a href="/admin/lookPositon?id=${dept.id}">查看${dept.name}下的职位</a></td>
            <td><a class="dept" href="#">删除部门</a></td>
            <td><a href="/admin/inputEditDept?id=${dept.id}">修改部门名字</a></td>
        </tr>
    </c:forEach>
</table>
<a href="/admin/inputManageDept">返回管理界面</a>
</body>
</html>
