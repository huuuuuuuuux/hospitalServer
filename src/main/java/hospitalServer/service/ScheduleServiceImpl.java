package hospitalServer.service;

import hospitalServer.bean.Schedule;
import hospitalServer.dao.ScheduleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.service
 **/
@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleDao scheduleDao;

    public List<Schedule> getSchByDept(int deptId) {
        return scheduleDao.getSchByDept(deptId);
    }

    public List<Schedule> getSchByDr(int drId) {
        return scheduleDao.getSchByDr(drId);
    }
}
