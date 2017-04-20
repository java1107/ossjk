package com.jkoss.pojo.sys;

public class Sysright {
    private Integer rtid;

    private String rtname;

    private String rtdesc;

    public Integer getRtid() {
        return rtid;
    }

    public void setRtid(Integer rtid) {
        this.rtid = rtid;
    }

    public String getRtname() {
        return rtname;
    }

    public void setRtname(String rtname) {
        this.rtname = rtname == null ? null : rtname.trim();
    }

    public String getRtdesc() {
        return rtdesc;
    }

    public void setRtdesc(String rtdesc) {
        this.rtdesc = rtdesc == null ? null : rtdesc.trim();
    }
}