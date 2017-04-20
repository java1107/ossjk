package com.jkoss.pojo.kc;

import java.util.ArrayList;
import java.util.List;

public class SubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectExample() {
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

        public Criteria andSbidIsNull() {
            addCriterion("sbid is null");
            return (Criteria) this;
        }

        public Criteria andSbidIsNotNull() {
            addCriterion("sbid is not null");
            return (Criteria) this;
        }

        public Criteria andSbidEqualTo(Integer value) {
            addCriterion("sbid =", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotEqualTo(Integer value) {
            addCriterion("sbid <>", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidGreaterThan(Integer value) {
            addCriterion("sbid >", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sbid >=", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLessThan(Integer value) {
            addCriterion("sbid <", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLessThanOrEqualTo(Integer value) {
            addCriterion("sbid <=", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidIn(List<Integer> values) {
            addCriterion("sbid in", values, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotIn(List<Integer> values) {
            addCriterion("sbid not in", values, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidBetween(Integer value1, Integer value2) {
            addCriterion("sbid between", value1, value2, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotBetween(Integer value1, Integer value2) {
            addCriterion("sbid not between", value1, value2, "sbid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidIsNull() {
            addCriterion("kcmdelid is null");
            return (Criteria) this;
        }

        public Criteria andKcmdelidIsNotNull() {
            addCriterion("kcmdelid is not null");
            return (Criteria) this;
        }

        public Criteria andKcmdelidEqualTo(Integer value) {
            addCriterion("kcmdelid =", value, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidNotEqualTo(Integer value) {
            addCriterion("kcmdelid <>", value, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidGreaterThan(Integer value) {
            addCriterion("kcmdelid >", value, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kcmdelid >=", value, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidLessThan(Integer value) {
            addCriterion("kcmdelid <", value, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidLessThanOrEqualTo(Integer value) {
            addCriterion("kcmdelid <=", value, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidIn(List<Integer> values) {
            addCriterion("kcmdelid in", values, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidNotIn(List<Integer> values) {
            addCriterion("kcmdelid not in", values, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidBetween(Integer value1, Integer value2) {
            addCriterion("kcmdelid between", value1, value2, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidNotBetween(Integer value1, Integer value2) {
            addCriterion("kcmdelid not between", value1, value2, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andSbnameIsNull() {
            addCriterion("sbname is null");
            return (Criteria) this;
        }

        public Criteria andSbnameIsNotNull() {
            addCriterion("sbname is not null");
            return (Criteria) this;
        }

        public Criteria andSbnameEqualTo(String value) {
            addCriterion("sbname =", value, "sbname");
            return (Criteria) this;
        }

        public Criteria andSbnameNotEqualTo(String value) {
            addCriterion("sbname <>", value, "sbname");
            return (Criteria) this;
        }

        public Criteria andSbnameGreaterThan(String value) {
            addCriterion("sbname >", value, "sbname");
            return (Criteria) this;
        }

        public Criteria andSbnameGreaterThanOrEqualTo(String value) {
            addCriterion("sbname >=", value, "sbname");
            return (Criteria) this;
        }

        public Criteria andSbnameLessThan(String value) {
            addCriterion("sbname <", value, "sbname");
            return (Criteria) this;
        }

        public Criteria andSbnameLessThanOrEqualTo(String value) {
            addCriterion("sbname <=", value, "sbname");
            return (Criteria) this;
        }

        public Criteria andSbnameLike(String value) {
            addCriterion("sbname like", value, "sbname");
            return (Criteria) this;
        }

        public Criteria andSbnameNotLike(String value) {
            addCriterion("sbname not like", value, "sbname");
            return (Criteria) this;
        }

        public Criteria andSbnameIn(List<String> values) {
            addCriterion("sbname in", values, "sbname");
            return (Criteria) this;
        }

        public Criteria andSbnameNotIn(List<String> values) {
            addCriterion("sbname not in", values, "sbname");
            return (Criteria) this;
        }

        public Criteria andSbnameBetween(String value1, String value2) {
            addCriterion("sbname between", value1, value2, "sbname");
            return (Criteria) this;
        }

        public Criteria andSbnameNotBetween(String value1, String value2) {
            addCriterion("sbname not between", value1, value2, "sbname");
            return (Criteria) this;
        }

        public Criteria andSbdaysIsNull() {
            addCriterion("sbdays is null");
            return (Criteria) this;
        }

        public Criteria andSbdaysIsNotNull() {
            addCriterion("sbdays is not null");
            return (Criteria) this;
        }

        public Criteria andSbdaysEqualTo(Integer value) {
            addCriterion("sbdays =", value, "sbdays");
            return (Criteria) this;
        }

        public Criteria andSbdaysNotEqualTo(Integer value) {
            addCriterion("sbdays <>", value, "sbdays");
            return (Criteria) this;
        }

        public Criteria andSbdaysGreaterThan(Integer value) {
            addCriterion("sbdays >", value, "sbdays");
            return (Criteria) this;
        }

        public Criteria andSbdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("sbdays >=", value, "sbdays");
            return (Criteria) this;
        }

        public Criteria andSbdaysLessThan(Integer value) {
            addCriterion("sbdays <", value, "sbdays");
            return (Criteria) this;
        }

        public Criteria andSbdaysLessThanOrEqualTo(Integer value) {
            addCriterion("sbdays <=", value, "sbdays");
            return (Criteria) this;
        }

        public Criteria andSbdaysIn(List<Integer> values) {
            addCriterion("sbdays in", values, "sbdays");
            return (Criteria) this;
        }

        public Criteria andSbdaysNotIn(List<Integer> values) {
            addCriterion("sbdays not in", values, "sbdays");
            return (Criteria) this;
        }

        public Criteria andSbdaysBetween(Integer value1, Integer value2) {
            addCriterion("sbdays between", value1, value2, "sbdays");
            return (Criteria) this;
        }

        public Criteria andSbdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("sbdays not between", value1, value2, "sbdays");
            return (Criteria) this;
        }

        public Criteria andSbcontentIsNull() {
            addCriterion("sbcontent is null");
            return (Criteria) this;
        }

        public Criteria andSbcontentIsNotNull() {
            addCriterion("sbcontent is not null");
            return (Criteria) this;
        }

        public Criteria andSbcontentEqualTo(String value) {
            addCriterion("sbcontent =", value, "sbcontent");
            return (Criteria) this;
        }

        public Criteria andSbcontentNotEqualTo(String value) {
            addCriterion("sbcontent <>", value, "sbcontent");
            return (Criteria) this;
        }

        public Criteria andSbcontentGreaterThan(String value) {
            addCriterion("sbcontent >", value, "sbcontent");
            return (Criteria) this;
        }

        public Criteria andSbcontentGreaterThanOrEqualTo(String value) {
            addCriterion("sbcontent >=", value, "sbcontent");
            return (Criteria) this;
        }

        public Criteria andSbcontentLessThan(String value) {
            addCriterion("sbcontent <", value, "sbcontent");
            return (Criteria) this;
        }

        public Criteria andSbcontentLessThanOrEqualTo(String value) {
            addCriterion("sbcontent <=", value, "sbcontent");
            return (Criteria) this;
        }

        public Criteria andSbcontentLike(String value) {
            addCriterion("sbcontent like", value, "sbcontent");
            return (Criteria) this;
        }

        public Criteria andSbcontentNotLike(String value) {
            addCriterion("sbcontent not like", value, "sbcontent");
            return (Criteria) this;
        }

        public Criteria andSbcontentIn(List<String> values) {
            addCriterion("sbcontent in", values, "sbcontent");
            return (Criteria) this;
        }

        public Criteria andSbcontentNotIn(List<String> values) {
            addCriterion("sbcontent not in", values, "sbcontent");
            return (Criteria) this;
        }

        public Criteria andSbcontentBetween(String value1, String value2) {
            addCriterion("sbcontent between", value1, value2, "sbcontent");
            return (Criteria) this;
        }

        public Criteria andSbcontentNotBetween(String value1, String value2) {
            addCriterion("sbcontent not between", value1, value2, "sbcontent");
            return (Criteria) this;
        }

        public Criteria andSbnoIsNull() {
            addCriterion("sbno is null");
            return (Criteria) this;
        }

        public Criteria andSbnoIsNotNull() {
            addCriterion("sbno is not null");
            return (Criteria) this;
        }

        public Criteria andSbnoEqualTo(Integer value) {
            addCriterion("sbno =", value, "sbno");
            return (Criteria) this;
        }

        public Criteria andSbnoNotEqualTo(Integer value) {
            addCriterion("sbno <>", value, "sbno");
            return (Criteria) this;
        }

        public Criteria andSbnoGreaterThan(Integer value) {
            addCriterion("sbno >", value, "sbno");
            return (Criteria) this;
        }

        public Criteria andSbnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sbno >=", value, "sbno");
            return (Criteria) this;
        }

        public Criteria andSbnoLessThan(Integer value) {
            addCriterion("sbno <", value, "sbno");
            return (Criteria) this;
        }

        public Criteria andSbnoLessThanOrEqualTo(Integer value) {
            addCriterion("sbno <=", value, "sbno");
            return (Criteria) this;
        }

        public Criteria andSbnoIn(List<Integer> values) {
            addCriterion("sbno in", values, "sbno");
            return (Criteria) this;
        }

        public Criteria andSbnoNotIn(List<Integer> values) {
            addCriterion("sbno not in", values, "sbno");
            return (Criteria) this;
        }

        public Criteria andSbnoBetween(Integer value1, Integer value2) {
            addCriterion("sbno between", value1, value2, "sbno");
            return (Criteria) this;
        }

        public Criteria andSbnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sbno not between", value1, value2, "sbno");
            return (Criteria) this;
        }

        public Criteria andSbdescbIsNull() {
            addCriterion("sbdescb is null");
            return (Criteria) this;
        }

        public Criteria andSbdescbIsNotNull() {
            addCriterion("sbdescb is not null");
            return (Criteria) this;
        }

        public Criteria andSbdescbEqualTo(String value) {
            addCriterion("sbdescb =", value, "sbdescb");
            return (Criteria) this;
        }

        public Criteria andSbdescbNotEqualTo(String value) {
            addCriterion("sbdescb <>", value, "sbdescb");
            return (Criteria) this;
        }

        public Criteria andSbdescbGreaterThan(String value) {
            addCriterion("sbdescb >", value, "sbdescb");
            return (Criteria) this;
        }

        public Criteria andSbdescbGreaterThanOrEqualTo(String value) {
            addCriterion("sbdescb >=", value, "sbdescb");
            return (Criteria) this;
        }

        public Criteria andSbdescbLessThan(String value) {
            addCriterion("sbdescb <", value, "sbdescb");
            return (Criteria) this;
        }

        public Criteria andSbdescbLessThanOrEqualTo(String value) {
            addCriterion("sbdescb <=", value, "sbdescb");
            return (Criteria) this;
        }

        public Criteria andSbdescbLike(String value) {
            addCriterion("sbdescb like", value, "sbdescb");
            return (Criteria) this;
        }

        public Criteria andSbdescbNotLike(String value) {
            addCriterion("sbdescb not like", value, "sbdescb");
            return (Criteria) this;
        }

        public Criteria andSbdescbIn(List<String> values) {
            addCriterion("sbdescb in", values, "sbdescb");
            return (Criteria) this;
        }

        public Criteria andSbdescbNotIn(List<String> values) {
            addCriterion("sbdescb not in", values, "sbdescb");
            return (Criteria) this;
        }

        public Criteria andSbdescbBetween(String value1, String value2) {
            addCriterion("sbdescb between", value1, value2, "sbdescb");
            return (Criteria) this;
        }

        public Criteria andSbdescbNotBetween(String value1, String value2) {
            addCriterion("sbdescb not between", value1, value2, "sbdescb");
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