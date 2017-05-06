package com.jkoss.pojo.oa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpfilesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpfilesExample() {
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

        public Criteria andFjidIsNull() {
            addCriterion("fjid is null");
            return (Criteria) this;
        }

        public Criteria andFjidIsNotNull() {
            addCriterion("fjid is not null");
            return (Criteria) this;
        }

        public Criteria andFjidEqualTo(Integer value) {
            addCriterion("fjid =", value, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidNotEqualTo(Integer value) {
            addCriterion("fjid <>", value, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidGreaterThan(Integer value) {
            addCriterion("fjid >", value, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fjid >=", value, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidLessThan(Integer value) {
            addCriterion("fjid <", value, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidLessThanOrEqualTo(Integer value) {
            addCriterion("fjid <=", value, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidIn(List<Integer> values) {
            addCriterion("fjid in", values, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidNotIn(List<Integer> values) {
            addCriterion("fjid not in", values, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidBetween(Integer value1, Integer value2) {
            addCriterion("fjid between", value1, value2, "fjid");
            return (Criteria) this;
        }

        public Criteria andFjidNotBetween(Integer value1, Integer value2) {
            addCriterion("fjid not between", value1, value2, "fjid");
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

        public Criteria andT_e_eidIsNull() {
            addCriterion("t_e_eid is null");
            return (Criteria) this;
        }

        public Criteria andT_e_eidIsNotNull() {
            addCriterion("t_e_eid is not null");
            return (Criteria) this;
        }

        public Criteria andT_e_eidEqualTo(Integer value) {
            addCriterion("t_e_eid =", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidNotEqualTo(Integer value) {
            addCriterion("t_e_eid <>", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidGreaterThan(Integer value) {
            addCriterion("t_e_eid >", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_e_eid >=", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidLessThan(Integer value) {
            addCriterion("t_e_eid <", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidLessThanOrEqualTo(Integer value) {
            addCriterion("t_e_eid <=", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidIn(List<Integer> values) {
            addCriterion("t_e_eid in", values, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidNotIn(List<Integer> values) {
            addCriterion("t_e_eid not in", values, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidBetween(Integer value1, Integer value2) {
            addCriterion("t_e_eid between", value1, value2, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidNotBetween(Integer value1, Integer value2) {
            addCriterion("t_e_eid not between", value1, value2, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andFjnameIsNull() {
            addCriterion("fjname is null");
            return (Criteria) this;
        }

        public Criteria andFjnameIsNotNull() {
            addCriterion("fjname is not null");
            return (Criteria) this;
        }

        public Criteria andFjnameEqualTo(String value) {
            addCriterion("fjname =", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotEqualTo(String value) {
            addCriterion("fjname <>", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameGreaterThan(String value) {
            addCriterion("fjname >", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameGreaterThanOrEqualTo(String value) {
            addCriterion("fjname >=", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLessThan(String value) {
            addCriterion("fjname <", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLessThanOrEqualTo(String value) {
            addCriterion("fjname <=", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameLike(String value) {
            addCriterion("fjname like", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotLike(String value) {
            addCriterion("fjname not like", value, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameIn(List<String> values) {
            addCriterion("fjname in", values, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotIn(List<String> values) {
            addCriterion("fjname not in", values, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameBetween(String value1, String value2) {
            addCriterion("fjname between", value1, value2, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjnameNotBetween(String value1, String value2) {
            addCriterion("fjname not between", value1, value2, "fjname");
            return (Criteria) this;
        }

        public Criteria andFjaddsIsNull() {
            addCriterion("fjadds is null");
            return (Criteria) this;
        }

        public Criteria andFjaddsIsNotNull() {
            addCriterion("fjadds is not null");
            return (Criteria) this;
        }

        public Criteria andFjaddsEqualTo(String value) {
            addCriterion("fjadds =", value, "fjadds");
            return (Criteria) this;
        }

        public Criteria andFjaddsNotEqualTo(String value) {
            addCriterion("fjadds <>", value, "fjadds");
            return (Criteria) this;
        }

        public Criteria andFjaddsGreaterThan(String value) {
            addCriterion("fjadds >", value, "fjadds");
            return (Criteria) this;
        }

        public Criteria andFjaddsGreaterThanOrEqualTo(String value) {
            addCriterion("fjadds >=", value, "fjadds");
            return (Criteria) this;
        }

        public Criteria andFjaddsLessThan(String value) {
            addCriterion("fjadds <", value, "fjadds");
            return (Criteria) this;
        }

        public Criteria andFjaddsLessThanOrEqualTo(String value) {
            addCriterion("fjadds <=", value, "fjadds");
            return (Criteria) this;
        }

        public Criteria andFjaddsLike(String value) {
            addCriterion("fjadds like", value, "fjadds");
            return (Criteria) this;
        }

        public Criteria andFjaddsNotLike(String value) {
            addCriterion("fjadds not like", value, "fjadds");
            return (Criteria) this;
        }

        public Criteria andFjaddsIn(List<String> values) {
            addCriterion("fjadds in", values, "fjadds");
            return (Criteria) this;
        }

        public Criteria andFjaddsNotIn(List<String> values) {
            addCriterion("fjadds not in", values, "fjadds");
            return (Criteria) this;
        }

        public Criteria andFjaddsBetween(String value1, String value2) {
            addCriterion("fjadds between", value1, value2, "fjadds");
            return (Criteria) this;
        }

        public Criteria andFjaddsNotBetween(String value1, String value2) {
            addCriterion("fjadds not between", value1, value2, "fjadds");
            return (Criteria) this;
        }

        public Criteria andFjuploaddateIsNull() {
            addCriterion("fjuploaddate is null");
            return (Criteria) this;
        }

        public Criteria andFjuploaddateIsNotNull() {
            addCriterion("fjuploaddate is not null");
            return (Criteria) this;
        }

        public Criteria andFjuploaddateEqualTo(Date value) {
            addCriterion("fjuploaddate =", value, "fjuploaddate");
            return (Criteria) this;
        }

        public Criteria andFjuploaddateNotEqualTo(Date value) {
            addCriterion("fjuploaddate <>", value, "fjuploaddate");
            return (Criteria) this;
        }

        public Criteria andFjuploaddateGreaterThan(Date value) {
            addCriterion("fjuploaddate >", value, "fjuploaddate");
            return (Criteria) this;
        }

        public Criteria andFjuploaddateGreaterThanOrEqualTo(Date value) {
            addCriterion("fjuploaddate >=", value, "fjuploaddate");
            return (Criteria) this;
        }

        public Criteria andFjuploaddateLessThan(Date value) {
            addCriterion("fjuploaddate <", value, "fjuploaddate");
            return (Criteria) this;
        }

        public Criteria andFjuploaddateLessThanOrEqualTo(Date value) {
            addCriterion("fjuploaddate <=", value, "fjuploaddate");
            return (Criteria) this;
        }

        public Criteria andFjuploaddateIn(List<Date> values) {
            addCriterion("fjuploaddate in", values, "fjuploaddate");
            return (Criteria) this;
        }

        public Criteria andFjuploaddateNotIn(List<Date> values) {
            addCriterion("fjuploaddate not in", values, "fjuploaddate");
            return (Criteria) this;
        }

        public Criteria andFjuploaddateBetween(Date value1, Date value2) {
            addCriterion("fjuploaddate between", value1, value2, "fjuploaddate");
            return (Criteria) this;
        }

        public Criteria andFjuploaddateNotBetween(Date value1, Date value2) {
            addCriterion("fjuploaddate not between", value1, value2, "fjuploaddate");
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