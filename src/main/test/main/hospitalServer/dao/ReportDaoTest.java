package hospitalServer.dao;

import hospitalServer.bean.Report;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: create by XiaoHan
 * @version: v1.0
 * @description: hospitalServer.dao
 * @date:2020/4/26
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class ReportDaoTest {
    private static final Logger LOG = Logger.getLogger(ReportDaoTest.class);

    @Autowired
    private ReportDao reportDao;
    @Test
    public void getUserReport() {
        List<Report> reports = reportDao.getUserReport("111");
        LOG.info(reports.toString());
    }
}