package hospitalServer.service;

import hospitalServer.bean.User;

import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.bean
 **/
public interface UserService {
    User login(String id,String pwd);
    void register(User user);
}