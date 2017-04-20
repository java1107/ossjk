package com.jkoss.pojo.stu;

import java.util.Date;

public class Evaluate {
    private Integer evid;

    private Integer eid;

    private Integer ossstuid;

    private Date evdate;

    private String evcontent;

    public Integer getEvid() {
        return evid;
    }

    public void setEvid(Integer evid) {
        this.evid = evid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getOssstuid() {
        return ossstuid;
    }

    public void setOssstuid(Integer ossstuid) {
        this.ossstuid = ossstuid;
    }

    public Date getEvdate() {
        return evdate;
    }

    public void setEvdate(Date evdate) {
        this.evdate = evdate;
    }

    public String getEvcontent() {
        return evcontent;
    }

    public void setEvcontent(String evcontent) {
        this.evcontent = evcontent == null ? null : evcontent.trim();
    }
}