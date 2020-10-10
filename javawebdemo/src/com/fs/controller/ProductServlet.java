package com.fs.controller;

import com.fs.common.ResponseCode;
import com.fs.service.ProductService;
import com.fs.service.UserService;
import com.fs.service.impl.ProductServiceImpl;
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
 * @date 2020/1/14 18:07
 */
@WebServlet("/backed/product/*")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    private ProductService productService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String[] split = requestURI.split("/");

        switch (split[split.length-1]){
            case "getall":
                getAllProduct(request,response);
                break;
            case "totype":
                totype(request,response);
                break;
            case "fuzzysearch":
                fuzzySearch(request,response);
                break;
            case "addone":
                addOne(request,response);
                break;
            case "delone":
                delOne(request,response);
        }
    }

    //获取所有商品数据
    private void getAllProduct(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        ResponseCode allProduct = productService.getAllProduct();
        request.setAttribute("plist",allProduct);
        request.getRequestDispatcher("/WEB-INF/plist.jsp").forward(request,response);
    }

    //商品下架
    private void totype(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        ResponseCode allProduct = productService.toType(id);
        //把数据转成json格式返回
        response.getWriter().write(allProduct.getData().toString());
    }

    //根据商品名称模糊查询
    private void fuzzySearch(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        ResponseCode allProduct = productService.fuzzySearch(key);
        request.setAttribute("plist",allProduct);
        request.getRequestDispatcher("/WEB-INF/plist.jsp").forward(request,response);
    }

    //新增商品
    private void addOne(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String pname = request.getParameter("pname");
        String price = request.getParameter("price");
        String pnum = request.getParameter("pnum");
        ResponseCode allProduct = productService.addOne(pname,pnum,price);
        request.getRequestDispatcher("/WEB-INF/addproduct.jsp").forward(request,response);
    }

    //删除商品
    private void delOne(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String pname = request.getParameter("pname");
        String price = request.getParameter("price");
        String pnum = request.getParameter("pnum");
//        System.out.println(pname+price+pnum);
        ResponseCode allProduct = productService.delOne(pname,pnum,price);
        request.getRequestDispatcher("/WEB-INF/delproduct.jsp").forward(request,response);
    }
}
