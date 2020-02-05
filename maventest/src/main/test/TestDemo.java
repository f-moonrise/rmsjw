import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Users;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/5 10:45
 */
public class TestDemo {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Users u = (Users) ac.getBean("users");
        System.out.println(u);

        Users u1 = (Users) ac.getBean("users");
        System.out.println(u1);
    }

    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Users u = (Users) ac.getBean("users1");
        System.out.println(u);

    }
}
