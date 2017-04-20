package com.jkoss.pojo.jy;

import java.util.Date;

public class Stucmpjob {
    private Integer jygwid;

    private Integer jyid;

    private Integer eid;

    private String jygwName;

    private String jygwdescb;

    private Integer jygwmin;

    private Integer jygwmax;

    private Integer jygwnum;

    private Date jygwbegindate;

    private Date jygwenddate;

    private String jygwbeizhu;

    private String jygwbeizhu2;

    public Integer getJygwid() {
        return jygwid;
    }

    public void setJygwid(Integer jygwid) {
        this.jygwid = jygwid;
    }

    public Integer getJyid() {
        return jyid;
    }

    public void setJyid(Integer jyid) {
        this.jyid = jyid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getJygwName() {
        return jygwName;
    }

    public void setJygwName(String jygwName) {
        this.jygwName = jygwName == null ? null : jygwName.trim();
    }

    public String getJygwdescb() {
        return jygwdescb;
    }

    public void setJygwdescb(String jygwdescb) {
        this.jygwdescb = jygwdescb == null ? null : jygwdescb.trim();
    }

    public Integer getJygwmin() {
        return jygwmin;
    }

    public void setJygwmin(Integer jygwmin) {
        this.jygwmin = jygwmin;
    }

    public Integer getJygwmax() {
        return jygwmax;
    }

    public void setJygwmax(Integer jygwmax) {
        this.jygwmax = jygwmax;
    }

    public Integer getJygwnum() {
        return jygwnum;
    }

    public void setJygwnum(Integer jygwnum) {
        this.jygwnum = jygwnum;
    }

    public Date getJygwbegindate() {
        return jygwbegindate;
    }

    public void setJygwbegindate(Date jygwbegindate) {
        this.jygwbegindate = jygwbegindate;
    }

    public Date getJygwenddate() {
        return jygwenddate;
    }

    public void setJygwenddate(Date jygwenddate) {
        this.jygwenddate = jygwenddate;
    }

    public String getJygwbeizhu() {
        return jygwbeizhu;
    }

    public void setJygwbeizhu(String jygwbeizhu) {
        this.jygwbeizhu = jygwbeizhu == null ? null : jygwbeizhu.trim();
    }

    public String getJygwbeizhu2() {
        return jygwbeizhu2;
    }

    public void setJygwbeizhu2(String jygwbeizhu2) {
        this.jygwbeizhu2 = jygwbeizhu2 == null ? null : jygwbeizhu2.trim();
    }
}