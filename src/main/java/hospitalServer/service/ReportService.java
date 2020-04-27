package hospitalServer.service;

import hospitalServer.bean.Report;

import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.service
 * @date:2020/4/26
 **/
public interface ReportService {
    List<Report> getUserReport(String userId);
}
