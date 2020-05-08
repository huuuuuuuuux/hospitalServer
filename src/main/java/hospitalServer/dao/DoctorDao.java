package hospitalServer.dao;

import hospitalServer.bean.Doctor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.dao
 **/
@Repository
public interface DoctorDao {
    List<Doctor> getDrByDept(int deptId);
}
