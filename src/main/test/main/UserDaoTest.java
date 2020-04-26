import hospitalServer.controller.UserController;
import hospitalServer.dao.UserDao;
import hospitalServer.bean.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author: create by XiaoHan
 * @version: v1.0
 * @description: hospitalServer.bean
 * @date:2020/3/27
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    private static final Logger LOG = Logger.getLogger(UserController.class);
//    @Test
//    public void login() {
//        String id = "123";
//        User user = userDao.getUser(id);
//        LOG.info("TEST: "+user);
//    }
    @Test
    public void register() {
        User user = new User("aaa","bbb","ccc",8,true);
        String id = "aaa";
        String pwd = "bbb";
        String name = "ccc";
        int age = 8;
        boolean sex = true;
        userDao.register(user);
        LOG.info("TEST: "+user);
    }

}