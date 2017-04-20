package com.jkoss.pojo.zx;

import java.util.ArrayList;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolExample() {
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

        public Criteria andSchoolIDIsNull() {
            addCriterion("schoolID is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIDIsNotNull() {
            addCriterion("schoolID is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIDEqualTo(Integer value) {
            addCriterion("schoolID =", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDNotEqualTo(Integer value) {
            addCriterion("schoolID <>", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDGreaterThan(Integer value) {
            addCriterion("schoolID >", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolID >=", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDLessThan(Integer value) {
            addCriterion("schoolID <", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDLessThanOrEqualTo(Integer value) {
            addCriterion("schoolID <=", value, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDIn(List<Integer> values) {
            addCriterion("schoolID in", values, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDNotIn(List<Integer> values) {
            addCriterion("schoolID not in", values, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDBetween(Integer value1, Integer value2) {
            addCriterion("schoolID between", value1, value2, "schoolID");
            return (Criteria) this;
        }

        public Criteria andSchoolIDNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolID not between", value1, value2, "schoolID");
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

        public Criteria andSchoolsfIsNull() {
            addCriterion("schoolsf is null");
            return (Criteria) this;
        }

        public Criteria andSchoolsfIsNotNull() {
            addCriterion("schoolsf is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolsfEqualTo(String value) {
            addCriterion("schoolsf =", value, "schoolsf");
            return (Criteria) this;
        }

        public Criteria andSchoolsfNotEqualTo(String value) {
            addCriterion("schoolsf <>", value, "schoolsf");
            return (Criteria) this;
        }

        public Criteria andSchoolsfGreaterThan(String value) {
            addCriterion("schoolsf >", value, "schoolsf");
            return (Criteria) this;
        }

        public Criteria andSchoolsfGreaterThanOrEqualTo(String value) {
            addCriterion("schoolsf >=", value, "schoolsf");
            return (Criteria) this;
        }

        public Criteria andSchoolsfLessThan(String value) {
            addCriterion("schoolsf <", value, "schoolsf");
            return (Criteria) this;
        }

        public Criteria andSchoolsfLessThanOrEqualTo(String value) {
            addCriterion("schoolsf <=", value, "schoolsf");
            return (Criteria) this;
        }

        public Criteria andSchoolsfLike(String value) {
            addCriterion("schoolsf like", value, "schoolsf");
            return (Criteria) this;
        }

        public Criteria andSchoolsfNotLike(String value) {
            addCriterion("schoolsf not like", value, "schoolsf");
            return (Criteria) this;
        }

        public Criteria andSchoolsfIn(List<String> values) {
            addCriterion("schoolsf in", values, "schoolsf");
            return (Criteria) this;
        }

        public Criteria andSchoolsfNotIn(List<String> values) {
            addCriterion("schoolsf not in", values, "schoolsf");
            return (Criteria) this;
        }

        public Criteria andSchoolsfBetween(String value1, String value2) {
            addCriterion("schoolsf between", value1, value2, "schoolsf");
            return (Criteria) this;
        }

        public Criteria andSchoolsfNotBetween(String value1, String value2) {
            addCriterion("schoolsf not between", value1, value2, "schoolsf");
            return (Criteria) this;
        }

        public Criteria andSkcityIsNull() {
            addCriterion("skcity is null");
            return (Criteria) this;
        }

        public Criteria andSkcityIsNotNull() {
            addCriterion("skcity is not null");
            return (Criteria) this;
        }

        public Criteria andSkcityEqualTo(String value) {
            addCriterion("skcity =", value, "skcity");
            return (Criteria) this;
        }

        public Criteria andSkcityNotEqualTo(String value) {
            addCriterion("skcity <>", value, "skcity");
            return (Criteria) this;
        }

        public Criteria andSkcityGreaterThan(String value) {
            addCriterion("skcity >", value, "skcity");
            return (Criteria) this;
        }

        public Criteria andSkcityGreaterThanOrEqualTo(String value) {
            addCriterion("skcity >=", value, "skcity");
            return (Criteria) this;
        }

        public Criteria andSkcityLessThan(String value) {
            addCriterion("skcity <", value, "skcity");
            return (Criteria) this;
        }

        public Criteria andSkcityLessThanOrEqualTo(String value) {
            addCriterion("skcity <=", value, "skcity");
            return (Criteria) this;
        }

        public Criteria andSkcityLike(String value) {
            addCriterion("skcity like", value, "skcity");
            return (Criteria) this;
        }

        public Criteria andSkcityNotLike(String value) {
            addCriterion("skcity not like", value, "skcity");
            return (Criteria) this;
        }

        public Criteria andSkcityIn(List<String> values) {
            addCriterion("skcity in", values, "skcity");
            return (Criteria) this;
        }

        public Criteria andSkcityNotIn(List<String> values) {
            addCriterion("skcity not in", values, "skcity");
            return (Criteria) this;
        }

        public Criteria andSkcityBetween(String value1, String value2) {
            addCriterion("skcity between", value1, value2, "skcity");
            return (Criteria) this;
        }

        public Criteria andSkcityNotBetween(String value1, String value2) {
            addCriterion("skcity not between", value1, value2, "skcity");
            return (Criteria) this;
        }

        public Criteria andSknameIsNull() {
            addCriterion("skname is null");
            return (Criteria) this;
        }

        public Criteria andSknameIsNotNull() {
            addCriterion("skname is not null");
            return (Criteria) this;
        }

        public Criteria andSknameEqualTo(String value) {
            addCriterion("skname =", value, "skname");
            return (Criteria) this;
        }

        public Criteria andSknameNotEqualTo(String value) {
            addCriterion("skname <>", value, "skname");
            return (Criteria) this;
        }

        public Criteria andSknameGreaterThan(String value) {
            addCriterion("skname >", value, "skname");
            return (Criteria) this;
        }

        public Criteria andSknameGreaterThanOrEqualTo(String value) {
            addCriterion("skname >=", value, "skname");
            return (Criteria) this;
        }

        public Criteria andSknameLessThan(String value) {
            addCriterion("skname <", value, "skname");
            return (Criteria) this;
        }

        public Criteria andSknameLessThanOrEqualTo(String value) {
            addCriterion("skname <=", value, "skname");
            return (Criteria) this;
        }

        public Criteria andSknameLike(String value) {
            addCriterion("skname like", value, "skname");
            return (Criteria) this;
        }

        public Criteria andSknameNotLike(String value) {
            addCriterion("skname not like", value, "skname");
            return (Criteria) this;
        }

        public Criteria andSknameIn(List<String> values) {
            addCriterion("skname in", values, "skname");
            return (Criteria) this;
        }

        public Criteria andSknameNotIn(List<String> values) {
            addCriterion("skname not in", values, "skname");
            return (Criteria) this;
        }

        public Criteria andSknameBetween(String value1, String value2) {
            addCriterion("skname between", value1, value2, "skname");
            return (Criteria) this;
        }

        public Criteria andSknameNotBetween(String value1, String value2) {
            addCriterion("skname not between", value1, value2, "skname");
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