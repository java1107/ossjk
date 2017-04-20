package com.jkoss.pojo.jy;

import java.util.Date;

public class Interview {
    private Integer stumsid;

    private Integer jygwid;

    private Integer ossstuid;

    private Date stumstolddate;

    private Date stumsdate;

    private String stumsplace;

    private String stumstel;

    private String stumsresult;

    public Integer getStumsid() {
        return stumsid;
    }

    public void setStumsid(Integer stumsid) {
        this.stumsid = stumsid;
    }

    public Integer getJygwid() {
        return jygwid;
    }

    public void setJygwid(Integer jygwid) {
        this.jygwid = jygwid;
    }

    public Integer getOssstuid() {
        return ossstuid;
    }

    public void setOssstuid(Integer ossstuid) {
        this.ossstuid = ossstuid;
    }

    public Date getStumstolddate() {
        return stumstolddate;
    }

    public void setStumstolddate(Date stumstolddate) {
        this.stumstolddate = stumstolddate;
    }

    public Date getStumsdate() {
        return stumsdate;
    }

    public void setStumsdate(Date stumsdate) {
        this.stumsdate = stumsdate;
    }

    public String getStumsplace() {
        return stumsplace;
    }

    public void setStumsplace(String stumsplace) {
        this.stumsplace = stumsplace == null ? null : stumsplace.trim();
    }

    public String getStumstel() {
        return stumstel;
    }

    public void setStumstel(String stumstel) {
        this.stumstel = stumstel == null ? null : stumstel.trim();
    }

    public String getStumsresult() {
        return stumsresult;
    }

    public void setStumsresult(String stumsresult) {
        this.stumsresult = stumsresult == null ? null : stumsresult.trim();
    }
}