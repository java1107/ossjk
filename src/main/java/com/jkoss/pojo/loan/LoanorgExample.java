package com.jkoss.pojo.loan;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoanorgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanorgExample() {
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

        public Criteria andLoancpidIsNull() {
            addCriterion("loancpid is null");
            return (Criteria) this;
        }

        public Criteria andLoancpidIsNotNull() {
            addCriterion("loancpid is not null");
            return (Criteria) this;
        }

        public Criteria andLoancpidEqualTo(Integer value) {
            addCriterion("loancpid =", value, "loancpid");
            return (Criteria) this;
        }

        public Criteria andLoancpidNotEqualTo(Integer value) {
            addCriterion("loancpid <>", value, "loancpid");
            return (Criteria) this;
        }

        public Criteria andLoancpidGreaterThan(Integer value) {
            addCriterion("loancpid >", value, "loancpid");
            return (Criteria) this;
        }

        public Criteria andLoancpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("loancpid >=", value, "loancpid");
            return (Criteria) this;
        }

        public Criteria andLoancpidLessThan(Integer value) {
            addCriterion("loancpid <", value, "loancpid");
            return (Criteria) this;
        }

        public Criteria andLoancpidLessThanOrEqualTo(Integer value) {
            addCriterion("loancpid <=", value, "loancpid");
            return (Criteria) this;
        }

        public Criteria andLoancpidIn(List<Integer> values) {
            addCriterion("loancpid in", values, "loancpid");
            return (Criteria) this;
        }

        public Criteria andLoancpidNotIn(List<Integer> values) {
            addCriterion("loancpid not in", values, "loancpid");
            return (Criteria) this;
        }

        public Criteria andLoancpidBetween(Integer value1, Integer value2) {
            addCriterion("loancpid between", value1, value2, "loancpid");
            return (Criteria) this;
        }

        public Criteria andLoancpidNotBetween(Integer value1, Integer value2) {
            addCriterion("loancpid not between", value1, value2, "loancpid");
            return (Criteria) this;
        }

        public Criteria andLoancpIsNull() {
            addCriterion("loancp is null");
            return (Criteria) this;
        }

        public Criteria andLoancpIsNotNull() {
            addCriterion("loancp is not null");
            return (Criteria) this;
        }

        public Criteria andLoancpEqualTo(String value) {
            addCriterion("loancp =", value, "loancp");
            return (Criteria) this;
        }

        public Criteria andLoancpNotEqualTo(String value) {
            addCriterion("loancp <>", value, "loancp");
            return (Criteria) this;
        }

        public Criteria andLoancpGreaterThan(String value) {
            addCriterion("loancp >", value, "loancp");
            return (Criteria) this;
        }

        public Criteria andLoancpGreaterThanOrEqualTo(String value) {
            addCriterion("loancp >=", value, "loancp");
            return (Criteria) this;
        }

        public Criteria andLoancpLessThan(String value) {
            addCriterion("loancp <", value, "loancp");
            return (Criteria) this;
        }

        public Criteria andLoancpLessThanOrEqualTo(String value) {
            addCriterion("loancp <=", value, "loancp");
            return (Criteria) this;
        }

        public Criteria andLoancpLike(String value) {
            addCriterion("loancp like", value, "loancp");
            return (Criteria) this;
        }

        public Criteria andLoancpNotLike(String value) {
            addCriterion("loancp not like", value, "loancp");
            return (Criteria) this;
        }

        public Criteria andLoancpIn(List<String> values) {
            addCriterion("loancp in", values, "loancp");
            return (Criteria) this;
        }

        public Criteria andLoancpNotIn(List<String> values) {
            addCriterion("loancp not in", values, "loancp");
            return (Criteria) this;
        }

        public Criteria andLoancpBetween(String value1, String value2) {
            addCriterion("loancp between", value1, value2, "loancp");
            return (Criteria) this;
        }

        public Criteria andLoancpNotBetween(String value1, String value2) {
            addCriterion("loancp not between", value1, value2, "loancp");
            return (Criteria) this;
        }

        public Criteria andLoanhzbeginIsNull() {
            addCriterion("loanhzbegin is null");
            return (Criteria) this;
        }

        public Criteria andLoanhzbeginIsNotNull() {
            addCriterion("loanhzbegin is not null");
            return (Criteria) this;
        }

        public Criteria andLoanhzbeginEqualTo(Date value) {
            addCriterionForJDBCDate("loanhzbegin =", value, "loanhzbegin");
            return (Criteria) this;
        }

        public Criteria andLoanhzbeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("loanhzbegin <>", value, "loanhzbegin");
            return (Criteria) this;
        }

        public Criteria andLoanhzbeginGreaterThan(Date value) {
            addCriterionForJDBCDate("loanhzbegin >", value, "loanhzbegin");
            return (Criteria) this;
        }

        public Criteria andLoanhzbeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loanhzbegin >=", value, "loanhzbegin");
            return (Criteria) this;
        }

        public Criteria andLoanhzbeginLessThan(Date value) {
            addCriterionForJDBCDate("loanhzbegin <", value, "loanhzbegin");
            return (Criteria) this;
        }

        public Criteria andLoanhzbeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loanhzbegin <=", value, "loanhzbegin");
            return (Criteria) this;
        }

        public Criteria andLoanhzbeginIn(List<Date> values) {
            addCriterionForJDBCDate("loanhzbegin in", values, "loanhzbegin");
            return (Criteria) this;
        }

        public Criteria andLoanhzbeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("loanhzbegin not in", values, "loanhzbegin");
            return (Criteria) this;
        }

        public Criteria andLoanhzbeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loanhzbegin between", value1, value2, "loanhzbegin");
            return (Criteria) this;
        }

        public Criteria andLoanhzbeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loanhzbegin not between", value1, value2, "loanhzbegin");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_inIsNull() {
            addCriterion("loanhzbegin_in is null");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_inIsNotNull() {
            addCriterion("loanhzbegin_in is not null");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_inEqualTo(Date value) {
            addCriterionForJDBCDate("loanhzbegin_in =", value, "loanhzbegin_in");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_inNotEqualTo(Date value) {
            addCriterionForJDBCDate("loanhzbegin_in <>", value, "loanhzbegin_in");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_inGreaterThan(Date value) {
            addCriterionForJDBCDate("loanhzbegin_in >", value, "loanhzbegin_in");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_inGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loanhzbegin_in >=", value, "loanhzbegin_in");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_inLessThan(Date value) {
            addCriterionForJDBCDate("loanhzbegin_in <", value, "loanhzbegin_in");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_inLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loanhzbegin_in <=", value, "loanhzbegin_in");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_inIn(List<Date> values) {
            addCriterionForJDBCDate("loanhzbegin_in in", values, "loanhzbegin_in");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_inNotIn(List<Date> values) {
            addCriterionForJDBCDate("loanhzbegin_in not in", values, "loanhzbegin_in");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_inBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loanhzbegin_in between", value1, value2, "loanhzbegin_in");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_inNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loanhzbegin_in not between", value1, value2, "loanhzbegin_in");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_outIsNull() {
            addCriterion("loanhzbegin_out is null");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_outIsNotNull() {
            addCriterion("loanhzbegin_out is not null");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_outEqualTo(Date value) {
            addCriterionForJDBCDate("loanhzbegin_out =", value, "loanhzbegin_out");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_outNotEqualTo(Date value) {
            addCriterionForJDBCDate("loanhzbegin_out <>", value, "loanhzbegin_out");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_outGreaterThan(Date value) {
            addCriterionForJDBCDate("loanhzbegin_out >", value, "loanhzbegin_out");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_outGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loanhzbegin_out >=", value, "loanhzbegin_out");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_outLessThan(Date value) {
            addCriterionForJDBCDate("loanhzbegin_out <", value, "loanhzbegin_out");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_outLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loanhzbegin_out <=", value, "loanhzbegin_out");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_outIn(List<Date> values) {
            addCriterionForJDBCDate("loanhzbegin_out in", values, "loanhzbegin_out");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_outNotIn(List<Date> values) {
            addCriterionForJDBCDate("loanhzbegin_out not in", values, "loanhzbegin_out");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_outBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loanhzbegin_out between", value1, value2, "loanhzbegin_out");
            return (Criteria) this;
        }

        public Criteria andLoanhzbegin_outNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loanhzbegin_out not between", value1, value2, "loanhzbegin_out");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectIsNull() {
            addCriterion("loanhzcontect is null");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectIsNotNull() {
            addCriterion("loanhzcontect is not null");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectEqualTo(String value) {
            addCriterion("loanhzcontect =", value, "loanhzcontect");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectNotEqualTo(String value) {
            addCriterion("loanhzcontect <>", value, "loanhzcontect");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectGreaterThan(String value) {
            addCriterion("loanhzcontect >", value, "loanhzcontect");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectGreaterThanOrEqualTo(String value) {
            addCriterion("loanhzcontect >=", value, "loanhzcontect");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectLessThan(String value) {
            addCriterion("loanhzcontect <", value, "loanhzcontect");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectLessThanOrEqualTo(String value) {
            addCriterion("loanhzcontect <=", value, "loanhzcontect");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectLike(String value) {
            addCriterion("loanhzcontect like", value, "loanhzcontect");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectNotLike(String value) {
            addCriterion("loanhzcontect not like", value, "loanhzcontect");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectIn(List<String> values) {
            addCriterion("loanhzcontect in", values, "loanhzcontect");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectNotIn(List<String> values) {
            addCriterion("loanhzcontect not in", values, "loanhzcontect");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectBetween(String value1, String value2) {
            addCriterion("loanhzcontect between", value1, value2, "loanhzcontect");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontectNotBetween(String value1, String value2) {
            addCriterion("loanhzcontect not between", value1, value2, "loanhzcontect");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelIsNull() {
            addCriterion("loanhzcontecttel is null");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelIsNotNull() {
            addCriterion("loanhzcontecttel is not null");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelEqualTo(String value) {
            addCriterion("loanhzcontecttel =", value, "loanhzcontecttel");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelNotEqualTo(String value) {
            addCriterion("loanhzcontecttel <>", value, "loanhzcontecttel");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelGreaterThan(String value) {
            addCriterion("loanhzcontecttel >", value, "loanhzcontecttel");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelGreaterThanOrEqualTo(String value) {
            addCriterion("loanhzcontecttel >=", value, "loanhzcontecttel");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelLessThan(String value) {
            addCriterion("loanhzcontecttel <", value, "loanhzcontecttel");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelLessThanOrEqualTo(String value) {
            addCriterion("loanhzcontecttel <=", value, "loanhzcontecttel");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelLike(String value) {
            addCriterion("loanhzcontecttel like", value, "loanhzcontecttel");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelNotLike(String value) {
            addCriterion("loanhzcontecttel not like", value, "loanhzcontecttel");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelIn(List<String> values) {
            addCriterion("loanhzcontecttel in", values, "loanhzcontecttel");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelNotIn(List<String> values) {
            addCriterion("loanhzcontecttel not in", values, "loanhzcontecttel");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelBetween(String value1, String value2) {
            addCriterion("loanhzcontecttel between", value1, value2, "loanhzcontecttel");
            return (Criteria) this;
        }

        public Criteria andLoanhzcontecttelNotBetween(String value1, String value2) {
            addCriterion("loanhzcontecttel not between", value1, value2, "loanhzcontecttel");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andLoandescIsNull() {
            addCriterion("loandesc is null");
            return (Criteria) this;
        }

        public Criteria andLoandescIsNotNull() {
            addCriterion("loandesc is not null");
            return (Criteria) this;
        }

        public Criteria andLoandescEqualTo(String value) {
            addCriterion("loandesc =", value, "loandesc");
            return (Criteria) this;
        }

        public Criteria andLoandescNotEqualTo(String value) {
            addCriterion("loandesc <>", value, "loandesc");
            return (Criteria) this;
        }

        public Criteria andLoandescGreaterThan(String value) {
            addCriterion("loandesc >", value, "loandesc");
            return (Criteria) this;
        }

        public Criteria andLoandescGreaterThanOrEqualTo(String value) {
            addCriterion("loandesc >=", value, "loandesc");
            return (Criteria) this;
        }

        public Criteria andLoandescLessThan(String value) {
            addCriterion("loandesc <", value, "loandesc");
            return (Criteria) this;
        }

        public Criteria andLoandescLessThanOrEqualTo(String value) {
            addCriterion("loandesc <=", value, "loandesc");
            return (Criteria) this;
        }

        public Criteria andLoandescLike(String value) {
            addCriterion("loandesc like", value, "loandesc");
            return (Criteria) this;
        }

        public Criteria andLoandescNotLike(String value) {
            addCriterion("loandesc not like", value, "loandesc");
            return (Criteria) this;
        }

        public Criteria andLoandescIn(List<String> values) {
            addCriterion("loandesc in", values, "loandesc");
            return (Criteria) this;
        }

        public Criteria andLoandescNotIn(List<String> values) {
            addCriterion("loandesc not in", values, "loandesc");
            return (Criteria) this;
        }

        public Criteria andLoandescBetween(String value1, String value2) {
            addCriterion("loandesc between", value1, value2, "loandesc");
            return (Criteria) this;
        }

        public Criteria andLoandescNotBetween(String value1, String value2) {
            addCriterion("loandesc not between", value1, value2, "loandesc");
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