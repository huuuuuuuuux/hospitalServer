package hospitalServer.dao;

import org.springframework.stereotype.Repository;
import hospitalServer.bean.User;

import java.util.List;

@Repository
public interface UserDao {
    List<User> showUser();
}
