package com.jkoss.pojo.loan;

import java.util.Date;

public class Payrecords {
    private Integer payRecordID;

    private Integer payID;

    private String payRcunt;

    private Date payRDate;

    private Float payRNum;

    private Integer payRType;

    private String payRsj;

    private String payRdesc;

    public Integer getPayRecordID() {
        return payRecordID;
    }

    public void setPayRecordID(Integer payRecordID) {
        this.payRecordID = payRecordID;
    }

    public Integer getPayID() {
        return payID;
    }

    public void setPayID(Integer payID) {
        this.payID = payID;
    }

    public String getPayRcunt() {
        return payRcunt;
    }

    public void setPayRcunt(String payRcunt) {
        this.payRcunt = payRcunt == null ? null : payRcunt.trim();
    }

    public Date getPayRDate() {
        return payRDate;
    }

    public void setPayRDate(Date payRDate) {
        this.payRDate = payRDate;
    }

    public Float getPayRNum() {
        return payRNum;
    }

    public void setPayRNum(Float payRNum) {
        this.payRNum = payRNum;
    }

    public Integer getPayRType() {
        return payRType;
    }

    public void setPayRType(Integer payRType) {
        this.payRType = payRType;
    }

    public String getPayRsj() {
        return payRsj;
    }

    public void setPayRsj(String payRsj) {
        this.payRsj = payRsj == null ? null : payRsj.trim();
    }

    public String getPayRdesc() {
        return payRdesc;
    }

    public void setPayRdesc(String payRdesc) {
        this.payRdesc = payRdesc == null ? null : payRdesc.trim();
    }
}