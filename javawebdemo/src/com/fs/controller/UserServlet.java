package com.fs.controller;

import com.fs.common.ResponseCode;
import com.fs.pojo.Users;
import com.fs.service.UserService;
import com.fs.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.ResponseCache;

/**
 * @author zangye03@gmail.com
 * @date 2020/1/14 18:14
 */
@WebServlet(name = "UserServlet",value = "/user/*")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private UserService userService = new UserServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        ResponseCode<Users> login = userService.login(username,password);
//        response.getWriter().write(login.toString());


        String requestURI = request.getRequestURI();
        String[] split = requestURI.split("/");

        switch (split[split.length - 1]){
            case "login":
                login(request,response);
                break;
            case "getmsg":
                getMsg(request,response);
                break;
        }
     }

    //管理员登录
    private void login(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ResponseCode<Users> login = userService.login(username,password);
        response.getWriter().write(login.toString());

        ResponseCode<Users> login = userService.login(username,password);
        request.setAttribute("user",login);
        request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request,response);
    }

    //获取管理员信息
    private void getMsg(HttpServletRequest request,HttpServletResponse response){
        System.out.println("获取管理员信息");
    }

    //修改管理员信息
    //禁用管理员信息
}