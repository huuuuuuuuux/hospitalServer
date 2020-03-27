package hospitalServer.service;

import hospitalServer.bean.User;

import java.util.List;

/**
 * @author chenjw
 * @version v1.0.0
 * @description
 * @date Created in 2018/8/3 10:14
 */

public interface UserService {
    List<User> showUser();
}