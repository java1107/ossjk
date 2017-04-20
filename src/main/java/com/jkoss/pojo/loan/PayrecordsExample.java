package com.jkoss.pojo.loan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayrecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayrecordsExample() {
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

        public Criteria andPayRecordIDIsNull() {
            addCriterion("payRecordID is null");
            return (Criteria) this;
        }

        public Criteria andPayRecordIDIsNotNull() {
            addCriterion("payRecordID is not null");
            return (Criteria) this;
        }

        public Criteria andPayRecordIDEqualTo(Integer value) {
            addCriterion("payRecordID =", value, "payRecordID");
            return (Criteria) this;
        }

        public Criteria andPayRecordIDNotEqualTo(Integer value) {
            addCriterion("payRecordID <>", value, "payRecordID");
            return (Criteria) this;
        }

        public Criteria andPayRecordIDGreaterThan(Integer value) {
            addCriterion("payRecordID >", value, "payRecordID");
            return (Criteria) this;
        }

        public Criteria andPayRecordIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("payRecordID >=", value, "payRecordID");
            return (Criteria) this;
        }

        public Criteria andPayRecordIDLessThan(Integer value) {
            addCriterion("payRecordID <", value, "payRecordID");
            return (Criteria) this;
        }

        public Criteria andPayRecordIDLessThanOrEqualTo(Integer value) {
            addCriterion("payRecordID <=", value, "payRecordID");
            return (Criteria) this;
        }

        public Criteria andPayRecordIDIn(List<Integer> values) {
            addCriterion("payRecordID in", values, "payRecordID");
            return (Criteria) this;
        }

        public Criteria andPayRecordIDNotIn(List<Integer> values) {
            addCriterion("payRecordID not in", values, "payRecordID");
            return (Criteria) this;
        }

        public Criteria andPayRecordIDBetween(Integer value1, Integer value2) {
            addCriterion("payRecordID between", value1, value2, "payRecordID");
            return (Criteria) this;
        }

        public Criteria andPayRecordIDNotBetween(Integer value1, Integer value2) {
            addCriterion("payRecordID not between", value1, value2, "payRecordID");
            return (Criteria) this;
        }

        public Criteria andPayIDIsNull() {
            addCriterion("payID is null");
            return (Criteria) this;
        }

        public Criteria andPayIDIsNotNull() {
            addCriterion("payID is not null");
            return (Criteria) this;
        }

        public Criteria andPayIDEqualTo(Integer value) {
            addCriterion("payID =", value, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDNotEqualTo(Integer value) {
            addCriterion("payID <>", value, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDGreaterThan(Integer value) {
            addCriterion("payID >", value, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("payID >=", value, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDLessThan(Integer value) {
            addCriterion("payID <", value, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDLessThanOrEqualTo(Integer value) {
            addCriterion("payID <=", value, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDIn(List<Integer> values) {
            addCriterion("payID in", values, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDNotIn(List<Integer> values) {
            addCriterion("payID not in", values, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDBetween(Integer value1, Integer value2) {
            addCriterion("payID between", value1, value2, "payID");
            return (Criteria) this;
        }

        public Criteria andPayIDNotBetween(Integer value1, Integer value2) {
            addCriterion("payID not between", value1, value2, "payID");
            return (Criteria) this;
        }

        public Criteria andPayRcuntIsNull() {
            addCriterion("payRcunt is null");
            return (Criteria) this;
        }

        public Criteria andPayRcuntIsNotNull() {
            addCriterion("payRcunt is not null");
            return (Criteria) this;
        }

        public Criteria andPayRcuntEqualTo(String value) {
            addCriterion("payRcunt =", value, "payRcunt");
            return (Criteria) this;
        }

        public Criteria andPayRcuntNotEqualTo(String value) {
            addCriterion("payRcunt <>", value, "payRcunt");
            return (Criteria) this;
        }

        public Criteria andPayRcuntGreaterThan(String value) {
            addCriterion("payRcunt >", value, "payRcunt");
            return (Criteria) this;
        }

        public Criteria andPayRcuntGreaterThanOrEqualTo(String value) {
            addCriterion("payRcunt >=", value, "payRcunt");
            return (Criteria) this;
        }

        public Criteria andPayRcuntLessThan(String value) {
            addCriterion("payRcunt <", value, "payRcunt");
            return (Criteria) this;
        }

        public Criteria andPayRcuntLessThanOrEqualTo(String value) {
            addCriterion("payRcunt <=", value, "payRcunt");
            return (Criteria) this;
        }

        public Criteria andPayRcuntLike(String value) {
            addCriterion("payRcunt like", value, "payRcunt");
            return (Criteria) this;
        }

        public Criteria andPayRcuntNotLike(String value) {
            addCriterion("payRcunt not like", value, "payRcunt");
            return (Criteria) this;
        }

        public Criteria andPayRcuntIn(List<String> values) {
            addCriterion("payRcunt in", values, "payRcunt");
            return (Criteria) this;
        }

        public Criteria andPayRcuntNotIn(List<String> values) {
            addCriterion("payRcunt not in", values, "payRcunt");
            return (Criteria) this;
        }

        public Criteria andPayRcuntBetween(String value1, String value2) {
            addCriterion("payRcunt between", value1, value2, "payRcunt");
            return (Criteria) this;
        }

        public Criteria andPayRcuntNotBetween(String value1, String value2) {
            addCriterion("payRcunt not between", value1, value2, "payRcunt");
            return (Criteria) this;
        }

        public Criteria andPayRDateIsNull() {
            addCriterion("payRDate is null");
            return (Criteria) this;
        }

        public Criteria andPayRDateIsNotNull() {
            addCriterion("payRDate is not null");
            return (Criteria) this;
        }

        public Criteria andPayRDateEqualTo(Date value) {
            addCriterion("payRDate =", value, "payRDate");
            return (Criteria) this;
        }

        public Criteria andPayRDateNotEqualTo(Date value) {
            addCriterion("payRDate <>", value, "payRDate");
            return (Criteria) this;
        }

        public Criteria andPayRDateGreaterThan(Date value) {
            addCriterion("payRDate >", value, "payRDate");
            return (Criteria) this;
        }

        public Criteria andPayRDateGreaterThanOrEqualTo(Date value) {
            addCriterion("payRDate >=", value, "payRDate");
            return (Criteria) this;
        }

        public Criteria andPayRDateLessThan(Date value) {
            addCriterion("payRDate <", value, "payRDate");
            return (Criteria) this;
        }

        public Criteria andPayRDateLessThanOrEqualTo(Date value) {
            addCriterion("payRDate <=", value, "payRDate");
            return (Criteria) this;
        }

        public Criteria andPayRDateIn(List<Date> values) {
            addCriterion("payRDate in", values, "payRDate");
            return (Criteria) this;
        }

        public Criteria andPayRDateNotIn(List<Date> values) {
            addCriterion("payRDate not in", values, "payRDate");
            return (Criteria) this;
        }

        public Criteria andPayRDateBetween(Date value1, Date value2) {
            addCriterion("payRDate between", value1, value2, "payRDate");
            return (Criteria) this;
        }

        public Criteria andPayRDateNotBetween(Date value1, Date value2) {
            addCriterion("payRDate not between", value1, value2, "payRDate");
            return (Criteria) this;
        }

        public Criteria andPayRNumIsNull() {
            addCriterion("payRNum is null");
            return (Criteria) this;
        }

        public Criteria andPayRNumIsNotNull() {
            addCriterion("payRNum is not null");
            return (Criteria) this;
        }

        public Criteria andPayRNumEqualTo(Float value) {
            addCriterion("payRNum =", value, "payRNum");
            return (Criteria) this;
        }

        public Criteria andPayRNumNotEqualTo(Float value) {
            addCriterion("payRNum <>", value, "payRNum");
            return (Criteria) this;
        }

        public Criteria andPayRNumGreaterThan(Float value) {
            addCriterion("payRNum >", value, "payRNum");
            return (Criteria) this;
        }

        public Criteria andPayRNumGreaterThanOrEqualTo(Float value) {
            addCriterion("payRNum >=", value, "payRNum");
            return (Criteria) this;
        }

        public Criteria andPayRNumLessThan(Float value) {
            addCriterion("payRNum <", value, "payRNum");
            return (Criteria) this;
        }

        public Criteria andPayRNumLessThanOrEqualTo(Float value) {
            addCriterion("payRNum <=", value, "payRNum");
            return (Criteria) this;
        }

        public Criteria andPayRNumIn(List<Float> values) {
            addCriterion("payRNum in", values, "payRNum");
            return (Criteria) this;
        }

        public Criteria andPayRNumNotIn(List<Float> values) {
            addCriterion("payRNum not in", values, "payRNum");
            return (Criteria) this;
        }

        public Criteria andPayRNumBetween(Float value1, Float value2) {
            addCriterion("payRNum between", value1, value2, "payRNum");
            return (Criteria) this;
        }

        public Criteria andPayRNumNotBetween(Float value1, Float value2) {
            addCriterion("payRNum not between", value1, value2, "payRNum");
            return (Criteria) this;
        }

        public Criteria andPayRTypeIsNull() {
            addCriterion("payRType is null");
            return (Criteria) this;
        }

        public Criteria andPayRTypeIsNotNull() {
            addCriterion("payRType is not null");
            return (Criteria) this;
        }

        public Criteria andPayRTypeEqualTo(Integer value) {
            addCriterion("payRType =", value, "payRType");
            return (Criteria) this;
        }

        public Criteria andPayRTypeNotEqualTo(Integer value) {
            addCriterion("payRType <>", value, "payRType");
            return (Criteria) this;
        }

        public Criteria andPayRTypeGreaterThan(Integer value) {
            addCriterion("payRType >", value, "payRType");
            return (Criteria) this;
        }

        public Criteria andPayRTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payRType >=", value, "payRType");
            return (Criteria) this;
        }

        public Criteria andPayRTypeLessThan(Integer value) {
            addCriterion("payRType <", value, "payRType");
            return (Criteria) this;
        }

        public Criteria andPayRTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payRType <=", value, "payRType");
            return (Criteria) this;
        }

        public Criteria andPayRTypeIn(List<Integer> values) {
            addCriterion("payRType in", values, "payRType");
            return (Criteria) this;
        }

        public Criteria andPayRTypeNotIn(List<Integer> values) {
            addCriterion("payRType not in", values, "payRType");
            return (Criteria) this;
        }

        public Criteria andPayRTypeBetween(Integer value1, Integer value2) {
            addCriterion("payRType between", value1, value2, "payRType");
            return (Criteria) this;
        }

        public Criteria andPayRTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payRType not between", value1, value2, "payRType");
            return (Criteria) this;
        }

        public Criteria andPayRsjIsNull() {
            addCriterion("payRsj is null");
            return (Criteria) this;
        }

        public Criteria andPayRsjIsNotNull() {
            addCriterion("payRsj is not null");
            return (Criteria) this;
        }

        public Criteria andPayRsjEqualTo(String value) {
            addCriterion("payRsj =", value, "payRsj");
            return (Criteria) this;
        }

        public Criteria andPayRsjNotEqualTo(String value) {
            addCriterion("payRsj <>", value, "payRsj");
            return (Criteria) this;
        }

        public Criteria andPayRsjGreaterThan(String value) {
            addCriterion("payRsj >", value, "payRsj");
            return (Criteria) this;
        }

        public Criteria andPayRsjGreaterThanOrEqualTo(String value) {
            addCriterion("payRsj >=", value, "payRsj");
            return (Criteria) this;
        }

        public Criteria andPayRsjLessThan(String value) {
            addCriterion("payRsj <", value, "payRsj");
            return (Criteria) this;
        }

        public Criteria andPayRsjLessThanOrEqualTo(String value) {
            addCriterion("payRsj <=", value, "payRsj");
            return (Criteria) this;
        }

        public Criteria andPayRsjLike(String value) {
            addCriterion("payRsj like", value, "payRsj");
            return (Criteria) this;
        }

        public Criteria andPayRsjNotLike(String value) {
            addCriterion("payRsj not like", value, "payRsj");
            return (Criteria) this;
        }

        public Criteria andPayRsjIn(List<String> values) {
            addCriterion("payRsj in", values, "payRsj");
            return (Criteria) this;
        }

        public Criteria andPayRsjNotIn(List<String> values) {
            addCriterion("payRsj not in", values, "payRsj");
            return (Criteria) this;
        }

        public Criteria andPayRsjBetween(String value1, String value2) {
            addCriterion("payRsj between", value1, value2, "payRsj");
            return (Criteria) this;
        }

        public Criteria andPayRsjNotBetween(String value1, String value2) {
            addCriterion("payRsj not between", value1, value2, "payRsj");
            return (Criteria) this;
        }

        public Criteria andPayRdescIsNull() {
            addCriterion("payRdesc is null");
            return (Criteria) this;
        }

        public Criteria andPayRdescIsNotNull() {
            addCriterion("payRdesc is not null");
            return (Criteria) this;
        }

        public Criteria andPayRdescEqualTo(String value) {
            addCriterion("payRdesc =", value, "payRdesc");
            return (Criteria) this;
        }

        public Criteria andPayRdescNotEqualTo(String value) {
            addCriterion("payRdesc <>", value, "payRdesc");
            return (Criteria) this;
        }

        public Criteria andPayRdescGreaterThan(String value) {
            addCriterion("payRdesc >", value, "payRdesc");
            return (Criteria) this;
        }

        public Criteria andPayRdescGreaterThanOrEqualTo(String value) {
            addCriterion("payRdesc >=", value, "payRdesc");
            return (Criteria) this;
        }

        public Criteria andPayRdescLessThan(String value) {
            addCriterion("payRdesc <", value, "payRdesc");
            return (Criteria) this;
        }

        public Criteria andPayRdescLessThanOrEqualTo(String value) {
            addCriterion("payRdesc <=", value, "payRdesc");
            return (Criteria) this;
        }

        public Criteria andPayRdescLike(String value) {
            addCriterion("payRdesc like", value, "payRdesc");
            return (Criteria) this;
        }

        public Criteria andPayRdescNotLike(String value) {
            addCriterion("payRdesc not like", value, "payRdesc");
            return (Criteria) this;
        }

        public Criteria andPayRdescIn(List<String> values) {
            addCriterion("payRdesc in", values, "payRdesc");
            return (Criteria) this;
        }

        public Criteria andPayRdescNotIn(List<String> values) {
            addCriterion("payRdesc not in", values, "payRdesc");
            return (Criteria) this;
        }

        public Criteria andPayRdescBetween(String value1, String value2) {
            addCriterion("payRdesc between", value1, value2, "payRdesc");
            return (Criteria) this;
        }

        public Criteria andPayRdescNotBetween(String value1, String value2) {
            addCriterion("payRdesc not between", value1, value2, "payRdesc");
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