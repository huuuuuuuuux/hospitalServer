package hospitalServer.service;

import hospitalServer.bean.Department;
import hospitalServer.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.service
 **/
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    public List<Department> getAllDept() {
        return departmentDao.getAllDept();
    }
}
