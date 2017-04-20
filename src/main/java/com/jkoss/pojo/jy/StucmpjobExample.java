package com.jkoss.pojo.jy;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StucmpjobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StucmpjobExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andJygwidIsNull() {
            addCriterion("jygwid is null");
            return (Criteria) this;
        }

        public Criteria andJygwidIsNotNull() {
            addCriterion("jygwid is not null");
            return (Criteria) this;
        }

        public Criteria andJygwidEqualTo(Integer value) {
            addCriterion("jygwid =", value, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidNotEqualTo(Integer value) {
            addCriterion("jygwid <>", value, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidGreaterThan(Integer value) {
            addCriterion("jygwid >", value, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jygwid >=", value, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidLessThan(Integer value) {
            addCriterion("jygwid <", value, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidLessThanOrEqualTo(Integer value) {
            addCriterion("jygwid <=", value, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidIn(List<Integer> values) {
            addCriterion("jygwid in", values, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidNotIn(List<Integer> values) {
            addCriterion("jygwid not in", values, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidBetween(Integer value1, Integer value2) {
            addCriterion("jygwid between", value1, value2, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidNotBetween(Integer value1, Integer value2) {
            addCriterion("jygwid not between", value1, value2, "jygwid");
            return (Criteria) this;
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

        public Criteria andJygwNameIsNull() {
            addCriterion("jygwName is null");
            return (Criteria) this;
        }

        public Criteria andJygwNameIsNotNull() {
            addCriterion("jygwName is not null");
            return (Criteria) this;
        }

        public Criteria andJygwNameEqualTo(String value) {
            addCriterion("jygwName =", value, "jygwName");
            return (Criteria) this;
        }

        public Criteria andJygwNameNotEqualTo(String value) {
            addCriterion("jygwName <>", value, "jygwName");
            return (Criteria) this;
        }

        public Criteria andJygwNameGreaterThan(String value) {
            addCriterion("jygwName >", value, "jygwName");
            return (Criteria) this;
        }

        public Criteria andJygwNameGreaterThanOrEqualTo(String value) {
            addCriterion("jygwName >=", value, "jygwName");
            return (Criteria) this;
        }

        public Criteria andJygwNameLessThan(String value) {
            addCriterion("jygwName <", value, "jygwName");
            return (Criteria) this;
        }

        public Criteria andJygwNameLessThanOrEqualTo(String value) {
            addCriterion("jygwName <=", value, "jygwName");
            return (Criteria) this;
        }

        public Criteria andJygwNameLike(String value) {
            addCriterion("jygwName like", value, "jygwName");
            return (Criteria) this;
        }

        public Criteria andJygwNameNotLike(String value) {
            addCriterion("jygwName not like", value, "jygwName");
            return (Criteria) this;
        }

        public Criteria andJygwNameIn(List<String> values) {
            addCriterion("jygwName in", values, "jygwName");
            return (Criteria) this;
        }

        public Criteria andJygwNameNotIn(List<String> values) {
            addCriterion("jygwName not in", values, "jygwName");
            return (Criteria) this;
        }

        public Criteria andJygwNameBetween(String value1, String value2) {
            addCriterion("jygwName between", value1, value2, "jygwName");
            return (Criteria) this;
        }

        public Criteria andJygwNameNotBetween(String value1, String value2) {
            addCriterion("jygwName not between", value1, value2, "jygwName");
            return (Criteria) this;
        }

        public Criteria andJygwdescbIsNull() {
            addCriterion("jygwdescb is null");
            return (Criteria) this;
        }

        public Criteria andJygwdescbIsNotNull() {
            addCriterion("jygwdescb is not null");
            return (Criteria) this;
        }

        public Criteria andJygwdescbEqualTo(String value) {
            addCriterion("jygwdescb =", value, "jygwdescb");
            return (Criteria) this;
        }

        public Criteria andJygwdescbNotEqualTo(String value) {
            addCriterion("jygwdescb <>", value, "jygwdescb");
            return (Criteria) this;
        }

        public Criteria andJygwdescbGreaterThan(String value) {
            addCriterion("jygwdescb >", value, "jygwdescb");
            return (Criteria) this;
        }

        public Criteria andJygwdescbGreaterThanOrEqualTo(String value) {
            addCriterion("jygwdescb >=", value, "jygwdescb");
            return (Criteria) this;
        }

        public Criteria andJygwdescbLessThan(String value) {
            addCriterion("jygwdescb <", value, "jygwdescb");
            return (Criteria) this;
        }

        public Criteria andJygwdescbLessThanOrEqualTo(String value) {
            addCriterion("jygwdescb <=", value, "jygwdescb");
            return (Criteria) this;
        }

        public Criteria andJygwdescbLike(String value) {
            addCriterion("jygwdescb like", value, "jygwdescb");
            return (Criteria) this;
        }

        public Criteria andJygwdescbNotLike(String value) {
            addCriterion("jygwdescb not like", value, "jygwdescb");
            return (Criteria) this;
        }

        public Criteria andJygwdescbIn(List<String> values) {
            addCriterion("jygwdescb in", values, "jygwdescb");
            return (Criteria) this;
        }

        public Criteria andJygwdescbNotIn(List<String> values) {
            addCriterion("jygwdescb not in", values, "jygwdescb");
            return (Criteria) this;
        }

        public Criteria andJygwdescbBetween(String value1, String value2) {
            addCriterion("jygwdescb between", value1, value2, "jygwdescb");
            return (Criteria) this;
        }

        public Criteria andJygwdescbNotBetween(String value1, String value2) {
            addCriterion("jygwdescb not between", value1, value2, "jygwdescb");
            return (Criteria) this;
        }

        public Criteria andJygwminIsNull() {
            addCriterion("jygwmin is null");
            return (Criteria) this;
        }

        public Criteria andJygwminIsNotNull() {
            addCriterion("jygwmin is not null");
            return (Criteria) this;
        }

        public Criteria andJygwminEqualTo(Integer value) {
            addCriterion("jygwmin =", value, "jygwmin");
            return (Criteria) this;
        }

        public Criteria andJygwminNotEqualTo(Integer value) {
            addCriterion("jygwmin <>", value, "jygwmin");
            return (Criteria) this;
        }

        public Criteria andJygwminGreaterThan(Integer value) {
            addCriterion("jygwmin >", value, "jygwmin");
            return (Criteria) this;
        }

        public Criteria andJygwminGreaterThanOrEqualTo(Integer value) {
            addCriterion("jygwmin >=", value, "jygwmin");
            return (Criteria) this;
        }

        public Criteria andJygwminLessThan(Integer value) {
            addCriterion("jygwmin <", value, "jygwmin");
            return (Criteria) this;
        }

        public Criteria andJygwminLessThanOrEqualTo(Integer value) {
            addCriterion("jygwmin <=", value, "jygwmin");
            return (Criteria) this;
        }

        public Criteria andJygwminIn(List<Integer> values) {
            addCriterion("jygwmin in", values, "jygwmin");
            return (Criteria) this;
        }

        public Criteria andJygwminNotIn(List<Integer> values) {
            addCriterion("jygwmin not in", values, "jygwmin");
            return (Criteria) this;
        }

        public Criteria andJygwminBetween(Integer value1, Integer value2) {
            addCriterion("jygwmin between", value1, value2, "jygwmin");
            return (Criteria) this;
        }

        public Criteria andJygwminNotBetween(Integer value1, Integer value2) {
            addCriterion("jygwmin not between", value1, value2, "jygwmin");
            return (Criteria) this;
        }

        public Criteria andJygwmaxIsNull() {
            addCriterion("jygwmax is null");
            return (Criteria) this;
        }

        public Criteria andJygwmaxIsNotNull() {
            addCriterion("jygwmax is not null");
            return (Criteria) this;
        }

        public Criteria andJygwmaxEqualTo(Integer value) {
            addCriterion("jygwmax =", value, "jygwmax");
            return (Criteria) this;
        }

        public Criteria andJygwmaxNotEqualTo(Integer value) {
            addCriterion("jygwmax <>", value, "jygwmax");
            return (Criteria) this;
        }

        public Criteria andJygwmaxGreaterThan(Integer value) {
            addCriterion("jygwmax >", value, "jygwmax");
            return (Criteria) this;
        }

        public Criteria andJygwmaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("jygwmax >=", value, "jygwmax");
            return (Criteria) this;
        }

        public Criteria andJygwmaxLessThan(Integer value) {
            addCriterion("jygwmax <", value, "jygwmax");
            return (Criteria) this;
        }

        public Criteria andJygwmaxLessThanOrEqualTo(Integer value) {
            addCriterion("jygwmax <=", value, "jygwmax");
            return (Criteria) this;
        }

        public Criteria andJygwmaxIn(List<Integer> values) {
            addCriterion("jygwmax in", values, "jygwmax");
            return (Criteria) this;
        }

        public Criteria andJygwmaxNotIn(List<Integer> values) {
            addCriterion("jygwmax not in", values, "jygwmax");
            return (Criteria) this;
        }

        public Criteria andJygwmaxBetween(Integer value1, Integer value2) {
            addCriterion("jygwmax between", value1, value2, "jygwmax");
            return (Criteria) this;
        }

        public Criteria andJygwmaxNotBetween(Integer value1, Integer value2) {
            addCriterion("jygwmax not between", value1, value2, "jygwmax");
            return (Criteria) this;
        }

        public Criteria andJygwnumIsNull() {
            addCriterion("jygwnum is null");
            return (Criteria) this;
        }

        public Criteria andJygwnumIsNotNull() {
            addCriterion("jygwnum is not null");
            return (Criteria) this;
        }

        public Criteria andJygwnumEqualTo(Integer value) {
            addCriterion("jygwnum =", value, "jygwnum");
            return (Criteria) this;
        }

        public Criteria andJygwnumNotEqualTo(Integer value) {
            addCriterion("jygwnum <>", value, "jygwnum");
            return (Criteria) this;
        }

        public Criteria andJygwnumGreaterThan(Integer value) {
            addCriterion("jygwnum >", value, "jygwnum");
            return (Criteria) this;
        }

        public Criteria andJygwnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("jygwnum >=", value, "jygwnum");
            return (Criteria) this;
        }

        public Criteria andJygwnumLessThan(Integer value) {
            addCriterion("jygwnum <", value, "jygwnum");
            return (Criteria) this;
        }

        public Criteria andJygwnumLessThanOrEqualTo(Integer value) {
            addCriterion("jygwnum <=", value, "jygwnum");
            return (Criteria) this;
        }

        public Criteria andJygwnumIn(List<Integer> values) {
            addCriterion("jygwnum in", values, "jygwnum");
            return (Criteria) this;
        }

        public Criteria andJygwnumNotIn(List<Integer> values) {
            addCriterion("jygwnum not in", values, "jygwnum");
            return (Criteria) this;
        }

        public Criteria andJygwnumBetween(Integer value1, Integer value2) {
            addCriterion("jygwnum between", value1, value2, "jygwnum");
            return (Criteria) this;
        }

        public Criteria andJygwnumNotBetween(Integer value1, Integer value2) {
            addCriterion("jygwnum not between", value1, value2, "jygwnum");
            return (Criteria) this;
        }

        public Criteria andJygwbegindateIsNull() {
            addCriterion("jygwbegindate is null");
            return (Criteria) this;
        }

        public Criteria andJygwbegindateIsNotNull() {
            addCriterion("jygwbegindate is not null");
            return (Criteria) this;
        }

        public Criteria andJygwbegindateEqualTo(Date value) {
            addCriterionForJDBCDate("jygwbegindate =", value, "jygwbegindate");
            return (Criteria) this;
        }

        public Criteria andJygwbegindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("jygwbegindate <>", value, "jygwbegindate");
            return (Criteria) this;
        }

        public Criteria andJygwbegindateGreaterThan(Date value) {
            addCriterionForJDBCDate("jygwbegindate >", value, "jygwbegindate");
            return (Criteria) this;
        }

        public Criteria andJygwbegindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jygwbegindate >=", value, "jygwbegindate");
            return (Criteria) this;
        }

        public Criteria andJygwbegindateLessThan(Date value) {
            addCriterionForJDBCDate("jygwbegindate <", value, "jygwbegindate");
            return (Criteria) this;
        }

        public Criteria andJygwbegindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jygwbegindate <=", value, "jygwbegindate");
            return (Criteria) this;
        }

        public Criteria andJygwbegindateIn(List<Date> values) {
            addCriterionForJDBCDate("jygwbegindate in", values, "jygwbegindate");
            return (Criteria) this;
        }

        public Criteria andJygwbegindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("jygwbegindate not in", values, "jygwbegindate");
            return (Criteria) this;
        }

        public Criteria andJygwbegindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jygwbegindate between", value1, value2, "jygwbegindate");
            return (Criteria) this;
        }

        public Criteria andJygwbegindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jygwbegindate not between", value1, value2, "jygwbegindate");
            return (Criteria) this;
        }

        public Criteria andJygwenddateIsNull() {
            addCriterion("jygwenddate is null");
            return (Criteria) this;
        }

        public Criteria andJygwenddateIsNotNull() {
            addCriterion("jygwenddate is not null");
            return (Criteria) this;
        }

        public Criteria andJygwenddateEqualTo(Date value) {
            addCriterionForJDBCDate("jygwenddate =", value, "jygwenddate");
            return (Criteria) this;
        }

        public Criteria andJygwenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("jygwenddate <>", value, "jygwenddate");
            return (Criteria) this;
        }

        public Criteria andJygwenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("jygwenddate >", value, "jygwenddate");
            return (Criteria) this;
        }

        public Criteria andJygwenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jygwenddate >=", value, "jygwenddate");
            return (Criteria) this;
        }

        public Criteria andJygwenddateLessThan(Date value) {
            addCriterionForJDBCDate("jygwenddate <", value, "jygwenddate");
            return (Criteria) this;
        }

        public Criteria andJygwenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jygwenddate <=", value, "jygwenddate");
            return (Criteria) this;
        }

        public Criteria andJygwenddateIn(List<Date> values) {
            addCriterionForJDBCDate("jygwenddate in", values, "jygwenddate");
            return (Criteria) this;
        }

        public Criteria andJygwenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("jygwenddate not in", values, "jygwenddate");
            return (Criteria) this;
        }

        public Criteria andJygwenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jygwenddate between", value1, value2, "jygwenddate");
            return (Criteria) this;
        }

        public Criteria andJygwenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jygwenddate not between", value1, value2, "jygwenddate");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuIsNull() {
            addCriterion("jygwbeizhu is null");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuIsNotNull() {
            addCriterion("jygwbeizhu is not null");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuEqualTo(String value) {
            addCriterion("jygwbeizhu =", value, "jygwbeizhu");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuNotEqualTo(String value) {
            addCriterion("jygwbeizhu <>", value, "jygwbeizhu");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuGreaterThan(String value) {
            addCriterion("jygwbeizhu >", value, "jygwbeizhu");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("jygwbeizhu >=", value, "jygwbeizhu");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuLessThan(String value) {
            addCriterion("jygwbeizhu <", value, "jygwbeizhu");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuLessThanOrEqualTo(String value) {
            addCriterion("jygwbeizhu <=", value, "jygwbeizhu");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuLike(String value) {
            addCriterion("jygwbeizhu like", value, "jygwbeizhu");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuNotLike(String value) {
            addCriterion("jygwbeizhu not like", value, "jygwbeizhu");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuIn(List<String> values) {
            addCriterion("jygwbeizhu in", values, "jygwbeizhu");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuNotIn(List<String> values) {
            addCriterion("jygwbeizhu not in", values, "jygwbeizhu");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuBetween(String value1, String value2) {
            addCriterion("jygwbeizhu between", value1, value2, "jygwbeizhu");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhuNotBetween(String value1, String value2) {
            addCriterion("jygwbeizhu not between", value1, value2, "jygwbeizhu");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2IsNull() {
            addCriterion("jygwbeizhu2 is null");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2IsNotNull() {
            addCriterion("jygwbeizhu2 is not null");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2EqualTo(String value) {
            addCriterion("jygwbeizhu2 =", value, "jygwbeizhu2");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2NotEqualTo(String value) {
            addCriterion("jygwbeizhu2 <>", value, "jygwbeizhu2");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2GreaterThan(String value) {
            addCriterion("jygwbeizhu2 >", value, "jygwbeizhu2");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2GreaterThanOrEqualTo(String value) {
            addCriterion("jygwbeizhu2 >=", value, "jygwbeizhu2");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2LessThan(String value) {
            addCriterion("jygwbeizhu2 <", value, "jygwbeizhu2");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2LessThanOrEqualTo(String value) {
            addCriterion("jygwbeizhu2 <=", value, "jygwbeizhu2");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2Like(String value) {
            addCriterion("jygwbeizhu2 like", value, "jygwbeizhu2");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2NotLike(String value) {
            addCriterion("jygwbeizhu2 not like", value, "jygwbeizhu2");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2In(List<String> values) {
            addCriterion("jygwbeizhu2 in", values, "jygwbeizhu2");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2NotIn(List<String> values) {
            addCriterion("jygwbeizhu2 not in", values, "jygwbeizhu2");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2Between(String value1, String value2) {
            addCriterion("jygwbeizhu2 between", value1, value2, "jygwbeizhu2");
            return (Criteria) this;
        }

        public Criteria andJygwbeizhu2NotBetween(String value1, String value2) {
            addCriterion("jygwbeizhu2 not between", value1, value2, "jygwbeizhu2");
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