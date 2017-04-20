package com.jkoss.pojo.oa;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_department
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_department
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_department
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated
     */
    public DepartmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_department
     *
     * @mbggenerated
     */
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

        public Criteria andDepIDIsNull() {
            addCriterion("depID is null");
            return (Criteria) this;
        }

        public Criteria andDepIDIsNotNull() {
            addCriterion("depID is not null");
            return (Criteria) this;
        }

        public Criteria andDepIDEqualTo(Integer value) {
            addCriterion("depID =", value, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDNotEqualTo(Integer value) {
            addCriterion("depID <>", value, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDGreaterThan(Integer value) {
            addCriterion("depID >", value, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("depID >=", value, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDLessThan(Integer value) {
            addCriterion("depID <", value, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDLessThanOrEqualTo(Integer value) {
            addCriterion("depID <=", value, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDIn(List<Integer> values) {
            addCriterion("depID in", values, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDNotIn(List<Integer> values) {
            addCriterion("depID not in", values, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDBetween(Integer value1, Integer value2) {
            addCriterion("depID between", value1, value2, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDNotBetween(Integer value1, Integer value2) {
            addCriterion("depID not between", value1, value2, "depID");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNull() {
            addCriterion("depname is null");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNotNull() {
            addCriterion("depname is not null");
            return (Criteria) this;
        }

        public Criteria andDepnameEqualTo(String value) {
            addCriterion("depname =", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotEqualTo(String value) {
            addCriterion("depname <>", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThan(String value) {
            addCriterion("depname >", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThanOrEqualTo(String value) {
            addCriterion("depname >=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThan(String value) {
            addCriterion("depname <", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThanOrEqualTo(String value) {
            addCriterion("depname <=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLike(String value) {
            addCriterion("depname like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotLike(String value) {
            addCriterion("depname not like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameIn(List<String> values) {
            addCriterion("depname in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotIn(List<String> values) {
            addCriterion("depname not in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameBetween(String value1, String value2) {
            addCriterion("depname between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotBetween(String value1, String value2) {
            addCriterion("depname not between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andDnoteIsNull() {
            addCriterion("dnote is null");
            return (Criteria) this;
        }

        public Criteria andDnoteIsNotNull() {
            addCriterion("dnote is not null");
            return (Criteria) this;
        }

        public Criteria andDnoteEqualTo(String value) {
            addCriterion("dnote =", value, "dnote");
            return (Criteria) this;
        }

        public Criteria andDnoteNotEqualTo(String value) {
            addCriterion("dnote <>", value, "dnote");
            return (Criteria) this;
        }

        public Criteria andDnoteGreaterThan(String value) {
            addCriterion("dnote >", value, "dnote");
            return (Criteria) this;
        }

        public Criteria andDnoteGreaterThanOrEqualTo(String value) {
            addCriterion("dnote >=", value, "dnote");
            return (Criteria) this;
        }

        public Criteria andDnoteLessThan(String value) {
            addCriterion("dnote <", value, "dnote");
            return (Criteria) this;
        }

        public Criteria andDnoteLessThanOrEqualTo(String value) {
            addCriterion("dnote <=", value, "dnote");
            return (Criteria) this;
        }

        public Criteria andDnoteLike(String value) {
            addCriterion("dnote like", value, "dnote");
            return (Criteria) this;
        }

        public Criteria andDnoteNotLike(String value) {
            addCriterion("dnote not like", value, "dnote");
            return (Criteria) this;
        }

        public Criteria andDnoteIn(List<String> values) {
            addCriterion("dnote in", values, "dnote");
            return (Criteria) this;
        }

        public Criteria andDnoteNotIn(List<String> values) {
            addCriterion("dnote not in", values, "dnote");
            return (Criteria) this;
        }

        public Criteria andDnoteBetween(String value1, String value2) {
            addCriterion("dnote between", value1, value2, "dnote");
            return (Criteria) this;
        }

        public Criteria andDnoteNotBetween(String value1, String value2) {
            addCriterion("dnote not between", value1, value2, "dnote");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_department
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_department
     *
     * @mbggenerated
     */
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