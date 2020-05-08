package hospitalServer.controller;

import hospitalServer.bean.Doctor;
import hospitalServer.service.DoctorService;
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
@RequestMapping("/doctor")
public class DoctorController {
    private  static final Logger LOG = Logger.getLogger(DoctorController.class);

    @Autowired
    private DoctorService doctorService;

    @RequestMapping("/getDrByDept")
    public void getDrByDept(HttpServletResponse response,
                      @RequestParam(value="deptId") int deptId) throws IOException {
        List<Doctor> doctors = doctorService.getDrByDept(deptId);
        Output.output("加载科室医生", response, doctors);
    }
}
