package com.jkoss.pojo.loan;

import java.util.Date;

public class Loancfg {
    private Integer fanID;

    private Integer loancpid;

    private String fanName;

    private Float fancost;

    private Date gendate;

    private String gencount;

    private Integer paymth;

    private Date bhybegin;

    private Float bhpay;

    private Integer bhpaymth;

    private Date paybegin;

    private Float payxf;

    private String fandesc;

    public Integer getFanID() {
        return fanID;
    }

    public void setFanID(Integer fanID) {
        this.fanID = fanID;
    }

    public Integer getLoancpid() {
        return loancpid;
    }

    public void setLoancpid(Integer loancpid) {
        this.loancpid = loancpid;
    }

    public String getFanName() {
        return fanName;
    }

    public void setFanName(String fanName) {
        this.fanName = fanName == null ? null : fanName.trim();
    }

    public Float getFancost() {
        return fancost;
    }

    public void setFancost(Float fancost) {
        this.fancost = fancost;
    }

    public Date getGendate() {
        return gendate;
    }

    public void setGendate(Date gendate) {
        this.gendate = gendate;
    }

    public String getGencount() {
        return gencount;
    }

    public void setGencount(String gencount) {
        this.gencount = gencount == null ? null : gencount.trim();
    }

    public Integer getPaymth() {
        return paymth;
    }

    public void setPaymth(Integer paymth) {
        this.paymth = paymth;
    }

    public Date getBhybegin() {
        return bhybegin;
    }

    public void setBhybegin(Date bhybegin) {
        this.bhybegin = bhybegin;
    }

    public Float getBhpay() {
        return bhpay;
    }

    public void setBhpay(Float bhpay) {
        this.bhpay = bhpay;
    }

    public Integer getBhpaymth() {
        return bhpaymth;
    }

    public void setBhpaymth(Integer bhpaymth) {
        this.bhpaymth = bhpaymth;
    }

    public Date getPaybegin() {
        return paybegin;
    }

    public void setPaybegin(Date paybegin) {
        this.paybegin = paybegin;
    }

    public Float getPayxf() {
        return payxf;
    }

    public void setPayxf(Float payxf) {
        this.payxf = payxf;
    }

    public String getFandesc() {
        return fandesc;
    }

    public void setFandesc(String fandesc) {
        this.fandesc = fandesc == null ? null : fandesc.trim();
    }
}