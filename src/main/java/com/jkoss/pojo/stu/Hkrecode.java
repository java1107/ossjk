package com.jkoss.pojo.stu;

import java.util.Date;

public class Hkrecode {
    private Integer hkid2;

    private Integer clzid;

    private String hktitle2;

    private Date hkdodate;

    private String hkdescb2;

    public Integer getHkid2() {
        return hkid2;
    }

    public void setHkid2(Integer hkid2) {
        this.hkid2 = hkid2;
    }

    public Integer getClzid() {
        return clzid;
    }

    public void setClzid(Integer clzid) {
        this.clzid = clzid;
    }

    public String getHktitle2() {
        return hktitle2;
    }

    public void setHktitle2(String hktitle2) {
        this.hktitle2 = hktitle2 == null ? null : hktitle2.trim();
    }

    public Date getHkdodate() {
        return hkdodate;
    }

    public void setHkdodate(Date hkdodate) {
        this.hkdodate = hkdodate;
    }

    public String getHkdescb2() {
        return hkdescb2;
    }

    public void setHkdescb2(String hkdescb2) {
        this.hkdescb2 = hkdescb2 == null ? null : hkdescb2.trim();
    }
}