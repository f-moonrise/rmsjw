<%--
  Created by IntelliJ IDEA.
  User: 13326
  Date: 2020/2/16
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>

<%--    <link rel="shortcut icon" href="/favicon.ico" type="/images/x-icon" />--%>
<%--    <link rel="stylesheet" href="./css/font.css">--%>
<%--    <link rel="stylesheet" href="./css/xadmin.css">--%>
<%--    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>--%>
<%--    <script src="/WEB-INF/lib/layui/layui.js" charset="utf-8"></script>--%>
<%--    <script type="text/javascript" src="./js/xadmin.js"></script>--%>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <!-- Loding font -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:300,700" rel="stylesheet">

    <!-- Custom Styles -->
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
<%--    <link rel="stylesheet" type="text/css" href="/css/style.css">--%>
    <style>
        .login{
            border: 3px black solid;
            width: 500px;
            margin: auto;
            margin-top: -50px;
        }
        .asdf{
            float: bottom;
            border: 1px black solid;
            z-index:99;
        }
    </style>
</head>
<body >


<%--<div class="login layui-anim layui-anim-up">--%>
<%--    <div class="message">后台管理系统</div>--%>
<%--    <div id="darkbannerwrap"></div>--%>

<%--    <form method="post" action="/backed/user/register" class="layui-form" >--%>
<%--        <input name="username" placeholder="账号"  type="text" class="layui-input" >--%>
<%--        <hr class="hr15">--%>
<%--        <input name="password"  placeholder="密码"  type="password" class="layui-input">--%>
<%--        <hr class="hr15">--%>
<%--        <input  value="注册" lay-submit lay-filter="login" style="width:100%;" type="submit">--%>
<%--        <hr class="hr20" >--%>

<%--    </form>--%>
<%--    <a href="/index.jsp" class="register-link">Login</a>--%>
<%--</div>--%>

<div class="container" id="login">
    <div class="row justify-content-center">
        <div class="col-lg-8">
            <div class="login">

                <h1>账户注册</h1>

                <!-- Loging form -->
                <form action="/backed/user/register" class="layui-form">
                    <div class="form-group">
                        <input type="text" name="username" class="form-control "  placeholder="账号">

                    </div>
                    <div></div>
                    <div class="form-group">
                        <input type="password" name="password" class="form-control"  placeholder="密码">
                    </div>



                    <br>
                    <button type="submit" class="btn btn-lg btn-block btn-success">注册</button>
                </form>
                <a href="/index.jsp" class="register-link">返回登录</a>
                <!-- End Loging form -->

        </div>
    </div>
</div>
</div>

<%--<!--Waves Container-->--%>
<%--<div class="asdf">--%>
<%--    <svg class="waves" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" viewBox="0 24 150 28" preserveAspectRatio="none" shape-rendering="auto">--%>
<%--        <defs>--%>
<%--            <path id="gentle-wave" d="M-160 44c30 0 58-18 88-18s 58 18 88 18 58-18 88-18 58 18 88 18 v44h-352z" />--%>
<%--        </defs>--%>
<%--        <g class="parallax">--%>
<%--            <use xlink:href="#gentle-wave" x="48" y="0" fill="rgba(255,255,255,0.7" />--%>
<%--            <use xlink:href="#gentle-wave" x="48" y="3" fill="rgba(255,255,255,0.5)" />--%>
<%--            <use xlink:href="#gentle-wave" x="48" y="5" fill="rgba(255,255,255,0.3)" />--%>
<%--            <use xlink:href="#gentle-wave" x="48" y="7" fill="#fff" />--%>
<%--        </g>--%>
<%--    </svg>--%>
<%--</div>--%>
<%--<!--Waves end-->--%>

</body>
</html>
