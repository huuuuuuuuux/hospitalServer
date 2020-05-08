package hospitalServer.dao;

import hospitalServer.bean.Schedule;
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
public class ScheduleDaoTest {
    private static final Logger LOG = Logger.getLogger(ScheduleDaoTest.class);

    @Autowired
    private ScheduleDao scheduleDao;
    @Test
    public void getSchByDept() {
        List<Schedule> schedules = scheduleDao.getSchByDept(1);
        LOG.info(schedules.toString());
    }

    @Test
    public void getSchByDr() {
        List<Schedule> schedules = scheduleDao.getSchByDr(3);
        LOG.info(schedules.toString());
    }
}