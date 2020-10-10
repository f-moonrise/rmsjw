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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.ResponseCache;

/**
 * @author zangye03@gmail.com
 * @date 2020/1/14 18:14
 */
@WebServlet("/backed/user/*")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private UserService userService = new UserServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String[] split = requestURI.split("/");

        switch (split[split.length - 1]){
            case "login":
                login(request,response);
                break;
            case "getmsg":
                getMsg(request,response);
                break;
            case "register":
                register(request,response);

        }
     }

    //管理员登录
    private void login(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + " " + password);
        ResponseCode<Users> login = userService.login(username,password);
System.out.println(login);
        if(login.getData() != null){
            //登录成功，保护用户信息
            HttpSession session = request.getSession();
            Users data = login.getData();
            session.setAttribute("us",data);

//        request.setAttribute("user",login);
            request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request,response);
        }
        else {
            request.getRequestDispatcher("/WEB-INF/noaccess.jsp").forward(request,response);
        }

    }

        // 注册
    private void register(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ResponseCode<Users> login = userService.register(username, password);

        request.getRequestDispatcher("/register.jsp").forward(request,response);
    }

    //获取管理员信息
    private void getMsg(HttpServletRequest request,HttpServletResponse response){
        System.out.println("获取管理员信息");
    }

    //修改管理员信息
    //禁用管理员信息
}



