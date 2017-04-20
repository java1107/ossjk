package com.jkoss.pojo.sys;

import java.util.ArrayList;
import java.util.List;

public class SysrightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysrightExample() {
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

        public Criteria andRtidIsNull() {
            addCriterion("rtid is null");
            return (Criteria) this;
        }

        public Criteria andRtidIsNotNull() {
            addCriterion("rtid is not null");
            return (Criteria) this;
        }

        public Criteria andRtidEqualTo(Integer value) {
            addCriterion("rtid =", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidNotEqualTo(Integer value) {
            addCriterion("rtid <>", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidGreaterThan(Integer value) {
            addCriterion("rtid >", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rtid >=", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidLessThan(Integer value) {
            addCriterion("rtid <", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidLessThanOrEqualTo(Integer value) {
            addCriterion("rtid <=", value, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidIn(List<Integer> values) {
            addCriterion("rtid in", values, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidNotIn(List<Integer> values) {
            addCriterion("rtid not in", values, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidBetween(Integer value1, Integer value2) {
            addCriterion("rtid between", value1, value2, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtidNotBetween(Integer value1, Integer value2) {
            addCriterion("rtid not between", value1, value2, "rtid");
            return (Criteria) this;
        }

        public Criteria andRtnameIsNull() {
            addCriterion("rtname is null");
            return (Criteria) this;
        }

        public Criteria andRtnameIsNotNull() {
            addCriterion("rtname is not null");
            return (Criteria) this;
        }

        public Criteria andRtnameEqualTo(String value) {
            addCriterion("rtname =", value, "rtname");
            return (Criteria) this;
        }

        public Criteria andRtnameNotEqualTo(String value) {
            addCriterion("rtname <>", value, "rtname");
            return (Criteria) this;
        }

        public Criteria andRtnameGreaterThan(String value) {
            addCriterion("rtname >", value, "rtname");
            return (Criteria) this;
        }

        public Criteria andRtnameGreaterThanOrEqualTo(String value) {
            addCriterion("rtname >=", value, "rtname");
            return (Criteria) this;
        }

        public Criteria andRtnameLessThan(String value) {
            addCriterion("rtname <", value, "rtname");
            return (Criteria) this;
        }

        public Criteria andRtnameLessThanOrEqualTo(String value) {
            addCriterion("rtname <=", value, "rtname");
            return (Criteria) this;
        }

        public Criteria andRtnameLike(String value) {
            addCriterion("rtname like", value, "rtname");
            return (Criteria) this;
        }

        public Criteria andRtnameNotLike(String value) {
            addCriterion("rtname not like", value, "rtname");
            return (Criteria) this;
        }

        public Criteria andRtnameIn(List<String> values) {
            addCriterion("rtname in", values, "rtname");
            return (Criteria) this;
        }

        public Criteria andRtnameNotIn(List<String> values) {
            addCriterion("rtname not in", values, "rtname");
            return (Criteria) this;
        }

        public Criteria andRtnameBetween(String value1, String value2) {
            addCriterion("rtname between", value1, value2, "rtname");
            return (Criteria) this;
        }

        public Criteria andRtnameNotBetween(String value1, String value2) {
            addCriterion("rtname not between", value1, value2, "rtname");
            return (Criteria) this;
        }

        public Criteria andRtdescIsNull() {
            addCriterion("rtdesc is null");
            return (Criteria) this;
        }

        public Criteria andRtdescIsNotNull() {
            addCriterion("rtdesc is not null");
            return (Criteria) this;
        }

        public Criteria andRtdescEqualTo(String value) {
            addCriterion("rtdesc =", value, "rtdesc");
            return (Criteria) this;
        }

        public Criteria andRtdescNotEqualTo(String value) {
            addCriterion("rtdesc <>", value, "rtdesc");
            return (Criteria) this;
        }

        public Criteria andRtdescGreaterThan(String value) {
            addCriterion("rtdesc >", value, "rtdesc");
            return (Criteria) this;
        }

        public Criteria andRtdescGreaterThanOrEqualTo(String value) {
            addCriterion("rtdesc >=", value, "rtdesc");
            return (Criteria) this;
        }

        public Criteria andRtdescLessThan(String value) {
            addCriterion("rtdesc <", value, "rtdesc");
            return (Criteria) this;
        }

        public Criteria andRtdescLessThanOrEqualTo(String value) {
            addCriterion("rtdesc <=", value, "rtdesc");
            return (Criteria) this;
        }

        public Criteria andRtdescLike(String value) {
            addCriterion("rtdesc like", value, "rtdesc");
            return (Criteria) this;
        }

        public Criteria andRtdescNotLike(String value) {
            addCriterion("rtdesc not like", value, "rtdesc");
            return (Criteria) this;
        }

        public Criteria andRtdescIn(List<String> values) {
            addCriterion("rtdesc in", values, "rtdesc");
            return (Criteria) this;
        }

        public Criteria andRtdescNotIn(List<String> values) {
            addCriterion("rtdesc not in", values, "rtdesc");
            return (Criteria) this;
        }

        public Criteria andRtdescBetween(String value1, String value2) {
            addCriterion("rtdesc between", value1, value2, "rtdesc");
            return (Criteria) this;
        }

        public Criteria andRtdescNotBetween(String value1, String value2) {
            addCriterion("rtdesc not between", value1, value2, "rtdesc");
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