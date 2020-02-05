<%--
  Created by IntelliJ IDEA.
  User: 13326
  Date: 2020/1/14
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="noaccess.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="left.jsp"%>
<html>
<head>
    <title>商品列表</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

    <style>
        #left{
            width: 20%;
            height: 94.7%;
            float: left;
            background-color: seagreen;
        }

        #top{
            width: 100%;
            height:40px;
            background-color: #009688;
        }

        #top span a{
            margin-top: 8px;
            margin-right: 15px;
            float: right;
            color: white;
        }

        #le-2{
            margin-top: -20px;
            width: 100%;
            padding-top: 4%;
            padding-left: 3%;
            /*height: 100px;*/
            /*background-color: white;*/
        }
        #le-2 h1{

        }

        #le-3{
            width: 100%;
            height: 600px;
            background-color: salmon;
        }

        .le-3{
            width: 100%;
            height: 80px;
            background-color: salmon;
            font-size: 32px;
        }

        .le-4{
            width: 100%;
            height: 60px;
            background-color: salmon;
            font-size: 28px;
        }

        .fs-xa{
            float: right;
            margin-top: 50px;
            margin-right: 200px ;
        }

        .fs-xb{
            float: right;
            margin-top: 50px;
            margin-right: 550px;
        }
    </style>
</head>
<body >
<div id="right">
    <div class="fs-xb">
    <form action="/backed/product/fuzzysearch" >
        <input type="text" placeholder="查询的商品名称" name="key">
        <input type="submit" value="查询">
    </form>
    </div>
    <c:if test="${not empty plist.data}">
        <div class="fs-xa" >
        <table class="table table-bordered">
            <tr>
                <th scope="col">序号</th>
                <th scope="col">商品名称</th>
                <th scope="col">商品价格</th>
                <th scope="col">商品库存</th>
                <th scope="col">商品在售</th>
                <th scope="col">商品创建时间</th>
                <th scope="col">商品更新时间</th>
                <th scope="col">操作</th>
            </tr>
            <c:forEach items="${plist.data}" var="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.pname}</td>
                    <td>${p.price}</td>
                    <td>${p.pnum}</td>
                    <td class="pt">${p.type}</td>
                    <td>${p.create_time}</td>
                    <td>${p.update_time}</td>
                    <td>
                        <button onclick="toType(this)">下架</button>
                        <button>修改</button>
                    </td>
                </tr>
            </c:forEach>
        </table>
        </div>
    </c:if>

    <c:if test="${empty plist.data}">
        没有更多的商品
    </c:if>
</div>



</body>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>




<script>
    function toType(but) {
        var id2 = $(but).parent().parent().children().first().text();
        $.get(
            "/backed/product/totype",
            {id:id2},
            function (data) {
                var num = Number(data);
                if(data>0){
                    $(but).parent().parent().children().first().nextAll(".pt").text(1);
                }
            }
        )
    }


</script>

</html>