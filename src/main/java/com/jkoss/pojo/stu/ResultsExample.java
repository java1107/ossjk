package com.jkoss.pojo.stu;

import java.util.ArrayList;
import java.util.List;

public class ResultsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResultsExample() {
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

        public Criteria andResidIsNull() {
            addCriterion("resid is null");
            return (Criteria) this;
        }

        public Criteria andResidIsNotNull() {
            addCriterion("resid is not null");
            return (Criteria) this;
        }

        public Criteria andResidEqualTo(Integer value) {
            addCriterion("resid =", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidNotEqualTo(Integer value) {
            addCriterion("resid <>", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidGreaterThan(Integer value) {
            addCriterion("resid >", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resid >=", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidLessThan(Integer value) {
            addCriterion("resid <", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidLessThanOrEqualTo(Integer value) {
            addCriterion("resid <=", value, "resid");
            return (Criteria) this;
        }

        public Criteria andResidIn(List<Integer> values) {
            addCriterion("resid in", values, "resid");
            return (Criteria) this;
        }

        public Criteria andResidNotIn(List<Integer> values) {
            addCriterion("resid not in", values, "resid");
            return (Criteria) this;
        }

        public Criteria andResidBetween(Integer value1, Integer value2) {
            addCriterion("resid between", value1, value2, "resid");
            return (Criteria) this;
        }

        public Criteria andResidNotBetween(Integer value1, Integer value2) {
            addCriterion("resid not between", value1, value2, "resid");
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

        public Criteria andThemeidIsNull() {
            addCriterion("themeid is null");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNotNull() {
            addCriterion("themeid is not null");
            return (Criteria) this;
        }

        public Criteria andThemeidEqualTo(Integer value) {
            addCriterion("themeid =", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotEqualTo(Integer value) {
            addCriterion("themeid <>", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThan(Integer value) {
            addCriterion("themeid >", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("themeid >=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThan(Integer value) {
            addCriterion("themeid <", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThanOrEqualTo(Integer value) {
            addCriterion("themeid <=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidIn(List<Integer> values) {
            addCriterion("themeid in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotIn(List<Integer> values) {
            addCriterion("themeid not in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidBetween(Integer value1, Integer value2) {
            addCriterion("themeid between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotBetween(Integer value1, Integer value2) {
            addCriterion("themeid not between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoredescbIsNull() {
            addCriterion("scoredescb is null");
            return (Criteria) this;
        }

        public Criteria andScoredescbIsNotNull() {
            addCriterion("scoredescb is not null");
            return (Criteria) this;
        }

        public Criteria andScoredescbEqualTo(String value) {
            addCriterion("scoredescb =", value, "scoredescb");
            return (Criteria) this;
        }

        public Criteria andScoredescbNotEqualTo(String value) {
            addCriterion("scoredescb <>", value, "scoredescb");
            return (Criteria) this;
        }

        public Criteria andScoredescbGreaterThan(String value) {
            addCriterion("scoredescb >", value, "scoredescb");
            return (Criteria) this;
        }

        public Criteria andScoredescbGreaterThanOrEqualTo(String value) {
            addCriterion("scoredescb >=", value, "scoredescb");
            return (Criteria) this;
        }

        public Criteria andScoredescbLessThan(String value) {
            addCriterion("scoredescb <", value, "scoredescb");
            return (Criteria) this;
        }

        public Criteria andScoredescbLessThanOrEqualTo(String value) {
            addCriterion("scoredescb <=", value, "scoredescb");
            return (Criteria) this;
        }

        public Criteria andScoredescbLike(String value) {
            addCriterion("scoredescb like", value, "scoredescb");
            return (Criteria) this;
        }

        public Criteria andScoredescbNotLike(String value) {
            addCriterion("scoredescb not like", value, "scoredescb");
            return (Criteria) this;
        }

        public Criteria andScoredescbIn(List<String> values) {
            addCriterion("scoredescb in", values, "scoredescb");
            return (Criteria) this;
        }

        public Criteria andScoredescbNotIn(List<String> values) {
            addCriterion("scoredescb not in", values, "scoredescb");
            return (Criteria) this;
        }

        public Criteria andScoredescbBetween(String value1, String value2) {
            addCriterion("scoredescb between", value1, value2, "scoredescb");
            return (Criteria) this;
        }

        public Criteria andScoredescbNotBetween(String value1, String value2) {
            addCriterion("scoredescb not between", value1, value2, "scoredescb");
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