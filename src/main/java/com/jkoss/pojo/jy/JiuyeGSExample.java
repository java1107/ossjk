package com.jkoss.pojo.jy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JiuyeGSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JiuyeGSExample() {
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

        public Criteria andJyidIsNull() {
            addCriterion("jyid is null");
            return (Criteria) this;
        }

        public Criteria andJyidIsNotNull() {
            addCriterion("jyid is not null");
            return (Criteria) this;
        }

        public Criteria andJyidEqualTo(Integer value) {
            addCriterion("jyid =", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotEqualTo(Integer value) {
            addCriterion("jyid <>", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidGreaterThan(Integer value) {
            addCriterion("jyid >", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jyid >=", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidLessThan(Integer value) {
            addCriterion("jyid <", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidLessThanOrEqualTo(Integer value) {
            addCriterion("jyid <=", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidIn(List<Integer> values) {
            addCriterion("jyid in", values, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotIn(List<Integer> values) {
            addCriterion("jyid not in", values, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidBetween(Integer value1, Integer value2) {
            addCriterion("jyid between", value1, value2, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotBetween(Integer value1, Integer value2) {
            addCriterion("jyid not between", value1, value2, "jyid");
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

        public Criteria andJynameIsNull() {
            addCriterion("jyname is null");
            return (Criteria) this;
        }

        public Criteria andJynameIsNotNull() {
            addCriterion("jyname is not null");
            return (Criteria) this;
        }

        public Criteria andJynameEqualTo(String value) {
            addCriterion("jyname =", value, "jyname");
            return (Criteria) this;
        }

        public Criteria andJynameNotEqualTo(String value) {
            addCriterion("jyname <>", value, "jyname");
            return (Criteria) this;
        }

        public Criteria andJynameGreaterThan(String value) {
            addCriterion("jyname >", value, "jyname");
            return (Criteria) this;
        }

        public Criteria andJynameGreaterThanOrEqualTo(String value) {
            addCriterion("jyname >=", value, "jyname");
            return (Criteria) this;
        }

        public Criteria andJynameLessThan(String value) {
            addCriterion("jyname <", value, "jyname");
            return (Criteria) this;
        }

        public Criteria andJynameLessThanOrEqualTo(String value) {
            addCriterion("jyname <=", value, "jyname");
            return (Criteria) this;
        }

        public Criteria andJynameLike(String value) {
            addCriterion("jyname like", value, "jyname");
            return (Criteria) this;
        }

        public Criteria andJynameNotLike(String value) {
            addCriterion("jyname not like", value, "jyname");
            return (Criteria) this;
        }

        public Criteria andJynameIn(List<String> values) {
            addCriterion("jyname in", values, "jyname");
            return (Criteria) this;
        }

        public Criteria andJynameNotIn(List<String> values) {
            addCriterion("jyname not in", values, "jyname");
            return (Criteria) this;
        }

        public Criteria andJynameBetween(String value1, String value2) {
            addCriterion("jyname between", value1, value2, "jyname");
            return (Criteria) this;
        }

        public Criteria andJynameNotBetween(String value1, String value2) {
            addCriterion("jyname not between", value1, value2, "jyname");
            return (Criteria) this;
        }

        public Criteria andJyaddrssIsNull() {
            addCriterion("jyaddrss is null");
            return (Criteria) this;
        }

        public Criteria andJyaddrssIsNotNull() {
            addCriterion("jyaddrss is not null");
            return (Criteria) this;
        }

        public Criteria andJyaddrssEqualTo(String value) {
            addCriterion("jyaddrss =", value, "jyaddrss");
            return (Criteria) this;
        }

        public Criteria andJyaddrssNotEqualTo(String value) {
            addCriterion("jyaddrss <>", value, "jyaddrss");
            return (Criteria) this;
        }

        public Criteria andJyaddrssGreaterThan(String value) {
            addCriterion("jyaddrss >", value, "jyaddrss");
            return (Criteria) this;
        }

        public Criteria andJyaddrssGreaterThanOrEqualTo(String value) {
            addCriterion("jyaddrss >=", value, "jyaddrss");
            return (Criteria) this;
        }

        public Criteria andJyaddrssLessThan(String value) {
            addCriterion("jyaddrss <", value, "jyaddrss");
            return (Criteria) this;
        }

        public Criteria andJyaddrssLessThanOrEqualTo(String value) {
            addCriterion("jyaddrss <=", value, "jyaddrss");
            return (Criteria) this;
        }

        public Criteria andJyaddrssLike(String value) {
            addCriterion("jyaddrss like", value, "jyaddrss");
            return (Criteria) this;
        }

        public Criteria andJyaddrssNotLike(String value) {
            addCriterion("jyaddrss not like", value, "jyaddrss");
            return (Criteria) this;
        }

        public Criteria andJyaddrssIn(List<String> values) {
            addCriterion("jyaddrss in", values, "jyaddrss");
            return (Criteria) this;
        }

        public Criteria andJyaddrssNotIn(List<String> values) {
            addCriterion("jyaddrss not in", values, "jyaddrss");
            return (Criteria) this;
        }

        public Criteria andJyaddrssBetween(String value1, String value2) {
            addCriterion("jyaddrss between", value1, value2, "jyaddrss");
            return (Criteria) this;
        }

        public Criteria andJyaddrssNotBetween(String value1, String value2) {
            addCriterion("jyaddrss not between", value1, value2, "jyaddrss");
            return (Criteria) this;
        }

        public Criteria andJytelIsNull() {
            addCriterion("jytel is null");
            return (Criteria) this;
        }

        public Criteria andJytelIsNotNull() {
            addCriterion("jytel is not null");
            return (Criteria) this;
        }

        public Criteria andJytelEqualTo(String value) {
            addCriterion("jytel =", value, "jytel");
            return (Criteria) this;
        }

        public Criteria andJytelNotEqualTo(String value) {
            addCriterion("jytel <>", value, "jytel");
            return (Criteria) this;
        }

        public Criteria andJytelGreaterThan(String value) {
            addCriterion("jytel >", value, "jytel");
            return (Criteria) this;
        }

        public Criteria andJytelGreaterThanOrEqualTo(String value) {
            addCriterion("jytel >=", value, "jytel");
            return (Criteria) this;
        }

        public Criteria andJytelLessThan(String value) {
            addCriterion("jytel <", value, "jytel");
            return (Criteria) this;
        }

        public Criteria andJytelLessThanOrEqualTo(String value) {
            addCriterion("jytel <=", value, "jytel");
            return (Criteria) this;
        }

        public Criteria andJytelLike(String value) {
            addCriterion("jytel like", value, "jytel");
            return (Criteria) this;
        }

        public Criteria andJytelNotLike(String value) {
            addCriterion("jytel not like", value, "jytel");
            return (Criteria) this;
        }

        public Criteria andJytelIn(List<String> values) {
            addCriterion("jytel in", values, "jytel");
            return (Criteria) this;
        }

        public Criteria andJytelNotIn(List<String> values) {
            addCriterion("jytel not in", values, "jytel");
            return (Criteria) this;
        }

        public Criteria andJytelBetween(String value1, String value2) {
            addCriterion("jytel between", value1, value2, "jytel");
            return (Criteria) this;
        }

        public Criteria andJytelNotBetween(String value1, String value2) {
            addCriterion("jytel not between", value1, value2, "jytel");
            return (Criteria) this;
        }

        public Criteria andJyempnameIsNull() {
            addCriterion("jyempname is null");
            return (Criteria) this;
        }

        public Criteria andJyempnameIsNotNull() {
            addCriterion("jyempname is not null");
            return (Criteria) this;
        }

        public Criteria andJyempnameEqualTo(String value) {
            addCriterion("jyempname =", value, "jyempname");
            return (Criteria) this;
        }

        public Criteria andJyempnameNotEqualTo(String value) {
            addCriterion("jyempname <>", value, "jyempname");
            return (Criteria) this;
        }

        public Criteria andJyempnameGreaterThan(String value) {
            addCriterion("jyempname >", value, "jyempname");
            return (Criteria) this;
        }

        public Criteria andJyempnameGreaterThanOrEqualTo(String value) {
            addCriterion("jyempname >=", value, "jyempname");
            return (Criteria) this;
        }

        public Criteria andJyempnameLessThan(String value) {
            addCriterion("jyempname <", value, "jyempname");
            return (Criteria) this;
        }

        public Criteria andJyempnameLessThanOrEqualTo(String value) {
            addCriterion("jyempname <=", value, "jyempname");
            return (Criteria) this;
        }

        public Criteria andJyempnameLike(String value) {
            addCriterion("jyempname like", value, "jyempname");
            return (Criteria) this;
        }

        public Criteria andJyempnameNotLike(String value) {
            addCriterion("jyempname not like", value, "jyempname");
            return (Criteria) this;
        }

        public Criteria andJyempnameIn(List<String> values) {
            addCriterion("jyempname in", values, "jyempname");
            return (Criteria) this;
        }

        public Criteria andJyempnameNotIn(List<String> values) {
            addCriterion("jyempname not in", values, "jyempname");
            return (Criteria) this;
        }

        public Criteria andJyempnameBetween(String value1, String value2) {
            addCriterion("jyempname between", value1, value2, "jyempname");
            return (Criteria) this;
        }

        public Criteria andJyempnameNotBetween(String value1, String value2) {
            addCriterion("jyempname not between", value1, value2, "jyempname");
            return (Criteria) this;
        }

        public Criteria andJyeqqIsNull() {
            addCriterion("jyeqq is null");
            return (Criteria) this;
        }

        public Criteria andJyeqqIsNotNull() {
            addCriterion("jyeqq is not null");
            return (Criteria) this;
        }

        public Criteria andJyeqqEqualTo(String value) {
            addCriterion("jyeqq =", value, "jyeqq");
            return (Criteria) this;
        }

        public Criteria andJyeqqNotEqualTo(String value) {
            addCriterion("jyeqq <>", value, "jyeqq");
            return (Criteria) this;
        }

        public Criteria andJyeqqGreaterThan(String value) {
            addCriterion("jyeqq >", value, "jyeqq");
            return (Criteria) this;
        }

        public Criteria andJyeqqGreaterThanOrEqualTo(String value) {
            addCriterion("jyeqq >=", value, "jyeqq");
            return (Criteria) this;
        }

        public Criteria andJyeqqLessThan(String value) {
            addCriterion("jyeqq <", value, "jyeqq");
            return (Criteria) this;
        }

        public Criteria andJyeqqLessThanOrEqualTo(String value) {
            addCriterion("jyeqq <=", value, "jyeqq");
            return (Criteria) this;
        }

        public Criteria andJyeqqLike(String value) {
            addCriterion("jyeqq like", value, "jyeqq");
            return (Criteria) this;
        }

        public Criteria andJyeqqNotLike(String value) {
            addCriterion("jyeqq not like", value, "jyeqq");
            return (Criteria) this;
        }

        public Criteria andJyeqqIn(List<String> values) {
            addCriterion("jyeqq in", values, "jyeqq");
            return (Criteria) this;
        }

        public Criteria andJyeqqNotIn(List<String> values) {
            addCriterion("jyeqq not in", values, "jyeqq");
            return (Criteria) this;
        }

        public Criteria andJyeqqBetween(String value1, String value2) {
            addCriterion("jyeqq between", value1, value2, "jyeqq");
            return (Criteria) this;
        }

        public Criteria andJyeqqNotBetween(String value1, String value2) {
            addCriterion("jyeqq not between", value1, value2, "jyeqq");
            return (Criteria) this;
        }

        public Criteria andJyetelIsNull() {
            addCriterion("jyetel is null");
            return (Criteria) this;
        }

        public Criteria andJyetelIsNotNull() {
            addCriterion("jyetel is not null");
            return (Criteria) this;
        }

        public Criteria andJyetelEqualTo(String value) {
            addCriterion("jyetel =", value, "jyetel");
            return (Criteria) this;
        }

        public Criteria andJyetelNotEqualTo(String value) {
            addCriterion("jyetel <>", value, "jyetel");
            return (Criteria) this;
        }

        public Criteria andJyetelGreaterThan(String value) {
            addCriterion("jyetel >", value, "jyetel");
            return (Criteria) this;
        }

        public Criteria andJyetelGreaterThanOrEqualTo(String value) {
            addCriterion("jyetel >=", value, "jyetel");
            return (Criteria) this;
        }

        public Criteria andJyetelLessThan(String value) {
            addCriterion("jyetel <", value, "jyetel");
            return (Criteria) this;
        }

        public Criteria andJyetelLessThanOrEqualTo(String value) {
            addCriterion("jyetel <=", value, "jyetel");
            return (Criteria) this;
        }

        public Criteria andJyetelLike(String value) {
            addCriterion("jyetel like", value, "jyetel");
            return (Criteria) this;
        }

        public Criteria andJyetelNotLike(String value) {
            addCriterion("jyetel not like", value, "jyetel");
            return (Criteria) this;
        }

        public Criteria andJyetelIn(List<String> values) {
            addCriterion("jyetel in", values, "jyetel");
            return (Criteria) this;
        }

        public Criteria andJyetelNotIn(List<String> values) {
            addCriterion("jyetel not in", values, "jyetel");
            return (Criteria) this;
        }

        public Criteria andJyetelBetween(String value1, String value2) {
            addCriterion("jyetel between", value1, value2, "jyetel");
            return (Criteria) this;
        }

        public Criteria andJyetelNotBetween(String value1, String value2) {
            addCriterion("jyetel not between", value1, value2, "jyetel");
            return (Criteria) this;
        }

        public Criteria andJyaddtimeIsNull() {
            addCriterion("jyaddtime is null");
            return (Criteria) this;
        }

        public Criteria andJyaddtimeIsNotNull() {
            addCriterion("jyaddtime is not null");
            return (Criteria) this;
        }

        public Criteria andJyaddtimeEqualTo(Date value) {
            addCriterion("jyaddtime =", value, "jyaddtime");
            return (Criteria) this;
        }

        public Criteria andJyaddtimeNotEqualTo(Date value) {
            addCriterion("jyaddtime <>", value, "jyaddtime");
            return (Criteria) this;
        }

        public Criteria andJyaddtimeGreaterThan(Date value) {
            addCriterion("jyaddtime >", value, "jyaddtime");
            return (Criteria) this;
        }

        public Criteria andJyaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jyaddtime >=", value, "jyaddtime");
            return (Criteria) this;
        }

        public Criteria andJyaddtimeLessThan(Date value) {
            addCriterion("jyaddtime <", value, "jyaddtime");
            return (Criteria) this;
        }

        public Criteria andJyaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("jyaddtime <=", value, "jyaddtime");
            return (Criteria) this;
        }

        public Criteria andJyaddtimeIn(List<Date> values) {
            addCriterion("jyaddtime in", values, "jyaddtime");
            return (Criteria) this;
        }

        public Criteria andJyaddtimeNotIn(List<Date> values) {
            addCriterion("jyaddtime not in", values, "jyaddtime");
            return (Criteria) this;
        }

        public Criteria andJyaddtimeBetween(Date value1, Date value2) {
            addCriterion("jyaddtime between", value1, value2, "jyaddtime");
            return (Criteria) this;
        }

        public Criteria andJyaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("jyaddtime not between", value1, value2, "jyaddtime");
            return (Criteria) this;
        }

        public Criteria andJydgrIsNull() {
            addCriterion("jydgr is null");
            return (Criteria) this;
        }

        public Criteria andJydgrIsNotNull() {
            addCriterion("jydgr is not null");
            return (Criteria) this;
        }

        public Criteria andJydgrEqualTo(Integer value) {
            addCriterion("jydgr =", value, "jydgr");
            return (Criteria) this;
        }

        public Criteria andJydgrNotEqualTo(Integer value) {
            addCriterion("jydgr <>", value, "jydgr");
            return (Criteria) this;
        }

        public Criteria andJydgrGreaterThan(Integer value) {
            addCriterion("jydgr >", value, "jydgr");
            return (Criteria) this;
        }

        public Criteria andJydgrGreaterThanOrEqualTo(Integer value) {
            addCriterion("jydgr >=", value, "jydgr");
            return (Criteria) this;
        }

        public Criteria andJydgrLessThan(Integer value) {
            addCriterion("jydgr <", value, "jydgr");
            return (Criteria) this;
        }

        public Criteria andJydgrLessThanOrEqualTo(Integer value) {
            addCriterion("jydgr <=", value, "jydgr");
            return (Criteria) this;
        }

        public Criteria andJydgrIn(List<Integer> values) {
            addCriterion("jydgr in", values, "jydgr");
            return (Criteria) this;
        }

        public Criteria andJydgrNotIn(List<Integer> values) {
            addCriterion("jydgr not in", values, "jydgr");
            return (Criteria) this;
        }

        public Criteria andJydgrBetween(Integer value1, Integer value2) {
            addCriterion("jydgr between", value1, value2, "jydgr");
            return (Criteria) this;
        }

        public Criteria andJydgrNotBetween(Integer value1, Integer value2) {
            addCriterion("jydgr not between", value1, value2, "jydgr");
            return (Criteria) this;
        }

        public Criteria andJydescbIsNull() {
            addCriterion("jydescb is null");
            return (Criteria) this;
        }

        public Criteria andJydescbIsNotNull() {
            addCriterion("jydescb is not null");
            return (Criteria) this;
        }

        public Criteria andJydescbEqualTo(String value) {
            addCriterion("jydescb =", value, "jydescb");
            return (Criteria) this;
        }

        public Criteria andJydescbNotEqualTo(String value) {
            addCriterion("jydescb <>", value, "jydescb");
            return (Criteria) this;
        }

        public Criteria andJydescbGreaterThan(String value) {
            addCriterion("jydescb >", value, "jydescb");
            return (Criteria) this;
        }

        public Criteria andJydescbGreaterThanOrEqualTo(String value) {
            addCriterion("jydescb >=", value, "jydescb");
            return (Criteria) this;
        }

        public Criteria andJydescbLessThan(String value) {
            addCriterion("jydescb <", value, "jydescb");
            return (Criteria) this;
        }

        public Criteria andJydescbLessThanOrEqualTo(String value) {
            addCriterion("jydescb <=", value, "jydescb");
            return (Criteria) this;
        }

        public Criteria andJydescbLike(String value) {
            addCriterion("jydescb like", value, "jydescb");
            return (Criteria) this;
        }

        public Criteria andJydescbNotLike(String value) {
            addCriterion("jydescb not like", value, "jydescb");
            return (Criteria) this;
        }

        public Criteria andJydescbIn(List<String> values) {
            addCriterion("jydescb in", values, "jydescb");
            return (Criteria) this;
        }

        public Criteria andJydescbNotIn(List<String> values) {
            addCriterion("jydescb not in", values, "jydescb");
            return (Criteria) this;
        }

        public Criteria andJydescbBetween(String value1, String value2) {
            addCriterion("jydescb between", value1, value2, "jydescb");
            return (Criteria) this;
        }

        public Criteria andJydescbNotBetween(String value1, String value2) {
            addCriterion("jydescb not between", value1, value2, "jydescb");
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