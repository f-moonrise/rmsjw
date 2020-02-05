package controller;

import dao.IndexDao;
import pojo.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/4 19:55
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IndexDao indexDao = new IndexDao();
        Users fs = indexDao.getu("fs", "123456");
        response.getWriter().write(fs.toString());
    }
}
