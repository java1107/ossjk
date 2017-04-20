package com.jkoss.pojo.stu;

import java.util.Date;

public class Ossstu {
    private Integer ossstuid;

    private Integer clzid;

    private Integer ossstuage;

    private Date joinDate;

    private String ossstuIDno;

    private String ossstuctnt;

    private String ossstuctnttel;

    private String ossstuctnt2;

    private Integer stukqno;

    public Integer getOssstuid() {
        return ossstuid;
    }

    public void setOssstuid(Integer ossstuid) {
        this.ossstuid = ossstuid;
    }

    public Integer getClzid() {
        return clzid;
    }

    public void setClzid(Integer clzid) {
        this.clzid = clzid;
    }

    public Integer getOssstuage() {
        return ossstuage;
    }

    public void setOssstuage(Integer ossstuage) {
        this.ossstuage = ossstuage;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getOssstuIDno() {
        return ossstuIDno;
    }

    public void setOssstuIDno(String ossstuIDno) {
        this.ossstuIDno = ossstuIDno == null ? null : ossstuIDno.trim();
    }

    public String getOssstuctnt() {
        return ossstuctnt;
    }

    public void setOssstuctnt(String ossstuctnt) {
        this.ossstuctnt = ossstuctnt == null ? null : ossstuctnt.trim();
    }

    public String getOssstuctnttel() {
        return ossstuctnttel;
    }

    public void setOssstuctnttel(String ossstuctnttel) {
        this.ossstuctnttel = ossstuctnttel == null ? null : ossstuctnttel.trim();
    }

    public String getOssstuctnt2() {
        return ossstuctnt2;
    }

    public void setOssstuctnt2(String ossstuctnt2) {
        this.ossstuctnt2 = ossstuctnt2 == null ? null : ossstuctnt2.trim();
    }

    public Integer getStukqno() {
        return stukqno;
    }

    public void setStukqno(Integer stukqno) {
        this.stukqno = stukqno;
    }
}