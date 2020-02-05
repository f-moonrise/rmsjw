<%--
  Created by IntelliJ IDEA.
  User: 13326
  Date: 2020/1/6
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>管理员登录</title>

    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
  </head>

  <body class="login-bg">

  <div class="login layui-anim layui-anim-up">
    <div class="message">后台管理系统</div>
    <div id="darkbannerwrap"></div>

    <form method="post" action="/backed/user/login" class="layui-form" >
      <input name="username" placeholder="账号"  type="text" class="layui-input" >
      <hr class="hr15">
      <input name="password"  placeholder="密码"  type="password" class="layui-input">
      <hr class="hr15">
      <input  value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
      <hr class="hr20" >
    </form>
  </div>


  </body>

  <script>

  </script>
</html>

<%--  <body>--%>
<%--  <form action="/backed/user/login" method="post">--%>
<%--    <input type="text" placeholder="账号" name="username">--%>
<%--    <input type="password" placeholder="密码" name="password">--%>
<%--    <input type="submit" value="登录">--%>
<%--  </form>--%>
<%--  </body>--%>
<%--</html>--%>
