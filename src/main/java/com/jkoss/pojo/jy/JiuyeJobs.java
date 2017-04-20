package com.jkoss.pojo.jy;

public class JiuyeJobs {
    private Integer jobid;

    private Integer depID;

    private String jobname;

    private String jobdesc;

    private Integer jobsal;

    private String jxsal;

    private String thrsal;

    private Integer upjobid;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getDepID() {
        return depID;
    }

    public void setDepID(Integer depID) {
        this.depID = depID;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getJobdesc() {
        return jobdesc;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc == null ? null : jobdesc.trim();
    }

    public Integer getJobsal() {
        return jobsal;
    }

    public void setJobsal(Integer jobsal) {
        this.jobsal = jobsal;
    }

    public String getJxsal() {
        return jxsal;
    }

    public void setJxsal(String jxsal) {
        this.jxsal = jxsal == null ? null : jxsal.trim();
    }

    public String getThrsal() {
        return thrsal;
    }

    public void setThrsal(String thrsal) {
        this.thrsal = thrsal == null ? null : thrsal.trim();
    }

    public Integer getUpjobid() {
        return upjobid;
    }

    public void setUpjobid(Integer upjobid) {
        this.upjobid = upjobid;
    }
}