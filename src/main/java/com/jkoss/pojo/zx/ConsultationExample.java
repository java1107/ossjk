package com.jkoss.pojo.zx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsultationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsultationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andZstuidIsNull() {
            addCriterion("zstuid is null");
            return (Criteria) this;
        }

        public Criteria andZstuidIsNotNull() {
            addCriterion("zstuid is not null");
            return (Criteria) this;
        }

        public Criteria andZstuidEqualTo(Integer value) {
            addCriterion("zstuid =", value, "zstuid");
            return (Criteria) this;
        }

        public Criteria andZstuidNotEqualTo(Integer value) {
            addCriterion("zstuid <>", value, "zstuid");
            return (Criteria) this;
        }

        public Criteria andZstuidGreaterThan(Integer value) {
            addCriterion("zstuid >", value, "zstuid");
            return (Criteria) this;
        }

        public Criteria andZstuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zstuid >=", value, "zstuid");
            return (Criteria) this;
        }

        public Criteria andZstuidLessThan(Integer value) {
            addCriterion("zstuid <", value, "zstuid");
            return (Criteria) this;
        }

        public Criteria andZstuidLessThanOrEqualTo(Integer value) {
            addCriterion("zstuid <=", value, "zstuid");
            return (Criteria) this;
        }

        public Criteria andZstuidIn(List<Integer> values) {
            addCriterion("zstuid in", values, "zstuid");
            return (Criteria) this;
        }

        public Criteria andZstuidNotIn(List<Integer> values) {
            addCriterion("zstuid not in", values, "zstuid");
            return (Criteria) this;
        }

        public Criteria andZstuidBetween(Integer value1, Integer value2) {
            addCriterion("zstuid between", value1, value2, "zstuid");
            return (Criteria) this;
        }

        public Criteria andZstuidNotBetween(Integer value1, Integer value2) {
            addCriterion("zstuid not between", value1, value2, "zstuid");
            return (Criteria) this;
        }

        public Criteria andSchoolIDIsNull() {
            addCriterion("schoolID is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIDIsNotNull() {
            addCriterion("schoolID is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIDEqualTo(Integer value) {
            addCriterion("schoolID =", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDNotEqualTo(Integer value) {
            addCriterion("schoolID <>", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDGreaterThan(Integer value) {
            addCriterion("schoolID >", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolID >=", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDLessThan(Integer value) {
            addCriterion("schoolID <", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDLessThanOrEqualTo(Integer value) {
            addCriterion("schoolID <=", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDIn(List<Integer> values) {
            addCriterion("schoolID in", values, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDNotIn(List<Integer> values) {
            addCriterion("schoolID not in", values, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDBetween(Integer value1, Integer value2) {
            addCriterion("schoolID between", value1, value2, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolID not between", value1, value2, "schoolID");
            return (Criteria) this;
        }

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidIsNull() {
            addCriterion("t_e_eid is null");
            return (Criteria) this;
        }

        public Criteria andT_e_eidIsNotNull() {
            addCriterion("t_e_eid is not null");
            return (Criteria) this;
        }

        public Criteria andT_e_eidEqualTo(Integer value) {
            addCriterion("t_e_eid =", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidNotEqualTo(Integer value) {
            addCriterion("t_e_eid <>", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidGreaterThan(Integer value) {
            addCriterion("t_e_eid >", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_e_eid >=", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidLessThan(Integer value) {
            addCriterion("t_e_eid <", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidLessThanOrEqualTo(Integer value) {
            addCriterion("t_e_eid <=", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidIn(List<Integer> values) {
            addCriterion("t_e_eid in", values, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidNotIn(List<Integer> values) {
            addCriterion("t_e_eid not in", values, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidBetween(Integer value1, Integer value2) {
            addCriterion("t_e_eid between", value1, value2, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidNotBetween(Integer value1, Integer value2) {
            addCriterion("t_e_eid not between", value1, value2, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andOssstuidIsNull() {
            addCriterion("ossstuid is null");
            return (Criteria) this;
        }

        public Criteria andOssstuidIsNotNull() {
            addCriterion("ossstuid is not null");
            return (Criteria) this;
        }

        public Criteria andOssstuidEqualTo(Integer value) {
            addCriterion("ossstuid =", value, "ossstuid");
            return (Criteria) this;
        }

        public Criteria andOssstuidNotEqualTo(Integer value) {
            addCriterion("ossstuid <>", value, "ossstuid");
            return (Criteria) this;
        }

        public Criteria andOssstuidGreaterThan(Integer value) {
            addCriterion("ossstuid >", value, "ossstuid");
            return (Criteria) this;
        }

        public Criteria andOssstuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ossstuid >=", value, "ossstuid");
            return (Criteria) this;
        }

        public Criteria andOssstuidLessThan(Integer value) {
            addCriterion("ossstuid <", value, "ossstuid");
            return (Criteria) this;
        }

        public Criteria andOssstuidLessThanOrEqualTo(Integer value) {
            addCriterion("ossstuid <=", value, "ossstuid");
            return (Criteria) this;
        }

        public Criteria andOssstuidIn(List<Integer> values) {
            addCriterion("ossstuid in", values, "ossstuid");
            return (Criteria) this;
        }

        public Criteria andOssstuidNotIn(List<Integer> values) {
            addCriterion("ossstuid not in", values, "ossstuid");
            return (Criteria) this;
        }

        public Criteria andOssstuidBetween(Integer value1, Integer value2) {
            addCriterion("ossstuid between", value1, value2, "ossstuid");
            return (Criteria) this;
        }

        public Criteria andOssstuidNotBetween(Integer value1, Integer value2) {
            addCriterion("ossstuid not between", value1, value2, "ossstuid");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuname is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuname is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuname =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuname <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuname >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuname >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuname <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuname <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuname like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuname not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuname in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuname not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuname between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuname not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andSsexIsNull() {
            addCriterion("ssex is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("ssex is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(Integer value) {
            addCriterion("ssex =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(Integer value) {
            addCriterion("ssex <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(Integer value) {
            addCriterion("ssex >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("ssex >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(Integer value) {
            addCriterion("ssex <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(Integer value) {
            addCriterion("ssex <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<Integer> values) {
            addCriterion("ssex in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<Integer> values) {
            addCriterion("ssex not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(Integer value1, Integer value2) {
            addCriterion("ssex between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(Integer value1, Integer value2) {
            addCriterion("ssex not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andMagyerIsNull() {
            addCriterion("magyer is null");
            return (Criteria) this;
        }

        public Criteria andMagyerIsNotNull() {
            addCriterion("magyer is not null");
            return (Criteria) this;
        }

        public Criteria andMagyerEqualTo(String value) {
            addCriterion("magyer =", value, "magyer");
            return (Criteria) this;
        }

        public Criteria andMagyerNotEqualTo(String value) {
            addCriterion("magyer <>", value, "magyer");
            return (Criteria) this;
        }

        public Criteria andMagyerGreaterThan(String value) {
            addCriterion("magyer >", value, "magyer");
            return (Criteria) this;
        }

        public Criteria andMagyerGreaterThanOrEqualTo(String value) {
            addCriterion("magyer >=", value, "magyer");
            return (Criteria) this;
        }

        public Criteria andMagyerLessThan(String value) {
            addCriterion("magyer <", value, "magyer");
            return (Criteria) this;
        }

        public Criteria andMagyerLessThanOrEqualTo(String value) {
            addCriterion("magyer <=", value, "magyer");
            return (Criteria) this;
        }

        public Criteria andMagyerLike(String value) {
            addCriterion("magyer like", value, "magyer");
            return (Criteria) this;
        }

        public Criteria andMagyerNotLike(String value) {
            addCriterion("magyer not like", value, "magyer");
            return (Criteria) this;
        }

        public Criteria andMagyerIn(List<String> values) {
            addCriterion("magyer in", values, "magyer");
            return (Criteria) this;
        }

        public Criteria andMagyerNotIn(List<String> values) {
            addCriterion("magyer not in", values, "magyer");
            return (Criteria) this;
        }

        public Criteria andMagyerBetween(String value1, String value2) {
            addCriterion("magyer between", value1, value2, "magyer");
            return (Criteria) this;
        }

        public Criteria andMagyerNotBetween(String value1, String value2) {
            addCriterion("magyer not between", value1, value2, "magyer");
            return (Criteria) this;
        }

        public Criteria andZxltypeIsNull() {
            addCriterion("zxltype is null");
            return (Criteria) this;
        }

        public Criteria andZxltypeIsNotNull() {
            addCriterion("zxltype is not null");
            return (Criteria) this;
        }

        public Criteria andZxltypeEqualTo(Integer value) {
            addCriterion("zxltype =", value, "zxltype");
            return (Criteria) this;
        }

        public Criteria andZxltypeNotEqualTo(Integer value) {
            addCriterion("zxltype <>", value, "zxltype");
            return (Criteria) this;
        }

        public Criteria andZxltypeGreaterThan(Integer value) {
            addCriterion("zxltype >", value, "zxltype");
            return (Criteria) this;
        }

        public Criteria andZxltypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("zxltype >=", value, "zxltype");
            return (Criteria) this;
        }

        public Criteria andZxltypeLessThan(Integer value) {
            addCriterion("zxltype <", value, "zxltype");
            return (Criteria) this;
        }

        public Criteria andZxltypeLessThanOrEqualTo(Integer value) {
            addCriterion("zxltype <=", value, "zxltype");
            return (Criteria) this;
        }

        public Criteria andZxltypeIn(List<Integer> values) {
            addCriterion("zxltype in", values, "zxltype");
            return (Criteria) this;
        }

        public Criteria andZxltypeNotIn(List<Integer> values) {
            addCriterion("zxltype not in", values, "zxltype");
            return (Criteria) this;
        }

        public Criteria andZxltypeBetween(Integer value1, Integer value2) {
            addCriterion("zxltype between", value1, value2, "zxltype");
            return (Criteria) this;
        }

        public Criteria andZxltypeNotBetween(Integer value1, Integer value2) {
            addCriterion("zxltype not between", value1, value2, "zxltype");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzIsNull() {
            addCriterion("gaoxiaoClz is null");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzIsNotNull() {
            addCriterion("gaoxiaoClz is not null");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzEqualTo(String value) {
            addCriterion("gaoxiaoClz =", value, "gaoxiaoClz");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzNotEqualTo(String value) {
            addCriterion("gaoxiaoClz <>", value, "gaoxiaoClz");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzGreaterThan(String value) {
            addCriterion("gaoxiaoClz >", value, "gaoxiaoClz");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzGreaterThanOrEqualTo(String value) {
            addCriterion("gaoxiaoClz >=", value, "gaoxiaoClz");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzLessThan(String value) {
            addCriterion("gaoxiaoClz <", value, "gaoxiaoClz");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzLessThanOrEqualTo(String value) {
            addCriterion("gaoxiaoClz <=", value, "gaoxiaoClz");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzLike(String value) {
            addCriterion("gaoxiaoClz like", value, "gaoxiaoClz");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzNotLike(String value) {
            addCriterion("gaoxiaoClz not like", value, "gaoxiaoClz");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzIn(List<String> values) {
            addCriterion("gaoxiaoClz in", values, "gaoxiaoClz");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzNotIn(List<String> values) {
            addCriterion("gaoxiaoClz not in", values, "gaoxiaoClz");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzBetween(String value1, String value2) {
            addCriterion("gaoxiaoClz between", value1, value2, "gaoxiaoClz");
            return (Criteria) this;
        }

        public Criteria andGaoxiaoClzNotBetween(String value1, String value2) {
            addCriterion("gaoxiaoClz not between", value1, value2, "gaoxiaoClz");
            return (Criteria) this;
        }

        public Criteria andStuphoneIsNull() {
            addCriterion("stuphone is null");
            return (Criteria) this;
        }

        public Criteria andStuphoneIsNotNull() {
            addCriterion("stuphone is not null");
            return (Criteria) this;
        }

        public Criteria andStuphoneEqualTo(String value) {
            addCriterion("stuphone =", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotEqualTo(String value) {
            addCriterion("stuphone <>", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneGreaterThan(String value) {
            addCriterion("stuphone >", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneGreaterThanOrEqualTo(String value) {
            addCriterion("stuphone >=", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLessThan(String value) {
            addCriterion("stuphone <", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLessThanOrEqualTo(String value) {
            addCriterion("stuphone <=", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLike(String value) {
            addCriterion("stuphone like", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotLike(String value) {
            addCriterion("stuphone not like", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneIn(List<String> values) {
            addCriterion("stuphone in", values, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotIn(List<String> values) {
            addCriterion("stuphone not in", values, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneBetween(String value1, String value2) {
            addCriterion("stuphone between", value1, value2, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotBetween(String value1, String value2) {
            addCriterion("stuphone not between", value1, value2, "stuphone");
            return (Criteria) this;
        }

        public Criteria andZstuqqIsNull() {
            addCriterion("zstuqq is null");
            return (Criteria) this;
        }

        public Criteria andZstuqqIsNotNull() {
            addCriterion("zstuqq is not null");
            return (Criteria) this;
        }

        public Criteria andZstuqqEqualTo(Integer value) {
            addCriterion("zstuqq =", value, "zstuqq");
            return (Criteria) this;
        }

        public Criteria andZstuqqNotEqualTo(Integer value) {
            addCriterion("zstuqq <>", value, "zstuqq");
            return (Criteria) this;
        }

        public Criteria andZstuqqGreaterThan(Integer value) {
            addCriterion("zstuqq >", value, "zstuqq");
            return (Criteria) this;
        }

        public Criteria andZstuqqGreaterThanOrEqualTo(Integer value) {
            addCriterion("zstuqq >=", value, "zstuqq");
            return (Criteria) this;
        }

        public Criteria andZstuqqLessThan(Integer value) {
            addCriterion("zstuqq <", value, "zstuqq");
            return (Criteria) this;
        }

        public Criteria andZstuqqLessThanOrEqualTo(Integer value) {
            addCriterion("zstuqq <=", value, "zstuqq");
            return (Criteria) this;
        }

        public Criteria andZstuqqIn(List<Integer> values) {
            addCriterion("zstuqq in", values, "zstuqq");
            return (Criteria) this;
        }

        public Criteria andZstuqqNotIn(List<Integer> values) {
            addCriterion("zstuqq not in", values, "zstuqq");
            return (Criteria) this;
        }

        public Criteria andZstuqqBetween(Integer value1, Integer value2) {
            addCriterion("zstuqq between", value1, value2, "zstuqq");
            return (Criteria) this;
        }

        public Criteria andZstuqqNotBetween(Integer value1, Integer value2) {
            addCriterion("zstuqq not between", value1, value2, "zstuqq");
            return (Criteria) this;
        }

        public Criteria andContimeIsNull() {
            addCriterion("contime is null");
            return (Criteria) this;
        }

        public Criteria andContimeIsNotNull() {
            addCriterion("contime is not null");
            return (Criteria) this;
        }

        public Criteria andContimeEqualTo(Date value) {
            addCriterion("contime =", value, "contime");
            return (Criteria) this;
        }

        public Criteria andContimeNotEqualTo(Date value) {
            addCriterion("contime <>", value, "contime");
            return (Criteria) this;
        }

        public Criteria andContimeGreaterThan(Date value) {
            addCriterion("contime >", value, "contime");
            return (Criteria) this;
        }

        public Criteria andContimeGreaterThanOrEqualTo(Date value) {
            addCriterion("contime >=", value, "contime");
            return (Criteria) this;
        }

        public Criteria andContimeLessThan(Date value) {
            addCriterion("contime <", value, "contime");
            return (Criteria) this;
        }

        public Criteria andContimeLessThanOrEqualTo(Date value) {
            addCriterion("contime <=", value, "contime");
            return (Criteria) this;
        }

        public Criteria andContimeIn(List<Date> values) {
            addCriterion("contime in", values, "contime");
            return (Criteria) this;
        }

        public Criteria andContimeNotIn(List<Date> values) {
            addCriterion("contime not in", values, "contime");
            return (Criteria) this;
        }

        public Criteria andContimeBetween(Date value1, Date value2) {
            addCriterion("contime between", value1, value2, "contime");
            return (Criteria) this;
        }

        public Criteria andContimeNotBetween(Date value1, Date value2) {
            addCriterion("contime not between", value1, value2, "contime");
            return (Criteria) this;
        }

        public Criteria andEntranceIsNull() {
            addCriterion("entrance is null");
            return (Criteria) this;
        }

        public Criteria andEntranceIsNotNull() {
            addCriterion("entrance is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceEqualTo(Integer value) {
            addCriterion("entrance =", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceNotEqualTo(Integer value) {
            addCriterion("entrance <>", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceGreaterThan(Integer value) {
            addCriterion("entrance >", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceGreaterThanOrEqualTo(Integer value) {
            addCriterion("entrance >=", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceLessThan(Integer value) {
            addCriterion("entrance <", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceLessThanOrEqualTo(Integer value) {
            addCriterion("entrance <=", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceIn(List<Integer> values) {
            addCriterion("entrance in", values, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceNotIn(List<Integer> values) {
            addCriterion("entrance not in", values, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceBetween(Integer value1, Integer value2) {
            addCriterion("entrance between", value1, value2, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceNotBetween(Integer value1, Integer value2) {
            addCriterion("entrance not between", value1, value2, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntimeIsNull() {
            addCriterion("entime is null");
            return (Criteria) this;
        }

        public Criteria andEntimeIsNotNull() {
            addCriterion("entime is not null");
            return (Criteria) this;
        }

        public Criteria andEntimeEqualTo(Date value) {
            addCriterion("entime =", value, "entime");
            return (Criteria) this;
        }

        public Criteria andEntimeNotEqualTo(Date value) {
            addCriterion("entime <>", value, "entime");
            return (Criteria) this;
        }

        public Criteria andEntimeGreaterThan(Date value) {
            addCriterion("entime >", value, "entime");
            return (Criteria) this;
        }

        public Criteria andEntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entime >=", value, "entime");
            return (Criteria) this;
        }

        public Criteria andEntimeLessThan(Date value) {
            addCriterion("entime <", value, "entime");
            return (Criteria) this;
        }

        public Criteria andEntimeLessThanOrEqualTo(Date value) {
            addCriterion("entime <=", value, "entime");
            return (Criteria) this;
        }

        public Criteria andEntimeIn(List<Date> values) {
            addCriterion("entime in", values, "entime");
            return (Criteria) this;
        }

        public Criteria andEntimeNotIn(List<Date> values) {
            addCriterion("entime not in", values, "entime");
            return (Criteria) this;
        }

        public Criteria andEntimeBetween(Date value1, Date value2) {
            addCriterion("entime between", value1, value2, "entime");
            return (Criteria) this;
        }

        public Criteria andEntimeNotBetween(Date value1, Date value2) {
            addCriterion("entime not between", value1, value2, "entime");
            return (Criteria) this;
        }

        public Criteria andStuclassidIsNull() {
            addCriterion("stuclassid is null");
            return (Criteria) this;
        }

        public Criteria andStuclassidIsNotNull() {
            addCriterion("stuclassid is not null");
            return (Criteria) this;
        }

        public Criteria andStuclassidEqualTo(Integer value) {
            addCriterion("stuclassid =", value, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidNotEqualTo(Integer value) {
            addCriterion("stuclassid <>", value, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidGreaterThan(Integer value) {
            addCriterion("stuclassid >", value, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuclassid >=", value, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidLessThan(Integer value) {
            addCriterion("stuclassid <", value, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidLessThanOrEqualTo(Integer value) {
            addCriterion("stuclassid <=", value, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidIn(List<Integer> values) {
            addCriterion("stuclassid in", values, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidNotIn(List<Integer> values) {
            addCriterion("stuclassid not in", values, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidBetween(Integer value1, Integer value2) {
            addCriterion("stuclassid between", value1, value2, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuclassid not between", value1, value2, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andZxstateIsNull() {
            addCriterion("zxstate is null");
            return (Criteria) this;
        }

        public Criteria andZxstateIsNotNull() {
            addCriterion("zxstate is not null");
            return (Criteria) this;
        }

        public Criteria andZxstateEqualTo(Integer value) {
            addCriterion("zxstate =", value, "zxstate");
            return (Criteria) this;
        }

        public Criteria andZxstateNotEqualTo(Integer value) {
            addCriterion("zxstate <>", value, "zxstate");
            return (Criteria) this;
        }

        public Criteria andZxstateGreaterThan(Integer value) {
            addCriterion("zxstate >", value, "zxstate");
            return (Criteria) this;
        }

        public Criteria andZxstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("zxstate >=", value, "zxstate");
            return (Criteria) this;
        }

        public Criteria andZxstateLessThan(Integer value) {
            addCriterion("zxstate <", value, "zxstate");
            return (Criteria) this;
        }

        public Criteria andZxstateLessThanOrEqualTo(Integer value) {
            addCriterion("zxstate <=", value, "zxstate");
            return (Criteria) this;
        }

        public Criteria andZxstateIn(List<Integer> values) {
            addCriterion("zxstate in", values, "zxstate");
            return (Criteria) this;
        }

        public Criteria andZxstateNotIn(List<Integer> values) {
            addCriterion("zxstate not in", values, "zxstate");
            return (Criteria) this;
        }

        public Criteria andZxstateBetween(Integer value1, Integer value2) {
            addCriterion("zxstate between", value1, value2, "zxstate");
            return (Criteria) this;
        }

        public Criteria andZxstateNotBetween(Integer value1, Integer value2) {
            addCriterion("zxstate not between", value1, value2, "zxstate");
            return (Criteria) this;
        }

        public Criteria andZstudescIsNull() {
            addCriterion("zstudesc is null");
            return (Criteria) this;
        }

        public Criteria andZstudescIsNotNull() {
            addCriterion("zstudesc is not null");
            return (Criteria) this;
        }

        public Criteria andZstudescEqualTo(String value) {
            addCriterion("zstudesc =", value, "zstudesc");
            return (Criteria) this;
        }

        public Criteria andZstudescNotEqualTo(String value) {
            addCriterion("zstudesc <>", value, "zstudesc");
            return (Criteria) this;
        }

        public Criteria andZstudescGreaterThan(String value) {
            addCriterion("zstudesc >", value, "zstudesc");
            return (Criteria) this;
        }

        public Criteria andZstudescGreaterThanOrEqualTo(String value) {
            addCriterion("zstudesc >=", value, "zstudesc");
            return (Criteria) this;
        }

        public Criteria andZstudescLessThan(String value) {
            addCriterion("zstudesc <", value, "zstudesc");
            return (Criteria) this;
        }

        public Criteria andZstudescLessThanOrEqualTo(String value) {
            addCriterion("zstudesc <=", value, "zstudesc");
            return (Criteria) this;
        }

        public Criteria andZstudescLike(String value) {
            addCriterion("zstudesc like", value, "zstudesc");
            return (Criteria) this;
        }

        public Criteria andZstudescNotLike(String value) {
            addCriterion("zstudesc not like", value, "zstudesc");
            return (Criteria) this;
        }

        public Criteria andZstudescIn(List<String> values) {
            addCriterion("zstudesc in", values, "zstudesc");
            return (Criteria) this;
        }

        public Criteria andZstudescNotIn(List<String> values) {
            addCriterion("zstudesc not in", values, "zstudesc");
            return (Criteria) this;
        }

        public Criteria andZstudescBetween(String value1, String value2) {
            addCriterion("zstudesc between", value1, value2, "zstudesc");
            return (Criteria) this;
        }

        public Criteria andZstudescNotBetween(String value1, String value2) {
            addCriterion("zstudesc not between", value1, value2, "zstudesc");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}