package com.jkoss.pojo.zx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsfollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsfollowExample() {
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

        public Criteria andFlwidIsNull() {
            addCriterion("flwid is null");
            return (Criteria) this;
        }

        public Criteria andFlwidIsNotNull() {
            addCriterion("flwid is not null");
            return (Criteria) this;
        }

        public Criteria andFlwidEqualTo(Integer value) {
            addCriterion("flwid =", value, "flwid");
            return (Criteria) this;
        }

        public Criteria andFlwidNotEqualTo(Integer value) {
            addCriterion("flwid <>", value, "flwid");
            return (Criteria) this;
        }

        public Criteria andFlwidGreaterThan(Integer value) {
            addCriterion("flwid >", value, "flwid");
            return (Criteria) this;
        }

        public Criteria andFlwidGreaterThanOrEqualTo(Integer value) {
            addCriterion("flwid >=", value, "flwid");
            return (Criteria) this;
        }

        public Criteria andFlwidLessThan(Integer value) {
            addCriterion("flwid <", value, "flwid");
            return (Criteria) this;
        }

        public Criteria andFlwidLessThanOrEqualTo(Integer value) {
            addCriterion("flwid <=", value, "flwid");
            return (Criteria) this;
        }

        public Criteria andFlwidIn(List<Integer> values) {
            addCriterion("flwid in", values, "flwid");
            return (Criteria) this;
        }

        public Criteria andFlwidNotIn(List<Integer> values) {
            addCriterion("flwid not in", values, "flwid");
            return (Criteria) this;
        }

        public Criteria andFlwidBetween(Integer value1, Integer value2) {
            addCriterion("flwid between", value1, value2, "flwid");
            return (Criteria) this;
        }

        public Criteria andFlwidNotBetween(Integer value1, Integer value2) {
            addCriterion("flwid not between", value1, value2, "flwid");
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

        public Criteria andFlwdateIsNull() {
            addCriterion("flwdate is null");
            return (Criteria) this;
        }

        public Criteria andFlwdateIsNotNull() {
            addCriterion("flwdate is not null");
            return (Criteria) this;
        }

        public Criteria andFlwdateEqualTo(Date value) {
            addCriterion("flwdate =", value, "flwdate");
            return (Criteria) this;
        }

        public Criteria andFlwdateNotEqualTo(Date value) {
            addCriterion("flwdate <>", value, "flwdate");
            return (Criteria) this;
        }

        public Criteria andFlwdateGreaterThan(Date value) {
            addCriterion("flwdate >", value, "flwdate");
            return (Criteria) this;
        }

        public Criteria andFlwdateGreaterThanOrEqualTo(Date value) {
            addCriterion("flwdate >=", value, "flwdate");
            return (Criteria) this;
        }

        public Criteria andFlwdateLessThan(Date value) {
            addCriterion("flwdate <", value, "flwdate");
            return (Criteria) this;
        }

        public Criteria andFlwdateLessThanOrEqualTo(Date value) {
            addCriterion("flwdate <=", value, "flwdate");
            return (Criteria) this;
        }

        public Criteria andFlwdateIn(List<Date> values) {
            addCriterion("flwdate in", values, "flwdate");
            return (Criteria) this;
        }

        public Criteria andFlwdateNotIn(List<Date> values) {
            addCriterion("flwdate not in", values, "flwdate");
            return (Criteria) this;
        }

        public Criteria andFlwdateBetween(Date value1, Date value2) {
            addCriterion("flwdate between", value1, value2, "flwdate");
            return (Criteria) this;
        }

        public Criteria andFlwdateNotBetween(Date value1, Date value2) {
            addCriterion("flwdate not between", value1, value2, "flwdate");
            return (Criteria) this;
        }

        public Criteria andFlwcontentIsNull() {
            addCriterion("flwcontent is null");
            return (Criteria) this;
        }

        public Criteria andFlwcontentIsNotNull() {
            addCriterion("flwcontent is not null");
            return (Criteria) this;
        }

        public Criteria andFlwcontentEqualTo(String value) {
            addCriterion("flwcontent =", value, "flwcontent");
            return (Criteria) this;
        }

        public Criteria andFlwcontentNotEqualTo(String value) {
            addCriterion("flwcontent <>", value, "flwcontent");
            return (Criteria) this;
        }

        public Criteria andFlwcontentGreaterThan(String value) {
            addCriterion("flwcontent >", value, "flwcontent");
            return (Criteria) this;
        }

        public Criteria andFlwcontentGreaterThanOrEqualTo(String value) {
            addCriterion("flwcontent >=", value, "flwcontent");
            return (Criteria) this;
        }

        public Criteria andFlwcontentLessThan(String value) {
            addCriterion("flwcontent <", value, "flwcontent");
            return (Criteria) this;
        }

        public Criteria andFlwcontentLessThanOrEqualTo(String value) {
            addCriterion("flwcontent <=", value, "flwcontent");
            return (Criteria) this;
        }

        public Criteria andFlwcontentLike(String value) {
            addCriterion("flwcontent like", value, "flwcontent");
            return (Criteria) this;
        }

        public Criteria andFlwcontentNotLike(String value) {
            addCriterion("flwcontent not like", value, "flwcontent");
            return (Criteria) this;
        }

        public Criteria andFlwcontentIn(List<String> values) {
            addCriterion("flwcontent in", values, "flwcontent");
            return (Criteria) this;
        }

        public Criteria andFlwcontentNotIn(List<String> values) {
            addCriterion("flwcontent not in", values, "flwcontent");
            return (Criteria) this;
        }

        public Criteria andFlwcontentBetween(String value1, String value2) {
            addCriterion("flwcontent between", value1, value2, "flwcontent");
            return (Criteria) this;
        }

        public Criteria andFlwcontentNotBetween(String value1, String value2) {
            addCriterion("flwcontent not between", value1, value2, "flwcontent");
            return (Criteria) this;
        }

        public Criteria andFlwansIsNull() {
            addCriterion("flwans is null");
            return (Criteria) this;
        }

        public Criteria andFlwansIsNotNull() {
            addCriterion("flwans is not null");
            return (Criteria) this;
        }

        public Criteria andFlwansEqualTo(String value) {
            addCriterion("flwans =", value, "flwans");
            return (Criteria) this;
        }

        public Criteria andFlwansNotEqualTo(String value) {
            addCriterion("flwans <>", value, "flwans");
            return (Criteria) this;
        }

        public Criteria andFlwansGreaterThan(String value) {
            addCriterion("flwans >", value, "flwans");
            return (Criteria) this;
        }

        public Criteria andFlwansGreaterThanOrEqualTo(String value) {
            addCriterion("flwans >=", value, "flwans");
            return (Criteria) this;
        }

        public Criteria andFlwansLessThan(String value) {
            addCriterion("flwans <", value, "flwans");
            return (Criteria) this;
        }

        public Criteria andFlwansLessThanOrEqualTo(String value) {
            addCriterion("flwans <=", value, "flwans");
            return (Criteria) this;
        }

        public Criteria andFlwansLike(String value) {
            addCriterion("flwans like", value, "flwans");
            return (Criteria) this;
        }

        public Criteria andFlwansNotLike(String value) {
            addCriterion("flwans not like", value, "flwans");
            return (Criteria) this;
        }

        public Criteria andFlwansIn(List<String> values) {
            addCriterion("flwans in", values, "flwans");
            return (Criteria) this;
        }

        public Criteria andFlwansNotIn(List<String> values) {
            addCriterion("flwans not in", values, "flwans");
            return (Criteria) this;
        }

        public Criteria andFlwansBetween(String value1, String value2) {
            addCriterion("flwans between", value1, value2, "flwans");
            return (Criteria) this;
        }

        public Criteria andFlwansNotBetween(String value1, String value2) {
            addCriterion("flwans not between", value1, value2, "flwans");
            return (Criteria) this;
        }

        public Criteria andFlwdescIsNull() {
            addCriterion("flwdesc is null");
            return (Criteria) this;
        }

        public Criteria andFlwdescIsNotNull() {
            addCriterion("flwdesc is not null");
            return (Criteria) this;
        }

        public Criteria andFlwdescEqualTo(String value) {
            addCriterion("flwdesc =", value, "flwdesc");
            return (Criteria) this;
        }

        public Criteria andFlwdescNotEqualTo(String value) {
            addCriterion("flwdesc <>", value, "flwdesc");
            return (Criteria) this;
        }

        public Criteria andFlwdescGreaterThan(String value) {
            addCriterion("flwdesc >", value, "flwdesc");
            return (Criteria) this;
        }

        public Criteria andFlwdescGreaterThanOrEqualTo(String value) {
            addCriterion("flwdesc >=", value, "flwdesc");
            return (Criteria) this;
        }

        public Criteria andFlwdescLessThan(String value) {
            addCriterion("flwdesc <", value, "flwdesc");
            return (Criteria) this;
        }

        public Criteria andFlwdescLessThanOrEqualTo(String value) {
            addCriterion("flwdesc <=", value, "flwdesc");
            return (Criteria) this;
        }

        public Criteria andFlwdescLike(String value) {
            addCriterion("flwdesc like", value, "flwdesc");
            return (Criteria) this;
        }

        public Criteria andFlwdescNotLike(String value) {
            addCriterion("flwdesc not like", value, "flwdesc");
            return (Criteria) this;
        }

        public Criteria andFlwdescIn(List<String> values) {
            addCriterion("flwdesc in", values, "flwdesc");
            return (Criteria) this;
        }

        public Criteria andFlwdescNotIn(List<String> values) {
            addCriterion("flwdesc not in", values, "flwdesc");
            return (Criteria) this;
        }

        public Criteria andFlwdescBetween(String value1, String value2) {
            addCriterion("flwdesc between", value1, value2, "flwdesc");
            return (Criteria) this;
        }

        public Criteria andFlwdescNotBetween(String value1, String value2) {
            addCriterion("flwdesc not between", value1, value2, "flwdesc");
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