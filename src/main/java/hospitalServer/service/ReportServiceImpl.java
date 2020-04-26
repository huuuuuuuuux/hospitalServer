package hospitalServer.service;

import hospitalServer.bean.Report;
import hospitalServer.controller.UserController;
import hospitalServer.dao.ReportDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.handler.LogicalHandler;
import java.util.List;

/**
 * @author: create by XiaoHan
 * @version: v1.0
 * @description: hospitalServer.service
 * @date:2020/4/26
 **/
@Service
public class ReportServiceImpl implements ReportService{
    private static final Logger LOG = Logger.getLogger(ReportServiceImpl.class);
    @Autowired
    private ReportDao reportDao;

    public List<Report> getUserReport(String userId) {
        return reportDao.getUserReport(userId);
    }
}
