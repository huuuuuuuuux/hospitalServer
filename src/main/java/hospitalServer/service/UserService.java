package hospitalServer.service;

import hospitalServer.bean.User;

import java.util.List;

/**
 * @author: create by XiaoHan
 * @version: v1.0
 * @description: hospitalServer.bean
 * @date:2020/3/27
 **/

public interface UserService {
    User login(String id,String pwd);
    void register(User user);
}