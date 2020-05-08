package hospitalServer.dao;

import hospitalServer.bean.Doctor;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.dao
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class DoctorDaoTest {
    private static final Logger LOG = Logger.getLogger(DoctorDaoTest.class);

    @Autowired
    private DoctorDao doctorDao;

    @Test
    public void getDrByDept() {
        List<Doctor> list = doctorDao.getDrByDept(1);
        LOG.info(list.toString());
    }
}