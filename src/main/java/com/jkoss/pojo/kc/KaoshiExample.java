package com.jkoss.pojo.kc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KaoshiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KaoshiExample() {
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

        public Criteria andThemeidIsNull() {
            addCriterion("themeid is null");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNotNull() {
            addCriterion("themeid is not null");
            return (Criteria) this;
        }

        public Criteria andThemeidEqualTo(Integer value) {
            addCriterion("themeid =", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotEqualTo(Integer value) {
            addCriterion("themeid <>", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThan(Integer value) {
            addCriterion("themeid >", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("themeid >=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThan(Integer value) {
            addCriterion("themeid <", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThanOrEqualTo(Integer value) {
            addCriterion("themeid <=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidIn(List<Integer> values) {
            addCriterion("themeid in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotIn(List<Integer> values) {
            addCriterion("themeid not in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidBetween(Integer value1, Integer value2) {
            addCriterion("themeid between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotBetween(Integer value1, Integer value2) {
            addCriterion("themeid not between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andClzidIsNull() {
            addCriterion("clzid is null");
            return (Criteria) this;
        }

        public Criteria andClzidIsNotNull() {
            addCriterion("clzid is not null");
            return (Criteria) this;
        }

        public Criteria andClzidEqualTo(Integer value) {
            addCriterion("clzid =", value, "clzid");
            return (Criteria) this;
        }

        public Criteria andClzidNotEqualTo(Integer value) {
            addCriterion("clzid <>", value, "clzid");
            return (Criteria) this;
        }

        public Criteria andClzidGreaterThan(Integer value) {
            addCriterion("clzid >", value, "clzid");
            return (Criteria) this;
        }

        public Criteria andClzidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clzid >=", value, "clzid");
            return (Criteria) this;
        }

        public Criteria andClzidLessThan(Integer value) {
            addCriterion("clzid <", value, "clzid");
            return (Criteria) this;
        }

        public Criteria andClzidLessThanOrEqualTo(Integer value) {
            addCriterion("clzid <=", value, "clzid");
            return (Criteria) this;
        }

        public Criteria andClzidIn(List<Integer> values) {
            addCriterion("clzid in", values, "clzid");
            return (Criteria) this;
        }

        public Criteria andClzidNotIn(List<Integer> values) {
            addCriterion("clzid not in", values, "clzid");
            return (Criteria) this;
        }

        public Criteria andClzidBetween(Integer value1, Integer value2) {
            addCriterion("clzid between", value1, value2, "clzid");
            return (Criteria) this;
        }

        public Criteria andClzidNotBetween(Integer value1, Integer value2) {
            addCriterion("clzid not between", value1, value2, "clzid");
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

        public Criteria andThenameIsNull() {
            addCriterion("thename is null");
            return (Criteria) this;
        }

        public Criteria andThenameIsNotNull() {
            addCriterion("thename is not null");
            return (Criteria) this;
        }

        public Criteria andThenameEqualTo(String value) {
            addCriterion("thename =", value, "thename");
            return (Criteria) this;
        }

        public Criteria andThenameNotEqualTo(String value) {
            addCriterion("thename <>", value, "thename");
            return (Criteria) this;
        }

        public Criteria andThenameGreaterThan(String value) {
            addCriterion("thename >", value, "thename");
            return (Criteria) this;
        }

        public Criteria andThenameGreaterThanOrEqualTo(String value) {
            addCriterion("thename >=", value, "thename");
            return (Criteria) this;
        }

        public Criteria andThenameLessThan(String value) {
            addCriterion("thename <", value, "thename");
            return (Criteria) this;
        }

        public Criteria andThenameLessThanOrEqualTo(String value) {
            addCriterion("thename <=", value, "thename");
            return (Criteria) this;
        }

        public Criteria andThenameLike(String value) {
            addCriterion("thename like", value, "thename");
            return (Criteria) this;
        }

        public Criteria andThenameNotLike(String value) {
            addCriterion("thename not like", value, "thename");
            return (Criteria) this;
        }

        public Criteria andThenameIn(List<String> values) {
            addCriterion("thename in", values, "thename");
            return (Criteria) this;
        }

        public Criteria andThenameNotIn(List<String> values) {
            addCriterion("thename not in", values, "thename");
            return (Criteria) this;
        }

        public Criteria andThenameBetween(String value1, String value2) {
            addCriterion("thename between", value1, value2, "thename");
            return (Criteria) this;
        }

        public Criteria andThenameNotBetween(String value1, String value2) {
            addCriterion("thename not between", value1, value2, "thename");
            return (Criteria) this;
        }

        public Criteria andThemetimeIsNull() {
            addCriterion("themetime is null");
            return (Criteria) this;
        }

        public Criteria andThemetimeIsNotNull() {
            addCriterion("themetime is not null");
            return (Criteria) this;
        }

        public Criteria andThemetimeEqualTo(Date value) {
            addCriterion("themetime =", value, "themetime");
            return (Criteria) this;
        }

        public Criteria andThemetimeNotEqualTo(Date value) {
            addCriterion("themetime <>", value, "themetime");
            return (Criteria) this;
        }

        public Criteria andThemetimeGreaterThan(Date value) {
            addCriterion("themetime >", value, "themetime");
            return (Criteria) this;
        }

        public Criteria andThemetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("themetime >=", value, "themetime");
            return (Criteria) this;
        }

        public Criteria andThemetimeLessThan(Date value) {
            addCriterion("themetime <", value, "themetime");
            return (Criteria) this;
        }

        public Criteria andThemetimeLessThanOrEqualTo(Date value) {
            addCriterion("themetime <=", value, "themetime");
            return (Criteria) this;
        }

        public Criteria andThemetimeIn(List<Date> values) {
            addCriterion("themetime in", values, "themetime");
            return (Criteria) this;
        }

        public Criteria andThemetimeNotIn(List<Date> values) {
            addCriterion("themetime not in", values, "themetime");
            return (Criteria) this;
        }

        public Criteria andThemetimeBetween(Date value1, Date value2) {
            addCriterion("themetime between", value1, value2, "themetime");
            return (Criteria) this;
        }

        public Criteria andThemetimeNotBetween(Date value1, Date value2) {
            addCriterion("themetime not between", value1, value2, "themetime");
            return (Criteria) this;
        }

        public Criteria andSjurlIsNull() {
            addCriterion("sjurl is null");
            return (Criteria) this;
        }

        public Criteria andSjurlIsNotNull() {
            addCriterion("sjurl is not null");
            return (Criteria) this;
        }

        public Criteria andSjurlEqualTo(String value) {
            addCriterion("sjurl =", value, "sjurl");
            return (Criteria) this;
        }

        public Criteria andSjurlNotEqualTo(String value) {
            addCriterion("sjurl <>", value, "sjurl");
            return (Criteria) this;
        }

        public Criteria andSjurlGreaterThan(String value) {
            addCriterion("sjurl >", value, "sjurl");
            return (Criteria) this;
        }

        public Criteria andSjurlGreaterThanOrEqualTo(String value) {
            addCriterion("sjurl >=", value, "sjurl");
            return (Criteria) this;
        }

        public Criteria andSjurlLessThan(String value) {
            addCriterion("sjurl <", value, "sjurl");
            return (Criteria) this;
        }

        public Criteria andSjurlLessThanOrEqualTo(String value) {
            addCriterion("sjurl <=", value, "sjurl");
            return (Criteria) this;
        }

        public Criteria andSjurlLike(String value) {
            addCriterion("sjurl like", value, "sjurl");
            return (Criteria) this;
        }

        public Criteria andSjurlNotLike(String value) {
            addCriterion("sjurl not like", value, "sjurl");
            return (Criteria) this;
        }

        public Criteria andSjurlIn(List<String> values) {
            addCriterion("sjurl in", values, "sjurl");
            return (Criteria) this;
        }

        public Criteria andSjurlNotIn(List<String> values) {
            addCriterion("sjurl not in", values, "sjurl");
            return (Criteria) this;
        }

        public Criteria andSjurlBetween(String value1, String value2) {
            addCriterion("sjurl between", value1, value2, "sjurl");
            return (Criteria) this;
        }

        public Criteria andSjurlNotBetween(String value1, String value2) {
            addCriterion("sjurl not between", value1, value2, "sjurl");
            return (Criteria) this;
        }

        public Criteria andSjansurlIsNull() {
            addCriterion("sjansurl is null");
            return (Criteria) this;
        }

        public Criteria andSjansurlIsNotNull() {
            addCriterion("sjansurl is not null");
            return (Criteria) this;
        }

        public Criteria andSjansurlEqualTo(String value) {
            addCriterion("sjansurl =", value, "sjansurl");
            return (Criteria) this;
        }

        public Criteria andSjansurlNotEqualTo(String value) {
            addCriterion("sjansurl <>", value, "sjansurl");
            return (Criteria) this;
        }

        public Criteria andSjansurlGreaterThan(String value) {
            addCriterion("sjansurl >", value, "sjansurl");
            return (Criteria) this;
        }

        public Criteria andSjansurlGreaterThanOrEqualTo(String value) {
            addCriterion("sjansurl >=", value, "sjansurl");
            return (Criteria) this;
        }

        public Criteria andSjansurlLessThan(String value) {
            addCriterion("sjansurl <", value, "sjansurl");
            return (Criteria) this;
        }

        public Criteria andSjansurlLessThanOrEqualTo(String value) {
            addCriterion("sjansurl <=", value, "sjansurl");
            return (Criteria) this;
        }

        public Criteria andSjansurlLike(String value) {
            addCriterion("sjansurl like", value, "sjansurl");
            return (Criteria) this;
        }

        public Criteria andSjansurlNotLike(String value) {
            addCriterion("sjansurl not like", value, "sjansurl");
            return (Criteria) this;
        }

        public Criteria andSjansurlIn(List<String> values) {
            addCriterion("sjansurl in", values, "sjansurl");
            return (Criteria) this;
        }

        public Criteria andSjansurlNotIn(List<String> values) {
            addCriterion("sjansurl not in", values, "sjansurl");
            return (Criteria) this;
        }

        public Criteria andSjansurlBetween(String value1, String value2) {
            addCriterion("sjansurl between", value1, value2, "sjansurl");
            return (Criteria) this;
        }

        public Criteria andSjansurlNotBetween(String value1, String value2) {
            addCriterion("sjansurl not between", value1, value2, "sjansurl");
            return (Criteria) this;
        }

        public Criteria andKaoshipjIsNull() {
            addCriterion("kaoshipj is null");
            return (Criteria) this;
        }

        public Criteria andKaoshipjIsNotNull() {
            addCriterion("kaoshipj is not null");
            return (Criteria) this;
        }

        public Criteria andKaoshipjEqualTo(String value) {
            addCriterion("kaoshipj =", value, "kaoshipj");
            return (Criteria) this;
        }

        public Criteria andKaoshipjNotEqualTo(String value) {
            addCriterion("kaoshipj <>", value, "kaoshipj");
            return (Criteria) this;
        }

        public Criteria andKaoshipjGreaterThan(String value) {
            addCriterion("kaoshipj >", value, "kaoshipj");
            return (Criteria) this;
        }

        public Criteria andKaoshipjGreaterThanOrEqualTo(String value) {
            addCriterion("kaoshipj >=", value, "kaoshipj");
            return (Criteria) this;
        }

        public Criteria andKaoshipjLessThan(String value) {
            addCriterion("kaoshipj <", value, "kaoshipj");
            return (Criteria) this;
        }

        public Criteria andKaoshipjLessThanOrEqualTo(String value) {
            addCriterion("kaoshipj <=", value, "kaoshipj");
            return (Criteria) this;
        }

        public Criteria andKaoshipjLike(String value) {
            addCriterion("kaoshipj like", value, "kaoshipj");
            return (Criteria) this;
        }

        public Criteria andKaoshipjNotLike(String value) {
            addCriterion("kaoshipj not like", value, "kaoshipj");
            return (Criteria) this;
        }

        public Criteria andKaoshipjIn(List<String> values) {
            addCriterion("kaoshipj in", values, "kaoshipj");
            return (Criteria) this;
        }

        public Criteria andKaoshipjNotIn(List<String> values) {
            addCriterion("kaoshipj not in", values, "kaoshipj");
            return (Criteria) this;
        }

        public Criteria andKaoshipjBetween(String value1, String value2) {
            addCriterion("kaoshipj between", value1, value2, "kaoshipj");
            return (Criteria) this;
        }

        public Criteria andKaoshipjNotBetween(String value1, String value2) {
            addCriterion("kaoshipj not between", value1, value2, "kaoshipj");
            return (Criteria) this;
        }

        public Criteria andKsdescbIsNull() {
            addCriterion("ksdescb is null");
            return (Criteria) this;
        }

        public Criteria andKsdescbIsNotNull() {
            addCriterion("ksdescb is not null");
            return (Criteria) this;
        }

        public Criteria andKsdescbEqualTo(String value) {
            addCriterion("ksdescb =", value, "ksdescb");
            return (Criteria) this;
        }

        public Criteria andKsdescbNotEqualTo(String value) {
            addCriterion("ksdescb <>", value, "ksdescb");
            return (Criteria) this;
        }

        public Criteria andKsdescbGreaterThan(String value) {
            addCriterion("ksdescb >", value, "ksdescb");
            return (Criteria) this;
        }

        public Criteria andKsdescbGreaterThanOrEqualTo(String value) {
            addCriterion("ksdescb >=", value, "ksdescb");
            return (Criteria) this;
        }

        public Criteria andKsdescbLessThan(String value) {
            addCriterion("ksdescb <", value, "ksdescb");
            return (Criteria) this;
        }

        public Criteria andKsdescbLessThanOrEqualTo(String value) {
            addCriterion("ksdescb <=", value, "ksdescb");
            return (Criteria) this;
        }

        public Criteria andKsdescbLike(String value) {
            addCriterion("ksdescb like", value, "ksdescb");
            return (Criteria) this;
        }

        public Criteria andKsdescbNotLike(String value) {
            addCriterion("ksdescb not like", value, "ksdescb");
            return (Criteria) this;
        }

        public Criteria andKsdescbIn(List<String> values) {
            addCriterion("ksdescb in", values, "ksdescb");
            return (Criteria) this;
        }

        public Criteria andKsdescbNotIn(List<String> values) {
            addCriterion("ksdescb not in", values, "ksdescb");
            return (Criteria) this;
        }

        public Criteria andKsdescbBetween(String value1, String value2) {
            addCriterion("ksdescb between", value1, value2, "ksdescb");
            return (Criteria) this;
        }

        public Criteria andKsdescbNotBetween(String value1, String value2) {
            addCriterion("ksdescb not between", value1, value2, "ksdescb");
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