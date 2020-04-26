package hospitalServer.dao;

import org.springframework.stereotype.Repository;
import hospitalServer.bean.User;

import java.util.List;

/**
 * @author: create by XiaoHan
 * @version: v1.0
 * @description: hospitalServer.bean
 * @date:2020/3/27
 **/
@Repository
public interface UserDao {
    User getUser(String id);
    void register(User user);
}
