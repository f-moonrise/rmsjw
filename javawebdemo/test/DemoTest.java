import com.fs.pojo.Users;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import java.sql.SQLException;

/**
 * @author zangye03@gmail.com
 * @date 2020/1/14 15:01
 */
public class DemoTest {
    @Test
    public void test1() throws SQLException{
        QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
        Users query = qr.query("select * from neuedu_user where id = ?",new BeanHandler<Users>(Users.class),1);
        System.out.println(query.getUsername());
    }
}
