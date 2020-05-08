package hospitalServer.controller;

import hospitalServer.bean.Schedule;
import hospitalServer.service.ScheduleService;
import hospitalServer.util.Output;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.controller
 **/
@Controller
@RequestMapping("/schedule")
public class ScheduleController {
    private  static final Logger LOG = Logger.getLogger(ScheduleController.class);

    @Autowired
    ScheduleService scheduleService;


    @RequestMapping("/getSchByDept")
    public void getSchByDept(HttpServletResponse response,
                            @RequestParam(value="deptId") int deptId) throws IOException {
        List<Schedule> schedules = scheduleService.getSchByDept(deptId);
        Output.output("加载科室排班表", response, schedules);
    }

    @RequestMapping("/getSchByDr")
    public void getSchByDr(HttpServletResponse response,
                             @RequestParam(value="drId") int drId) throws IOException {
        List<Schedule> schedules = scheduleService.getSchByDr(drId);
        Output.output("加载医生排班表", response, schedules);
    }
}
