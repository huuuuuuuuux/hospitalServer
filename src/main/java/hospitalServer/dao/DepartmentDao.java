package hospitalServer.dao;

import hospitalServer.bean.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.dao
 **/
@Repository
public interface DepartmentDao {
    List<Department> getAllDept();
}
