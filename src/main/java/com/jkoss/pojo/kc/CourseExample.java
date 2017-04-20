package com.jkoss.pojo.kc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andKcidIsNull() {
            addCriterion("kcid is null");
            return (Criteria) this;
        }

        public Criteria andKcidIsNotNull() {
            addCriterion("kcid is not null");
            return (Criteria) this;
        }

        public Criteria andKcidEqualTo(Integer value) {
            addCriterion("kcid =", value, "kcid");
            return (Criteria) this;
        }

        public Criteria andKcidNotEqualTo(Integer value) {
            addCriterion("kcid <>", value, "kcid");
            return (Criteria) this;
        }

        public Criteria andKcidGreaterThan(Integer value) {
            addCriterion("kcid >", value, "kcid");
            return (Criteria) this;
        }

        public Criteria andKcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kcid >=", value, "kcid");
            return (Criteria) this;
        }

        public Criteria andKcidLessThan(Integer value) {
            addCriterion("kcid <", value, "kcid");
            return (Criteria) this;
        }

        public Criteria andKcidLessThanOrEqualTo(Integer value) {
            addCriterion("kcid <=", value, "kcid");
            return (Criteria) this;
        }

        public Criteria andKcidIn(List<Integer> values) {
            addCriterion("kcid in", values, "kcid");
            return (Criteria) this;
        }

        public Criteria andKcidNotIn(List<Integer> values) {
            addCriterion("kcid not in", values, "kcid");
            return (Criteria) this;
        }

        public Criteria andKcidBetween(Integer value1, Integer value2) {
            addCriterion("kcid between", value1, value2, "kcid");
            return (Criteria) this;
        }

        public Criteria andKcidNotBetween(Integer value1, Integer value2) {
            addCriterion("kcid not between", value1, value2, "kcid");
            return (Criteria) this;
        }

        public Criteria andKcnameIsNull() {
            addCriterion("kcname is null");
            return (Criteria) this;
        }

        public Criteria andKcnameIsNotNull() {
            addCriterion("kcname is not null");
            return (Criteria) this;
        }

        public Criteria andKcnameEqualTo(String value) {
            addCriterion("kcname =", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameNotEqualTo(String value) {
            addCriterion("kcname <>", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameGreaterThan(String value) {
            addCriterion("kcname >", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameGreaterThanOrEqualTo(String value) {
            addCriterion("kcname >=", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameLessThan(String value) {
            addCriterion("kcname <", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameLessThanOrEqualTo(String value) {
            addCriterion("kcname <=", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameLike(String value) {
            addCriterion("kcname like", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameNotLike(String value) {
            addCriterion("kcname not like", value, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameIn(List<String> values) {
            addCriterion("kcname in", values, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameNotIn(List<String> values) {
            addCriterion("kcname not in", values, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameBetween(String value1, String value2) {
            addCriterion("kcname between", value1, value2, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcnameNotBetween(String value1, String value2) {
            addCriterion("kcname not between", value1, value2, "kcname");
            return (Criteria) this;
        }

        public Criteria andKcdateIsNull() {
            addCriterion("kcdate is null");
            return (Criteria) this;
        }

        public Criteria andKcdateIsNotNull() {
            addCriterion("kcdate is not null");
            return (Criteria) this;
        }

        public Criteria andKcdateEqualTo(Date value) {
            addCriterion("kcdate =", value, "kcdate");
            return (Criteria) this;
        }

        public Criteria andKcdateNotEqualTo(Date value) {
            addCriterion("kcdate <>", value, "kcdate");
            return (Criteria) this;
        }

        public Criteria andKcdateGreaterThan(Date value) {
            addCriterion("kcdate >", value, "kcdate");
            return (Criteria) this;
        }

        public Criteria andKcdateGreaterThanOrEqualTo(Date value) {
            addCriterion("kcdate >=", value, "kcdate");
            return (Criteria) this;
        }

        public Criteria andKcdateLessThan(Date value) {
            addCriterion("kcdate <", value, "kcdate");
            return (Criteria) this;
        }

        public Criteria andKcdateLessThanOrEqualTo(Date value) {
            addCriterion("kcdate <=", value, "kcdate");
            return (Criteria) this;
        }

        public Criteria andKcdateIn(List<Date> values) {
            addCriterion("kcdate in", values, "kcdate");
            return (Criteria) this;
        }

        public Criteria andKcdateNotIn(List<Date> values) {
            addCriterion("kcdate not in", values, "kcdate");
            return (Criteria) this;
        }

        public Criteria andKcdateBetween(Date value1, Date value2) {
            addCriterion("kcdate between", value1, value2, "kcdate");
            return (Criteria) this;
        }

        public Criteria andKcdateNotBetween(Date value1, Date value2) {
            addCriterion("kcdate not between", value1, value2, "kcdate");
            return (Criteria) this;
        }

        public Criteria andKcdescIsNull() {
            addCriterion("kcdesc is null");
            return (Criteria) this;
        }

        public Criteria andKcdescIsNotNull() {
            addCriterion("kcdesc is not null");
            return (Criteria) this;
        }

        public Criteria andKcdescEqualTo(String value) {
            addCriterion("kcdesc =", value, "kcdesc");
            return (Criteria) this;
        }

        public Criteria andKcdescNotEqualTo(String value) {
            addCriterion("kcdesc <>", value, "kcdesc");
            return (Criteria) this;
        }

        public Criteria andKcdescGreaterThan(String value) {
            addCriterion("kcdesc >", value, "kcdesc");
            return (Criteria) this;
        }

        public Criteria andKcdescGreaterThanOrEqualTo(String value) {
            addCriterion("kcdesc >=", value, "kcdesc");
            return (Criteria) this;
        }

        public Criteria andKcdescLessThan(String value) {
            addCriterion("kcdesc <", value, "kcdesc");
            return (Criteria) this;
        }

        public Criteria andKcdescLessThanOrEqualTo(String value) {
            addCriterion("kcdesc <=", value, "kcdesc");
            return (Criteria) this;
        }

        public Criteria andKcdescLike(String value) {
            addCriterion("kcdesc like", value, "kcdesc");
            return (Criteria) this;
        }

        public Criteria andKcdescNotLike(String value) {
            addCriterion("kcdesc not like", value, "kcdesc");
            return (Criteria) this;
        }

        public Criteria andKcdescIn(List<String> values) {
            addCriterion("kcdesc in", values, "kcdesc");
            return (Criteria) this;
        }

        public Criteria andKcdescNotIn(List<String> values) {
            addCriterion("kcdesc not in", values, "kcdesc");
            return (Criteria) this;
        }

        public Criteria andKcdescBetween(String value1, String value2) {
            addCriterion("kcdesc between", value1, value2, "kcdesc");
            return (Criteria) this;
        }

        public Criteria andKcdescNotBetween(String value1, String value2) {
            addCriterion("kcdesc not between", value1, value2, "kcdesc");
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