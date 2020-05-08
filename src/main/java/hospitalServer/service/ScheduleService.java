package hospitalServer.service;

import hospitalServer.bean.Schedule;

import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.service
 **/
public interface ScheduleService {
    List<Schedule> getSchByDept(int deptId);
    List<Schedule> getSchByDr(int drId);
}
