package hospitalServer.service;

import hospitalServer.bean.Doctor;
import hospitalServer.dao.DoctorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.service
 **/
@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorDao doctorDao;

    public List<Doctor> getDrByDept(int deptId) {
        return doctorDao.getDrByDept(deptId);
    }
}
