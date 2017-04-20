package com.jkoss.pojo.stu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateExample() {
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

        public Criteria andEvidIsNull() {
            addCriterion("evid is null");
            return (Criteria) this;
        }

        public Criteria andEvidIsNotNull() {
            addCriterion("evid is not null");
            return (Criteria) this;
        }

        public Criteria andEvidEqualTo(Integer value) {
            addCriterion("evid =", value, "evid");
            return (Criteria) this;
        }

        public Criteria andEvidNotEqualTo(Integer value) {
            addCriterion("evid <>", value, "evid");
            return (Criteria) this;
        }

        public Criteria andEvidGreaterThan(Integer value) {
            addCriterion("evid >", value, "evid");
            return (Criteria) this;
        }

        public Criteria andEvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("evid >=", value, "evid");
            return (Criteria) this;
        }

        public Criteria andEvidLessThan(Integer value) {
            addCriterion("evid <", value, "evid");
            return (Criteria) this;
        }

        public Criteria andEvidLessThanOrEqualTo(Integer value) {
            addCriterion("evid <=", value, "evid");
            return (Criteria) this;
        }

        public Criteria andEvidIn(List<Integer> values) {
            addCriterion("evid in", values, "evid");
            return (Criteria) this;
        }

        public Criteria andEvidNotIn(List<Integer> values) {
            addCriterion("evid not in", values, "evid");
            return (Criteria) this;
        }

        public Criteria andEvidBetween(Integer value1, Integer value2) {
            addCriterion("evid between", value1, value2, "evid");
            return (Criteria) this;
        }

        public Criteria andEvidNotBetween(Integer value1, Integer value2) {
            addCriterion("evid not between", value1, value2, "evid");
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

        public Criteria andEvdateIsNull() {
            addCriterion("evdate is null");
            return (Criteria) this;
        }

        public Criteria andEvdateIsNotNull() {
            addCriterion("evdate is not null");
            return (Criteria) this;
        }

        public Criteria andEvdateEqualTo(Date value) {
            addCriterion("evdate =", value, "evdate");
            return (Criteria) this;
        }

        public Criteria andEvdateNotEqualTo(Date value) {
            addCriterion("evdate <>", value, "evdate");
            return (Criteria) this;
        }

        public Criteria andEvdateGreaterThan(Date value) {
            addCriterion("evdate >", value, "evdate");
            return (Criteria) this;
        }

        public Criteria andEvdateGreaterThanOrEqualTo(Date value) {
            addCriterion("evdate >=", value, "evdate");
            return (Criteria) this;
        }

        public Criteria andEvdateLessThan(Date value) {
            addCriterion("evdate <", value, "evdate");
            return (Criteria) this;
        }

        public Criteria andEvdateLessThanOrEqualTo(Date value) {
            addCriterion("evdate <=", value, "evdate");
            return (Criteria) this;
        }

        public Criteria andEvdateIn(List<Date> values) {
            addCriterion("evdate in", values, "evdate");
            return (Criteria) this;
        }

        public Criteria andEvdateNotIn(List<Date> values) {
            addCriterion("evdate not in", values, "evdate");
            return (Criteria) this;
        }

        public Criteria andEvdateBetween(Date value1, Date value2) {
            addCriterion("evdate between", value1, value2, "evdate");
            return (Criteria) this;
        }

        public Criteria andEvdateNotBetween(Date value1, Date value2) {
            addCriterion("evdate not between", value1, value2, "evdate");
            return (Criteria) this;
        }

        public Criteria andEvcontentIsNull() {
            addCriterion("evcontent is null");
            return (Criteria) this;
        }

        public Criteria andEvcontentIsNotNull() {
            addCriterion("evcontent is not null");
            return (Criteria) this;
        }

        public Criteria andEvcontentEqualTo(String value) {
            addCriterion("evcontent =", value, "evcontent");
            return (Criteria) this;
        }

        public Criteria andEvcontentNotEqualTo(String value) {
            addCriterion("evcontent <>", value, "evcontent");
            return (Criteria) this;
        }

        public Criteria andEvcontentGreaterThan(String value) {
            addCriterion("evcontent >", value, "evcontent");
            return (Criteria) this;
        }

        public Criteria andEvcontentGreaterThanOrEqualTo(String value) {
            addCriterion("evcontent >=", value, "evcontent");
            return (Criteria) this;
        }

        public Criteria andEvcontentLessThan(String value) {
            addCriterion("evcontent <", value, "evcontent");
            return (Criteria) this;
        }

        public Criteria andEvcontentLessThanOrEqualTo(String value) {
            addCriterion("evcontent <=", value, "evcontent");
            return (Criteria) this;
        }

        public Criteria andEvcontentLike(String value) {
            addCriterion("evcontent like", value, "evcontent");
            return (Criteria) this;
        }

        public Criteria andEvcontentNotLike(String value) {
            addCriterion("evcontent not like", value, "evcontent");
            return (Criteria) this;
        }

        public Criteria andEvcontentIn(List<String> values) {
            addCriterion("evcontent in", values, "evcontent");
            return (Criteria) this;
        }

        public Criteria andEvcontentNotIn(List<String> values) {
            addCriterion("evcontent not in", values, "evcontent");
            return (Criteria) this;
        }

        public Criteria andEvcontentBetween(String value1, String value2) {
            addCriterion("evcontent between", value1, value2, "evcontent");
            return (Criteria) this;
        }

        public Criteria andEvcontentNotBetween(String value1, String value2) {
            addCriterion("evcontent not between", value1, value2, "evcontent");
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