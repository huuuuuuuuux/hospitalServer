package hospitalServer.bean;

import java.util.Date;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.bean
 * @date:2020/4/26
 **/
public class Report {
    private int rptId;
    private String userId;
    private String rptTitle;
    private String rptDate;
    private String rptContent;

    public Report() {
    }

    public Report(int rptId, String userId, String rptTitle, String rptDate, String rptContent) {
        this.rptId = rptId;
        this.userId = userId;
        this.rptTitle = rptTitle;
        this.rptDate = rptDate;
        this.rptContent = rptContent;
    }

    public int getRptId() {
        return rptId;
    }

    public void setRptId(int rptId) {
        this.rptId = rptId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRptContent() {
        return rptContent;
    }

    public void setRptContent(String rptContent) {
        this.rptContent = rptContent;
    }

    public String getRptTitle() {
        return rptTitle;
    }

    public void setRptTitle(String rptTitle) {
        this.rptTitle = rptTitle;
    }

    public String getRptDate() {
        return rptDate;
    }

    public void setRptDate(String rptDate) {
        this.rptDate = rptDate;
    }

    @Override
    public String toString() {
        return "Report{" +
                "rptId=" + rptId +
                ", userId='" + userId + '\'' +
                ", rptTitle='" + rptTitle + '\'' +
                ", rptDate=" + rptDate +
                ", rptContent='" + rptContent + '\'' +
                '}';
    }
}
