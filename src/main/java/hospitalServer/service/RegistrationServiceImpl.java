package hospitalServer.service;

import hospitalServer.bean.Registration;
import hospitalServer.bean.Schedule;
import hospitalServer.dao.RegistrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.service
 **/
@Service
public class RegistrationServiceImpl implements RegistrationService{
    @Autowired
    RegistrationDao registrationDao;


    public Registration doRegistration(String userId, int schId) {
        int regTotal = registrationDao.getRegPosTotal(schId);
        int regRemg = registrationDao.getRegPosRemg(schId);
        int rank = (regTotal - regRemg) == 0 ? 0 : regRemg + 1;

        if(rank == 0)
            return null;//无空余位置

        Schedule schedule = new Schedule();
        schedule.setSchId(schId);
        schedule.setSchRemgPos(rank);
        registrationDao.addPatient(schedule);

        Registration registration = new Registration(0, userId, schId, rank);
        registrationDao.newRegister(registration);

        return registration;
    }
}
