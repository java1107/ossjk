package com.jkoss.pojo.jy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StucompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StucompanyExample() {
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

        public Criteria andJygjIDIsNull() {
            addCriterion("jygjID is null");
            return (Criteria) this;
        }

        public Criteria andJygjIDIsNotNull() {
            addCriterion("jygjID is not null");
            return (Criteria) this;
        }

        public Criteria andJygjIDEqualTo(Integer value) {
            addCriterion("jygjID =", value, "jygjID");
            return (Criteria) this;
        }

        public Criteria andJygjIDNotEqualTo(Integer value) {
            addCriterion("jygjID <>", value, "jygjID");
            return (Criteria) this;
        }

        public Criteria andJygjIDGreaterThan(Integer value) {
            addCriterion("jygjID >", value, "jygjID");
            return (Criteria) this;
        }

        public Criteria andJygjIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("jygjID >=", value, "jygjID");
            return (Criteria) this;
        }

        public Criteria andJygjIDLessThan(Integer value) {
            addCriterion("jygjID <", value, "jygjID");
            return (Criteria) this;
        }

        public Criteria andJygjIDLessThanOrEqualTo(Integer value) {
            addCriterion("jygjID <=", value, "jygjID");
            return (Criteria) this;
        }

        public Criteria andJygjIDIn(List<Integer> values) {
            addCriterion("jygjID in", values, "jygjID");
            return (Criteria) this;
        }

        public Criteria andJygjIDNotIn(List<Integer> values) {
            addCriterion("jygjID not in", values, "jygjID");
            return (Criteria) this;
        }

        public Criteria andJygjIDBetween(Integer value1, Integer value2) {
            addCriterion("jygjID between", value1, value2, "jygjID");
            return (Criteria) this;
        }

        public Criteria andJygjIDNotBetween(Integer value1, Integer value2) {
            addCriterion("jygjID not between", value1, value2, "jygjID");
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

        public Criteria andJyidIsNull() {
            addCriterion("jyid is null");
            return (Criteria) this;
        }

        public Criteria andJyidIsNotNull() {
            addCriterion("jyid is not null");
            return (Criteria) this;
        }

        public Criteria andJyidEqualTo(Integer value) {
            addCriterion("jyid =", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotEqualTo(Integer value) {
            addCriterion("jyid <>", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidGreaterThan(Integer value) {
            addCriterion("jyid >", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jyid >=", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidLessThan(Integer value) {
            addCriterion("jyid <", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidLessThanOrEqualTo(Integer value) {
            addCriterion("jyid <=", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidIn(List<Integer> values) {
            addCriterion("jyid in", values, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotIn(List<Integer> values) {
            addCriterion("jyid not in", values, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidBetween(Integer value1, Integer value2) {
            addCriterion("jyid between", value1, value2, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotBetween(Integer value1, Integer value2) {
            addCriterion("jyid not between", value1, value2, "jyid");
            return (Criteria) this;
        }

        public Criteria andJygjDateIsNull() {
            addCriterion("jygjDate is null");
            return (Criteria) this;
        }

        public Criteria andJygjDateIsNotNull() {
            addCriterion("jygjDate is not null");
            return (Criteria) this;
        }

        public Criteria andJygjDateEqualTo(Date value) {
            addCriterion("jygjDate =", value, "jygjDate");
            return (Criteria) this;
        }

        public Criteria andJygjDateNotEqualTo(Date value) {
            addCriterion("jygjDate <>", value, "jygjDate");
            return (Criteria) this;
        }

        public Criteria andJygjDateGreaterThan(Date value) {
            addCriterion("jygjDate >", value, "jygjDate");
            return (Criteria) this;
        }

        public Criteria andJygjDateGreaterThanOrEqualTo(Date value) {
            addCriterion("jygjDate >=", value, "jygjDate");
            return (Criteria) this;
        }

        public Criteria andJygjDateLessThan(Date value) {
            addCriterion("jygjDate <", value, "jygjDate");
            return (Criteria) this;
        }

        public Criteria andJygjDateLessThanOrEqualTo(Date value) {
            addCriterion("jygjDate <=", value, "jygjDate");
            return (Criteria) this;
        }

        public Criteria andJygjDateIn(List<Date> values) {
            addCriterion("jygjDate in", values, "jygjDate");
            return (Criteria) this;
        }

        public Criteria andJygjDateNotIn(List<Date> values) {
            addCriterion("jygjDate not in", values, "jygjDate");
            return (Criteria) this;
        }

        public Criteria andJygjDateBetween(Date value1, Date value2) {
            addCriterion("jygjDate between", value1, value2, "jygjDate");
            return (Criteria) this;
        }

        public Criteria andJygjDateNotBetween(Date value1, Date value2) {
            addCriterion("jygjDate not between", value1, value2, "jygjDate");
            return (Criteria) this;
        }

        public Criteria andJygjcontentIsNull() {
            addCriterion("jygjcontent is null");
            return (Criteria) this;
        }

        public Criteria andJygjcontentIsNotNull() {
            addCriterion("jygjcontent is not null");
            return (Criteria) this;
        }

        public Criteria andJygjcontentEqualTo(String value) {
            addCriterion("jygjcontent =", value, "jygjcontent");
            return (Criteria) this;
        }

        public Criteria andJygjcontentNotEqualTo(String value) {
            addCriterion("jygjcontent <>", value, "jygjcontent");
            return (Criteria) this;
        }

        public Criteria andJygjcontentGreaterThan(String value) {
            addCriterion("jygjcontent >", value, "jygjcontent");
            return (Criteria) this;
        }

        public Criteria andJygjcontentGreaterThanOrEqualTo(String value) {
            addCriterion("jygjcontent >=", value, "jygjcontent");
            return (Criteria) this;
        }

        public Criteria andJygjcontentLessThan(String value) {
            addCriterion("jygjcontent <", value, "jygjcontent");
            return (Criteria) this;
        }

        public Criteria andJygjcontentLessThanOrEqualTo(String value) {
            addCriterion("jygjcontent <=", value, "jygjcontent");
            return (Criteria) this;
        }

        public Criteria andJygjcontentLike(String value) {
            addCriterion("jygjcontent like", value, "jygjcontent");
            return (Criteria) this;
        }

        public Criteria andJygjcontentNotLike(String value) {
            addCriterion("jygjcontent not like", value, "jygjcontent");
            return (Criteria) this;
        }

        public Criteria andJygjcontentIn(List<String> values) {
            addCriterion("jygjcontent in", values, "jygjcontent");
            return (Criteria) this;
        }

        public Criteria andJygjcontentNotIn(List<String> values) {
            addCriterion("jygjcontent not in", values, "jygjcontent");
            return (Criteria) this;
        }

        public Criteria andJygjcontentBetween(String value1, String value2) {
            addCriterion("jygjcontent between", value1, value2, "jygjcontent");
            return (Criteria) this;
        }

        public Criteria andJygjcontentNotBetween(String value1, String value2) {
            addCriterion("jygjcontent not between", value1, value2, "jygjcontent");
            return (Criteria) this;
        }

        public Criteria andJygjresultIsNull() {
            addCriterion("jygjresult is null");
            return (Criteria) this;
        }

        public Criteria andJygjresultIsNotNull() {
            addCriterion("jygjresult is not null");
            return (Criteria) this;
        }

        public Criteria andJygjresultEqualTo(String value) {
            addCriterion("jygjresult =", value, "jygjresult");
            return (Criteria) this;
        }

        public Criteria andJygjresultNotEqualTo(String value) {
            addCriterion("jygjresult <>", value, "jygjresult");
            return (Criteria) this;
        }

        public Criteria andJygjresultGreaterThan(String value) {
            addCriterion("jygjresult >", value, "jygjresult");
            return (Criteria) this;
        }

        public Criteria andJygjresultGreaterThanOrEqualTo(String value) {
            addCriterion("jygjresult >=", value, "jygjresult");
            return (Criteria) this;
        }

        public Criteria andJygjresultLessThan(String value) {
            addCriterion("jygjresult <", value, "jygjresult");
            return (Criteria) this;
        }

        public Criteria andJygjresultLessThanOrEqualTo(String value) {
            addCriterion("jygjresult <=", value, "jygjresult");
            return (Criteria) this;
        }

        public Criteria andJygjresultLike(String value) {
            addCriterion("jygjresult like", value, "jygjresult");
            return (Criteria) this;
        }

        public Criteria andJygjresultNotLike(String value) {
            addCriterion("jygjresult not like", value, "jygjresult");
            return (Criteria) this;
        }

        public Criteria andJygjresultIn(List<String> values) {
            addCriterion("jygjresult in", values, "jygjresult");
            return (Criteria) this;
        }

        public Criteria andJygjresultNotIn(List<String> values) {
            addCriterion("jygjresult not in", values, "jygjresult");
            return (Criteria) this;
        }

        public Criteria andJygjresultBetween(String value1, String value2) {
            addCriterion("jygjresult between", value1, value2, "jygjresult");
            return (Criteria) this;
        }

        public Criteria andJygjresultNotBetween(String value1, String value2) {
            addCriterion("jygjresult not between", value1, value2, "jygjresult");
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