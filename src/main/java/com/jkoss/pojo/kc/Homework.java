package com.jkoss.pojo.kc;

public class Homework {
    private Integer hkid;

    private Integer eid;

    private Integer sbid;

    private String hktitle;

    private String hkans;

    private String hkdescb;

    public Integer getHkid() {
        return hkid;
    }

    public void setHkid(Integer hkid) {
        this.hkid = hkid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getSbid() {
        return sbid;
    }

    public void setSbid(Integer sbid) {
        this.sbid = sbid;
    }

    public String getHktitle() {
        return hktitle;
    }

    public void setHktitle(String hktitle) {
        this.hktitle = hktitle == null ? null : hktitle.trim();
    }

    public String getHkans() {
        return hkans;
    }

    public void setHkans(String hkans) {
        this.hkans = hkans == null ? null : hkans.trim();
    }

    public String getHkdescb() {
        return hkdescb;
    }

    public void setHkdescb(String hkdescb) {
        this.hkdescb = hkdescb == null ? null : hkdescb.trim();
    }
}