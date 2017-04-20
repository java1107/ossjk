package com.jkoss.pojo.jy;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JiuyerecodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JiuyerecodeExample() {
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

        public Criteria andJysuccidIsNull() {
            addCriterion("jysuccid is null");
            return (Criteria) this;
        }

        public Criteria andJysuccidIsNotNull() {
            addCriterion("jysuccid is not null");
            return (Criteria) this;
        }

        public Criteria andJysuccidEqualTo(Integer value) {
            addCriterion("jysuccid =", value, "jysuccid");
            return (Criteria) this;
        }

        public Criteria andJysuccidNotEqualTo(Integer value) {
            addCriterion("jysuccid <>", value, "jysuccid");
            return (Criteria) this;
        }

        public Criteria andJysuccidGreaterThan(Integer value) {
            addCriterion("jysuccid >", value, "jysuccid");
            return (Criteria) this;
        }

        public Criteria andJysuccidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jysuccid >=", value, "jysuccid");
            return (Criteria) this;
        }

        public Criteria andJysuccidLessThan(Integer value) {
            addCriterion("jysuccid <", value, "jysuccid");
            return (Criteria) this;
        }

        public Criteria andJysuccidLessThanOrEqualTo(Integer value) {
            addCriterion("jysuccid <=", value, "jysuccid");
            return (Criteria) this;
        }

        public Criteria andJysuccidIn(List<Integer> values) {
            addCriterion("jysuccid in", values, "jysuccid");
            return (Criteria) this;
        }

        public Criteria andJysuccidNotIn(List<Integer> values) {
            addCriterion("jysuccid not in", values, "jysuccid");
            return (Criteria) this;
        }

        public Criteria andJysuccidBetween(Integer value1, Integer value2) {
            addCriterion("jysuccid between", value1, value2, "jysuccid");
            return (Criteria) this;
        }

        public Criteria andJysuccidNotBetween(Integer value1, Integer value2) {
            addCriterion("jysuccid not between", value1, value2, "jysuccid");
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

        public Criteria andLtdnameIsNull() {
            addCriterion("ltdname is null");
            return (Criteria) this;
        }

        public Criteria andLtdnameIsNotNull() {
            addCriterion("ltdname is not null");
            return (Criteria) this;
        }

        public Criteria andLtdnameEqualTo(String value) {
            addCriterion("ltdname =", value, "ltdname");
            return (Criteria) this;
        }

        public Criteria andLtdnameNotEqualTo(String value) {
            addCriterion("ltdname <>", value, "ltdname");
            return (Criteria) this;
        }

        public Criteria andLtdnameGreaterThan(String value) {
            addCriterion("ltdname >", value, "ltdname");
            return (Criteria) this;
        }

        public Criteria andLtdnameGreaterThanOrEqualTo(String value) {
            addCriterion("ltdname >=", value, "ltdname");
            return (Criteria) this;
        }

        public Criteria andLtdnameLessThan(String value) {
            addCriterion("ltdname <", value, "ltdname");
            return (Criteria) this;
        }

        public Criteria andLtdnameLessThanOrEqualTo(String value) {
            addCriterion("ltdname <=", value, "ltdname");
            return (Criteria) this;
        }

        public Criteria andLtdnameLike(String value) {
            addCriterion("ltdname like", value, "ltdname");
            return (Criteria) this;
        }

        public Criteria andLtdnameNotLike(String value) {
            addCriterion("ltdname not like", value, "ltdname");
            return (Criteria) this;
        }

        public Criteria andLtdnameIn(List<String> values) {
            addCriterion("ltdname in", values, "ltdname");
            return (Criteria) this;
        }

        public Criteria andLtdnameNotIn(List<String> values) {
            addCriterion("ltdname not in", values, "ltdname");
            return (Criteria) this;
        }

        public Criteria andLtdnameBetween(String value1, String value2) {
            addCriterion("ltdname between", value1, value2, "ltdname");
            return (Criteria) this;
        }

        public Criteria andLtdnameNotBetween(String value1, String value2) {
            addCriterion("ltdname not between", value1, value2, "ltdname");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEmptimeIsNull() {
            addCriterion("emptime is null");
            return (Criteria) this;
        }

        public Criteria andEmptimeIsNotNull() {
            addCriterion("emptime is not null");
            return (Criteria) this;
        }

        public Criteria andEmptimeEqualTo(Date value) {
            addCriterion("emptime =", value, "emptime");
            return (Criteria) this;
        }

        public Criteria andEmptimeNotEqualTo(Date value) {
            addCriterion("emptime <>", value, "emptime");
            return (Criteria) this;
        }

        public Criteria andEmptimeGreaterThan(Date value) {
            addCriterion("emptime >", value, "emptime");
            return (Criteria) this;
        }

        public Criteria andEmptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("emptime >=", value, "emptime");
            return (Criteria) this;
        }

        public Criteria andEmptimeLessThan(Date value) {
            addCriterion("emptime <", value, "emptime");
            return (Criteria) this;
        }

        public Criteria andEmptimeLessThanOrEqualTo(Date value) {
            addCriterion("emptime <=", value, "emptime");
            return (Criteria) this;
        }

        public Criteria andEmptimeIn(List<Date> values) {
            addCriterion("emptime in", values, "emptime");
            return (Criteria) this;
        }

        public Criteria andEmptimeNotIn(List<Date> values) {
            addCriterion("emptime not in", values, "emptime");
            return (Criteria) this;
        }

        public Criteria andEmptimeBetween(Date value1, Date value2) {
            addCriterion("emptime between", value1, value2, "emptime");
            return (Criteria) this;
        }

        public Criteria andEmptimeNotBetween(Date value1, Date value2) {
            addCriterion("emptime not between", value1, value2, "emptime");
            return (Criteria) this;
        }

        public Criteria andTrialtimeIsNull() {
            addCriterion("trialtime is null");
            return (Criteria) this;
        }

        public Criteria andTrialtimeIsNotNull() {
            addCriterion("trialtime is not null");
            return (Criteria) this;
        }

        public Criteria andTrialtimeEqualTo(Date value) {
            addCriterionForJDBCDate("trialtime =", value, "trialtime");
            return (Criteria) this;
        }

        public Criteria andTrialtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("trialtime <>", value, "trialtime");
            return (Criteria) this;
        }

        public Criteria andTrialtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("trialtime >", value, "trialtime");
            return (Criteria) this;
        }

        public Criteria andTrialtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trialtime >=", value, "trialtime");
            return (Criteria) this;
        }

        public Criteria andTrialtimeLessThan(Date value) {
            addCriterionForJDBCDate("trialtime <", value, "trialtime");
            return (Criteria) this;
        }

        public Criteria andTrialtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trialtime <=", value, "trialtime");
            return (Criteria) this;
        }

        public Criteria andTrialtimeIn(List<Date> values) {
            addCriterionForJDBCDate("trialtime in", values, "trialtime");
            return (Criteria) this;
        }

        public Criteria andTrialtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("trialtime not in", values, "trialtime");
            return (Criteria) this;
        }

        public Criteria andTrialtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trialtime between", value1, value2, "trialtime");
            return (Criteria) this;
        }

        public Criteria andTrialtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trialtime not between", value1, value2, "trialtime");
            return (Criteria) this;
        }

        public Criteria andTrialwagesIsNull() {
            addCriterion("trialwages is null");
            return (Criteria) this;
        }

        public Criteria andTrialwagesIsNotNull() {
            addCriterion("trialwages is not null");
            return (Criteria) this;
        }

        public Criteria andTrialwagesEqualTo(Integer value) {
            addCriterion("trialwages =", value, "trialwages");
            return (Criteria) this;
        }

        public Criteria andTrialwagesNotEqualTo(Integer value) {
            addCriterion("trialwages <>", value, "trialwages");
            return (Criteria) this;
        }

        public Criteria andTrialwagesGreaterThan(Integer value) {
            addCriterion("trialwages >", value, "trialwages");
            return (Criteria) this;
        }

        public Criteria andTrialwagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("trialwages >=", value, "trialwages");
            return (Criteria) this;
        }

        public Criteria andTrialwagesLessThan(Integer value) {
            addCriterion("trialwages <", value, "trialwages");
            return (Criteria) this;
        }

        public Criteria andTrialwagesLessThanOrEqualTo(Integer value) {
            addCriterion("trialwages <=", value, "trialwages");
            return (Criteria) this;
        }

        public Criteria andTrialwagesIn(List<Integer> values) {
            addCriterion("trialwages in", values, "trialwages");
            return (Criteria) this;
        }

        public Criteria andTrialwagesNotIn(List<Integer> values) {
            addCriterion("trialwages not in", values, "trialwages");
            return (Criteria) this;
        }

        public Criteria andTrialwagesBetween(Integer value1, Integer value2) {
            addCriterion("trialwages between", value1, value2, "trialwages");
            return (Criteria) this;
        }

        public Criteria andTrialwagesNotBetween(Integer value1, Integer value2) {
            addCriterion("trialwages not between", value1, value2, "trialwages");
            return (Criteria) this;
        }

        public Criteria andPositivetimeIsNull() {
            addCriterion("positivetime is null");
            return (Criteria) this;
        }

        public Criteria andPositivetimeIsNotNull() {
            addCriterion("positivetime is not null");
            return (Criteria) this;
        }

        public Criteria andPositivetimeEqualTo(Date value) {
            addCriterionForJDBCDate("positivetime =", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("positivetime <>", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("positivetime >", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("positivetime >=", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeLessThan(Date value) {
            addCriterionForJDBCDate("positivetime <", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("positivetime <=", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeIn(List<Date> values) {
            addCriterionForJDBCDate("positivetime in", values, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("positivetime not in", values, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("positivetime between", value1, value2, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("positivetime not between", value1, value2, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivepayIsNull() {
            addCriterion("positivepay is null");
            return (Criteria) this;
        }

        public Criteria andPositivepayIsNotNull() {
            addCriterion("positivepay is not null");
            return (Criteria) this;
        }

        public Criteria andPositivepayEqualTo(Integer value) {
            addCriterion("positivepay =", value, "positivepay");
            return (Criteria) this;
        }

        public Criteria andPositivepayNotEqualTo(Integer value) {
            addCriterion("positivepay <>", value, "positivepay");
            return (Criteria) this;
        }

        public Criteria andPositivepayGreaterThan(Integer value) {
            addCriterion("positivepay >", value, "positivepay");
            return (Criteria) this;
        }

        public Criteria andPositivepayGreaterThanOrEqualTo(Integer value) {
            addCriterion("positivepay >=", value, "positivepay");
            return (Criteria) this;
        }

        public Criteria andPositivepayLessThan(Integer value) {
            addCriterion("positivepay <", value, "positivepay");
            return (Criteria) this;
        }

        public Criteria andPositivepayLessThanOrEqualTo(Integer value) {
            addCriterion("positivepay <=", value, "positivepay");
            return (Criteria) this;
        }

        public Criteria andPositivepayIn(List<Integer> values) {
            addCriterion("positivepay in", values, "positivepay");
            return (Criteria) this;
        }

        public Criteria andPositivepayNotIn(List<Integer> values) {
            addCriterion("positivepay not in", values, "positivepay");
            return (Criteria) this;
        }

        public Criteria andPositivepayBetween(Integer value1, Integer value2) {
            addCriterion("positivepay between", value1, value2, "positivepay");
            return (Criteria) this;
        }

        public Criteria andPositivepayNotBetween(Integer value1, Integer value2) {
            addCriterion("positivepay not between", value1, value2, "positivepay");
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