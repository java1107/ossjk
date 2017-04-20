package com.jkoss.pojo.kc;

public class Subject {
    private Integer sbid;

    private Integer kcmdelid;

    private String sbname;

    private Integer sbdays;

    private String sbcontent;

    private Integer sbno;

    private String sbdescb;

    public Integer getSbid() {
        return sbid;
    }

    public void setSbid(Integer sbid) {
        this.sbid = sbid;
    }

    public Integer getKcmdelid() {
        return kcmdelid;
    }

    public void setKcmdelid(Integer kcmdelid) {
        this.kcmdelid = kcmdelid;
    }

    public String getSbname() {
        return sbname;
    }

    public void setSbname(String sbname) {
        this.sbname = sbname == null ? null : sbname.trim();
    }

    public Integer getSbdays() {
        return sbdays;
    }

    public void setSbdays(Integer sbdays) {
        this.sbdays = sbdays;
    }

    public String getSbcontent() {
        return sbcontent;
    }

    public void setSbcontent(String sbcontent) {
        this.sbcontent = sbcontent == null ? null : sbcontent.trim();
    }

    public Integer getSbno() {
        return sbno;
    }

    public void setSbno(Integer sbno) {
        this.sbno = sbno;
    }

    public String getSbdescb() {
        return sbdescb;
    }

    public void setSbdescb(String sbdescb) {
        this.sbdescb = sbdescb == null ? null : sbdescb.trim();
    }
}