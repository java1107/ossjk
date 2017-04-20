package com.jkoss.pojo.kc;

public class Coursemodel {
    private Integer kcmdelid;

    private String kcmdelName;

    private String kcmdelDesc;

    public Integer getKcmdelid() {
        return kcmdelid;
    }

    public void setKcmdelid(Integer kcmdelid) {
        this.kcmdelid = kcmdelid;
    }

    public String getKcmdelName() {
        return kcmdelName;
    }

    public void setKcmdelName(String kcmdelName) {
        this.kcmdelName = kcmdelName == null ? null : kcmdelName.trim();
    }

    public String getKcmdelDesc() {
        return kcmdelDesc;
    }

    public void setKcmdelDesc(String kcmdelDesc) {
        this.kcmdelDesc = kcmdelDesc == null ? null : kcmdelDesc.trim();
    }
}