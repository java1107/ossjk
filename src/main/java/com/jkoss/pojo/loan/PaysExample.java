package com.jkoss.pojo.loan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaysExample() {
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

        public Criteria andFanIDIsNull() {
            addCriterion("fanID is null");
            return (Criteria) this;
        }

        public Criteria andFanIDIsNotNull() {
            addCriterion("fanID is not null");
            return (Criteria) this;
        }

        public Criteria andFanIDEqualTo(Integer value) {
            addCriterion("fanID =", value, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDNotEqualTo(Integer value) {
            addCriterion("fanID <>", value, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDGreaterThan(Integer value) {
            addCriterion("fanID >", value, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("fanID >=", value, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDLessThan(Integer value) {
            addCriterion("fanID <", value, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDLessThanOrEqualTo(Integer value) {
            addCriterion("fanID <=", value, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDIn(List<Integer> values) {
            addCriterion("fanID in", values, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDNotIn(List<Integer> values) {
            addCriterion("fanID not in", values, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDBetween(Integer value1, Integer value2) {
            addCriterion("fanID between", value1, value2, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDNotBetween(Integer value1, Integer value2) {
            addCriterion("fanID not between", value1, value2, "fanID");
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

        public Criteria andPayDateIsNull() {
            addCriterion("payDate is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("payDate is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterion("payDate =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterion("payDate <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterion("payDate >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("payDate >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterion("payDate <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterion("payDate <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterion("payDate in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterion("payDate not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterion("payDate between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterion("payDate not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andAllneedpayIsNull() {
            addCriterion("allneedpay is null");
            return (Criteria) this;
        }

        public Criteria andAllneedpayIsNotNull() {
            addCriterion("allneedpay is not null");
            return (Criteria) this;
        }

        public Criteria andAllneedpayEqualTo(Integer value) {
            addCriterion("allneedpay =", value, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayNotEqualTo(Integer value) {
            addCriterion("allneedpay <>", value, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayGreaterThan(Integer value) {
            addCriterion("allneedpay >", value, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayGreaterThanOrEqualTo(Integer value) {
            addCriterion("allneedpay >=", value, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayLessThan(Integer value) {
            addCriterion("allneedpay <", value, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayLessThanOrEqualTo(Integer value) {
            addCriterion("allneedpay <=", value, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayIn(List<Integer> values) {
            addCriterion("allneedpay in", values, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayNotIn(List<Integer> values) {
            addCriterion("allneedpay not in", values, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayBetween(Integer value1, Integer value2) {
            addCriterion("allneedpay between", value1, value2, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andAllneedpayNotBetween(Integer value1, Integer value2) {
            addCriterion("allneedpay not between", value1, value2, "allneedpay");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("payType =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("payType <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("payType >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payType >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("payType <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payType <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("payType in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("payType not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("payType between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payType not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayDescIsNull() {
            addCriterion("payDesc is null");
            return (Criteria) this;
        }

        public Criteria andPayDescIsNotNull() {
            addCriterion("payDesc is not null");
            return (Criteria) this;
        }

        public Criteria andPayDescEqualTo(String value) {
            addCriterion("payDesc =", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescNotEqualTo(String value) {
            addCriterion("payDesc <>", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescGreaterThan(String value) {
            addCriterion("payDesc >", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescGreaterThanOrEqualTo(String value) {
            addCriterion("payDesc >=", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescLessThan(String value) {
            addCriterion("payDesc <", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescLessThanOrEqualTo(String value) {
            addCriterion("payDesc <=", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescLike(String value) {
            addCriterion("payDesc like", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescNotLike(String value) {
            addCriterion("payDesc not like", value, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescIn(List<String> values) {
            addCriterion("payDesc in", values, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescNotIn(List<String> values) {
            addCriterion("payDesc not in", values, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescBetween(String value1, String value2) {
            addCriterion("payDesc between", value1, value2, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayDescNotBetween(String value1, String value2) {
            addCriterion("payDesc not between", value1, value2, "payDesc");
            return (Criteria) this;
        }

        public Criteria andPayotherIsNull() {
            addCriterion("payother is null");
            return (Criteria) this;
        }

        public Criteria andPayotherIsNotNull() {
            addCriterion("payother is not null");
            return (Criteria) this;
        }

        public Criteria andPayotherEqualTo(String value) {
            addCriterion("payother =", value, "payother");
            return (Criteria) this;
        }

        public Criteria andPayotherNotEqualTo(String value) {
            addCriterion("payother <>", value, "payother");
            return (Criteria) this;
        }

        public Criteria andPayotherGreaterThan(String value) {
            addCriterion("payother >", value, "payother");
            return (Criteria) this;
        }

        public Criteria andPayotherGreaterThanOrEqualTo(String value) {
            addCriterion("payother >=", value, "payother");
            return (Criteria) this;
        }

        public Criteria andPayotherLessThan(String value) {
            addCriterion("payother <", value, "payother");
            return (Criteria) this;
        }

        public Criteria andPayotherLessThanOrEqualTo(String value) {
            addCriterion("payother <=", value, "payother");
            return (Criteria) this;
        }

        public Criteria andPayotherLike(String value) {
            addCriterion("payother like", value, "payother");
            return (Criteria) this;
        }

        public Criteria andPayotherNotLike(String value) {
            addCriterion("payother not like", value, "payother");
            return (Criteria) this;
        }

        public Criteria andPayotherIn(List<String> values) {
            addCriterion("payother in", values, "payother");
            return (Criteria) this;
        }

        public Criteria andPayotherNotIn(List<String> values) {
            addCriterion("payother not in", values, "payother");
            return (Criteria) this;
        }

        public Criteria andPayotherBetween(String value1, String value2) {
            addCriterion("payother between", value1, value2, "payother");
            return (Criteria) this;
        }

        public Criteria andPayotherNotBetween(String value1, String value2) {
            addCriterion("payother not between", value1, value2, "payother");
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