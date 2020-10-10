package dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import pojo.Users;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/4 17:38
 */
public class IndexDao {

    public Users getu(String uname, String psd){
        QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

        String sql = "select id,username,password,type,create_time,update_time from neuedu_user where username=? and password=?";

        Users u = null;
        try{
            u = qr.query(sql,new BeanHandler<Users>(Users.class),"fs","123456");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("asdfg"+u);
        return u;
    }
}
