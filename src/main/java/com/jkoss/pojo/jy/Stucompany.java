package com.jkoss.pojo.jy;

import java.util.Date;

public class Stucompany {
    private Integer jygjID;

    private Integer eid;

    private Integer jyid;

    private Date jygjDate;

    private String jygjcontent;

    private String jygjresult;

    public Integer getJygjID() {
        return jygjID;
    }

    public void setJygjID(Integer jygjID) {
        this.jygjID = jygjID;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getJyid() {
        return jyid;
    }

    public void setJyid(Integer jyid) {
        this.jyid = jyid;
    }

    public Date getJygjDate() {
        return jygjDate;
    }

    public void setJygjDate(Date jygjDate) {
        this.jygjDate = jygjDate;
    }

    public String getJygjcontent() {
        return jygjcontent;
    }

    public void setJygjcontent(String jygjcontent) {
        this.jygjcontent = jygjcontent == null ? null : jygjcontent.trim();
    }

    public String getJygjresult() {
        return jygjresult;
    }

    public void setJygjresult(String jygjresult) {
        this.jygjresult = jygjresult == null ? null : jygjresult.trim();
    }
}