package com.fs.dao;

import com.fs.pojo.Users;
import com.fs.utils.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @author zangye03@gmail.com
 * @date 2020/1/14 19:07
 */
public class UserDao {

    public Users selectByUserNameAndPassword(String username,String password){
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());

        String sql = "select id,username,password,type,create_time,update_time from neuedu_user where username=? and password=?";

        Users u = null;
        try{
            u = qr.query(sql,new BeanHandler<Users>(Users.class),username,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return u;
    }

    public int insertByUserNameAndPassword(String username, String password) {
        QueryRunner qr = new QueryRunner(C3P0Util.getCom());
        String sql = "insert into neuedu_user values(null,?,?,1,now(),now())";
        int n = 0;
        try{
            n = qr.update(sql, username,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return n;
    }
}
