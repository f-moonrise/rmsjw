package com.fs.dao;

import com.fs.pojo.Product;
import com.fs.utils.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2020/1 /14 18:19
 */
public class ProductDao {

    public List<Product> selectAll(){
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());
        String sql = "select id,pname,price,pnum,type,create_time,update_time from neuedu_product";
        List<Product> query = null;
        try{
            query = qr.query(sql, new BeanListHandler<Product>(Product.class));
        }catch (Exception e){
            e.printStackTrace();
        }
        return query;
    }

    public Product selectById(int i) {
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());
        String sql = "select id,pname,price,pnum,type,create_time,update_time from neuedu_product where id=?";
        Product query = null;
        try{
            query = qr.query(sql, new BeanHandler<Product>(Product.class),i);
        }catch (Exception e){
            e.printStackTrace();
        }
        return query;
    }

    public int updateById(int i) {
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());
        String sql = "update neuedu_product set type=1,update_time=now() where id=?";
        int m = 0;
        try{
            m = qr.update(sql, i);
        }catch (Exception e){
            e.printStackTrace();
        }
        return m;
    }

    public List<Product> selectByPname(String key) {
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());
        String sql = "select id,pname,price,pnum,type,create_time,update_time from neuedu_product where pname like ?";
        List<Product> query = null;
        try{
            query = qr.query(sql, new BeanListHandler<Product>(Product.class),key);
        }catch (Exception e){
            e.printStackTrace();
        }
        return query;
    }

    public int insertOne(String pname, Double d, Integer m) {
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());
        String sql = "insert into neuedu_product values(null,?,?,?,0,now(),now())";
        int n = 0;
        try{
            n = qr.update(sql, pname,d,m);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return n;
    }

    public Product selectOneByPname(String pname) {
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());
        String sql = "select id,pname,price,pnum,type,create_time,update_time from neuedu_product where pname = ?";
        Product query = null;
        try{
            query = qr.query(sql, new BeanHandler<Product>(Product.class),pname);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return query;
    }

    public int delOne(String pname, Double d, Integer m) {
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());
//        System.out.println(pname+d+m);
        String sql = "DELETE from neuedu_product where pname = ?";
        int query = 0;
        try{
            query = qr.execute(sql,pname);
        }catch (SQLException e){
            e.printStackTrace();
        }
//        System.out.println(query);
        return query;
    }
}
