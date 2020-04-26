package hospitalServer.controller;

import com.alibaba.fastjson.JSON;
import hospitalServer.bean.Report;
import hospitalServer.service.ReportService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author: create by XiaoHan
 * @version: v1.0
 * @description: hospitalServer.controller
 * @date:2020/4/26
 **/
@Controller
@RequestMapping("/report")
public class ReportController {
    private  static final Logger LOG = Logger.getLogger(ReportController.class);

    @Autowired
    private ReportService reportService;


    @RequestMapping("/Login")
    public void Login(HttpServletResponse response,
                      @RequestParam(value="userId") String id) throws IOException {
        List<Report> reports = reportService.getUserReport(id);
        output(response, reports);
    }

    private void output(HttpServletResponse response, List<Report> reports) throws IOException {
        if(reports != null) {
            String jsonObject = JSON.toJSONString(reports);
            ServletOutputStream output = response.getOutputStream();
            byte[] dataByte = jsonObject.getBytes("UTF-8");
            output.write(dataByte);
            LOG.info("成功" + reports);
        }
        else {
            LOG.info("失败");
        }
    }
}
