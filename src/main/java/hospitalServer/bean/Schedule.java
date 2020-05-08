package hospitalServer.bean;

import java.util.Date;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.bean
 **/
public class Schedule {
    private int schId;
    private int drId;
    private int deptId;
    private String schDate;
    private int schPriceCent;
    private int schTotalPos;
    private int schRemgPos;

    public Schedule() {
    }

    public Schedule(int schId, int drId, int deptId, String schDate, int schPriceCent, int schTotalPos, int schRemgPos) {
        this.schId = schId;
        this.drId = drId;
        this.deptId = deptId;
        this.schDate = schDate;
        this.schPriceCent = schPriceCent;
        this.schTotalPos = schTotalPos;
        this.schRemgPos = schRemgPos;
    }

    public int getSchId() {
        return schId;
    }

    public void setSchId(int schId) {
        this.schId = schId;
    }

    public int getDrId() {
        return drId;
    }

    public void setDrId(int drId) {
        this.drId = drId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getSchDate() {
        return schDate;
    }

    public void setSchDate(String schDate) {
        this.schDate = schDate;
    }

    public int getSchPriceCent() {
        return schPriceCent;
    }

    public void setSchPriceCent(int schPriceCent) {
        this.schPriceCent = schPriceCent;
    }

    public int getSchTotalPos() {
        return schTotalPos;
    }

    public void setSchTotalPos(int schTotalPos) {
        this.schTotalPos = schTotalPos;
    }

    public int getSchRemgPos() {
        return schRemgPos;
    }

    public void setSchRemgPos(int schRemgPos) {
        this.schRemgPos = schRemgPos;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "schId=" + schId +
                ", drId=" + drId +
                ", deptId=" + deptId +
                ", schDate=" + schDate +
                ", schPriceCent=" + schPriceCent +
                ", schTotalPos=" + schTotalPos +
                ", schRemgPos=" + schRemgPos +
                '}';
    }
}
