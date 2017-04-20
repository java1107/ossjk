package com.jkoss.pojo.loan;

import java.util.Date;

public class Loanorg {
    private Integer loancpid;

    private String loancp;

    private Date loanhzbegin;

    private Date loanhzbegin_in;

    private Date loanhzbegin_out;

    private String loanhzcontect;

    private String loanhzcontecttel;

    private Integer priority;

    private String loandesc;

    public Integer getLoancpid() {
        return loancpid;
    }

    public void setLoancpid(Integer loancpid) {
        this.loancpid = loancpid;
    }

    public String getLoancp() {
        return loancp;
    }

    public void setLoancp(String loancp) {
        this.loancp = loancp == null ? null : loancp.trim();
    }

    public Date getLoanhzbegin() {
        return loanhzbegin;
    }

    public void setLoanhzbegin(Date loanhzbegin) {
        this.loanhzbegin = loanhzbegin;
    }

    public Date getLoanhzbegin_in() {
        return loanhzbegin_in;
    }

    public void setLoanhzbegin_in(Date loanhzbegin_in) {
        this.loanhzbegin_in = loanhzbegin_in;
    }

    public Date getLoanhzbegin_out() {
        return loanhzbegin_out;
    }

    public void setLoanhzbegin_out(Date loanhzbegin_out) {
        this.loanhzbegin_out = loanhzbegin_out;
    }

    public String getLoanhzcontect() {
        return loanhzcontect;
    }

    public void setLoanhzcontect(String loanhzcontect) {
        this.loanhzcontect = loanhzcontect == null ? null : loanhzcontect.trim();
    }

    public String getLoanhzcontecttel() {
        return loanhzcontecttel;
    }

    public void setLoanhzcontecttel(String loanhzcontecttel) {
        this.loanhzcontecttel = loanhzcontecttel == null ? null : loanhzcontecttel.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getLoandesc() {
        return loandesc;
    }

    public void setLoandesc(String loandesc) {
        this.loandesc = loandesc == null ? null : loandesc.trim();
    }
}