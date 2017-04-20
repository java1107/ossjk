package com.jkoss.pojo.jy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StuattendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuattendanceExample() {
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

        public Criteria andKqidIsNull() {
            addCriterion("kqid is null");
            return (Criteria) this;
        }

        public Criteria andKqidIsNotNull() {
            addCriterion("kqid is not null");
            return (Criteria) this;
        }

        public Criteria andKqidEqualTo(Integer value) {
            addCriterion("kqid =", value, "kqid");
            return (Criteria) this;
        }

        public Criteria andKqidNotEqualTo(Integer value) {
            addCriterion("kqid <>", value, "kqid");
            return (Criteria) this;
        }

        public Criteria andKqidGreaterThan(Integer value) {
            addCriterion("kqid >", value, "kqid");
            return (Criteria) this;
        }

        public Criteria andKqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kqid >=", value, "kqid");
            return (Criteria) this;
        }

        public Criteria andKqidLessThan(Integer value) {
            addCriterion("kqid <", value, "kqid");
            return (Criteria) this;
        }

        public Criteria andKqidLessThanOrEqualTo(Integer value) {
            addCriterion("kqid <=", value, "kqid");
            return (Criteria) this;
        }

        public Criteria andKqidIn(List<Integer> values) {
            addCriterion("kqid in", values, "kqid");
            return (Criteria) this;
        }

        public Criteria andKqidNotIn(List<Integer> values) {
            addCriterion("kqid not in", values, "kqid");
            return (Criteria) this;
        }

        public Criteria andKqidBetween(Integer value1, Integer value2) {
            addCriterion("kqid between", value1, value2, "kqid");
            return (Criteria) this;
        }

        public Criteria andKqidNotBetween(Integer value1, Integer value2) {
            addCriterion("kqid not between", value1, value2, "kqid");
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

        public Criteria andKqdate1IsNull() {
            addCriterion("kqdate1 is null");
            return (Criteria) this;
        }

        public Criteria andKqdate1IsNotNull() {
            addCriterion("kqdate1 is not null");
            return (Criteria) this;
        }

        public Criteria andKqdate1EqualTo(Date value) {
            addCriterion("kqdate1 =", value, "kqdate1");
            return (Criteria) this;
        }

        public Criteria andKqdate1NotEqualTo(Date value) {
            addCriterion("kqdate1 <>", value, "kqdate1");
            return (Criteria) this;
        }

        public Criteria andKqdate1GreaterThan(Date value) {
            addCriterion("kqdate1 >", value, "kqdate1");
            return (Criteria) this;
        }

        public Criteria andKqdate1GreaterThanOrEqualTo(Date value) {
            addCriterion("kqdate1 >=", value, "kqdate1");
            return (Criteria) this;
        }

        public Criteria andKqdate1LessThan(Date value) {
            addCriterion("kqdate1 <", value, "kqdate1");
            return (Criteria) this;
        }

        public Criteria andKqdate1LessThanOrEqualTo(Date value) {
            addCriterion("kqdate1 <=", value, "kqdate1");
            return (Criteria) this;
        }

        public Criteria andKqdate1In(List<Date> values) {
            addCriterion("kqdate1 in", values, "kqdate1");
            return (Criteria) this;
        }

        public Criteria andKqdate1NotIn(List<Date> values) {
            addCriterion("kqdate1 not in", values, "kqdate1");
            return (Criteria) this;
        }

        public Criteria andKqdate1Between(Date value1, Date value2) {
            addCriterion("kqdate1 between", value1, value2, "kqdate1");
            return (Criteria) this;
        }

        public Criteria andKqdate1NotBetween(Date value1, Date value2) {
            addCriterion("kqdate1 not between", value1, value2, "kqdate1");
            return (Criteria) this;
        }

        public Criteria andKqdate2IsNull() {
            addCriterion("kqdate2 is null");
            return (Criteria) this;
        }

        public Criteria andKqdate2IsNotNull() {
            addCriterion("kqdate2 is not null");
            return (Criteria) this;
        }

        public Criteria andKqdate2EqualTo(Date value) {
            addCriterion("kqdate2 =", value, "kqdate2");
            return (Criteria) this;
        }

        public Criteria andKqdate2NotEqualTo(Date value) {
            addCriterion("kqdate2 <>", value, "kqdate2");
            return (Criteria) this;
        }

        public Criteria andKqdate2GreaterThan(Date value) {
            addCriterion("kqdate2 >", value, "kqdate2");
            return (Criteria) this;
        }

        public Criteria andKqdate2GreaterThanOrEqualTo(Date value) {
            addCriterion("kqdate2 >=", value, "kqdate2");
            return (Criteria) this;
        }

        public Criteria andKqdate2LessThan(Date value) {
            addCriterion("kqdate2 <", value, "kqdate2");
            return (Criteria) this;
        }

        public Criteria andKqdate2LessThanOrEqualTo(Date value) {
            addCriterion("kqdate2 <=", value, "kqdate2");
            return (Criteria) this;
        }

        public Criteria andKqdate2In(List<Date> values) {
            addCriterion("kqdate2 in", values, "kqdate2");
            return (Criteria) this;
        }

        public Criteria andKqdate2NotIn(List<Date> values) {
            addCriterion("kqdate2 not in", values, "kqdate2");
            return (Criteria) this;
        }

        public Criteria andKqdate2Between(Date value1, Date value2) {
            addCriterion("kqdate2 between", value1, value2, "kqdate2");
            return (Criteria) this;
        }

        public Criteria andKqdate2NotBetween(Date value1, Date value2) {
            addCriterion("kqdate2 not between", value1, value2, "kqdate2");
            return (Criteria) this;
        }

        public Criteria andKqresultIsNull() {
            addCriterion("kqresult is null");
            return (Criteria) this;
        }

        public Criteria andKqresultIsNotNull() {
            addCriterion("kqresult is not null");
            return (Criteria) this;
        }

        public Criteria andKqresultEqualTo(String value) {
            addCriterion("kqresult =", value, "kqresult");
            return (Criteria) this;
        }

        public Criteria andKqresultNotEqualTo(String value) {
            addCriterion("kqresult <>", value, "kqresult");
            return (Criteria) this;
        }

        public Criteria andKqresultGreaterThan(String value) {
            addCriterion("kqresult >", value, "kqresult");
            return (Criteria) this;
        }

        public Criteria andKqresultGreaterThanOrEqualTo(String value) {
            addCriterion("kqresult >=", value, "kqresult");
            return (Criteria) this;
        }

        public Criteria andKqresultLessThan(String value) {
            addCriterion("kqresult <", value, "kqresult");
            return (Criteria) this;
        }

        public Criteria andKqresultLessThanOrEqualTo(String value) {
            addCriterion("kqresult <=", value, "kqresult");
            return (Criteria) this;
        }

        public Criteria andKqresultLike(String value) {
            addCriterion("kqresult like", value, "kqresult");
            return (Criteria) this;
        }

        public Criteria andKqresultNotLike(String value) {
            addCriterion("kqresult not like", value, "kqresult");
            return (Criteria) this;
        }

        public Criteria andKqresultIn(List<String> values) {
            addCriterion("kqresult in", values, "kqresult");
            return (Criteria) this;
        }

        public Criteria andKqresultNotIn(List<String> values) {
            addCriterion("kqresult not in", values, "kqresult");
            return (Criteria) this;
        }

        public Criteria andKqresultBetween(String value1, String value2) {
            addCriterion("kqresult between", value1, value2, "kqresult");
            return (Criteria) this;
        }

        public Criteria andKqresultNotBetween(String value1, String value2) {
            addCriterion("kqresult not between", value1, value2, "kqresult");
            return (Criteria) this;
        }

        public Criteria andKqbreakIsNull() {
            addCriterion("kqbreak is null");
            return (Criteria) this;
        }

        public Criteria andKqbreakIsNotNull() {
            addCriterion("kqbreak is not null");
            return (Criteria) this;
        }

        public Criteria andKqbreakEqualTo(String value) {
            addCriterion("kqbreak =", value, "kqbreak");
            return (Criteria) this;
        }

        public Criteria andKqbreakNotEqualTo(String value) {
            addCriterion("kqbreak <>", value, "kqbreak");
            return (Criteria) this;
        }

        public Criteria andKqbreakGreaterThan(String value) {
            addCriterion("kqbreak >", value, "kqbreak");
            return (Criteria) this;
        }

        public Criteria andKqbreakGreaterThanOrEqualTo(String value) {
            addCriterion("kqbreak >=", value, "kqbreak");
            return (Criteria) this;
        }

        public Criteria andKqbreakLessThan(String value) {
            addCriterion("kqbreak <", value, "kqbreak");
            return (Criteria) this;
        }

        public Criteria andKqbreakLessThanOrEqualTo(String value) {
            addCriterion("kqbreak <=", value, "kqbreak");
            return (Criteria) this;
        }

        public Criteria andKqbreakLike(String value) {
            addCriterion("kqbreak like", value, "kqbreak");
            return (Criteria) this;
        }

        public Criteria andKqbreakNotLike(String value) {
            addCriterion("kqbreak not like", value, "kqbreak");
            return (Criteria) this;
        }

        public Criteria andKqbreakIn(List<String> values) {
            addCriterion("kqbreak in", values, "kqbreak");
            return (Criteria) this;
        }

        public Criteria andKqbreakNotIn(List<String> values) {
            addCriterion("kqbreak not in", values, "kqbreak");
            return (Criteria) this;
        }

        public Criteria andKqbreakBetween(String value1, String value2) {
            addCriterion("kqbreak between", value1, value2, "kqbreak");
            return (Criteria) this;
        }

        public Criteria andKqbreakNotBetween(String value1, String value2) {
            addCriterion("kqbreak not between", value1, value2, "kqbreak");
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