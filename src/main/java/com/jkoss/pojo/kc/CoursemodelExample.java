package com.jkoss.pojo.kc;

import java.util.ArrayList;
import java.util.List;

public class CoursemodelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoursemodelExample() {
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

        public Criteria andKcmdelNameIsNull() {
            addCriterion("kcmdelName is null");
            return (Criteria) this;
        }

        public Criteria andKcmdelNameIsNotNull() {
            addCriterion("kcmdelName is not null");
            return (Criteria) this;
        }

        public Criteria andKcmdelNameEqualTo(String value) {
            addCriterion("kcmdelName =", value, "kcmdelName");
            return (Criteria) this;
        }

        public Criteria andKcmdelNameNotEqualTo(String value) {
            addCriterion("kcmdelName <>", value, "kcmdelName");
            return (Criteria) this;
        }

        public Criteria andKcmdelNameGreaterThan(String value) {
            addCriterion("kcmdelName >", value, "kcmdelName");
            return (Criteria) this;
        }

        public Criteria andKcmdelNameGreaterThanOrEqualTo(String value) {
            addCriterion("kcmdelName >=", value, "kcmdelName");
            return (Criteria) this;
        }

        public Criteria andKcmdelNameLessThan(String value) {
            addCriterion("kcmdelName <", value, "kcmdelName");
            return (Criteria) this;
        }

        public Criteria andKcmdelNameLessThanOrEqualTo(String value) {
            addCriterion("kcmdelName <=", value, "kcmdelName");
            return (Criteria) this;
        }

        public Criteria andKcmdelNameLike(String value) {
            addCriterion("kcmdelName like", value, "kcmdelName");
            return (Criteria) this;
        }

        public Criteria andKcmdelNameNotLike(String value) {
            addCriterion("kcmdelName not like", value, "kcmdelName");
            return (Criteria) this;
        }

        public Criteria andKcmdelNameIn(List<String> values) {
            addCriterion("kcmdelName in", values, "kcmdelName");
            return (Criteria) this;
        }

        public Criteria andKcmdelNameNotIn(List<String> values) {
            addCriterion("kcmdelName not in", values, "kcmdelName");
            return (Criteria) this;
        }

        public Criteria andKcmdelNameBetween(String value1, String value2) {
            addCriterion("kcmdelName between", value1, value2, "kcmdelName");
            return (Criteria) this;
        }

        public Criteria andKcmdelNameNotBetween(String value1, String value2) {
            addCriterion("kcmdelName not between", value1, value2, "kcmdelName");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescIsNull() {
            addCriterion("kcmdelDesc is null");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescIsNotNull() {
            addCriterion("kcmdelDesc is not null");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescEqualTo(String value) {
            addCriterion("kcmdelDesc =", value, "kcmdelDesc");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescNotEqualTo(String value) {
            addCriterion("kcmdelDesc <>", value, "kcmdelDesc");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescGreaterThan(String value) {
            addCriterion("kcmdelDesc >", value, "kcmdelDesc");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescGreaterThanOrEqualTo(String value) {
            addCriterion("kcmdelDesc >=", value, "kcmdelDesc");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescLessThan(String value) {
            addCriterion("kcmdelDesc <", value, "kcmdelDesc");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescLessThanOrEqualTo(String value) {
            addCriterion("kcmdelDesc <=", value, "kcmdelDesc");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescLike(String value) {
            addCriterion("kcmdelDesc like", value, "kcmdelDesc");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescNotLike(String value) {
            addCriterion("kcmdelDesc not like", value, "kcmdelDesc");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescIn(List<String> values) {
            addCriterion("kcmdelDesc in", values, "kcmdelDesc");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescNotIn(List<String> values) {
            addCriterion("kcmdelDesc not in", values, "kcmdelDesc");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescBetween(String value1, String value2) {
            addCriterion("kcmdelDesc between", value1, value2, "kcmdelDesc");
            return (Criteria) this;
        }

        public Criteria andKcmdelDescNotBetween(String value1, String value2) {
            addCriterion("kcmdelDesc not between", value1, value2, "kcmdelDesc");
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