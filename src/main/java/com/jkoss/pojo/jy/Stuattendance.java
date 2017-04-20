package com.jkoss.pojo.jy;

import java.util.Date;

public class Stuattendance {
    private Integer kqid;

    private Integer ossstuid;

    private Integer eid;

    private Date kqdate1;

    private Date kqdate2;

    private String kqresult;

    private String kqbreak;

    public Integer getKqid() {
        return kqid;
    }

    public void setKqid(Integer kqid) {
        this.kqid = kqid;
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

    public Date getKqdate1() {
        return kqdate1;
    }

    public void setKqdate1(Date kqdate1) {
        this.kqdate1 = kqdate1;
    }

    public Date getKqdate2() {
        return kqdate2;
    }

    public void setKqdate2(Date kqdate2) {
        this.kqdate2 = kqdate2;
    }

    public String getKqresult() {
        return kqresult;
    }

    public void setKqresult(String kqresult) {
        this.kqresult = kqresult == null ? null : kqresult.trim();
    }

    public String getKqbreak() {
        return kqbreak;
    }

    public void setKqbreak(String kqbreak) {
        this.kqbreak = kqbreak == null ? null : kqbreak.trim();
    }
}