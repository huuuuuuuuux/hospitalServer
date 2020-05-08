package hospitalServer.service;

import hospitalServer.bean.Doctor;

import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.service
 **/
public interface DoctorService {
    List<Doctor> getDrByDept(int deptId);
}
