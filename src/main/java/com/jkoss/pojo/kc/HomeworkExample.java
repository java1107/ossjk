package com.jkoss.pojo.kc;

import java.util.ArrayList;
import java.util.List;

public class HomeworkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeworkExample() {
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

        public Criteria andHkidIsNull() {
            addCriterion("hkid is null");
            return (Criteria) this;
        }

        public Criteria andHkidIsNotNull() {
            addCriterion("hkid is not null");
            return (Criteria) this;
        }

        public Criteria andHkidEqualTo(Integer value) {
            addCriterion("hkid =", value, "hkid");
            return (Criteria) this;
        }

        public Criteria andHkidNotEqualTo(Integer value) {
            addCriterion("hkid <>", value, "hkid");
            return (Criteria) this;
        }

        public Criteria andHkidGreaterThan(Integer value) {
            addCriterion("hkid >", value, "hkid");
            return (Criteria) this;
        }

        public Criteria andHkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hkid >=", value, "hkid");
            return (Criteria) this;
        }

        public Criteria andHkidLessThan(Integer value) {
            addCriterion("hkid <", value, "hkid");
            return (Criteria) this;
        }

        public Criteria andHkidLessThanOrEqualTo(Integer value) {
            addCriterion("hkid <=", value, "hkid");
            return (Criteria) this;
        }

        public Criteria andHkidIn(List<Integer> values) {
            addCriterion("hkid in", values, "hkid");
            return (Criteria) this;
        }

        public Criteria andHkidNotIn(List<Integer> values) {
            addCriterion("hkid not in", values, "hkid");
            return (Criteria) this;
        }

        public Criteria andHkidBetween(Integer value1, Integer value2) {
            addCriterion("hkid between", value1, value2, "hkid");
            return (Criteria) this;
        }

        public Criteria andHkidNotBetween(Integer value1, Integer value2) {
            addCriterion("hkid not between", value1, value2, "hkid");
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

        public Criteria andHktitleIsNull() {
            addCriterion("hktitle is null");
            return (Criteria) this;
        }

        public Criteria andHktitleIsNotNull() {
            addCriterion("hktitle is not null");
            return (Criteria) this;
        }

        public Criteria andHktitleEqualTo(String value) {
            addCriterion("hktitle =", value, "hktitle");
            return (Criteria) this;
        }

        public Criteria andHktitleNotEqualTo(String value) {
            addCriterion("hktitle <>", value, "hktitle");
            return (Criteria) this;
        }

        public Criteria andHktitleGreaterThan(String value) {
            addCriterion("hktitle >", value, "hktitle");
            return (Criteria) this;
        }

        public Criteria andHktitleGreaterThanOrEqualTo(String value) {
            addCriterion("hktitle >=", value, "hktitle");
            return (Criteria) this;
        }

        public Criteria andHktitleLessThan(String value) {
            addCriterion("hktitle <", value, "hktitle");
            return (Criteria) this;
        }

        public Criteria andHktitleLessThanOrEqualTo(String value) {
            addCriterion("hktitle <=", value, "hktitle");
            return (Criteria) this;
        }

        public Criteria andHktitleLike(String value) {
            addCriterion("hktitle like", value, "hktitle");
            return (Criteria) this;
        }

        public Criteria andHktitleNotLike(String value) {
            addCriterion("hktitle not like", value, "hktitle");
            return (Criteria) this;
        }

        public Criteria andHktitleIn(List<String> values) {
            addCriterion("hktitle in", values, "hktitle");
            return (Criteria) this;
        }

        public Criteria andHktitleNotIn(List<String> values) {
            addCriterion("hktitle not in", values, "hktitle");
            return (Criteria) this;
        }

        public Criteria andHktitleBetween(String value1, String value2) {
            addCriterion("hktitle between", value1, value2, "hktitle");
            return (Criteria) this;
        }

        public Criteria andHktitleNotBetween(String value1, String value2) {
            addCriterion("hktitle not between", value1, value2, "hktitle");
            return (Criteria) this;
        }

        public Criteria andHkansIsNull() {
            addCriterion("hkans is null");
            return (Criteria) this;
        }

        public Criteria andHkansIsNotNull() {
            addCriterion("hkans is not null");
            return (Criteria) this;
        }

        public Criteria andHkansEqualTo(String value) {
            addCriterion("hkans =", value, "hkans");
            return (Criteria) this;
        }

        public Criteria andHkansNotEqualTo(String value) {
            addCriterion("hkans <>", value, "hkans");
            return (Criteria) this;
        }

        public Criteria andHkansGreaterThan(String value) {
            addCriterion("hkans >", value, "hkans");
            return (Criteria) this;
        }

        public Criteria andHkansGreaterThanOrEqualTo(String value) {
            addCriterion("hkans >=", value, "hkans");
            return (Criteria) this;
        }

        public Criteria andHkansLessThan(String value) {
            addCriterion("hkans <", value, "hkans");
            return (Criteria) this;
        }

        public Criteria andHkansLessThanOrEqualTo(String value) {
            addCriterion("hkans <=", value, "hkans");
            return (Criteria) this;
        }

        public Criteria andHkansLike(String value) {
            addCriterion("hkans like", value, "hkans");
            return (Criteria) this;
        }

        public Criteria andHkansNotLike(String value) {
            addCriterion("hkans not like", value, "hkans");
            return (Criteria) this;
        }

        public Criteria andHkansIn(List<String> values) {
            addCriterion("hkans in", values, "hkans");
            return (Criteria) this;
        }

        public Criteria andHkansNotIn(List<String> values) {
            addCriterion("hkans not in", values, "hkans");
            return (Criteria) this;
        }

        public Criteria andHkansBetween(String value1, String value2) {
            addCriterion("hkans between", value1, value2, "hkans");
            return (Criteria) this;
        }

        public Criteria andHkansNotBetween(String value1, String value2) {
            addCriterion("hkans not between", value1, value2, "hkans");
            return (Criteria) this;
        }

        public Criteria andHkdescbIsNull() {
            addCriterion("hkdescb is null");
            return (Criteria) this;
        }

        public Criteria andHkdescbIsNotNull() {
            addCriterion("hkdescb is not null");
            return (Criteria) this;
        }

        public Criteria andHkdescbEqualTo(String value) {
            addCriterion("hkdescb =", value, "hkdescb");
            return (Criteria) this;
        }

        public Criteria andHkdescbNotEqualTo(String value) {
            addCriterion("hkdescb <>", value, "hkdescb");
            return (Criteria) this;
        }

        public Criteria andHkdescbGreaterThan(String value) {
            addCriterion("hkdescb >", value, "hkdescb");
            return (Criteria) this;
        }

        public Criteria andHkdescbGreaterThanOrEqualTo(String value) {
            addCriterion("hkdescb >=", value, "hkdescb");
            return (Criteria) this;
        }

        public Criteria andHkdescbLessThan(String value) {
            addCriterion("hkdescb <", value, "hkdescb");
            return (Criteria) this;
        }

        public Criteria andHkdescbLessThanOrEqualTo(String value) {
            addCriterion("hkdescb <=", value, "hkdescb");
            return (Criteria) this;
        }

        public Criteria andHkdescbLike(String value) {
            addCriterion("hkdescb like", value, "hkdescb");
            return (Criteria) this;
        }

        public Criteria andHkdescbNotLike(String value) {
            addCriterion("hkdescb not like", value, "hkdescb");
            return (Criteria) this;
        }

        public Criteria andHkdescbIn(List<String> values) {
            addCriterion("hkdescb in", values, "hkdescb");
            return (Criteria) this;
        }

        public Criteria andHkdescbNotIn(List<String> values) {
            addCriterion("hkdescb not in", values, "hkdescb");
            return (Criteria) this;
        }

        public Criteria andHkdescbBetween(String value1, String value2) {
            addCriterion("hkdescb between", value1, value2, "hkdescb");
            return (Criteria) this;
        }

        public Criteria andHkdescbNotBetween(String value1, String value2) {
            addCriterion("hkdescb not between", value1, value2, "hkdescb");
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