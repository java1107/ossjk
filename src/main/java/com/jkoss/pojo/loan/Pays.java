package com.jkoss.pojo.loan;

import java.util.Date;

public class Pays {
    private Integer payID;

    private Integer fanID;

    private Integer ossstuid;

    private Date payDate;

    private Integer allneedpay;

    private Integer payType;

    private String payDesc;

    private String payother;

    public Integer getPayID() {
        return payID;
    }

    public void setPayID(Integer payID) {
        this.payID = payID;
    }

    public Integer getFanID() {
        return fanID;
    }

    public void setFanID(Integer fanID) {
        this.fanID = fanID;
    }

    public Integer getOssstuid() {
        return ossstuid;
    }

    public void setOssstuid(Integer ossstuid) {
        this.ossstuid = ossstuid;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Integer getAllneedpay() {
        return allneedpay;
    }

    public void setAllneedpay(Integer allneedpay) {
        this.allneedpay = allneedpay;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayDesc() {
        return payDesc;
    }

    public void setPayDesc(String payDesc) {
        this.payDesc = payDesc == null ? null : payDesc.trim();
    }

    public String getPayother() {
        return payother;
    }

    public void setPayother(String payother) {
        this.payother = payother == null ? null : payother.trim();
    }
}