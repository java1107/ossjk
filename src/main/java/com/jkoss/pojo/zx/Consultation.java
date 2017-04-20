package com.jkoss.pojo.zx;

import java.util.Date;

public class Consultation {
    private Integer zstuid;

    private Integer schoolID;

    private Integer eid;

    private Integer t_e_eid;

    private Integer ossstuid;

    private String stuname;

    private Integer ssex;

    private String magyer;

    private Integer zxltype;

    private String gaoxiaoClz;

    private String stuphone;

    private Integer zstuqq;

    private Date contime;

    private Integer entrance;

    private Date entime;

    private Integer stuclassid;

    private String weixin;

    private Integer zxstate;

    private String zstudesc;

    public Integer getZstuid() {
        return zstuid;
    }

    public void setZstuid(Integer zstuid) {
        this.zstuid = zstuid;
    }

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

    public Integer getT_e_eid() {
        return t_e_eid;
    }

    public void setT_e_eid(Integer t_e_eid) {
        this.t_e_eid = t_e_eid;
    }

    public Integer getOssstuid() {
        return ossstuid;
    }

    public void setOssstuid(Integer ossstuid) {
        this.ossstuid = ossstuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public Integer getSsex() {
        return ssex;
    }

    public void setSsex(Integer ssex) {
        this.ssex = ssex;
    }

    public String getMagyer() {
        return magyer;
    }

    public void setMagyer(String magyer) {
        this.magyer = magyer == null ? null : magyer.trim();
    }

    public Integer getZxltype() {
        return zxltype;
    }

    public void setZxltype(Integer zxltype) {
        this.zxltype = zxltype;
    }

    public String getGaoxiaoClz() {
        return gaoxiaoClz;
    }

    public void setGaoxiaoClz(String gaoxiaoClz) {
        this.gaoxiaoClz = gaoxiaoClz == null ? null : gaoxiaoClz.trim();
    }

    public String getStuphone() {
        return stuphone;
    }

    public void setStuphone(String stuphone) {
        this.stuphone = stuphone == null ? null : stuphone.trim();
    }

    public Integer getZstuqq() {
        return zstuqq;
    }

    public void setZstuqq(Integer zstuqq) {
        this.zstuqq = zstuqq;
    }

    public Date getContime() {
        return contime;
    }

    public void setContime(Date contime) {
        this.contime = contime;
    }

    public Integer getEntrance() {
        return entrance;
    }

    public void setEntrance(Integer entrance) {
        this.entrance = entrance;
    }

    public Date getEntime() {
        return entime;
    }

    public void setEntime(Date entime) {
        this.entime = entime;
    }

    public Integer getStuclassid() {
        return stuclassid;
    }

    public void setStuclassid(Integer stuclassid) {
        this.stuclassid = stuclassid;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public Integer getZxstate() {
        return zxstate;
    }

    public void setZxstate(Integer zxstate) {
        this.zxstate = zxstate;
    }

    public String getZstudesc() {
        return zstudesc;
    }

    public void setZstudesc(String zstudesc) {
        this.zstudesc = zstudesc == null ? null : zstudesc.trim();
    }
}