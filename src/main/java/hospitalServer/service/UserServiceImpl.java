package hospitalServer.service;

import hospitalServer.bean.User;
import hospitalServer.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: create by XiaoHan
 * @version: v1.0
 * @description: hospitalServer.bean
 * @date:2020/3/27
 **/
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao uDao;

    public User getUser(String id) {
        return uDao.getUser(id);
    }
}