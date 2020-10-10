<%--
  Created by IntelliJ IDEA.
  User: 13326
  Date: 2020/2/21
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="noaccess.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="left.jsp"%>
<html>
<head>
    <title>新增商品</title>
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">--%>

<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">--%>
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
            margin-top: 100px;
            margin-right: 350px;
            padding: 50px;
            border: black 3px solid;
            height: 400px;
            width: 600px;
        }

        .fs-xb{
            float: right;
            /*border: black 1px solid;*/
            margin-top: 10px;
            margin-right: 200px;
        }

        .fs-xc{
            margin-top: 20px;
        }

        .fs-xd{
            position: relative;
            margin-top: 10px;
            /*margin-left: 700px;*/
        }
    </style>
</head>
<body>
<%--    <form action="/backed/product/addone" method="post">--%>
<%--        <input type="text" placeholder="商品名称" name="pname">--%>
<%--        <input type="text" placeholder="商品价格" name="price">--%>
<%--        <input type="number" placeholder="商品库存" name="pnum">--%>
<%--        <input type="submit" value="新增">--%>
<%--    </form>--%>
<div class="fs-xa">
    <form action="/backed/product/delone" method="post">
        <%--    <table class="fs-xc">--%>
        <%--        <tr>--%>
        <%--            <th >商品名称</th>--%>
        <%--            <th >商品价格</th>--%>
        <%--            <th >商品库存</th>--%>
        <%--        </tr>--%>

        <%--        <tr>--%>
        <%--                <td><input type="text" placeholder="商品名称" name="pname"></td>--%>
        <%--                <td><input type="text" placeholder="商品价格" name="price"></td>--%>
        <%--                <td><input type="number" placeholder="商品库存" name="pnum"></td>--%>
        <%--        </tr>--%>
        <%--    </table>--%>
        <div class="form-group">
            <label for="pname">商品名称</label>
            <input type="text" class="form-control" id="pname" aria-describedby="emailHelp" name="pname">
        </div>
        <div class="form-group">
            <label for="price">商品价格</label>
            <input type="text" class="form-control" id="price" name="price">
        </div>
        <div class="form-group">
            <label for="pnum">商品库存</label>
            <input type="number" class="form-control" id="pnum" name="pnum">
        </div>
        <div class="form-group form-check">
            <input type="checkbox" class="form-check-input" id="exampleCheck1">
            <label class="form-check-label" for="exampleCheck1">Check me out</label>
        </div>
        <div class="fs-xb">
            <input class="btn btn-secondary btn-lg active" type="submit" value="删&nbsp&nbsp除">
        </div>

        <div class="fs-xd">
            <a href="/backed/product/getall"><button type="button" class="btn btn-primary">返&nbsp&nbsp回</button></a>
        </div>
    </form>
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

