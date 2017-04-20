package com.jkoss.pojo.stu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassesExample() {
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

        public Criteria andClznameIsNull() {
            addCriterion("clzname is null");
            return (Criteria) this;
        }

        public Criteria andClznameIsNotNull() {
            addCriterion("clzname is not null");
            return (Criteria) this;
        }

        public Criteria andClznameEqualTo(String value) {
            addCriterion("clzname =", value, "clzname");
            return (Criteria) this;
        }

        public Criteria andClznameNotEqualTo(String value) {
            addCriterion("clzname <>", value, "clzname");
            return (Criteria) this;
        }

        public Criteria andClznameGreaterThan(String value) {
            addCriterion("clzname >", value, "clzname");
            return (Criteria) this;
        }

        public Criteria andClznameGreaterThanOrEqualTo(String value) {
            addCriterion("clzname >=", value, "clzname");
            return (Criteria) this;
        }

        public Criteria andClznameLessThan(String value) {
            addCriterion("clzname <", value, "clzname");
            return (Criteria) this;
        }

        public Criteria andClznameLessThanOrEqualTo(String value) {
            addCriterion("clzname <=", value, "clzname");
            return (Criteria) this;
        }

        public Criteria andClznameLike(String value) {
            addCriterion("clzname like", value, "clzname");
            return (Criteria) this;
        }

        public Criteria andClznameNotLike(String value) {
            addCriterion("clzname not like", value, "clzname");
            return (Criteria) this;
        }

        public Criteria andClznameIn(List<String> values) {
            addCriterion("clzname in", values, "clzname");
            return (Criteria) this;
        }

        public Criteria andClznameNotIn(List<String> values) {
            addCriterion("clzname not in", values, "clzname");
            return (Criteria) this;
        }

        public Criteria andClznameBetween(String value1, String value2) {
            addCriterion("clzname between", value1, value2, "clzname");
            return (Criteria) this;
        }

        public Criteria andClznameNotBetween(String value1, String value2) {
            addCriterion("clzname not between", value1, value2, "clzname");
            return (Criteria) this;
        }

        public Criteria andClzprccIsNull() {
            addCriterion("clzprcc is null");
            return (Criteria) this;
        }

        public Criteria andClzprccIsNotNull() {
            addCriterion("clzprcc is not null");
            return (Criteria) this;
        }

        public Criteria andClzprccEqualTo(Integer value) {
            addCriterion("clzprcc =", value, "clzprcc");
            return (Criteria) this;
        }

        public Criteria andClzprccNotEqualTo(Integer value) {
            addCriterion("clzprcc <>", value, "clzprcc");
            return (Criteria) this;
        }

        public Criteria andClzprccGreaterThan(Integer value) {
            addCriterion("clzprcc >", value, "clzprcc");
            return (Criteria) this;
        }

        public Criteria andClzprccGreaterThanOrEqualTo(Integer value) {
            addCriterion("clzprcc >=", value, "clzprcc");
            return (Criteria) this;
        }

        public Criteria andClzprccLessThan(Integer value) {
            addCriterion("clzprcc <", value, "clzprcc");
            return (Criteria) this;
        }

        public Criteria andClzprccLessThanOrEqualTo(Integer value) {
            addCriterion("clzprcc <=", value, "clzprcc");
            return (Criteria) this;
        }

        public Criteria andClzprccIn(List<Integer> values) {
            addCriterion("clzprcc in", values, "clzprcc");
            return (Criteria) this;
        }

        public Criteria andClzprccNotIn(List<Integer> values) {
            addCriterion("clzprcc not in", values, "clzprcc");
            return (Criteria) this;
        }

        public Criteria andClzprccBetween(Integer value1, Integer value2) {
            addCriterion("clzprcc between", value1, value2, "clzprcc");
            return (Criteria) this;
        }

        public Criteria andClzprccNotBetween(Integer value1, Integer value2) {
            addCriterion("clzprcc not between", value1, value2, "clzprcc");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNull() {
            addCriterion("opentime is null");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNotNull() {
            addCriterion("opentime is not null");
            return (Criteria) this;
        }

        public Criteria andOpentimeEqualTo(Date value) {
            addCriterion("opentime =", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotEqualTo(Date value) {
            addCriterion("opentime <>", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThan(Date value) {
            addCriterion("opentime >", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opentime >=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThan(Date value) {
            addCriterion("opentime <", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThanOrEqualTo(Date value) {
            addCriterion("opentime <=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeIn(List<Date> values) {
            addCriterion("opentime in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotIn(List<Date> values) {
            addCriterion("opentime not in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeBetween(Date value1, Date value2) {
            addCriterion("opentime between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotBetween(Date value1, Date value2) {
            addCriterion("opentime not between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andGrddateIsNull() {
            addCriterion("grddate is null");
            return (Criteria) this;
        }

        public Criteria andGrddateIsNotNull() {
            addCriterion("grddate is not null");
            return (Criteria) this;
        }

        public Criteria andGrddateEqualTo(Date value) {
            addCriterion("grddate =", value, "grddate");
            return (Criteria) this;
        }

        public Criteria andGrddateNotEqualTo(Date value) {
            addCriterion("grddate <>", value, "grddate");
            return (Criteria) this;
        }

        public Criteria andGrddateGreaterThan(Date value) {
            addCriterion("grddate >", value, "grddate");
            return (Criteria) this;
        }

        public Criteria andGrddateGreaterThanOrEqualTo(Date value) {
            addCriterion("grddate >=", value, "grddate");
            return (Criteria) this;
        }

        public Criteria andGrddateLessThan(Date value) {
            addCriterion("grddate <", value, "grddate");
            return (Criteria) this;
        }

        public Criteria andGrddateLessThanOrEqualTo(Date value) {
            addCriterion("grddate <=", value, "grddate");
            return (Criteria) this;
        }

        public Criteria andGrddateIn(List<Date> values) {
            addCriterion("grddate in", values, "grddate");
            return (Criteria) this;
        }

        public Criteria andGrddateNotIn(List<Date> values) {
            addCriterion("grddate not in", values, "grddate");
            return (Criteria) this;
        }

        public Criteria andGrddateBetween(Date value1, Date value2) {
            addCriterion("grddate between", value1, value2, "grddate");
            return (Criteria) this;
        }

        public Criteria andGrddateNotBetween(Date value1, Date value2) {
            addCriterion("grddate not between", value1, value2, "grddate");
            return (Criteria) this;
        }

        public Criteria andClzdescIsNull() {
            addCriterion("clzdesc is null");
            return (Criteria) this;
        }

        public Criteria andClzdescIsNotNull() {
            addCriterion("clzdesc is not null");
            return (Criteria) this;
        }

        public Criteria andClzdescEqualTo(String value) {
            addCriterion("clzdesc =", value, "clzdesc");
            return (Criteria) this;
        }

        public Criteria andClzdescNotEqualTo(String value) {
            addCriterion("clzdesc <>", value, "clzdesc");
            return (Criteria) this;
        }

        public Criteria andClzdescGreaterThan(String value) {
            addCriterion("clzdesc >", value, "clzdesc");
            return (Criteria) this;
        }

        public Criteria andClzdescGreaterThanOrEqualTo(String value) {
            addCriterion("clzdesc >=", value, "clzdesc");
            return (Criteria) this;
        }

        public Criteria andClzdescLessThan(String value) {
            addCriterion("clzdesc <", value, "clzdesc");
            return (Criteria) this;
        }

        public Criteria andClzdescLessThanOrEqualTo(String value) {
            addCriterion("clzdesc <=", value, "clzdesc");
            return (Criteria) this;
        }

        public Criteria andClzdescLike(String value) {
            addCriterion("clzdesc like", value, "clzdesc");
            return (Criteria) this;
        }

        public Criteria andClzdescNotLike(String value) {
            addCriterion("clzdesc not like", value, "clzdesc");
            return (Criteria) this;
        }

        public Criteria andClzdescIn(List<String> values) {
            addCriterion("clzdesc in", values, "clzdesc");
            return (Criteria) this;
        }

        public Criteria andClzdescNotIn(List<String> values) {
            addCriterion("clzdesc not in", values, "clzdesc");
            return (Criteria) this;
        }

        public Criteria andClzdescBetween(String value1, String value2) {
            addCriterion("clzdesc between", value1, value2, "clzdesc");
            return (Criteria) this;
        }

        public Criteria andClzdescNotBetween(String value1, String value2) {
            addCriterion("clzdesc not between", value1, value2, "clzdesc");
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