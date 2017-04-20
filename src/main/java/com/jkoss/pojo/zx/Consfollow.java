package com.jkoss.pojo.zx;

import java.util.Date;

public class Consfollow {
    private Integer flwid;

    private Integer eid;

    private Integer zstuid;

    private Date flwdate;

    private String flwcontent;

    private String flwans;

    private String flwdesc;

    public Integer getFlwid() {
        return flwid;
    }

    public void setFlwid(Integer flwid) {
        this.flwid = flwid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getZstuid() {
        return zstuid;
    }

    public void setZstuid(Integer zstuid) {
        this.zstuid = zstuid;
    }

    public Date getFlwdate() {
        return flwdate;
    }

    public void setFlwdate(Date flwdate) {
        this.flwdate = flwdate;
    }

    public String getFlwcontent() {
        return flwcontent;
    }

    public void setFlwcontent(String flwcontent) {
        this.flwcontent = flwcontent == null ? null : flwcontent.trim();
    }

    public String getFlwans() {
        return flwans;
    }

    public void setFlwans(String flwans) {
        this.flwans = flwans == null ? null : flwans.trim();
    }

    public String getFlwdesc() {
        return flwdesc;
    }

    public void setFlwdesc(String flwdesc) {
        this.flwdesc = flwdesc == null ? null : flwdesc.trim();
    }
}