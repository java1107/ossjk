package com.jkoss.pojo.stu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StuqinjiaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuqinjiaExample() {
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

        public Criteria andSqjidIsNull() {
            addCriterion("sqjid is null");
            return (Criteria) this;
        }

        public Criteria andSqjidIsNotNull() {
            addCriterion("sqjid is not null");
            return (Criteria) this;
        }

        public Criteria andSqjidEqualTo(Integer value) {
            addCriterion("sqjid =", value, "sqjid");
            return (Criteria) this;
        }

        public Criteria andSqjidNotEqualTo(Integer value) {
            addCriterion("sqjid <>", value, "sqjid");
            return (Criteria) this;
        }

        public Criteria andSqjidGreaterThan(Integer value) {
            addCriterion("sqjid >", value, "sqjid");
            return (Criteria) this;
        }

        public Criteria andSqjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sqjid >=", value, "sqjid");
            return (Criteria) this;
        }

        public Criteria andSqjidLessThan(Integer value) {
            addCriterion("sqjid <", value, "sqjid");
            return (Criteria) this;
        }

        public Criteria andSqjidLessThanOrEqualTo(Integer value) {
            addCriterion("sqjid <=", value, "sqjid");
            return (Criteria) this;
        }

        public Criteria andSqjidIn(List<Integer> values) {
            addCriterion("sqjid in", values, "sqjid");
            return (Criteria) this;
        }

        public Criteria andSqjidNotIn(List<Integer> values) {
            addCriterion("sqjid not in", values, "sqjid");
            return (Criteria) this;
        }

        public Criteria andSqjidBetween(Integer value1, Integer value2) {
            addCriterion("sqjid between", value1, value2, "sqjid");
            return (Criteria) this;
        }

        public Criteria andSqjidNotBetween(Integer value1, Integer value2) {
            addCriterion("sqjid not between", value1, value2, "sqjid");
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

        public Criteria andSqjdateIsNull() {
            addCriterion("sqjdate is null");
            return (Criteria) this;
        }

        public Criteria andSqjdateIsNotNull() {
            addCriterion("sqjdate is not null");
            return (Criteria) this;
        }

        public Criteria andSqjdateEqualTo(Date value) {
            addCriterion("sqjdate =", value, "sqjdate");
            return (Criteria) this;
        }

        public Criteria andSqjdateNotEqualTo(Date value) {
            addCriterion("sqjdate <>", value, "sqjdate");
            return (Criteria) this;
        }

        public Criteria andSqjdateGreaterThan(Date value) {
            addCriterion("sqjdate >", value, "sqjdate");
            return (Criteria) this;
        }

        public Criteria andSqjdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sqjdate >=", value, "sqjdate");
            return (Criteria) this;
        }

        public Criteria andSqjdateLessThan(Date value) {
            addCriterion("sqjdate <", value, "sqjdate");
            return (Criteria) this;
        }

        public Criteria andSqjdateLessThanOrEqualTo(Date value) {
            addCriterion("sqjdate <=", value, "sqjdate");
            return (Criteria) this;
        }

        public Criteria andSqjdateIn(List<Date> values) {
            addCriterion("sqjdate in", values, "sqjdate");
            return (Criteria) this;
        }

        public Criteria andSqjdateNotIn(List<Date> values) {
            addCriterion("sqjdate not in", values, "sqjdate");
            return (Criteria) this;
        }

        public Criteria andSqjdateBetween(Date value1, Date value2) {
            addCriterion("sqjdate between", value1, value2, "sqjdate");
            return (Criteria) this;
        }

        public Criteria andSqjdateNotBetween(Date value1, Date value2) {
            addCriterion("sqjdate not between", value1, value2, "sqjdate");
            return (Criteria) this;
        }

        public Criteria andSqjresonIsNull() {
            addCriterion("sqjreson is null");
            return (Criteria) this;
        }

        public Criteria andSqjresonIsNotNull() {
            addCriterion("sqjreson is not null");
            return (Criteria) this;
        }

        public Criteria andSqjresonEqualTo(String value) {
            addCriterion("sqjreson =", value, "sqjreson");
            return (Criteria) this;
        }

        public Criteria andSqjresonNotEqualTo(String value) {
            addCriterion("sqjreson <>", value, "sqjreson");
            return (Criteria) this;
        }

        public Criteria andSqjresonGreaterThan(String value) {
            addCriterion("sqjreson >", value, "sqjreson");
            return (Criteria) this;
        }

        public Criteria andSqjresonGreaterThanOrEqualTo(String value) {
            addCriterion("sqjreson >=", value, "sqjreson");
            return (Criteria) this;
        }

        public Criteria andSqjresonLessThan(String value) {
            addCriterion("sqjreson <", value, "sqjreson");
            return (Criteria) this;
        }

        public Criteria andSqjresonLessThanOrEqualTo(String value) {
            addCriterion("sqjreson <=", value, "sqjreson");
            return (Criteria) this;
        }

        public Criteria andSqjresonLike(String value) {
            addCriterion("sqjreson like", value, "sqjreson");
            return (Criteria) this;
        }

        public Criteria andSqjresonNotLike(String value) {
            addCriterion("sqjreson not like", value, "sqjreson");
            return (Criteria) this;
        }

        public Criteria andSqjresonIn(List<String> values) {
            addCriterion("sqjreson in", values, "sqjreson");
            return (Criteria) this;
        }

        public Criteria andSqjresonNotIn(List<String> values) {
            addCriterion("sqjreson not in", values, "sqjreson");
            return (Criteria) this;
        }

        public Criteria andSqjresonBetween(String value1, String value2) {
            addCriterion("sqjreson between", value1, value2, "sqjreson");
            return (Criteria) this;
        }

        public Criteria andSqjresonNotBetween(String value1, String value2) {
            addCriterion("sqjreson not between", value1, value2, "sqjreson");
            return (Criteria) this;
        }

        public Criteria andSqjquerenIsNull() {
            addCriterion("sqjqueren is null");
            return (Criteria) this;
        }

        public Criteria andSqjquerenIsNotNull() {
            addCriterion("sqjqueren is not null");
            return (Criteria) this;
        }

        public Criteria andSqjquerenEqualTo(String value) {
            addCriterion("sqjqueren =", value, "sqjqueren");
            return (Criteria) this;
        }

        public Criteria andSqjquerenNotEqualTo(String value) {
            addCriterion("sqjqueren <>", value, "sqjqueren");
            return (Criteria) this;
        }

        public Criteria andSqjquerenGreaterThan(String value) {
            addCriterion("sqjqueren >", value, "sqjqueren");
            return (Criteria) this;
        }

        public Criteria andSqjquerenGreaterThanOrEqualTo(String value) {
            addCriterion("sqjqueren >=", value, "sqjqueren");
            return (Criteria) this;
        }

        public Criteria andSqjquerenLessThan(String value) {
            addCriterion("sqjqueren <", value, "sqjqueren");
            return (Criteria) this;
        }

        public Criteria andSqjquerenLessThanOrEqualTo(String value) {
            addCriterion("sqjqueren <=", value, "sqjqueren");
            return (Criteria) this;
        }

        public Criteria andSqjquerenLike(String value) {
            addCriterion("sqjqueren like", value, "sqjqueren");
            return (Criteria) this;
        }

        public Criteria andSqjquerenNotLike(String value) {
            addCriterion("sqjqueren not like", value, "sqjqueren");
            return (Criteria) this;
        }

        public Criteria andSqjquerenIn(List<String> values) {
            addCriterion("sqjqueren in", values, "sqjqueren");
            return (Criteria) this;
        }

        public Criteria andSqjquerenNotIn(List<String> values) {
            addCriterion("sqjqueren not in", values, "sqjqueren");
            return (Criteria) this;
        }

        public Criteria andSqjquerenBetween(String value1, String value2) {
            addCriterion("sqjqueren between", value1, value2, "sqjqueren");
            return (Criteria) this;
        }

        public Criteria andSqjquerenNotBetween(String value1, String value2) {
            addCriterion("sqjqueren not between", value1, value2, "sqjqueren");
            return (Criteria) this;
        }

        public Criteria andSqjstateIsNull() {
            addCriterion("sqjstate is null");
            return (Criteria) this;
        }

        public Criteria andSqjstateIsNotNull() {
            addCriterion("sqjstate is not null");
            return (Criteria) this;
        }

        public Criteria andSqjstateEqualTo(Integer value) {
            addCriterion("sqjstate =", value, "sqjstate");
            return (Criteria) this;
        }

        public Criteria andSqjstateNotEqualTo(Integer value) {
            addCriterion("sqjstate <>", value, "sqjstate");
            return (Criteria) this;
        }

        public Criteria andSqjstateGreaterThan(Integer value) {
            addCriterion("sqjstate >", value, "sqjstate");
            return (Criteria) this;
        }

        public Criteria andSqjstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sqjstate >=", value, "sqjstate");
            return (Criteria) this;
        }

        public Criteria andSqjstateLessThan(Integer value) {
            addCriterion("sqjstate <", value, "sqjstate");
            return (Criteria) this;
        }

        public Criteria andSqjstateLessThanOrEqualTo(Integer value) {
            addCriterion("sqjstate <=", value, "sqjstate");
            return (Criteria) this;
        }

        public Criteria andSqjstateIn(List<Integer> values) {
            addCriterion("sqjstate in", values, "sqjstate");
            return (Criteria) this;
        }

        public Criteria andSqjstateNotIn(List<Integer> values) {
            addCriterion("sqjstate not in", values, "sqjstate");
            return (Criteria) this;
        }

        public Criteria andSqjstateBetween(Integer value1, Integer value2) {
            addCriterion("sqjstate between", value1, value2, "sqjstate");
            return (Criteria) this;
        }

        public Criteria andSqjstateNotBetween(Integer value1, Integer value2) {
            addCriterion("sqjstate not between", value1, value2, "sqjstate");
            return (Criteria) this;
        }

        public Criteria andSqjbeginIsNull() {
            addCriterion("sqjbegin is null");
            return (Criteria) this;
        }

        public Criteria andSqjbeginIsNotNull() {
            addCriterion("sqjbegin is not null");
            return (Criteria) this;
        }

        public Criteria andSqjbeginEqualTo(Date value) {
            addCriterionForJDBCDate("sqjbegin =", value, "sqjbegin");
            return (Criteria) this;
        }

        public Criteria andSqjbeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("sqjbegin <>", value, "sqjbegin");
            return (Criteria) this;
        }

        public Criteria andSqjbeginGreaterThan(Date value) {
            addCriterionForJDBCDate("sqjbegin >", value, "sqjbegin");
            return (Criteria) this;
        }

        public Criteria andSqjbeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sqjbegin >=", value, "sqjbegin");
            return (Criteria) this;
        }

        public Criteria andSqjbeginLessThan(Date value) {
            addCriterionForJDBCDate("sqjbegin <", value, "sqjbegin");
            return (Criteria) this;
        }

        public Criteria andSqjbeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sqjbegin <=", value, "sqjbegin");
            return (Criteria) this;
        }

        public Criteria andSqjbeginIn(List<Date> values) {
            addCriterionForJDBCDate("sqjbegin in", values, "sqjbegin");
            return (Criteria) this;
        }

        public Criteria andSqjbeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("sqjbegin not in", values, "sqjbegin");
            return (Criteria) this;
        }

        public Criteria andSqjbeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sqjbegin between", value1, value2, "sqjbegin");
            return (Criteria) this;
        }

        public Criteria andSqjbeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sqjbegin not between", value1, value2, "sqjbegin");
            return (Criteria) this;
        }

        public Criteria andSqjendIsNull() {
            addCriterion("sqjend is null");
            return (Criteria) this;
        }

        public Criteria andSqjendIsNotNull() {
            addCriterion("sqjend is not null");
            return (Criteria) this;
        }

        public Criteria andSqjendEqualTo(Date value) {
            addCriterionForJDBCDate("sqjend =", value, "sqjend");
            return (Criteria) this;
        }

        public Criteria andSqjendNotEqualTo(Date value) {
            addCriterionForJDBCDate("sqjend <>", value, "sqjend");
            return (Criteria) this;
        }

        public Criteria andSqjendGreaterThan(Date value) {
            addCriterionForJDBCDate("sqjend >", value, "sqjend");
            return (Criteria) this;
        }

        public Criteria andSqjendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sqjend >=", value, "sqjend");
            return (Criteria) this;
        }

        public Criteria andSqjendLessThan(Date value) {
            addCriterionForJDBCDate("sqjend <", value, "sqjend");
            return (Criteria) this;
        }

        public Criteria andSqjendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sqjend <=", value, "sqjend");
            return (Criteria) this;
        }

        public Criteria andSqjendIn(List<Date> values) {
            addCriterionForJDBCDate("sqjend in", values, "sqjend");
            return (Criteria) this;
        }

        public Criteria andSqjendNotIn(List<Date> values) {
            addCriterionForJDBCDate("sqjend not in", values, "sqjend");
            return (Criteria) this;
        }

        public Criteria andSqjendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sqjend between", value1, value2, "sqjend");
            return (Criteria) this;
        }

        public Criteria andSqjendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sqjend not between", value1, value2, "sqjend");
            return (Criteria) this;
        }

        public Criteria andSqjdescIsNull() {
            addCriterion("sqjdesc is null");
            return (Criteria) this;
        }

        public Criteria andSqjdescIsNotNull() {
            addCriterion("sqjdesc is not null");
            return (Criteria) this;
        }

        public Criteria andSqjdescEqualTo(String value) {
            addCriterion("sqjdesc =", value, "sqjdesc");
            return (Criteria) this;
        }

        public Criteria andSqjdescNotEqualTo(String value) {
            addCriterion("sqjdesc <>", value, "sqjdesc");
            return (Criteria) this;
        }

        public Criteria andSqjdescGreaterThan(String value) {
            addCriterion("sqjdesc >", value, "sqjdesc");
            return (Criteria) this;
        }

        public Criteria andSqjdescGreaterThanOrEqualTo(String value) {
            addCriterion("sqjdesc >=", value, "sqjdesc");
            return (Criteria) this;
        }

        public Criteria andSqjdescLessThan(String value) {
            addCriterion("sqjdesc <", value, "sqjdesc");
            return (Criteria) this;
        }

        public Criteria andSqjdescLessThanOrEqualTo(String value) {
            addCriterion("sqjdesc <=", value, "sqjdesc");
            return (Criteria) this;
        }

        public Criteria andSqjdescLike(String value) {
            addCriterion("sqjdesc like", value, "sqjdesc");
            return (Criteria) this;
        }

        public Criteria andSqjdescNotLike(String value) {
            addCriterion("sqjdesc not like", value, "sqjdesc");
            return (Criteria) this;
        }

        public Criteria andSqjdescIn(List<String> values) {
            addCriterion("sqjdesc in", values, "sqjdesc");
            return (Criteria) this;
        }

        public Criteria andSqjdescNotIn(List<String> values) {
            addCriterion("sqjdesc not in", values, "sqjdesc");
            return (Criteria) this;
        }

        public Criteria andSqjdescBetween(String value1, String value2) {
            addCriterion("sqjdesc between", value1, value2, "sqjdesc");
            return (Criteria) this;
        }

        public Criteria andSqjdescNotBetween(String value1, String value2) {
            addCriterion("sqjdesc not between", value1, value2, "sqjdesc");
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