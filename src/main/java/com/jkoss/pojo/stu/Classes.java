package com.jkoss.pojo.stu;

import java.util.Date;

public class Classes {
    private Integer clzid;

    private Integer kcid;

    private Integer eid;

    private Integer t_e_eid;

    private String clzname;

    private Integer clzprcc;

    private Date opentime;

    private Date grddate;

    private String clzdesc;

    public Integer getClzid() {
        return clzid;
    }

    public void setClzid(Integer clzid) {
        this.clzid = clzid;
    }

    public Integer getKcid() {
        return kcid;
    }

    public void setKcid(Integer kcid) {
        this.kcid = kcid;
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

    public String getClzname() {
        return clzname;
    }

    public void setClzname(String clzname) {
        this.clzname = clzname == null ? null : clzname.trim();
    }

    public Integer getClzprcc() {
        return clzprcc;
    }

    public void setClzprcc(Integer clzprcc) {
        this.clzprcc = clzprcc;
    }

    public Date getOpentime() {
        return opentime;
    }

    public void setOpentime(Date opentime) {
        this.opentime = opentime;
    }

    public Date getGrddate() {
        return grddate;
    }

    public void setGrddate(Date grddate) {
        this.grddate = grddate;
    }

    public String getClzdesc() {
        return clzdesc;
    }

    public void setClzdesc(String clzdesc) {
        this.clzdesc = clzdesc == null ? null : clzdesc.trim();
    }
}