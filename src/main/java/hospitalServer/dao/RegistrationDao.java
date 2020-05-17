package hospitalServer.dao;

import hospitalServer.bean.Registration;
import hospitalServer.bean.Schedule;
import org.springframework.stereotype.Repository;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.dao
 **/
@Repository
public interface RegistrationDao {
    void newRegister(Registration registration);
    void addPatient(Schedule schedule);
    int getRegPosTotal(int schId);
    int getRegPosRemg(int schId);
}
