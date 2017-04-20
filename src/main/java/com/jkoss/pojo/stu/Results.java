package com.jkoss.pojo.stu;

public class Results {
    private Integer resid;

    private Integer ossstuid;

    private Integer themeid;

    private Integer score;

    private String scoredescb;

    public Integer getResid() {
        return resid;
    }

    public void setResid(Integer resid) {
        this.resid = resid;
    }

    public Integer getOssstuid() {
        return ossstuid;
    }

    public void setOssstuid(Integer ossstuid) {
        this.ossstuid = ossstuid;
    }

    public Integer getThemeid() {
        return themeid;
    }

    public void setThemeid(Integer themeid) {
        this.themeid = themeid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getScoredescb() {
        return scoredescb;
    }

    public void setScoredescb(String scoredescb) {
        this.scoredescb = scoredescb == null ? null : scoredescb.trim();
    }
}