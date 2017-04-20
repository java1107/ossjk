package com.jkoss.pojo.kc;

import java.util.Date;

public class Course {
    private Integer kcid;

    private String kcname;

    private Date kcdate;

    private String kcdesc;

    public Integer getKcid() {
        return kcid;
    }

    public void setKcid(Integer kcid) {
        this.kcid = kcid;
    }

    public String getKcname() {
        return kcname;
    }

    public void setKcname(String kcname) {
        this.kcname = kcname == null ? null : kcname.trim();
    }

    public Date getKcdate() {
        return kcdate;
    }

    public void setKcdate(Date kcdate) {
        this.kcdate = kcdate;
    }

    public String getKcdesc() {
        return kcdesc;
    }

    public void setKcdesc(String kcdesc) {
        this.kcdesc = kcdesc == null ? null : kcdesc.trim();
    }
}