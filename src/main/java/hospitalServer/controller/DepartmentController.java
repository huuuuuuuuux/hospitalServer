package hospitalServer.controller;

import hospitalServer.bean.Department;
import hospitalServer.service.DepartmentService;
import hospitalServer.util.Output;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.controller
 **/
@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/getAllDept")
    public void Login(HttpServletResponse response) throws IOException {
        List<Department> departmentList = departmentService.getAllDept();
        Output.output("获取所有科室信息", response, departmentList);
    }
}
