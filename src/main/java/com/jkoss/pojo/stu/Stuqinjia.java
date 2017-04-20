package com.jkoss.pojo.stu;

import java.util.Date;

public class Stuqinjia {
    private Integer sqjid;

    private Integer ossstuid;

    private Integer eid;

    private Date sqjdate;

    private String sqjreson;

    private String sqjqueren;

    private Integer sqjstate;

    private Date sqjbegin;

    private Date sqjend;

    private String sqjdesc;

    public Integer getSqjid() {
        return sqjid;
    }

    public void setSqjid(Integer sqjid) {
        this.sqjid = sqjid;
    }

    public Integer getOssstuid() {
        return ossstuid;
    }

    public void setOssstuid(Integer ossstuid) {
        this.ossstuid = ossstuid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Date getSqjdate() {
        return sqjdate;
    }

    public void setSqjdate(Date sqjdate) {
        this.sqjdate = sqjdate;
    }

    public String getSqjreson() {
        return sqjreson;
    }

    public void setSqjreson(String sqjreson) {
        this.sqjreson = sqjreson == null ? null : sqjreson.trim();
    }

    public String getSqjqueren() {
        return sqjqueren;
    }

    public void setSqjqueren(String sqjqueren) {
        this.sqjqueren = sqjqueren == null ? null : sqjqueren.trim();
    }

    public Integer getSqjstate() {
        return sqjstate;
    }

    public void setSqjstate(Integer sqjstate) {
        this.sqjstate = sqjstate;
    }

    public Date getSqjbegin() {
        return sqjbegin;
    }

    public void setSqjbegin(Date sqjbegin) {
        this.sqjbegin = sqjbegin;
    }

    public Date getSqjend() {
        return sqjend;
    }

    public void setSqjend(Date sqjend) {
        this.sqjend = sqjend;
    }

    public String getSqjdesc() {
        return sqjdesc;
    }

    public void setSqjdesc(String sqjdesc) {
        this.sqjdesc = sqjdesc == null ? null : sqjdesc.trim();
    }
}