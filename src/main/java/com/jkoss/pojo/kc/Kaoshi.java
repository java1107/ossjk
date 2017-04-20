package com.jkoss.pojo.kc;

import java.util.Date;

public class Kaoshi {
    private Integer themeid;

    private Integer clzid;

    private Integer eid;

    private String thename;

    private Date themetime;

    private String sjurl;

    private String sjansurl;

    private String kaoshipj;

    private String ksdescb;

    public Integer getThemeid() {
        return themeid;
    }

    public void setThemeid(Integer themeid) {
        this.themeid = themeid;
    }

    public Integer getClzid() {
        return clzid;
    }

    public void setClzid(Integer clzid) {
        this.clzid = clzid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getThename() {
        return thename;
    }

    public void setThename(String thename) {
        this.thename = thename == null ? null : thename.trim();
    }

    public Date getThemetime() {
        return themetime;
    }

    public void setThemetime(Date themetime) {
        this.themetime = themetime;
    }

    public String getSjurl() {
        return sjurl;
    }

    public void setSjurl(String sjurl) {
        this.sjurl = sjurl == null ? null : sjurl.trim();
    }

    public String getSjansurl() {
        return sjansurl;
    }

    public void setSjansurl(String sjansurl) {
        this.sjansurl = sjansurl == null ? null : sjansurl.trim();
    }

    public String getKaoshipj() {
        return kaoshipj;
    }

    public void setKaoshipj(String kaoshipj) {
        this.kaoshipj = kaoshipj == null ? null : kaoshipj.trim();
    }

    public String getKsdescb() {
        return ksdescb;
    }

    public void setKsdescb(String ksdescb) {
        this.ksdescb = ksdescb == null ? null : ksdescb.trim();
    }
}