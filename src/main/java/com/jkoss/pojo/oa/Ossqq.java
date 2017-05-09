package com.jkoss.pojo.oa;

import java.util.Date;

public class Ossqq {
    private Integer qqeid;

    private Integer eid;
    private Emps    owner;  //拥有人
    
    private Integer t_e_eid;
    private Emps    useEmp;   //使用人
    
    private String qqename;

    private Integer qqesex;

    private String qqeuse;

    private String qqepwd;

    private Date qqelastupp;

    private Date lastfp;

    private String qqenote;

    public Integer getQqeid() {
        return qqeid;
    }

    public void setQqeid(Integer qqeid) {
        this.qqeid = qqeid;
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

    public String getQqename() {
        return qqename;
    }

    public void setQqename(String qqename) {
        this.qqename = qqename == null ? null : qqename.trim();
    }

    public Integer getQqesex() {
        return qqesex;
    }

    public void setQqesex(Integer qqesex) {
        this.qqesex = qqesex;
    }

    public String getQqeuse() {
        return qqeuse;
    }

    public void setQqeuse(String qqeuse) {
        this.qqeuse = qqeuse == null ? null : qqeuse.trim();
    }

    public String getQqepwd() {
        return qqepwd;
    }

    public void setQqepwd(String qqepwd) {
        this.qqepwd = qqepwd == null ? null : qqepwd.trim();
    }

    public Date getQqelastupp() {
        return qqelastupp;
    }

    public void setQqelastupp(Date qqelastupp) {
        this.qqelastupp = qqelastupp;
    }

    public Date getLastfp() {
        return lastfp;
    }

    public void setLastfp(Date lastfp) {
        this.lastfp = lastfp;
    }

    public String getQqenote() {
        return qqenote;
    }

    public void setQqenote(String qqenote) {
        this.qqenote = qqenote == null ? null : qqenote.trim();
    }

	public Emps getOwner() {
		return owner;
	}

	public void setOwner(Emps owner) {
		this.owner = owner;
	}

	public Emps getUseEmp() {
		return useEmp;
	}

	public void setUseEmp(Emps useEmp) {
		this.useEmp = useEmp;
	}
    
    
    
    
}