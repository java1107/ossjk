package com.jkoss.pojo.oa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jkoss.pojo.sys.Sysright;

public class Emps {
 
    private Integer eid;
    private Integer jobid;
    private Integer empdid;   //详细信息
    private String lgnName;
    private String ename;
    private String pwdword;
    private String weixin;
    private Date   hireDate;
    private Date   outDate;
    private Integer esex;
    private String  enotion;
    private Date    eage;
    private String ephone;
    private String qqp;
    private String qqe;
    private String wherefr;  //籍贯

	private Empdetail  detail;
    private EmpJobs    ejob;
    private List<Sysright>  rights ;
    
    public String getWherefr() {
		return wherefr;
	}

	public void setWherefr(String wherefr) {
		this.wherefr = wherefr;
	}
    
    public Integer getEid() {
        return eid;
    }
 
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getJobid() {
        return jobid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emps.jobid
     *
     * @param jobid the value for t_emps.jobid
     *
     * @mbggenerated
     */
    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emps.jyid
     *
     * @return the value of t_emps.jyid
     *
     * @mbggenerated
     */
    public Integer getEmpdid() {
        return empdid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emps.jyid
     *
     * @param jyid the value for t_emps.jyid
     *
     * @mbggenerated
     */
    public void setEmpdid(Integer empdid) {
        this.empdid = empdid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emps.lgnName
     *
     * @return the value of t_emps.lgnName
     *
     * @mbggenerated
     */
    public String getLgnName() {
        return lgnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emps.lgnName
     *
     * @param lgnName the value for t_emps.lgnName
     *
     * @mbggenerated
     */
    public void setLgnName(String lgnName) {
        this.lgnName = lgnName == null ? null : lgnName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emps.ename
     *
     * @return the value of t_emps.ename
     *
     * @mbggenerated
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emps.ename
     *
     * @param ename the value for t_emps.ename
     *
     * @mbggenerated
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emps.pwdword
     *
     * @return the value of t_emps.pwdword
     *
     * @mbggenerated
     */
    public String getPwdword() {
        return pwdword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emps.pwdword
     *
     * @param pwdword the value for t_emps.pwdword
     *
     * @mbggenerated
     */
    public void setPwdword(String pwdword) {
        this.pwdword = pwdword == null ? null : pwdword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emps.weixin
     *
     * @return the value of t_emps.weixin
     *
     * @mbggenerated
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emps.weixin
     *
     * @param weixin the value for t_emps.weixin
     *
     * @mbggenerated
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emps.hireDate
     *
     * @return the value of t_emps.hireDate
     *
     * @mbggenerated
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emps.hireDate
     *
     * @param hireDate the value for t_emps.hireDate
     *
     * @mbggenerated
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emps.outDate
     *
     * @return the value of t_emps.outDate
     *
     * @mbggenerated
     */
    public Date getOutDate() {
        return outDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emps.outDate
     *
     * @param outDate the value for t_emps.outDate
     *
     * @mbggenerated
     */
    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emps.esex
     *
     * @return the value of t_emps.esex
     *
     * @mbggenerated
     */
    public Integer getEsex() {
        return esex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emps.esex
     *
     * @param esex the value for t_emps.esex
     *
     * @mbggenerated
     */
    public void setEsex(Integer esex) {
        this.esex = esex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emps.enotion
     *
     * @return the value of t_emps.enotion
     *
     * @mbggenerated
     */
    public String getEnotion() {
        return enotion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emps.enotion
     *
     * @param enotion the value for t_emps.enotion
     *
     * @mbggenerated
     */
    public void setEnotion(String enotion) {
        this.enotion = enotion == null ? null : enotion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emps.eage
     *
     * @return the value of t_emps.eage
     *
     * @mbggenerated
     */
    public Date getEage() {
        return eage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emps.eage
     *
     * @param eage the value for t_emps.eage
     *
     * @mbggenerated
     */
    public void setEage(Date eage) {
        this.eage = eage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emps.ephone
     *
     * @return the value of t_emps.ephone
     *
     * @mbggenerated
     */
    public String getEphone() {
        return ephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emps.ephone
     *
     * @param ephone the value for t_emps.ephone
     *
     * @mbggenerated
     */
    public void setEphone(String ephone) {
        this.ephone = ephone == null ? null : ephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emps.qqp
     *
     * @return the value of t_emps.qqp
     *
     * @mbggenerated
     */
    public String getQqp() {
        return qqp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emps.qqp
     *
     * @param qqp the value for t_emps.qqp
     *
     * @mbggenerated
     */
    public void setQqp(String qqp) {
        this.qqp = qqp == null ? null : qqp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emps.qqe
     *
     * @return the value of t_emps.qqe
     *
     * @mbggenerated
     */
    public String getQqe() {
        return qqe;
    }

   
    public void setQqe(String qqe) {
        this.qqe = qqe == null ? null : qqe.trim();
    }

	public Empdetail getDetail() {
		return detail;
	}

	public void setDetail(Empdetail detail) {
		this.detail = detail;
	}
 
	public List<Sysright> getRights() {
		return rights;
	}

	public void setRights(List<Sysright> rights) {
		this.rights = rights;
	}

	public EmpJobs getEjob() {
		return ejob;
	}

	public void setEjob(EmpJobs ejob) {
		this.ejob = ejob;
	}

 
       
}