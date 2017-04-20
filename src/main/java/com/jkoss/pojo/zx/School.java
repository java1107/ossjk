package com.jkoss.pojo.zx;

public class School {
    private Integer schoolID;

    private Integer eid;

    private String schoolsf;

    private String skcity;

    private String skname;

    public Integer getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(Integer schoolID) {
        this.schoolID = schoolID;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getSchoolsf() {
        return schoolsf;
    }

    public void setSchoolsf(String schoolsf) {
        this.schoolsf = schoolsf == null ? null : schoolsf.trim();
    }

    public String getSkcity() {
        return skcity;
    }

    public void setSkcity(String skcity) {
        this.skcity = skcity == null ? null : skcity.trim();
    }

    public String getSkname() {
        return skname;
    }

    public void setSkname(String skname) {
        this.skname = skname == null ? null : skname.trim();
    }
}