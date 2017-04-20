package com.jkoss.pojo.jy;

import java.util.ArrayList;
import java.util.List;

public class JiuyeJobsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JiuyeJobsExample() {
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

        public Criteria andJobidIsNull() {
            addCriterion("jobid is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("jobid is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(Integer value) {
            addCriterion("jobid =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(Integer value) {
            addCriterion("jobid <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(Integer value) {
            addCriterion("jobid >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobid >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(Integer value) {
            addCriterion("jobid <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(Integer value) {
            addCriterion("jobid <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<Integer> values) {
            addCriterion("jobid in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<Integer> values) {
            addCriterion("jobid not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(Integer value1, Integer value2) {
            addCriterion("jobid between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(Integer value1, Integer value2) {
            addCriterion("jobid not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andDepIDIsNull() {
            addCriterion("depID is null");
            return (Criteria) this;
        }

        public Criteria andDepIDIsNotNull() {
            addCriterion("depID is not null");
            return (Criteria) this;
        }

        public Criteria andDepIDEqualTo(Integer value) {
            addCriterion("depID =", value, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDNotEqualTo(Integer value) {
            addCriterion("depID <>", value, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDGreaterThan(Integer value) {
            addCriterion("depID >", value, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("depID >=", value, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDLessThan(Integer value) {
            addCriterion("depID <", value, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDLessThanOrEqualTo(Integer value) {
            addCriterion("depID <=", value, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDIn(List<Integer> values) {
            addCriterion("depID in", values, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDNotIn(List<Integer> values) {
            addCriterion("depID not in", values, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDBetween(Integer value1, Integer value2) {
            addCriterion("depID between", value1, value2, "depID");
            return (Criteria) this;
        }

        public Criteria andDepIDNotBetween(Integer value1, Integer value2) {
            addCriterion("depID not between", value1, value2, "depID");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("jobname is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("jobname is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("jobname =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("jobname <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("jobname >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("jobname >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("jobname <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("jobname <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("jobname like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("jobname not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("jobname in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("jobname not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("jobname between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("jobname not between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobdescIsNull() {
            addCriterion("jobdesc is null");
            return (Criteria) this;
        }

        public Criteria andJobdescIsNotNull() {
            addCriterion("jobdesc is not null");
            return (Criteria) this;
        }

        public Criteria andJobdescEqualTo(String value) {
            addCriterion("jobdesc =", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotEqualTo(String value) {
            addCriterion("jobdesc <>", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescGreaterThan(String value) {
            addCriterion("jobdesc >", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescGreaterThanOrEqualTo(String value) {
            addCriterion("jobdesc >=", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescLessThan(String value) {
            addCriterion("jobdesc <", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescLessThanOrEqualTo(String value) {
            addCriterion("jobdesc <=", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescLike(String value) {
            addCriterion("jobdesc like", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotLike(String value) {
            addCriterion("jobdesc not like", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescIn(List<String> values) {
            addCriterion("jobdesc in", values, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotIn(List<String> values) {
            addCriterion("jobdesc not in", values, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescBetween(String value1, String value2) {
            addCriterion("jobdesc between", value1, value2, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotBetween(String value1, String value2) {
            addCriterion("jobdesc not between", value1, value2, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobsalIsNull() {
            addCriterion("jobsal is null");
            return (Criteria) this;
        }

        public Criteria andJobsalIsNotNull() {
            addCriterion("jobsal is not null");
            return (Criteria) this;
        }

        public Criteria andJobsalEqualTo(Integer value) {
            addCriterion("jobsal =", value, "jobsal");
            return (Criteria) this;
        }

        public Criteria andJobsalNotEqualTo(Integer value) {
            addCriterion("jobsal <>", value, "jobsal");
            return (Criteria) this;
        }

        public Criteria andJobsalGreaterThan(Integer value) {
            addCriterion("jobsal >", value, "jobsal");
            return (Criteria) this;
        }

        public Criteria andJobsalGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobsal >=", value, "jobsal");
            return (Criteria) this;
        }

        public Criteria andJobsalLessThan(Integer value) {
            addCriterion("jobsal <", value, "jobsal");
            return (Criteria) this;
        }

        public Criteria andJobsalLessThanOrEqualTo(Integer value) {
            addCriterion("jobsal <=", value, "jobsal");
            return (Criteria) this;
        }

        public Criteria andJobsalIn(List<Integer> values) {
            addCriterion("jobsal in", values, "jobsal");
            return (Criteria) this;
        }

        public Criteria andJobsalNotIn(List<Integer> values) {
            addCriterion("jobsal not in", values, "jobsal");
            return (Criteria) this;
        }

        public Criteria andJobsalBetween(Integer value1, Integer value2) {
            addCriterion("jobsal between", value1, value2, "jobsal");
            return (Criteria) this;
        }

        public Criteria andJobsalNotBetween(Integer value1, Integer value2) {
            addCriterion("jobsal not between", value1, value2, "jobsal");
            return (Criteria) this;
        }

        public Criteria andJxsalIsNull() {
            addCriterion("jxsal is null");
            return (Criteria) this;
        }

        public Criteria andJxsalIsNotNull() {
            addCriterion("jxsal is not null");
            return (Criteria) this;
        }

        public Criteria andJxsalEqualTo(String value) {
            addCriterion("jxsal =", value, "jxsal");
            return (Criteria) this;
        }

        public Criteria andJxsalNotEqualTo(String value) {
            addCriterion("jxsal <>", value, "jxsal");
            return (Criteria) this;
        }

        public Criteria andJxsalGreaterThan(String value) {
            addCriterion("jxsal >", value, "jxsal");
            return (Criteria) this;
        }

        public Criteria andJxsalGreaterThanOrEqualTo(String value) {
            addCriterion("jxsal >=", value, "jxsal");
            return (Criteria) this;
        }

        public Criteria andJxsalLessThan(String value) {
            addCriterion("jxsal <", value, "jxsal");
            return (Criteria) this;
        }

        public Criteria andJxsalLessThanOrEqualTo(String value) {
            addCriterion("jxsal <=", value, "jxsal");
            return (Criteria) this;
        }

        public Criteria andJxsalLike(String value) {
            addCriterion("jxsal like", value, "jxsal");
            return (Criteria) this;
        }

        public Criteria andJxsalNotLike(String value) {
            addCriterion("jxsal not like", value, "jxsal");
            return (Criteria) this;
        }

        public Criteria andJxsalIn(List<String> values) {
            addCriterion("jxsal in", values, "jxsal");
            return (Criteria) this;
        }

        public Criteria andJxsalNotIn(List<String> values) {
            addCriterion("jxsal not in", values, "jxsal");
            return (Criteria) this;
        }

        public Criteria andJxsalBetween(String value1, String value2) {
            addCriterion("jxsal between", value1, value2, "jxsal");
            return (Criteria) this;
        }

        public Criteria andJxsalNotBetween(String value1, String value2) {
            addCriterion("jxsal not between", value1, value2, "jxsal");
            return (Criteria) this;
        }

        public Criteria andThrsalIsNull() {
            addCriterion("thrsal is null");
            return (Criteria) this;
        }

        public Criteria andThrsalIsNotNull() {
            addCriterion("thrsal is not null");
            return (Criteria) this;
        }

        public Criteria andThrsalEqualTo(String value) {
            addCriterion("thrsal =", value, "thrsal");
            return (Criteria) this;
        }

        public Criteria andThrsalNotEqualTo(String value) {
            addCriterion("thrsal <>", value, "thrsal");
            return (Criteria) this;
        }

        public Criteria andThrsalGreaterThan(String value) {
            addCriterion("thrsal >", value, "thrsal");
            return (Criteria) this;
        }

        public Criteria andThrsalGreaterThanOrEqualTo(String value) {
            addCriterion("thrsal >=", value, "thrsal");
            return (Criteria) this;
        }

        public Criteria andThrsalLessThan(String value) {
            addCriterion("thrsal <", value, "thrsal");
            return (Criteria) this;
        }

        public Criteria andThrsalLessThanOrEqualTo(String value) {
            addCriterion("thrsal <=", value, "thrsal");
            return (Criteria) this;
        }

        public Criteria andThrsalLike(String value) {
            addCriterion("thrsal like", value, "thrsal");
            return (Criteria) this;
        }

        public Criteria andThrsalNotLike(String value) {
            addCriterion("thrsal not like", value, "thrsal");
            return (Criteria) this;
        }

        public Criteria andThrsalIn(List<String> values) {
            addCriterion("thrsal in", values, "thrsal");
            return (Criteria) this;
        }

        public Criteria andThrsalNotIn(List<String> values) {
            addCriterion("thrsal not in", values, "thrsal");
            return (Criteria) this;
        }

        public Criteria andThrsalBetween(String value1, String value2) {
            addCriterion("thrsal between", value1, value2, "thrsal");
            return (Criteria) this;
        }

        public Criteria andThrsalNotBetween(String value1, String value2) {
            addCriterion("thrsal not between", value1, value2, "thrsal");
            return (Criteria) this;
        }

        public Criteria andUpjobidIsNull() {
            addCriterion("upjobid is null");
            return (Criteria) this;
        }

        public Criteria andUpjobidIsNotNull() {
            addCriterion("upjobid is not null");
            return (Criteria) this;
        }

        public Criteria andUpjobidEqualTo(Integer value) {
            addCriterion("upjobid =", value, "upjobid");
            return (Criteria) this;
        }

        public Criteria andUpjobidNotEqualTo(Integer value) {
            addCriterion("upjobid <>", value, "upjobid");
            return (Criteria) this;
        }

        public Criteria andUpjobidGreaterThan(Integer value) {
            addCriterion("upjobid >", value, "upjobid");
            return (Criteria) this;
        }

        public Criteria andUpjobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("upjobid >=", value, "upjobid");
            return (Criteria) this;
        }

        public Criteria andUpjobidLessThan(Integer value) {
            addCriterion("upjobid <", value, "upjobid");
            return (Criteria) this;
        }

        public Criteria andUpjobidLessThanOrEqualTo(Integer value) {
            addCriterion("upjobid <=", value, "upjobid");
            return (Criteria) this;
        }

        public Criteria andUpjobidIn(List<Integer> values) {
            addCriterion("upjobid in", values, "upjobid");
            return (Criteria) this;
        }

        public Criteria andUpjobidNotIn(List<Integer> values) {
            addCriterion("upjobid not in", values, "upjobid");
            return (Criteria) this;
        }

        public Criteria andUpjobidBetween(Integer value1, Integer value2) {
            addCriterion("upjobid between", value1, value2, "upjobid");
            return (Criteria) this;
        }

        public Criteria andUpjobidNotBetween(Integer value1, Integer value2) {
            addCriterion("upjobid not between", value1, value2, "upjobid");
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