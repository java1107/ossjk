package com.jkoss.pojo.stu;

import java.util.Date;

public class Stupinxue {
    private Integer pinjiaID;

    private Integer ossstuid;

    private Integer eid;

    private Date pjDate;

    private Integer stulisten;

    private Integer studo;

    private String jxcontent;

    private String explang;

    private String othadv;

    public Integer getPinjiaID() {
        return pinjiaID;
    }

    public void setPinjiaID(Integer pinjiaID) {
        this.pinjiaID = pinjiaID;
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

    public Date getPjDate() {
        return pjDate;
    }

    public void setPjDate(Date pjDate) {
        this.pjDate = pjDate;
    }

    public Integer getStulisten() {
        return stulisten;
    }

    public void setStulisten(Integer stulisten) {
        this.stulisten = stulisten;
    }

    public Integer getStudo() {
        return studo;
    }

    public void setStudo(Integer studo) {
        this.studo = studo;
    }

    public String getJxcontent() {
        return jxcontent;
    }

    public void setJxcontent(String jxcontent) {
        this.jxcontent = jxcontent == null ? null : jxcontent.trim();
    }

    public String getExplang() {
        return explang;
    }

    public void setExplang(String explang) {
        this.explang = explang == null ? null : explang.trim();
    }

    public String getOthadv() {
        return othadv;
    }

    public void setOthadv(String othadv) {
        this.othadv = othadv == null ? null : othadv.trim();
    }
}