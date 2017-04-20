package com.jkoss.pojo.jy;

import java.util.Date;

public class JiuyeGS {
    private Integer jyid;

    private Integer eid;

    private String jyname;

    private String jyaddrss;

    private String jytel;

    private String jyempname;

    private String jyeqq;

    private String jyetel;

    private Date jyaddtime;

    private Integer jydgr;

    private String jydescb;

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

    public String getJyname() {
        return jyname;
    }

    public void setJyname(String jyname) {
        this.jyname = jyname == null ? null : jyname.trim();
    }

    public String getJyaddrss() {
        return jyaddrss;
    }

    public void setJyaddrss(String jyaddrss) {
        this.jyaddrss = jyaddrss == null ? null : jyaddrss.trim();
    }

    public String getJytel() {
        return jytel;
    }

    public void setJytel(String jytel) {
        this.jytel = jytel == null ? null : jytel.trim();
    }

    public String getJyempname() {
        return jyempname;
    }

    public void setJyempname(String jyempname) {
        this.jyempname = jyempname == null ? null : jyempname.trim();
    }

    public String getJyeqq() {
        return jyeqq;
    }

    public void setJyeqq(String jyeqq) {
        this.jyeqq = jyeqq == null ? null : jyeqq.trim();
    }

    public String getJyetel() {
        return jyetel;
    }

    public void setJyetel(String jyetel) {
        this.jyetel = jyetel == null ? null : jyetel.trim();
    }

    public Date getJyaddtime() {
        return jyaddtime;
    }

    public void setJyaddtime(Date jyaddtime) {
        this.jyaddtime = jyaddtime;
    }

    public Integer getJydgr() {
        return jydgr;
    }

    public void setJydgr(Integer jydgr) {
        this.jydgr = jydgr;
    }

    public String getJydescb() {
        return jydescb;
    }

    public void setJydescb(String jydescb) {
        this.jydescb = jydescb == null ? null : jydescb.trim();
    }
}