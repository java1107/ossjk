package com.jkoss.pojo.stu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HkrecodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HkrecodeExample() {
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

        public Criteria andHkid2IsNull() {
            addCriterion("hkid2 is null");
            return (Criteria) this;
        }

        public Criteria andHkid2IsNotNull() {
            addCriterion("hkid2 is not null");
            return (Criteria) this;
        }

        public Criteria andHkid2EqualTo(Integer value) {
            addCriterion("hkid2 =", value, "hkid2");
            return (Criteria) this;
        }

        public Criteria andHkid2NotEqualTo(Integer value) {
            addCriterion("hkid2 <>", value, "hkid2");
            return (Criteria) this;
        }

        public Criteria andHkid2GreaterThan(Integer value) {
            addCriterion("hkid2 >", value, "hkid2");
            return (Criteria) this;
        }

        public Criteria andHkid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("hkid2 >=", value, "hkid2");
            return (Criteria) this;
        }

        public Criteria andHkid2LessThan(Integer value) {
            addCriterion("hkid2 <", value, "hkid2");
            return (Criteria) this;
        }

        public Criteria andHkid2LessThanOrEqualTo(Integer value) {
            addCriterion("hkid2 <=", value, "hkid2");
            return (Criteria) this;
        }

        public Criteria andHkid2In(List<Integer> values) {
            addCriterion("hkid2 in", values, "hkid2");
            return (Criteria) this;
        }

        public Criteria andHkid2NotIn(List<Integer> values) {
            addCriterion("hkid2 not in", values, "hkid2");
            return (Criteria) this;
        }

        public Criteria andHkid2Between(Integer value1, Integer value2) {
            addCriterion("hkid2 between", value1, value2, "hkid2");
            return (Criteria) this;
        }

        public Criteria andHkid2NotBetween(Integer value1, Integer value2) {
            addCriterion("hkid2 not between", value1, value2, "hkid2");
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

        public Criteria andHktitle2IsNull() {
            addCriterion("hktitle2 is null");
            return (Criteria) this;
        }

        public Criteria andHktitle2IsNotNull() {
            addCriterion("hktitle2 is not null");
            return (Criteria) this;
        }

        public Criteria andHktitle2EqualTo(String value) {
            addCriterion("hktitle2 =", value, "hktitle2");
            return (Criteria) this;
        }

        public Criteria andHktitle2NotEqualTo(String value) {
            addCriterion("hktitle2 <>", value, "hktitle2");
            return (Criteria) this;
        }

        public Criteria andHktitle2GreaterThan(String value) {
            addCriterion("hktitle2 >", value, "hktitle2");
            return (Criteria) this;
        }

        public Criteria andHktitle2GreaterThanOrEqualTo(String value) {
            addCriterion("hktitle2 >=", value, "hktitle2");
            return (Criteria) this;
        }

        public Criteria andHktitle2LessThan(String value) {
            addCriterion("hktitle2 <", value, "hktitle2");
            return (Criteria) this;
        }

        public Criteria andHktitle2LessThanOrEqualTo(String value) {
            addCriterion("hktitle2 <=", value, "hktitle2");
            return (Criteria) this;
        }

        public Criteria andHktitle2Like(String value) {
            addCriterion("hktitle2 like", value, "hktitle2");
            return (Criteria) this;
        }

        public Criteria andHktitle2NotLike(String value) {
            addCriterion("hktitle2 not like", value, "hktitle2");
            return (Criteria) this;
        }

        public Criteria andHktitle2In(List<String> values) {
            addCriterion("hktitle2 in", values, "hktitle2");
            return (Criteria) this;
        }

        public Criteria andHktitle2NotIn(List<String> values) {
            addCriterion("hktitle2 not in", values, "hktitle2");
            return (Criteria) this;
        }

        public Criteria andHktitle2Between(String value1, String value2) {
            addCriterion("hktitle2 between", value1, value2, "hktitle2");
            return (Criteria) this;
        }

        public Criteria andHktitle2NotBetween(String value1, String value2) {
            addCriterion("hktitle2 not between", value1, value2, "hktitle2");
            return (Criteria) this;
        }

        public Criteria andHkdodateIsNull() {
            addCriterion("hkdodate is null");
            return (Criteria) this;
        }

        public Criteria andHkdodateIsNotNull() {
            addCriterion("hkdodate is not null");
            return (Criteria) this;
        }

        public Criteria andHkdodateEqualTo(Date value) {
            addCriterion("hkdodate =", value, "hkdodate");
            return (Criteria) this;
        }

        public Criteria andHkdodateNotEqualTo(Date value) {
            addCriterion("hkdodate <>", value, "hkdodate");
            return (Criteria) this;
        }

        public Criteria andHkdodateGreaterThan(Date value) {
            addCriterion("hkdodate >", value, "hkdodate");
            return (Criteria) this;
        }

        public Criteria andHkdodateGreaterThanOrEqualTo(Date value) {
            addCriterion("hkdodate >=", value, "hkdodate");
            return (Criteria) this;
        }

        public Criteria andHkdodateLessThan(Date value) {
            addCriterion("hkdodate <", value, "hkdodate");
            return (Criteria) this;
        }

        public Criteria andHkdodateLessThanOrEqualTo(Date value) {
            addCriterion("hkdodate <=", value, "hkdodate");
            return (Criteria) this;
        }

        public Criteria andHkdodateIn(List<Date> values) {
            addCriterion("hkdodate in", values, "hkdodate");
            return (Criteria) this;
        }

        public Criteria andHkdodateNotIn(List<Date> values) {
            addCriterion("hkdodate not in", values, "hkdodate");
            return (Criteria) this;
        }

        public Criteria andHkdodateBetween(Date value1, Date value2) {
            addCriterion("hkdodate between", value1, value2, "hkdodate");
            return (Criteria) this;
        }

        public Criteria andHkdodateNotBetween(Date value1, Date value2) {
            addCriterion("hkdodate not between", value1, value2, "hkdodate");
            return (Criteria) this;
        }

        public Criteria andHkdescb2IsNull() {
            addCriterion("hkdescb2 is null");
            return (Criteria) this;
        }

        public Criteria andHkdescb2IsNotNull() {
            addCriterion("hkdescb2 is not null");
            return (Criteria) this;
        }

        public Criteria andHkdescb2EqualTo(String value) {
            addCriterion("hkdescb2 =", value, "hkdescb2");
            return (Criteria) this;
        }

        public Criteria andHkdescb2NotEqualTo(String value) {
            addCriterion("hkdescb2 <>", value, "hkdescb2");
            return (Criteria) this;
        }

        public Criteria andHkdescb2GreaterThan(String value) {
            addCriterion("hkdescb2 >", value, "hkdescb2");
            return (Criteria) this;
        }

        public Criteria andHkdescb2GreaterThanOrEqualTo(String value) {
            addCriterion("hkdescb2 >=", value, "hkdescb2");
            return (Criteria) this;
        }

        public Criteria andHkdescb2LessThan(String value) {
            addCriterion("hkdescb2 <", value, "hkdescb2");
            return (Criteria) this;
        }

        public Criteria andHkdescb2LessThanOrEqualTo(String value) {
            addCriterion("hkdescb2 <=", value, "hkdescb2");
            return (Criteria) this;
        }

        public Criteria andHkdescb2Like(String value) {
            addCriterion("hkdescb2 like", value, "hkdescb2");
            return (Criteria) this;
        }

        public Criteria andHkdescb2NotLike(String value) {
            addCriterion("hkdescb2 not like", value, "hkdescb2");
            return (Criteria) this;
        }

        public Criteria andHkdescb2In(List<String> values) {
            addCriterion("hkdescb2 in", values, "hkdescb2");
            return (Criteria) this;
        }

        public Criteria andHkdescb2NotIn(List<String> values) {
            addCriterion("hkdescb2 not in", values, "hkdescb2");
            return (Criteria) this;
        }

        public Criteria andHkdescb2Between(String value1, String value2) {
            addCriterion("hkdescb2 between", value1, value2, "hkdescb2");
            return (Criteria) this;
        }

        public Criteria andHkdescb2NotBetween(String value1, String value2) {
            addCriterion("hkdescb2 not between", value1, value2, "hkdescb2");
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