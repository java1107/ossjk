package com.jkoss.pojo.jy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterviewExample() {
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

        public Criteria andStumsidIsNull() {
            addCriterion("stumsid is null");
            return (Criteria) this;
        }

        public Criteria andStumsidIsNotNull() {
            addCriterion("stumsid is not null");
            return (Criteria) this;
        }

        public Criteria andStumsidEqualTo(Integer value) {
            addCriterion("stumsid =", value, "stumsid");
            return (Criteria) this;
        }

        public Criteria andStumsidNotEqualTo(Integer value) {
            addCriterion("stumsid <>", value, "stumsid");
            return (Criteria) this;
        }

        public Criteria andStumsidGreaterThan(Integer value) {
            addCriterion("stumsid >", value, "stumsid");
            return (Criteria) this;
        }

        public Criteria andStumsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stumsid >=", value, "stumsid");
            return (Criteria) this;
        }

        public Criteria andStumsidLessThan(Integer value) {
            addCriterion("stumsid <", value, "stumsid");
            return (Criteria) this;
        }

        public Criteria andStumsidLessThanOrEqualTo(Integer value) {
            addCriterion("stumsid <=", value, "stumsid");
            return (Criteria) this;
        }

        public Criteria andStumsidIn(List<Integer> values) {
            addCriterion("stumsid in", values, "stumsid");
            return (Criteria) this;
        }

        public Criteria andStumsidNotIn(List<Integer> values) {
            addCriterion("stumsid not in", values, "stumsid");
            return (Criteria) this;
        }

        public Criteria andStumsidBetween(Integer value1, Integer value2) {
            addCriterion("stumsid between", value1, value2, "stumsid");
            return (Criteria) this;
        }

        public Criteria andStumsidNotBetween(Integer value1, Integer value2) {
            addCriterion("stumsid not between", value1, value2, "stumsid");
            return (Criteria) this;
        }

        public Criteria andJygwidIsNull() {
            addCriterion("jygwid is null");
            return (Criteria) this;
        }

        public Criteria andJygwidIsNotNull() {
            addCriterion("jygwid is not null");
            return (Criteria) this;
        }

        public Criteria andJygwidEqualTo(Integer value) {
            addCriterion("jygwid =", value, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidNotEqualTo(Integer value) {
            addCriterion("jygwid <>", value, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidGreaterThan(Integer value) {
            addCriterion("jygwid >", value, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jygwid >=", value, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidLessThan(Integer value) {
            addCriterion("jygwid <", value, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidLessThanOrEqualTo(Integer value) {
            addCriterion("jygwid <=", value, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidIn(List<Integer> values) {
            addCriterion("jygwid in", values, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidNotIn(List<Integer> values) {
            addCriterion("jygwid not in", values, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidBetween(Integer value1, Integer value2) {
            addCriterion("jygwid between", value1, value2, "jygwid");
            return (Criteria) this;
        }

        public Criteria andJygwidNotBetween(Integer value1, Integer value2) {
            addCriterion("jygwid not between", value1, value2, "jygwid");
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

        public Criteria andStumstolddateIsNull() {
            addCriterion("stumstolddate is null");
            return (Criteria) this;
        }

        public Criteria andStumstolddateIsNotNull() {
            addCriterion("stumstolddate is not null");
            return (Criteria) this;
        }

        public Criteria andStumstolddateEqualTo(Date value) {
            addCriterion("stumstolddate =", value, "stumstolddate");
            return (Criteria) this;
        }

        public Criteria andStumstolddateNotEqualTo(Date value) {
            addCriterion("stumstolddate <>", value, "stumstolddate");
            return (Criteria) this;
        }

        public Criteria andStumstolddateGreaterThan(Date value) {
            addCriterion("stumstolddate >", value, "stumstolddate");
            return (Criteria) this;
        }

        public Criteria andStumstolddateGreaterThanOrEqualTo(Date value) {
            addCriterion("stumstolddate >=", value, "stumstolddate");
            return (Criteria) this;
        }

        public Criteria andStumstolddateLessThan(Date value) {
            addCriterion("stumstolddate <", value, "stumstolddate");
            return (Criteria) this;
        }

        public Criteria andStumstolddateLessThanOrEqualTo(Date value) {
            addCriterion("stumstolddate <=", value, "stumstolddate");
            return (Criteria) this;
        }

        public Criteria andStumstolddateIn(List<Date> values) {
            addCriterion("stumstolddate in", values, "stumstolddate");
            return (Criteria) this;
        }

        public Criteria andStumstolddateNotIn(List<Date> values) {
            addCriterion("stumstolddate not in", values, "stumstolddate");
            return (Criteria) this;
        }

        public Criteria andStumstolddateBetween(Date value1, Date value2) {
            addCriterion("stumstolddate between", value1, value2, "stumstolddate");
            return (Criteria) this;
        }

        public Criteria andStumstolddateNotBetween(Date value1, Date value2) {
            addCriterion("stumstolddate not between", value1, value2, "stumstolddate");
            return (Criteria) this;
        }

        public Criteria andStumsdateIsNull() {
            addCriterion("stumsdate is null");
            return (Criteria) this;
        }

        public Criteria andStumsdateIsNotNull() {
            addCriterion("stumsdate is not null");
            return (Criteria) this;
        }

        public Criteria andStumsdateEqualTo(Date value) {
            addCriterion("stumsdate =", value, "stumsdate");
            return (Criteria) this;
        }

        public Criteria andStumsdateNotEqualTo(Date value) {
            addCriterion("stumsdate <>", value, "stumsdate");
            return (Criteria) this;
        }

        public Criteria andStumsdateGreaterThan(Date value) {
            addCriterion("stumsdate >", value, "stumsdate");
            return (Criteria) this;
        }

        public Criteria andStumsdateGreaterThanOrEqualTo(Date value) {
            addCriterion("stumsdate >=", value, "stumsdate");
            return (Criteria) this;
        }

        public Criteria andStumsdateLessThan(Date value) {
            addCriterion("stumsdate <", value, "stumsdate");
            return (Criteria) this;
        }

        public Criteria andStumsdateLessThanOrEqualTo(Date value) {
            addCriterion("stumsdate <=", value, "stumsdate");
            return (Criteria) this;
        }

        public Criteria andStumsdateIn(List<Date> values) {
            addCriterion("stumsdate in", values, "stumsdate");
            return (Criteria) this;
        }

        public Criteria andStumsdateNotIn(List<Date> values) {
            addCriterion("stumsdate not in", values, "stumsdate");
            return (Criteria) this;
        }

        public Criteria andStumsdateBetween(Date value1, Date value2) {
            addCriterion("stumsdate between", value1, value2, "stumsdate");
            return (Criteria) this;
        }

        public Criteria andStumsdateNotBetween(Date value1, Date value2) {
            addCriterion("stumsdate not between", value1, value2, "stumsdate");
            return (Criteria) this;
        }

        public Criteria andStumsplaceIsNull() {
            addCriterion("stumsplace is null");
            return (Criteria) this;
        }

        public Criteria andStumsplaceIsNotNull() {
            addCriterion("stumsplace is not null");
            return (Criteria) this;
        }

        public Criteria andStumsplaceEqualTo(String value) {
            addCriterion("stumsplace =", value, "stumsplace");
            return (Criteria) this;
        }

        public Criteria andStumsplaceNotEqualTo(String value) {
            addCriterion("stumsplace <>", value, "stumsplace");
            return (Criteria) this;
        }

        public Criteria andStumsplaceGreaterThan(String value) {
            addCriterion("stumsplace >", value, "stumsplace");
            return (Criteria) this;
        }

        public Criteria andStumsplaceGreaterThanOrEqualTo(String value) {
            addCriterion("stumsplace >=", value, "stumsplace");
            return (Criteria) this;
        }

        public Criteria andStumsplaceLessThan(String value) {
            addCriterion("stumsplace <", value, "stumsplace");
            return (Criteria) this;
        }

        public Criteria andStumsplaceLessThanOrEqualTo(String value) {
            addCriterion("stumsplace <=", value, "stumsplace");
            return (Criteria) this;
        }

        public Criteria andStumsplaceLike(String value) {
            addCriterion("stumsplace like", value, "stumsplace");
            return (Criteria) this;
        }

        public Criteria andStumsplaceNotLike(String value) {
            addCriterion("stumsplace not like", value, "stumsplace");
            return (Criteria) this;
        }

        public Criteria andStumsplaceIn(List<String> values) {
            addCriterion("stumsplace in", values, "stumsplace");
            return (Criteria) this;
        }

        public Criteria andStumsplaceNotIn(List<String> values) {
            addCriterion("stumsplace not in", values, "stumsplace");
            return (Criteria) this;
        }

        public Criteria andStumsplaceBetween(String value1, String value2) {
            addCriterion("stumsplace between", value1, value2, "stumsplace");
            return (Criteria) this;
        }

        public Criteria andStumsplaceNotBetween(String value1, String value2) {
            addCriterion("stumsplace not between", value1, value2, "stumsplace");
            return (Criteria) this;
        }

        public Criteria andStumstelIsNull() {
            addCriterion("stumstel is null");
            return (Criteria) this;
        }

        public Criteria andStumstelIsNotNull() {
            addCriterion("stumstel is not null");
            return (Criteria) this;
        }

        public Criteria andStumstelEqualTo(String value) {
            addCriterion("stumstel =", value, "stumstel");
            return (Criteria) this;
        }

        public Criteria andStumstelNotEqualTo(String value) {
            addCriterion("stumstel <>", value, "stumstel");
            return (Criteria) this;
        }

        public Criteria andStumstelGreaterThan(String value) {
            addCriterion("stumstel >", value, "stumstel");
            return (Criteria) this;
        }

        public Criteria andStumstelGreaterThanOrEqualTo(String value) {
            addCriterion("stumstel >=", value, "stumstel");
            return (Criteria) this;
        }

        public Criteria andStumstelLessThan(String value) {
            addCriterion("stumstel <", value, "stumstel");
            return (Criteria) this;
        }

        public Criteria andStumstelLessThanOrEqualTo(String value) {
            addCriterion("stumstel <=", value, "stumstel");
            return (Criteria) this;
        }

        public Criteria andStumstelLike(String value) {
            addCriterion("stumstel like", value, "stumstel");
            return (Criteria) this;
        }

        public Criteria andStumstelNotLike(String value) {
            addCriterion("stumstel not like", value, "stumstel");
            return (Criteria) this;
        }

        public Criteria andStumstelIn(List<String> values) {
            addCriterion("stumstel in", values, "stumstel");
            return (Criteria) this;
        }

        public Criteria andStumstelNotIn(List<String> values) {
            addCriterion("stumstel not in", values, "stumstel");
            return (Criteria) this;
        }

        public Criteria andStumstelBetween(String value1, String value2) {
            addCriterion("stumstel between", value1, value2, "stumstel");
            return (Criteria) this;
        }

        public Criteria andStumstelNotBetween(String value1, String value2) {
            addCriterion("stumstel not between", value1, value2, "stumstel");
            return (Criteria) this;
        }

        public Criteria andStumsresultIsNull() {
            addCriterion("stumsresult is null");
            return (Criteria) this;
        }

        public Criteria andStumsresultIsNotNull() {
            addCriterion("stumsresult is not null");
            return (Criteria) this;
        }

        public Criteria andStumsresultEqualTo(String value) {
            addCriterion("stumsresult =", value, "stumsresult");
            return (Criteria) this;
        }

        public Criteria andStumsresultNotEqualTo(String value) {
            addCriterion("stumsresult <>", value, "stumsresult");
            return (Criteria) this;
        }

        public Criteria andStumsresultGreaterThan(String value) {
            addCriterion("stumsresult >", value, "stumsresult");
            return (Criteria) this;
        }

        public Criteria andStumsresultGreaterThanOrEqualTo(String value) {
            addCriterion("stumsresult >=", value, "stumsresult");
            return (Criteria) this;
        }

        public Criteria andStumsresultLessThan(String value) {
            addCriterion("stumsresult <", value, "stumsresult");
            return (Criteria) this;
        }

        public Criteria andStumsresultLessThanOrEqualTo(String value) {
            addCriterion("stumsresult <=", value, "stumsresult");
            return (Criteria) this;
        }

        public Criteria andStumsresultLike(String value) {
            addCriterion("stumsresult like", value, "stumsresult");
            return (Criteria) this;
        }

        public Criteria andStumsresultNotLike(String value) {
            addCriterion("stumsresult not like", value, "stumsresult");
            return (Criteria) this;
        }

        public Criteria andStumsresultIn(List<String> values) {
            addCriterion("stumsresult in", values, "stumsresult");
            return (Criteria) this;
        }

        public Criteria andStumsresultNotIn(List<String> values) {
            addCriterion("stumsresult not in", values, "stumsresult");
            return (Criteria) this;
        }

        public Criteria andStumsresultBetween(String value1, String value2) {
            addCriterion("stumsresult between", value1, value2, "stumsresult");
            return (Criteria) this;
        }

        public Criteria andStumsresultNotBetween(String value1, String value2) {
            addCriterion("stumsresult not between", value1, value2, "stumsresult");
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