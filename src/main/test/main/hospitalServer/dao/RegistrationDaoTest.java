package hospitalServer.dao;

import hospitalServer.bean.Registration;
import hospitalServer.bean.Schedule;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.dao
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class RegistrationDaoTest {
    private static final Logger LOG = Logger.getLogger(RegistrationDaoTest.class);


    @Autowired
    private RegistrationDao registrationDao;

    @Test
    public void newRegister() {
        Registration registration = new Registration(0,"1",1,1);
        registrationDao.newRegister(registration);
    }

    @Test
    public void getRegPosTotal() {
        LOG.info("getRegPosTotal: " + registrationDao.getRegPosTotal(1));
    }

    @Test
    public void getRegPosRemg() {
        LOG.info("getRegPosRemg: " + registrationDao.getRegPosRemg(1));
    }

    @Test
    public void addPatient() {
        Schedule schedule = new Schedule();
        schedule.setSchId(1);
        schedule.setSchRemgPos(11);
        registrationDao.addPatient(schedule);
    }
}