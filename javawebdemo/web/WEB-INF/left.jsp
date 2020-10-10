<%--
  Created by IntelliJ IDEA.
  User: 13326
  Date: 2020/1/18
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

    <style>
        #left{

            width: 20% !important;
            height: 94.7% !important;
            float: left !important;
            background-color: seagreen !important;
        }

        #top{
            width: 100% !important;
            height:40px !important;
            background-color: #009688 !important;
        }

        #top span a{
            margin-top: 8px !important;
            margin-right: 15px !important;
            float: right !important;
            color: white !important;
        }

        #le-2{
            margin-top: -20px !important;
            width: 100% !important;
            padding-top: 4% !important;
            padding-left: 3% !important;
            /*height: 100px;*/
            /*background-color: white;*/
        }
        #le-2 h1{

        }

        #le-3{
            width: 100% !important;
            height: 600px !important;
            background-color: salmon !important;
        }

        .le-3{
            width: 100% !important;
            height: 80px !important;
            background-color: salmon !important;
            font-size: 32px !important;
        }

        .le-4{
            width: 100% !important;
            height: 60px !important;
            background-color: salmon !important;
            font-size: 28px !important;
        }
    </style>
</head>


<body>

<div id="top">
        <span>
            <a href="/index.jsp">退出登录</a>
            <a href="/backed/index/home">回到首页</a>
        </span>
</div>
<div id="left">
    <div id="le-2">
        <h1>欢迎${user.data.username}登录管理后台</h1>
    </div>

    <div class="dropdown" >
        <button class="btn btn-default dropdown-toggle le-3" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
            商品管理
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu le-4" aria-labelledby="dropdownMenu1">
            <li><a href="/backed/product/getall">商品列表</a></li>
            <li><a href="/backed/index/addproduct">新增商品</a></li>
            <li><a href="${pageContext.request.contextPath}/backed/product/delone">删除商品</a></li>
        </ul>
    </div>
</div>
</body>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/script.js"></script>

</html>
