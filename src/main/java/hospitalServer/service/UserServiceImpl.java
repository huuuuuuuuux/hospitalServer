package hospitalServer.service;

import hospitalServer.bean.User;
import hospitalServer.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenjw
 * @version v1.0.0
 * @description
 * @date Created in 2018/8/3 10:15
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao uDao;

    public List<User> showUser() {
        return uDao.showUser();
    }
}