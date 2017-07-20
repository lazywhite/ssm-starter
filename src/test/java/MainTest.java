import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssm.entity.User;
import ssm.service.UserService;

import java.util.List;
import static junit.framework.Assert.*;

/**
 * Created by white on 17/7/20.
 */
public class MainTest {

    @Test
    public void test01(){
        ApplicationContext  context = new ClassPathXmlApplicationContext("spring/spring.xml");
        UserService userService = (UserService) context.getBean("userService");
        List<User> list = userService.findAll();
        assertNotNull(list);
    }

}
