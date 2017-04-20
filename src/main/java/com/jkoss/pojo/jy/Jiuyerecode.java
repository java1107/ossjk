package com.jkoss.pojo.jy;

import java.util.Date;

public class Jiuyerecode {
    private Integer jysuccid;

    private Integer eid;

    private Integer ossstuid;

    private String ltdname;

    private String address;

    private Date emptime;

    private Date trialtime;

    private Integer trialwages;

    private Date positivetime;

    private Integer positivepay;

    public Integer getJysuccid() {
        return jysuccid;
    }

    public void setJysuccid(Integer jysuccid) {
        this.jysuccid = jysuccid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getOssstuid() {
        return ossstuid;
    }

    public void setOssstuid(Integer ossstuid) {
        this.ossstuid = ossstuid;
    }

    public String getLtdname() {
        return ltdname;
    }

    public void setLtdname(String ltdname) {
        this.ltdname = ltdname == null ? null : ltdname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getEmptime() {
        return emptime;
    }

    public void setEmptime(Date emptime) {
        this.emptime = emptime;
    }

    public Date getTrialtime() {
        return trialtime;
    }

    public void setTrialtime(Date trialtime) {
        this.trialtime = trialtime;
    }

    public Integer getTrialwages() {
        return trialwages;
    }

    public void setTrialwages(Integer trialwages) {
        this.trialwages = trialwages;
    }

    public Date getPositivetime() {
        return positivetime;
    }

    public void setPositivetime(Date positivetime) {
        this.positivetime = positivetime;
    }

    public Integer getPositivepay() {
        return positivepay;
    }

    public void setPositivepay(Integer positivepay) {
        this.positivepay = positivepay;
    }
}