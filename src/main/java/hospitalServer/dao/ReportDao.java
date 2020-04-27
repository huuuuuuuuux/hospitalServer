package hospitalServer.dao;

import hospitalServer.bean.Report;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.dao
 * @date:2020/4/26
 **/
@Repository
public interface ReportDao {
    List<Report> getUserReport(String userId);
}
