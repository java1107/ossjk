package com.jkoss.pojo.oa;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReimsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_reims
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_reims
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_reims
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reims
     *
     * @mbggenerated
     */
    public ReimsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reims
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reims
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reims
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reims
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reims
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reims
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reims
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
     * This method corresponds to the database table t_reims
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
     * This method corresponds to the database table t_reims
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reims
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
     * This class corresponds to the database table t_reims
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRiemidIsNull() {
            addCriterion("riemid is null");
            return (Criteria) this;
        }

        public Criteria andRiemidIsNotNull() {
            addCriterion("riemid is not null");
            return (Criteria) this;
        }

        public Criteria andRiemidEqualTo(Integer value) {
            addCriterion("riemid =", value, "riemid");
            return (Criteria) this;
        }

        public Criteria andRiemidNotEqualTo(Integer value) {
            addCriterion("riemid <>", value, "riemid");
            return (Criteria) this;
        }

        public Criteria andRiemidGreaterThan(Integer value) {
            addCriterion("riemid >", value, "riemid");
            return (Criteria) this;
        }

        public Criteria andRiemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("riemid >=", value, "riemid");
            return (Criteria) this;
        }

        public Criteria andRiemidLessThan(Integer value) {
            addCriterion("riemid <", value, "riemid");
            return (Criteria) this;
        }

        public Criteria andRiemidLessThanOrEqualTo(Integer value) {
            addCriterion("riemid <=", value, "riemid");
            return (Criteria) this;
        }

        public Criteria andRiemidIn(List<Integer> values) {
            addCriterion("riemid in", values, "riemid");
            return (Criteria) this;
        }

        public Criteria andRiemidNotIn(List<Integer> values) {
            addCriterion("riemid not in", values, "riemid");
            return (Criteria) this;
        }

        public Criteria andRiemidBetween(Integer value1, Integer value2) {
            addCriterion("riemid between", value1, value2, "riemid");
            return (Criteria) this;
        }

        public Criteria andRiemidNotBetween(Integer value1, Integer value2) {
            addCriterion("riemid not between", value1, value2, "riemid");
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

        public Criteria andRiemnameIsNull() {
            addCriterion("riemname is null");
            return (Criteria) this;
        }

        public Criteria andRiemnameIsNotNull() {
            addCriterion("riemname is not null");
            return (Criteria) this;
        }

        public Criteria andRiemnameEqualTo(String value) {
            addCriterion("riemname =", value, "riemname");
            return (Criteria) this;
        }

        public Criteria andRiemnameNotEqualTo(String value) {
            addCriterion("riemname <>", value, "riemname");
            return (Criteria) this;
        }

        public Criteria andRiemnameGreaterThan(String value) {
            addCriterion("riemname >", value, "riemname");
            return (Criteria) this;
        }

        public Criteria andRiemnameGreaterThanOrEqualTo(String value) {
            addCriterion("riemname >=", value, "riemname");
            return (Criteria) this;
        }

        public Criteria andRiemnameLessThan(String value) {
            addCriterion("riemname <", value, "riemname");
            return (Criteria) this;
        }

        public Criteria andRiemnameLessThanOrEqualTo(String value) {
            addCriterion("riemname <=", value, "riemname");
            return (Criteria) this;
        }

        public Criteria andRiemnameLike(String value) {
            addCriterion("riemname like", value, "riemname");
            return (Criteria) this;
        }

        public Criteria andRiemnameNotLike(String value) {
            addCriterion("riemname not like", value, "riemname");
            return (Criteria) this;
        }

        public Criteria andRiemnameIn(List<String> values) {
            addCriterion("riemname in", values, "riemname");
            return (Criteria) this;
        }

        public Criteria andRiemnameNotIn(List<String> values) {
            addCriterion("riemname not in", values, "riemname");
            return (Criteria) this;
        }

        public Criteria andRiemnameBetween(String value1, String value2) {
            addCriterion("riemname between", value1, value2, "riemname");
            return (Criteria) this;
        }

        public Criteria andRiemnameNotBetween(String value1, String value2) {
            addCriterion("riemname not between", value1, value2, "riemname");
            return (Criteria) this;
        }

        public Criteria andRiemresonIsNull() {
            addCriterion("riemreson is null");
            return (Criteria) this;
        }

        public Criteria andRiemresonIsNotNull() {
            addCriterion("riemreson is not null");
            return (Criteria) this;
        }

        public Criteria andRiemresonEqualTo(String value) {
            addCriterion("riemreson =", value, "riemreson");
            return (Criteria) this;
        }

        public Criteria andRiemresonNotEqualTo(String value) {
            addCriterion("riemreson <>", value, "riemreson");
            return (Criteria) this;
        }

        public Criteria andRiemresonGreaterThan(String value) {
            addCriterion("riemreson >", value, "riemreson");
            return (Criteria) this;
        }

        public Criteria andRiemresonGreaterThanOrEqualTo(String value) {
            addCriterion("riemreson >=", value, "riemreson");
            return (Criteria) this;
        }

        public Criteria andRiemresonLessThan(String value) {
            addCriterion("riemreson <", value, "riemreson");
            return (Criteria) this;
        }

        public Criteria andRiemresonLessThanOrEqualTo(String value) {
            addCriterion("riemreson <=", value, "riemreson");
            return (Criteria) this;
        }

        public Criteria andRiemresonLike(String value) {
            addCriterion("riemreson like", value, "riemreson");
            return (Criteria) this;
        }

        public Criteria andRiemresonNotLike(String value) {
            addCriterion("riemreson not like", value, "riemreson");
            return (Criteria) this;
        }

        public Criteria andRiemresonIn(List<String> values) {
            addCriterion("riemreson in", values, "riemreson");
            return (Criteria) this;
        }

        public Criteria andRiemresonNotIn(List<String> values) {
            addCriterion("riemreson not in", values, "riemreson");
            return (Criteria) this;
        }

        public Criteria andRiemresonBetween(String value1, String value2) {
            addCriterion("riemreson between", value1, value2, "riemreson");
            return (Criteria) this;
        }

        public Criteria andRiemresonNotBetween(String value1, String value2) {
            addCriterion("riemreson not between", value1, value2, "riemreson");
            return (Criteria) this;
        }

        public Criteria andRiemdescIsNull() {
            addCriterion("riemdesc is null");
            return (Criteria) this;
        }

        public Criteria andRiemdescIsNotNull() {
            addCriterion("riemdesc is not null");
            return (Criteria) this;
        }

        public Criteria andRiemdescEqualTo(String value) {
            addCriterion("riemdesc =", value, "riemdesc");
            return (Criteria) this;
        }

        public Criteria andRiemdescNotEqualTo(String value) {
            addCriterion("riemdesc <>", value, "riemdesc");
            return (Criteria) this;
        }

        public Criteria andRiemdescGreaterThan(String value) {
            addCriterion("riemdesc >", value, "riemdesc");
            return (Criteria) this;
        }

        public Criteria andRiemdescGreaterThanOrEqualTo(String value) {
            addCriterion("riemdesc >=", value, "riemdesc");
            return (Criteria) this;
        }

        public Criteria andRiemdescLessThan(String value) {
            addCriterion("riemdesc <", value, "riemdesc");
            return (Criteria) this;
        }

        public Criteria andRiemdescLessThanOrEqualTo(String value) {
            addCriterion("riemdesc <=", value, "riemdesc");
            return (Criteria) this;
        }

        public Criteria andRiemdescLike(String value) {
            addCriterion("riemdesc like", value, "riemdesc");
            return (Criteria) this;
        }

        public Criteria andRiemdescNotLike(String value) {
            addCriterion("riemdesc not like", value, "riemdesc");
            return (Criteria) this;
        }

        public Criteria andRiemdescIn(List<String> values) {
            addCriterion("riemdesc in", values, "riemdesc");
            return (Criteria) this;
        }

        public Criteria andRiemdescNotIn(List<String> values) {
            addCriterion("riemdesc not in", values, "riemdesc");
            return (Criteria) this;
        }

        public Criteria andRiemdescBetween(String value1, String value2) {
            addCriterion("riemdesc between", value1, value2, "riemdesc");
            return (Criteria) this;
        }

        public Criteria andRiemdescNotBetween(String value1, String value2) {
            addCriterion("riemdesc not between", value1, value2, "riemdesc");
            return (Criteria) this;
        }

        public Criteria andRiemsqdateIsNull() {
            addCriterion("riemsqdate is null");
            return (Criteria) this;
        }

        public Criteria andRiemsqdateIsNotNull() {
            addCriterion("riemsqdate is not null");
            return (Criteria) this;
        }

        public Criteria andRiemsqdateEqualTo(Date value) {
            addCriterion("riemsqdate =", value, "riemsqdate");
            return (Criteria) this;
        }

        public Criteria andRiemsqdateNotEqualTo(Date value) {
            addCriterion("riemsqdate <>", value, "riemsqdate");
            return (Criteria) this;
        }

        public Criteria andRiemsqdateGreaterThan(Date value) {
            addCriterion("riemsqdate >", value, "riemsqdate");
            return (Criteria) this;
        }

        public Criteria andRiemsqdateGreaterThanOrEqualTo(Date value) {
            addCriterion("riemsqdate >=", value, "riemsqdate");
            return (Criteria) this;
        }

        public Criteria andRiemsqdateLessThan(Date value) {
            addCriterion("riemsqdate <", value, "riemsqdate");
            return (Criteria) this;
        }

        public Criteria andRiemsqdateLessThanOrEqualTo(Date value) {
            addCriterion("riemsqdate <=", value, "riemsqdate");
            return (Criteria) this;
        }

        public Criteria andRiemsqdateIn(List<Date> values) {
            addCriterion("riemsqdate in", values, "riemsqdate");
            return (Criteria) this;
        }

        public Criteria andRiemsqdateNotIn(List<Date> values) {
            addCriterion("riemsqdate not in", values, "riemsqdate");
            return (Criteria) this;
        }

        public Criteria andRiemsqdateBetween(Date value1, Date value2) {
            addCriterion("riemsqdate between", value1, value2, "riemsqdate");
            return (Criteria) this;
        }

        public Criteria andRiemsqdateNotBetween(Date value1, Date value2) {
            addCriterion("riemsqdate not between", value1, value2, "riemsqdate");
            return (Criteria) this;
        }

        public Criteria andRiemdateIsNull() {
            addCriterion("riemdate is null");
            return (Criteria) this;
        }

        public Criteria andRiemdateIsNotNull() {
            addCriterion("riemdate is not null");
            return (Criteria) this;
        }

        public Criteria andRiemdateEqualTo(Date value) {
            addCriterionForJDBCDate("riemdate =", value, "riemdate");
            return (Criteria) this;
        }

        public Criteria andRiemdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("riemdate <>", value, "riemdate");
            return (Criteria) this;
        }

        public Criteria andRiemdateGreaterThan(Date value) {
            addCriterionForJDBCDate("riemdate >", value, "riemdate");
            return (Criteria) this;
        }

        public Criteria andRiemdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("riemdate >=", value, "riemdate");
            return (Criteria) this;
        }

        public Criteria andRiemdateLessThan(Date value) {
            addCriterionForJDBCDate("riemdate <", value, "riemdate");
            return (Criteria) this;
        }

        public Criteria andRiemdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("riemdate <=", value, "riemdate");
            return (Criteria) this;
        }

        public Criteria andRiemdateIn(List<Date> values) {
            addCriterionForJDBCDate("riemdate in", values, "riemdate");
            return (Criteria) this;
        }

        public Criteria andRiemdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("riemdate not in", values, "riemdate");
            return (Criteria) this;
        }

        public Criteria andRiemdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("riemdate between", value1, value2, "riemdate");
            return (Criteria) this;
        }

        public Criteria andRiemdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("riemdate not between", value1, value2, "riemdate");
            return (Criteria) this;
        }

        public Criteria andRiemstateIsNull() {
            addCriterion("riemstate is null");
            return (Criteria) this;
        }

        public Criteria andRiemstateIsNotNull() {
            addCriterion("riemstate is not null");
            return (Criteria) this;
        }

        public Criteria andRiemstateEqualTo(Integer value) {
            addCriterion("riemstate =", value, "riemstate");
            return (Criteria) this;
        }

        public Criteria andRiemstateNotEqualTo(Integer value) {
            addCriterion("riemstate <>", value, "riemstate");
            return (Criteria) this;
        }

        public Criteria andRiemstateGreaterThan(Integer value) {
            addCriterion("riemstate >", value, "riemstate");
            return (Criteria) this;
        }

        public Criteria andRiemstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("riemstate >=", value, "riemstate");
            return (Criteria) this;
        }

        public Criteria andRiemstateLessThan(Integer value) {
            addCriterion("riemstate <", value, "riemstate");
            return (Criteria) this;
        }

        public Criteria andRiemstateLessThanOrEqualTo(Integer value) {
            addCriterion("riemstate <=", value, "riemstate");
            return (Criteria) this;
        }

        public Criteria andRiemstateIn(List<Integer> values) {
            addCriterion("riemstate in", values, "riemstate");
            return (Criteria) this;
        }

        public Criteria andRiemstateNotIn(List<Integer> values) {
            addCriterion("riemstate not in", values, "riemstate");
            return (Criteria) this;
        }

        public Criteria andRiemstateBetween(Integer value1, Integer value2) {
            addCriterion("riemstate between", value1, value2, "riemstate");
            return (Criteria) this;
        }

        public Criteria andRiemstateNotBetween(Integer value1, Integer value2) {
            addCriterion("riemstate not between", value1, value2, "riemstate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_reims
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
     * This class corresponds to the database table t_reims
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