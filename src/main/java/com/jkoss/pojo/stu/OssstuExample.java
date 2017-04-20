package com.jkoss.pojo.stu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OssstuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OssstuExample() {
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

        public Criteria andOssstuageIsNull() {
            addCriterion("ossstuage is null");
            return (Criteria) this;
        }

        public Criteria andOssstuageIsNotNull() {
            addCriterion("ossstuage is not null");
            return (Criteria) this;
        }

        public Criteria andOssstuageEqualTo(Integer value) {
            addCriterion("ossstuage =", value, "ossstuage");
            return (Criteria) this;
        }

        public Criteria andOssstuageNotEqualTo(Integer value) {
            addCriterion("ossstuage <>", value, "ossstuage");
            return (Criteria) this;
        }

        public Criteria andOssstuageGreaterThan(Integer value) {
            addCriterion("ossstuage >", value, "ossstuage");
            return (Criteria) this;
        }

        public Criteria andOssstuageGreaterThanOrEqualTo(Integer value) {
            addCriterion("ossstuage >=", value, "ossstuage");
            return (Criteria) this;
        }

        public Criteria andOssstuageLessThan(Integer value) {
            addCriterion("ossstuage <", value, "ossstuage");
            return (Criteria) this;
        }

        public Criteria andOssstuageLessThanOrEqualTo(Integer value) {
            addCriterion("ossstuage <=", value, "ossstuage");
            return (Criteria) this;
        }

        public Criteria andOssstuageIn(List<Integer> values) {
            addCriterion("ossstuage in", values, "ossstuage");
            return (Criteria) this;
        }

        public Criteria andOssstuageNotIn(List<Integer> values) {
            addCriterion("ossstuage not in", values, "ossstuage");
            return (Criteria) this;
        }

        public Criteria andOssstuageBetween(Integer value1, Integer value2) {
            addCriterion("ossstuage between", value1, value2, "ossstuage");
            return (Criteria) this;
        }

        public Criteria andOssstuageNotBetween(Integer value1, Integer value2) {
            addCriterion("ossstuage not between", value1, value2, "ossstuage");
            return (Criteria) this;
        }

        public Criteria andJoinDateIsNull() {
            addCriterion("joinDate is null");
            return (Criteria) this;
        }

        public Criteria andJoinDateIsNotNull() {
            addCriterion("joinDate is not null");
            return (Criteria) this;
        }

        public Criteria andJoinDateEqualTo(Date value) {
            addCriterion("joinDate =", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotEqualTo(Date value) {
            addCriterion("joinDate <>", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateGreaterThan(Date value) {
            addCriterion("joinDate >", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateGreaterThanOrEqualTo(Date value) {
            addCriterion("joinDate >=", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateLessThan(Date value) {
            addCriterion("joinDate <", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateLessThanOrEqualTo(Date value) {
            addCriterion("joinDate <=", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateIn(List<Date> values) {
            addCriterion("joinDate in", values, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotIn(List<Date> values) {
            addCriterion("joinDate not in", values, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateBetween(Date value1, Date value2) {
            addCriterion("joinDate between", value1, value2, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotBetween(Date value1, Date value2) {
            addCriterion("joinDate not between", value1, value2, "joinDate");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoIsNull() {
            addCriterion("ossstuIDno is null");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoIsNotNull() {
            addCriterion("ossstuIDno is not null");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoEqualTo(String value) {
            addCriterion("ossstuIDno =", value, "ossstuIDno");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoNotEqualTo(String value) {
            addCriterion("ossstuIDno <>", value, "ossstuIDno");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoGreaterThan(String value) {
            addCriterion("ossstuIDno >", value, "ossstuIDno");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoGreaterThanOrEqualTo(String value) {
            addCriterion("ossstuIDno >=", value, "ossstuIDno");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoLessThan(String value) {
            addCriterion("ossstuIDno <", value, "ossstuIDno");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoLessThanOrEqualTo(String value) {
            addCriterion("ossstuIDno <=", value, "ossstuIDno");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoLike(String value) {
            addCriterion("ossstuIDno like", value, "ossstuIDno");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoNotLike(String value) {
            addCriterion("ossstuIDno not like", value, "ossstuIDno");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoIn(List<String> values) {
            addCriterion("ossstuIDno in", values, "ossstuIDno");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoNotIn(List<String> values) {
            addCriterion("ossstuIDno not in", values, "ossstuIDno");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoBetween(String value1, String value2) {
            addCriterion("ossstuIDno between", value1, value2, "ossstuIDno");
            return (Criteria) this;
        }

        public Criteria andOssstuIDnoNotBetween(String value1, String value2) {
            addCriterion("ossstuIDno not between", value1, value2, "ossstuIDno");
            return (Criteria) this;
        }

        public Criteria andOssstuctntIsNull() {
            addCriterion("ossstuctnt is null");
            return (Criteria) this;
        }

        public Criteria andOssstuctntIsNotNull() {
            addCriterion("ossstuctnt is not null");
            return (Criteria) this;
        }

        public Criteria andOssstuctntEqualTo(String value) {
            addCriterion("ossstuctnt =", value, "ossstuctnt");
            return (Criteria) this;
        }

        public Criteria andOssstuctntNotEqualTo(String value) {
            addCriterion("ossstuctnt <>", value, "ossstuctnt");
            return (Criteria) this;
        }

        public Criteria andOssstuctntGreaterThan(String value) {
            addCriterion("ossstuctnt >", value, "ossstuctnt");
            return (Criteria) this;
        }

        public Criteria andOssstuctntGreaterThanOrEqualTo(String value) {
            addCriterion("ossstuctnt >=", value, "ossstuctnt");
            return (Criteria) this;
        }

        public Criteria andOssstuctntLessThan(String value) {
            addCriterion("ossstuctnt <", value, "ossstuctnt");
            return (Criteria) this;
        }

        public Criteria andOssstuctntLessThanOrEqualTo(String value) {
            addCriterion("ossstuctnt <=", value, "ossstuctnt");
            return (Criteria) this;
        }

        public Criteria andOssstuctntLike(String value) {
            addCriterion("ossstuctnt like", value, "ossstuctnt");
            return (Criteria) this;
        }

        public Criteria andOssstuctntNotLike(String value) {
            addCriterion("ossstuctnt not like", value, "ossstuctnt");
            return (Criteria) this;
        }

        public Criteria andOssstuctntIn(List<String> values) {
            addCriterion("ossstuctnt in", values, "ossstuctnt");
            return (Criteria) this;
        }

        public Criteria andOssstuctntNotIn(List<String> values) {
            addCriterion("ossstuctnt not in", values, "ossstuctnt");
            return (Criteria) this;
        }

        public Criteria andOssstuctntBetween(String value1, String value2) {
            addCriterion("ossstuctnt between", value1, value2, "ossstuctnt");
            return (Criteria) this;
        }

        public Criteria andOssstuctntNotBetween(String value1, String value2) {
            addCriterion("ossstuctnt not between", value1, value2, "ossstuctnt");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelIsNull() {
            addCriterion("ossstuctnttel is null");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelIsNotNull() {
            addCriterion("ossstuctnttel is not null");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelEqualTo(String value) {
            addCriterion("ossstuctnttel =", value, "ossstuctnttel");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelNotEqualTo(String value) {
            addCriterion("ossstuctnttel <>", value, "ossstuctnttel");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelGreaterThan(String value) {
            addCriterion("ossstuctnttel >", value, "ossstuctnttel");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelGreaterThanOrEqualTo(String value) {
            addCriterion("ossstuctnttel >=", value, "ossstuctnttel");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelLessThan(String value) {
            addCriterion("ossstuctnttel <", value, "ossstuctnttel");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelLessThanOrEqualTo(String value) {
            addCriterion("ossstuctnttel <=", value, "ossstuctnttel");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelLike(String value) {
            addCriterion("ossstuctnttel like", value, "ossstuctnttel");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelNotLike(String value) {
            addCriterion("ossstuctnttel not like", value, "ossstuctnttel");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelIn(List<String> values) {
            addCriterion("ossstuctnttel in", values, "ossstuctnttel");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelNotIn(List<String> values) {
            addCriterion("ossstuctnttel not in", values, "ossstuctnttel");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelBetween(String value1, String value2) {
            addCriterion("ossstuctnttel between", value1, value2, "ossstuctnttel");
            return (Criteria) this;
        }

        public Criteria andOssstuctnttelNotBetween(String value1, String value2) {
            addCriterion("ossstuctnttel not between", value1, value2, "ossstuctnttel");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2IsNull() {
            addCriterion("ossstuctnt2 is null");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2IsNotNull() {
            addCriterion("ossstuctnt2 is not null");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2EqualTo(String value) {
            addCriterion("ossstuctnt2 =", value, "ossstuctnt2");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2NotEqualTo(String value) {
            addCriterion("ossstuctnt2 <>", value, "ossstuctnt2");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2GreaterThan(String value) {
            addCriterion("ossstuctnt2 >", value, "ossstuctnt2");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2GreaterThanOrEqualTo(String value) {
            addCriterion("ossstuctnt2 >=", value, "ossstuctnt2");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2LessThan(String value) {
            addCriterion("ossstuctnt2 <", value, "ossstuctnt2");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2LessThanOrEqualTo(String value) {
            addCriterion("ossstuctnt2 <=", value, "ossstuctnt2");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2Like(String value) {
            addCriterion("ossstuctnt2 like", value, "ossstuctnt2");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2NotLike(String value) {
            addCriterion("ossstuctnt2 not like", value, "ossstuctnt2");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2In(List<String> values) {
            addCriterion("ossstuctnt2 in", values, "ossstuctnt2");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2NotIn(List<String> values) {
            addCriterion("ossstuctnt2 not in", values, "ossstuctnt2");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2Between(String value1, String value2) {
            addCriterion("ossstuctnt2 between", value1, value2, "ossstuctnt2");
            return (Criteria) this;
        }

        public Criteria andOssstuctnt2NotBetween(String value1, String value2) {
            addCriterion("ossstuctnt2 not between", value1, value2, "ossstuctnt2");
            return (Criteria) this;
        }

        public Criteria andStukqnoIsNull() {
            addCriterion("stukqno is null");
            return (Criteria) this;
        }

        public Criteria andStukqnoIsNotNull() {
            addCriterion("stukqno is not null");
            return (Criteria) this;
        }

        public Criteria andStukqnoEqualTo(Integer value) {
            addCriterion("stukqno =", value, "stukqno");
            return (Criteria) this;
        }

        public Criteria andStukqnoNotEqualTo(Integer value) {
            addCriterion("stukqno <>", value, "stukqno");
            return (Criteria) this;
        }

        public Criteria andStukqnoGreaterThan(Integer value) {
            addCriterion("stukqno >", value, "stukqno");
            return (Criteria) this;
        }

        public Criteria andStukqnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("stukqno >=", value, "stukqno");
            return (Criteria) this;
        }

        public Criteria andStukqnoLessThan(Integer value) {
            addCriterion("stukqno <", value, "stukqno");
            return (Criteria) this;
        }

        public Criteria andStukqnoLessThanOrEqualTo(Integer value) {
            addCriterion("stukqno <=", value, "stukqno");
            return (Criteria) this;
        }

        public Criteria andStukqnoIn(List<Integer> values) {
            addCriterion("stukqno in", values, "stukqno");
            return (Criteria) this;
        }

        public Criteria andStukqnoNotIn(List<Integer> values) {
            addCriterion("stukqno not in", values, "stukqno");
            return (Criteria) this;
        }

        public Criteria andStukqnoBetween(Integer value1, Integer value2) {
            addCriterion("stukqno between", value1, value2, "stukqno");
            return (Criteria) this;
        }

        public Criteria andStukqnoNotBetween(Integer value1, Integer value2) {
            addCriterion("stukqno not between", value1, value2, "stukqno");
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