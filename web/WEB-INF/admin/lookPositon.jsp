<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Machenike
  Date: 2018/10/19
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            $(".positon").click(function () {
                alert("www")
                var $d=$(this)
                var $td=$(this).parent().parent().children()
                var id=$td[0].innerHTML
                var positon=$td[1].innerHTML
                alert(id)
                $.ajax({
                    url:"${pageContext.request.contextPath}/admin/deletePositon",
                    data:{"id":id,"positon":positon},
                    type:"post",
                    dataType:"text",
                    success:function (data) {
                        if(data=="delete"){
                            var f=confirm("是否删除id为"+id+"的职位")
                            if(f==true){
                                $d.parent().parent().remove()
                                alert("删除成功")
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
        <td>职位id</td>
        <td>职位名字</td>
        <td>部门id</td>
        <td>创建时间</td>
    </tr>
    <c:forEach items="${sessionScope.positon}" var="positon">
        <tr>
            <td>${positon.id}</td>
            <td>${positon.name}</td>
            <td>${positon.deptId}</td>
            <td>${positon.time}</td>
            <td><a href="/admin/lookEmployee?id=${positon.id}">查看${positon.name}员工</a></td>
            <td><a href="/admin/inputAddPositon?id=${positon.deptId}">添加职位</a></td>
            <td><a href="/admin/inputEditPositon?id=${positon.id}">修改职位</a></td>
            <td><a class="positon" href="#">删除职位</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
