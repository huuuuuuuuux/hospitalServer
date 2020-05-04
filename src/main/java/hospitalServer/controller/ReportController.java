package hospitalServer.controller;

import com.alibaba.fastjson.JSON;
import hospitalServer.bean.Report;
import hospitalServer.service.ReportService;
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
@RequestMapping("/report")
public class ReportController {
    private  static final Logger LOG = Logger.getLogger(ReportController.class);

    @Autowired
    private ReportService reportService;

    @RequestMapping("/getUserReport")
    public void Login(HttpServletResponse response,
                      @RequestParam(value="userId") String id) throws IOException {
        List<Report> reports = reportService.getUserReport(id);
        Output.output("加载体检报告", response, reports);
    }

}
