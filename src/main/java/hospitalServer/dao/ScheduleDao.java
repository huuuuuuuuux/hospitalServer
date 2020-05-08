package hospitalServer.dao;

import hospitalServer.bean.Schedule;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.dao
 **/
@Repository
public interface ScheduleDao {
    List<Schedule> getSchByDept(int deptId);
    List<Schedule> getSchByDr(int drId);
}
