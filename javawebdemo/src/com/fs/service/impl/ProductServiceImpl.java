package com.fs.service.impl;

import com.fs.dao.ProductDao;
import com.fs.pojo.Product;
import com.fs.service.ProductService;

import java.net.ResponseCache;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2020/1/14 18:20
 */
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao = new ProductDao();

    @Override
    public ResponseCache getAllProduct(){
        List<Product> productList = productDao.selectAll();
//        return ResponseCache.toSuccess(productList);
        return null;
    }
}
