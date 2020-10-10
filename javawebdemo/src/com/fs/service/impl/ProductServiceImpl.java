package com.fs.service.impl;

import com.fs.common.ResponseCode;
import com.fs.dao.ProductDao;
import com.fs.pojo.Product;
import com.fs.service.ProductService;
import com.mysql.cj.util.StringUtils;

import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2020/1/14 18:20
 */
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao = new ProductDao();

    @Override
    public ResponseCode getAllProduct(){
        List<Product> productList = productDao.selectAll();
        return ResponseCode.toSuccess(productList);
    }

    //商品下架
    @Override
    public ResponseCode toType(String id) {
        //参数非空判断
        if(id == null || "".equals(id)){
            return ResponseCode.toDefeated("非法参数");
        }
        int i = Integer.parseInt(id);
        //查找商品
        Product p = productDao.selectById(i);
        if(p == null){
            return ResponseCode.toDefeated("商品不存在!");
        }
        //修改商品信息
        int i2 = productDao.updateById(i);
        if(i2 < 0){
            return ResponseCode.toDefeated("商品下架失败!");
        }
        return ResponseCode.toSuccess(i2);
    }


    //商品模糊搜索
    @Override
    public ResponseCode fuzzySearch(String key) {
        if(StringUtils.isNullOrEmpty(key)){
            return ResponseCode.toDefeated("非法参数");
        }

        String keyWord = "%" + key + "%";
        List<Product> li = productDao.selectByPname(keyWord);
        return ResponseCode.toSuccess(li);
    }

    @Override
    public ResponseCode addOne(String pname, String pnum, String price) {
        //参数非空判断
        if(pname == null || "".equals(pname)){
            return ResponseCode.toDefeated("非法参数");
        }
        if(pnum == null || "".equals(pnum)){
            return ResponseCode.toDefeated("非法参数");
        }
        if(price == null || "".equals(price)){
            return ResponseCode.toDefeated("非法参数");
        }
        //根据商品名称查询是否存在
        Product p = productDao.selectOneByPname(pname);
        if(p != null){
            return ResponseCode.toDefeated("商品已存在");
        }

        Double d = Double.parseDouble(price);
        Integer m = Integer.parseInt(pnum);
        //当商品不存在的时候再新增
        int i = productDao.insertOne(pname,d,m);
        return ResponseCode.toSuccess(i);
    }

    @Override
    public ResponseCode delOne(String pname, String pnum, String price) {
        //参数非空判断
        if(pname == null || "".equals(pname)){
            return ResponseCode.toDefeated("非法参数");
        }
        if(pnum == null || "".equals(pnum)){
            return ResponseCode.toDefeated("非法参数");
        }
        if(price == null || "".equals(price)){
            return ResponseCode.toDefeated("非法参数");
        }
        //根据商品名称查询是否存在
        Product p = productDao.selectOneByPname(pname);
        if(p == null){
            return ResponseCode.toDefeated("商品不存在");
        }

//        System.out.println(pname+price+pnum);
        Double d = Double.parseDouble(price);
        Integer m = Integer.parseInt(pnum);
        //当商品存在的时候删除
        int i = productDao.delOne(pname,d,m);
        return ResponseCode.toSuccess(i);
    }
}
