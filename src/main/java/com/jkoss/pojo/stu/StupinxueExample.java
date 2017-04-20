package com.jkoss.pojo.stu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StupinxueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StupinxueExample() {
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

        public Criteria andPinjiaIDIsNull() {
            addCriterion("pinjiaID is null");
            return (Criteria) this;
        }

        public Criteria andPinjiaIDIsNotNull() {
            addCriterion("pinjiaID is not null");
            return (Criteria) this;
        }

        public Criteria andPinjiaIDEqualTo(Integer value) {
            addCriterion("pinjiaID =", value, "pinjiaID");
            return (Criteria) this;
        }

        public Criteria andPinjiaIDNotEqualTo(Integer value) {
            addCriterion("pinjiaID <>", value, "pinjiaID");
            return (Criteria) this;
        }

        public Criteria andPinjiaIDGreaterThan(Integer value) {
            addCriterion("pinjiaID >", value, "pinjiaID");
            return (Criteria) this;
        }

        public Criteria andPinjiaIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("pinjiaID >=", value, "pinjiaID");
            return (Criteria) this;
        }

        public Criteria andPinjiaIDLessThan(Integer value) {
            addCriterion("pinjiaID <", value, "pinjiaID");
            return (Criteria) this;
        }

        public Criteria andPinjiaIDLessThanOrEqualTo(Integer value) {
            addCriterion("pinjiaID <=", value, "pinjiaID");
            return (Criteria) this;
        }

        public Criteria andPinjiaIDIn(List<Integer> values) {
            addCriterion("pinjiaID in", values, "pinjiaID");
            return (Criteria) this;
        }

        public Criteria andPinjiaIDNotIn(List<Integer> values) {
            addCriterion("pinjiaID not in", values, "pinjiaID");
            return (Criteria) this;
        }

        public Criteria andPinjiaIDBetween(Integer value1, Integer value2) {
            addCriterion("pinjiaID between", value1, value2, "pinjiaID");
            return (Criteria) this;
        }

        public Criteria andPinjiaIDNotBetween(Integer value1, Integer value2) {
            addCriterion("pinjiaID not between", value1, value2, "pinjiaID");
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

        public Criteria andPjDateIsNull() {
            addCriterion("pjDate is null");
            return (Criteria) this;
        }

        public Criteria andPjDateIsNotNull() {
            addCriterion("pjDate is not null");
            return (Criteria) this;
        }

        public Criteria andPjDateEqualTo(Date value) {
            addCriterion("pjDate =", value, "pjDate");
            return (Criteria) this;
        }

        public Criteria andPjDateNotEqualTo(Date value) {
            addCriterion("pjDate <>", value, "pjDate");
            return (Criteria) this;
        }

        public Criteria andPjDateGreaterThan(Date value) {
            addCriterion("pjDate >", value, "pjDate");
            return (Criteria) this;
        }

        public Criteria andPjDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pjDate >=", value, "pjDate");
            return (Criteria) this;
        }

        public Criteria andPjDateLessThan(Date value) {
            addCriterion("pjDate <", value, "pjDate");
            return (Criteria) this;
        }

        public Criteria andPjDateLessThanOrEqualTo(Date value) {
            addCriterion("pjDate <=", value, "pjDate");
            return (Criteria) this;
        }

        public Criteria andPjDateIn(List<Date> values) {
            addCriterion("pjDate in", values, "pjDate");
            return (Criteria) this;
        }

        public Criteria andPjDateNotIn(List<Date> values) {
            addCriterion("pjDate not in", values, "pjDate");
            return (Criteria) this;
        }

        public Criteria andPjDateBetween(Date value1, Date value2) {
            addCriterion("pjDate between", value1, value2, "pjDate");
            return (Criteria) this;
        }

        public Criteria andPjDateNotBetween(Date value1, Date value2) {
            addCriterion("pjDate not between", value1, value2, "pjDate");
            return (Criteria) this;
        }

        public Criteria andStulistenIsNull() {
            addCriterion("stulisten is null");
            return (Criteria) this;
        }

        public Criteria andStulistenIsNotNull() {
            addCriterion("stulisten is not null");
            return (Criteria) this;
        }

        public Criteria andStulistenEqualTo(Integer value) {
            addCriterion("stulisten =", value, "stulisten");
            return (Criteria) this;
        }

        public Criteria andStulistenNotEqualTo(Integer value) {
            addCriterion("stulisten <>", value, "stulisten");
            return (Criteria) this;
        }

        public Criteria andStulistenGreaterThan(Integer value) {
            addCriterion("stulisten >", value, "stulisten");
            return (Criteria) this;
        }

        public Criteria andStulistenGreaterThanOrEqualTo(Integer value) {
            addCriterion("stulisten >=", value, "stulisten");
            return (Criteria) this;
        }

        public Criteria andStulistenLessThan(Integer value) {
            addCriterion("stulisten <", value, "stulisten");
            return (Criteria) this;
        }

        public Criteria andStulistenLessThanOrEqualTo(Integer value) {
            addCriterion("stulisten <=", value, "stulisten");
            return (Criteria) this;
        }

        public Criteria andStulistenIn(List<Integer> values) {
            addCriterion("stulisten in", values, "stulisten");
            return (Criteria) this;
        }

        public Criteria andStulistenNotIn(List<Integer> values) {
            addCriterion("stulisten not in", values, "stulisten");
            return (Criteria) this;
        }

        public Criteria andStulistenBetween(Integer value1, Integer value2) {
            addCriterion("stulisten between", value1, value2, "stulisten");
            return (Criteria) this;
        }

        public Criteria andStulistenNotBetween(Integer value1, Integer value2) {
            addCriterion("stulisten not between", value1, value2, "stulisten");
            return (Criteria) this;
        }

        public Criteria andStudoIsNull() {
            addCriterion("studo is null");
            return (Criteria) this;
        }

        public Criteria andStudoIsNotNull() {
            addCriterion("studo is not null");
            return (Criteria) this;
        }

        public Criteria andStudoEqualTo(Integer value) {
            addCriterion("studo =", value, "studo");
            return (Criteria) this;
        }

        public Criteria andStudoNotEqualTo(Integer value) {
            addCriterion("studo <>", value, "studo");
            return (Criteria) this;
        }

        public Criteria andStudoGreaterThan(Integer value) {
            addCriterion("studo >", value, "studo");
            return (Criteria) this;
        }

        public Criteria andStudoGreaterThanOrEqualTo(Integer value) {
            addCriterion("studo >=", value, "studo");
            return (Criteria) this;
        }

        public Criteria andStudoLessThan(Integer value) {
            addCriterion("studo <", value, "studo");
            return (Criteria) this;
        }

        public Criteria andStudoLessThanOrEqualTo(Integer value) {
            addCriterion("studo <=", value, "studo");
            return (Criteria) this;
        }

        public Criteria andStudoIn(List<Integer> values) {
            addCriterion("studo in", values, "studo");
            return (Criteria) this;
        }

        public Criteria andStudoNotIn(List<Integer> values) {
            addCriterion("studo not in", values, "studo");
            return (Criteria) this;
        }

        public Criteria andStudoBetween(Integer value1, Integer value2) {
            addCriterion("studo between", value1, value2, "studo");
            return (Criteria) this;
        }

        public Criteria andStudoNotBetween(Integer value1, Integer value2) {
            addCriterion("studo not between", value1, value2, "studo");
            return (Criteria) this;
        }

        public Criteria andJxcontentIsNull() {
            addCriterion("jxcontent is null");
            return (Criteria) this;
        }

        public Criteria andJxcontentIsNotNull() {
            addCriterion("jxcontent is not null");
            return (Criteria) this;
        }

        public Criteria andJxcontentEqualTo(String value) {
            addCriterion("jxcontent =", value, "jxcontent");
            return (Criteria) this;
        }

        public Criteria andJxcontentNotEqualTo(String value) {
            addCriterion("jxcontent <>", value, "jxcontent");
            return (Criteria) this;
        }

        public Criteria andJxcontentGreaterThan(String value) {
            addCriterion("jxcontent >", value, "jxcontent");
            return (Criteria) this;
        }

        public Criteria andJxcontentGreaterThanOrEqualTo(String value) {
            addCriterion("jxcontent >=", value, "jxcontent");
            return (Criteria) this;
        }

        public Criteria andJxcontentLessThan(String value) {
            addCriterion("jxcontent <", value, "jxcontent");
            return (Criteria) this;
        }

        public Criteria andJxcontentLessThanOrEqualTo(String value) {
            addCriterion("jxcontent <=", value, "jxcontent");
            return (Criteria) this;
        }

        public Criteria andJxcontentLike(String value) {
            addCriterion("jxcontent like", value, "jxcontent");
            return (Criteria) this;
        }

        public Criteria andJxcontentNotLike(String value) {
            addCriterion("jxcontent not like", value, "jxcontent");
            return (Criteria) this;
        }

        public Criteria andJxcontentIn(List<String> values) {
            addCriterion("jxcontent in", values, "jxcontent");
            return (Criteria) this;
        }

        public Criteria andJxcontentNotIn(List<String> values) {
            addCriterion("jxcontent not in", values, "jxcontent");
            return (Criteria) this;
        }

        public Criteria andJxcontentBetween(String value1, String value2) {
            addCriterion("jxcontent between", value1, value2, "jxcontent");
            return (Criteria) this;
        }

        public Criteria andJxcontentNotBetween(String value1, String value2) {
            addCriterion("jxcontent not between", value1, value2, "jxcontent");
            return (Criteria) this;
        }

        public Criteria andExplangIsNull() {
            addCriterion("explang is null");
            return (Criteria) this;
        }

        public Criteria andExplangIsNotNull() {
            addCriterion("explang is not null");
            return (Criteria) this;
        }

        public Criteria andExplangEqualTo(String value) {
            addCriterion("explang =", value, "explang");
            return (Criteria) this;
        }

        public Criteria andExplangNotEqualTo(String value) {
            addCriterion("explang <>", value, "explang");
            return (Criteria) this;
        }

        public Criteria andExplangGreaterThan(String value) {
            addCriterion("explang >", value, "explang");
            return (Criteria) this;
        }

        public Criteria andExplangGreaterThanOrEqualTo(String value) {
            addCriterion("explang >=", value, "explang");
            return (Criteria) this;
        }

        public Criteria andExplangLessThan(String value) {
            addCriterion("explang <", value, "explang");
            return (Criteria) this;
        }

        public Criteria andExplangLessThanOrEqualTo(String value) {
            addCriterion("explang <=", value, "explang");
            return (Criteria) this;
        }

        public Criteria andExplangLike(String value) {
            addCriterion("explang like", value, "explang");
            return (Criteria) this;
        }

        public Criteria andExplangNotLike(String value) {
            addCriterion("explang not like", value, "explang");
            return (Criteria) this;
        }

        public Criteria andExplangIn(List<String> values) {
            addCriterion("explang in", values, "explang");
            return (Criteria) this;
        }

        public Criteria andExplangNotIn(List<String> values) {
            addCriterion("explang not in", values, "explang");
            return (Criteria) this;
        }

        public Criteria andExplangBetween(String value1, String value2) {
            addCriterion("explang between", value1, value2, "explang");
            return (Criteria) this;
        }

        public Criteria andExplangNotBetween(String value1, String value2) {
            addCriterion("explang not between", value1, value2, "explang");
            return (Criteria) this;
        }

        public Criteria andOthadvIsNull() {
            addCriterion("othadv is null");
            return (Criteria) this;
        }

        public Criteria andOthadvIsNotNull() {
            addCriterion("othadv is not null");
            return (Criteria) this;
        }

        public Criteria andOthadvEqualTo(String value) {
            addCriterion("othadv =", value, "othadv");
            return (Criteria) this;
        }

        public Criteria andOthadvNotEqualTo(String value) {
            addCriterion("othadv <>", value, "othadv");
            return (Criteria) this;
        }

        public Criteria andOthadvGreaterThan(String value) {
            addCriterion("othadv >", value, "othadv");
            return (Criteria) this;
        }

        public Criteria andOthadvGreaterThanOrEqualTo(String value) {
            addCriterion("othadv >=", value, "othadv");
            return (Criteria) this;
        }

        public Criteria andOthadvLessThan(String value) {
            addCriterion("othadv <", value, "othadv");
            return (Criteria) this;
        }

        public Criteria andOthadvLessThanOrEqualTo(String value) {
            addCriterion("othadv <=", value, "othadv");
            return (Criteria) this;
        }

        public Criteria andOthadvLike(String value) {
            addCriterion("othadv like", value, "othadv");
            return (Criteria) this;
        }

        public Criteria andOthadvNotLike(String value) {
            addCriterion("othadv not like", value, "othadv");
            return (Criteria) this;
        }

        public Criteria andOthadvIn(List<String> values) {
            addCriterion("othadv in", values, "othadv");
            return (Criteria) this;
        }

        public Criteria andOthadvNotIn(List<String> values) {
            addCriterion("othadv not in", values, "othadv");
            return (Criteria) this;
        }

        public Criteria andOthadvBetween(String value1, String value2) {
            addCriterion("othadv between", value1, value2, "othadv");
            return (Criteria) this;
        }

        public Criteria andOthadvNotBetween(String value1, String value2) {
            addCriterion("othadv not between", value1, value2, "othadv");
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