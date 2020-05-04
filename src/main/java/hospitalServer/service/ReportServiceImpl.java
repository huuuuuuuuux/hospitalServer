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
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.service
 **/
@Service
public class ReportServiceImpl implements ReportService{
    @Autowired
    private ReportDao reportDao;

    public List<Report> getUserReport(String userId) {
        return reportDao.getUserReport(userId);
    }
}
