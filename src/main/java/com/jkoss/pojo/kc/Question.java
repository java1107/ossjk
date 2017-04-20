package com.jkoss.pojo.kc;

public class Question {
    private Integer qid;

    private Integer eid;

    private Integer kcmdelid;

    private String questionName;

    private Integer questiontype;

    private String qselectA;

    private String qselectB;

    private String qselectC;

    private String qselectD;

    private String anws;

    private Integer hard;

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getKcmdelid() {
        return kcmdelid;
    }

    public void setKcmdelid(Integer kcmdelid) {
        this.kcmdelid = kcmdelid;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName == null ? null : questionName.trim();
    }

    public Integer getQuestiontype() {
        return questiontype;
    }

    public void setQuestiontype(Integer questiontype) {
        this.questiontype = questiontype;
    }

    public String getQselectA() {
        return qselectA;
    }

    public void setQselectA(String qselectA) {
        this.qselectA = qselectA == null ? null : qselectA.trim();
    }

    public String getQselectB() {
        return qselectB;
    }

    public void setQselectB(String qselectB) {
        this.qselectB = qselectB == null ? null : qselectB.trim();
    }

    public String getQselectC() {
        return qselectC;
    }

    public void setQselectC(String qselectC) {
        this.qselectC = qselectC == null ? null : qselectC.trim();
    }

    public String getQselectD() {
        return qselectD;
    }

    public void setQselectD(String qselectD) {
        this.qselectD = qselectD == null ? null : qselectD.trim();
    }

    public String getAnws() {
        return anws;
    }

    public void setAnws(String anws) {
        this.anws = anws == null ? null : anws.trim();
    }

    public Integer getHard() {
        return hard;
    }

    public void setHard(Integer hard) {
        this.hard = hard;
    }
}