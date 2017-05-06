package com.jkoss.pojo.oa;

import java.util.Date;

public class Empfiles {
    private Integer fjid;
    //谁的附件
    private Integer eid;
    //谁添加
    private Integer t_e_eid;

    private String fjname;

    private String fjadds;

    private Date fjuploaddate;

    public Integer getFjid() {
        return fjid;
    }

    public void setFjid(Integer fjid) {
        this.fjid = fjid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getT_e_eid() {
        return t_e_eid;
    }

    public void setT_e_eid(Integer t_e_eid) {
        this.t_e_eid = t_e_eid;
    }

    public String getFjname() {
        return fjname;
    }

    public void setFjname(String fjname) {
        this.fjname = fjname == null ? null : fjname.trim();
    }

    public String getFjadds() {
        return fjadds;
    }

    public void setFjadds(String fjadds) {
        this.fjadds = fjadds == null ? null : fjadds.trim();
    }

    public Date getFjuploaddate() {
        return fjuploaddate;
    }

    public void setFjuploaddate(Date fjuploaddate) {
        this.fjuploaddate = fjuploaddate;
    }
}