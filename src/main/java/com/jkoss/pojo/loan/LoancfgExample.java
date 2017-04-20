package com.jkoss.pojo.loan;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoancfgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoancfgExample() {
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

        public Criteria andFanIDIsNull() {
            addCriterion("fanID is null");
            return (Criteria) this;
        }

        public Criteria andFanIDIsNotNull() {
            addCriterion("fanID is not null");
            return (Criteria) this;
        }

        public Criteria andFanIDEqualTo(Integer value) {
            addCriterion("fanID =", value, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDNotEqualTo(Integer value) {
            addCriterion("fanID <>", value, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDGreaterThan(Integer value) {
            addCriterion("fanID >", value, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("fanID >=", value, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDLessThan(Integer value) {
            addCriterion("fanID <", value, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDLessThanOrEqualTo(Integer value) {
            addCriterion("fanID <=", value, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDIn(List<Integer> values) {
            addCriterion("fanID in", values, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDNotIn(List<Integer> values) {
            addCriterion("fanID not in", values, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDBetween(Integer value1, Integer value2) {
            addCriterion("fanID between", value1, value2, "fanID");
            return (Criteria) this;
        }

        public Criteria andFanIDNotBetween(Integer value1, Integer value2) {
            addCriterion("fanID not between", value1, value2, "fanID");
            return (Criteria) this;
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

        public Criteria andFanNameIsNull() {
            addCriterion("fanName is null");
            return (Criteria) this;
        }

        public Criteria andFanNameIsNotNull() {
            addCriterion("fanName is not null");
            return (Criteria) this;
        }

        public Criteria andFanNameEqualTo(String value) {
            addCriterion("fanName =", value, "fanName");
            return (Criteria) this;
        }

        public Criteria andFanNameNotEqualTo(String value) {
            addCriterion("fanName <>", value, "fanName");
            return (Criteria) this;
        }

        public Criteria andFanNameGreaterThan(String value) {
            addCriterion("fanName >", value, "fanName");
            return (Criteria) this;
        }

        public Criteria andFanNameGreaterThanOrEqualTo(String value) {
            addCriterion("fanName >=", value, "fanName");
            return (Criteria) this;
        }

        public Criteria andFanNameLessThan(String value) {
            addCriterion("fanName <", value, "fanName");
            return (Criteria) this;
        }

        public Criteria andFanNameLessThanOrEqualTo(String value) {
            addCriterion("fanName <=", value, "fanName");
            return (Criteria) this;
        }

        public Criteria andFanNameLike(String value) {
            addCriterion("fanName like", value, "fanName");
            return (Criteria) this;
        }

        public Criteria andFanNameNotLike(String value) {
            addCriterion("fanName not like", value, "fanName");
            return (Criteria) this;
        }

        public Criteria andFanNameIn(List<String> values) {
            addCriterion("fanName in", values, "fanName");
            return (Criteria) this;
        }

        public Criteria andFanNameNotIn(List<String> values) {
            addCriterion("fanName not in", values, "fanName");
            return (Criteria) this;
        }

        public Criteria andFanNameBetween(String value1, String value2) {
            addCriterion("fanName between", value1, value2, "fanName");
            return (Criteria) this;
        }

        public Criteria andFanNameNotBetween(String value1, String value2) {
            addCriterion("fanName not between", value1, value2, "fanName");
            return (Criteria) this;
        }

        public Criteria andFancostIsNull() {
            addCriterion("fancost is null");
            return (Criteria) this;
        }

        public Criteria andFancostIsNotNull() {
            addCriterion("fancost is not null");
            return (Criteria) this;
        }

        public Criteria andFancostEqualTo(Float value) {
            addCriterion("fancost =", value, "fancost");
            return (Criteria) this;
        }

        public Criteria andFancostNotEqualTo(Float value) {
            addCriterion("fancost <>", value, "fancost");
            return (Criteria) this;
        }

        public Criteria andFancostGreaterThan(Float value) {
            addCriterion("fancost >", value, "fancost");
            return (Criteria) this;
        }

        public Criteria andFancostGreaterThanOrEqualTo(Float value) {
            addCriterion("fancost >=", value, "fancost");
            return (Criteria) this;
        }

        public Criteria andFancostLessThan(Float value) {
            addCriterion("fancost <", value, "fancost");
            return (Criteria) this;
        }

        public Criteria andFancostLessThanOrEqualTo(Float value) {
            addCriterion("fancost <=", value, "fancost");
            return (Criteria) this;
        }

        public Criteria andFancostIn(List<Float> values) {
            addCriterion("fancost in", values, "fancost");
            return (Criteria) this;
        }

        public Criteria andFancostNotIn(List<Float> values) {
            addCriterion("fancost not in", values, "fancost");
            return (Criteria) this;
        }

        public Criteria andFancostBetween(Float value1, Float value2) {
            addCriterion("fancost between", value1, value2, "fancost");
            return (Criteria) this;
        }

        public Criteria andFancostNotBetween(Float value1, Float value2) {
            addCriterion("fancost not between", value1, value2, "fancost");
            return (Criteria) this;
        }

        public Criteria andGendateIsNull() {
            addCriterion("gendate is null");
            return (Criteria) this;
        }

        public Criteria andGendateIsNotNull() {
            addCriterion("gendate is not null");
            return (Criteria) this;
        }

        public Criteria andGendateEqualTo(Date value) {
            addCriterionForJDBCDate("gendate =", value, "gendate");
            return (Criteria) this;
        }

        public Criteria andGendateNotEqualTo(Date value) {
            addCriterionForJDBCDate("gendate <>", value, "gendate");
            return (Criteria) this;
        }

        public Criteria andGendateGreaterThan(Date value) {
            addCriterionForJDBCDate("gendate >", value, "gendate");
            return (Criteria) this;
        }

        public Criteria andGendateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gendate >=", value, "gendate");
            return (Criteria) this;
        }

        public Criteria andGendateLessThan(Date value) {
            addCriterionForJDBCDate("gendate <", value, "gendate");
            return (Criteria) this;
        }

        public Criteria andGendateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gendate <=", value, "gendate");
            return (Criteria) this;
        }

        public Criteria andGendateIn(List<Date> values) {
            addCriterionForJDBCDate("gendate in", values, "gendate");
            return (Criteria) this;
        }

        public Criteria andGendateNotIn(List<Date> values) {
            addCriterionForJDBCDate("gendate not in", values, "gendate");
            return (Criteria) this;
        }

        public Criteria andGendateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gendate between", value1, value2, "gendate");
            return (Criteria) this;
        }

        public Criteria andGendateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gendate not between", value1, value2, "gendate");
            return (Criteria) this;
        }

        public Criteria andGencountIsNull() {
            addCriterion("gencount is null");
            return (Criteria) this;
        }

        public Criteria andGencountIsNotNull() {
            addCriterion("gencount is not null");
            return (Criteria) this;
        }

        public Criteria andGencountEqualTo(String value) {
            addCriterion("gencount =", value, "gencount");
            return (Criteria) this;
        }

        public Criteria andGencountNotEqualTo(String value) {
            addCriterion("gencount <>", value, "gencount");
            return (Criteria) this;
        }

        public Criteria andGencountGreaterThan(String value) {
            addCriterion("gencount >", value, "gencount");
            return (Criteria) this;
        }

        public Criteria andGencountGreaterThanOrEqualTo(String value) {
            addCriterion("gencount >=", value, "gencount");
            return (Criteria) this;
        }

        public Criteria andGencountLessThan(String value) {
            addCriterion("gencount <", value, "gencount");
            return (Criteria) this;
        }

        public Criteria andGencountLessThanOrEqualTo(String value) {
            addCriterion("gencount <=", value, "gencount");
            return (Criteria) this;
        }

        public Criteria andGencountLike(String value) {
            addCriterion("gencount like", value, "gencount");
            return (Criteria) this;
        }

        public Criteria andGencountNotLike(String value) {
            addCriterion("gencount not like", value, "gencount");
            return (Criteria) this;
        }

        public Criteria andGencountIn(List<String> values) {
            addCriterion("gencount in", values, "gencount");
            return (Criteria) this;
        }

        public Criteria andGencountNotIn(List<String> values) {
            addCriterion("gencount not in", values, "gencount");
            return (Criteria) this;
        }

        public Criteria andGencountBetween(String value1, String value2) {
            addCriterion("gencount between", value1, value2, "gencount");
            return (Criteria) this;
        }

        public Criteria andGencountNotBetween(String value1, String value2) {
            addCriterion("gencount not between", value1, value2, "gencount");
            return (Criteria) this;
        }

        public Criteria andPaymthIsNull() {
            addCriterion("paymth is null");
            return (Criteria) this;
        }

        public Criteria andPaymthIsNotNull() {
            addCriterion("paymth is not null");
            return (Criteria) this;
        }

        public Criteria andPaymthEqualTo(Integer value) {
            addCriterion("paymth =", value, "paymth");
            return (Criteria) this;
        }

        public Criteria andPaymthNotEqualTo(Integer value) {
            addCriterion("paymth <>", value, "paymth");
            return (Criteria) this;
        }

        public Criteria andPaymthGreaterThan(Integer value) {
            addCriterion("paymth >", value, "paymth");
            return (Criteria) this;
        }

        public Criteria andPaymthGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymth >=", value, "paymth");
            return (Criteria) this;
        }

        public Criteria andPaymthLessThan(Integer value) {
            addCriterion("paymth <", value, "paymth");
            return (Criteria) this;
        }

        public Criteria andPaymthLessThanOrEqualTo(Integer value) {
            addCriterion("paymth <=", value, "paymth");
            return (Criteria) this;
        }

        public Criteria andPaymthIn(List<Integer> values) {
            addCriterion("paymth in", values, "paymth");
            return (Criteria) this;
        }

        public Criteria andPaymthNotIn(List<Integer> values) {
            addCriterion("paymth not in", values, "paymth");
            return (Criteria) this;
        }

        public Criteria andPaymthBetween(Integer value1, Integer value2) {
            addCriterion("paymth between", value1, value2, "paymth");
            return (Criteria) this;
        }

        public Criteria andPaymthNotBetween(Integer value1, Integer value2) {
            addCriterion("paymth not between", value1, value2, "paymth");
            return (Criteria) this;
        }

        public Criteria andBhybeginIsNull() {
            addCriterion("bhybegin is null");
            return (Criteria) this;
        }

        public Criteria andBhybeginIsNotNull() {
            addCriterion("bhybegin is not null");
            return (Criteria) this;
        }

        public Criteria andBhybeginEqualTo(Date value) {
            addCriterionForJDBCDate("bhybegin =", value, "bhybegin");
            return (Criteria) this;
        }

        public Criteria andBhybeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("bhybegin <>", value, "bhybegin");
            return (Criteria) this;
        }

        public Criteria andBhybeginGreaterThan(Date value) {
            addCriterionForJDBCDate("bhybegin >", value, "bhybegin");
            return (Criteria) this;
        }

        public Criteria andBhybeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bhybegin >=", value, "bhybegin");
            return (Criteria) this;
        }

        public Criteria andBhybeginLessThan(Date value) {
            addCriterionForJDBCDate("bhybegin <", value, "bhybegin");
            return (Criteria) this;
        }

        public Criteria andBhybeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bhybegin <=", value, "bhybegin");
            return (Criteria) this;
        }

        public Criteria andBhybeginIn(List<Date> values) {
            addCriterionForJDBCDate("bhybegin in", values, "bhybegin");
            return (Criteria) this;
        }

        public Criteria andBhybeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("bhybegin not in", values, "bhybegin");
            return (Criteria) this;
        }

        public Criteria andBhybeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bhybegin between", value1, value2, "bhybegin");
            return (Criteria) this;
        }

        public Criteria andBhybeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bhybegin not between", value1, value2, "bhybegin");
            return (Criteria) this;
        }

        public Criteria andBhpayIsNull() {
            addCriterion("bhpay is null");
            return (Criteria) this;
        }

        public Criteria andBhpayIsNotNull() {
            addCriterion("bhpay is not null");
            return (Criteria) this;
        }

        public Criteria andBhpayEqualTo(Float value) {
            addCriterion("bhpay =", value, "bhpay");
            return (Criteria) this;
        }

        public Criteria andBhpayNotEqualTo(Float value) {
            addCriterion("bhpay <>", value, "bhpay");
            return (Criteria) this;
        }

        public Criteria andBhpayGreaterThan(Float value) {
            addCriterion("bhpay >", value, "bhpay");
            return (Criteria) this;
        }

        public Criteria andBhpayGreaterThanOrEqualTo(Float value) {
            addCriterion("bhpay >=", value, "bhpay");
            return (Criteria) this;
        }

        public Criteria andBhpayLessThan(Float value) {
            addCriterion("bhpay <", value, "bhpay");
            return (Criteria) this;
        }

        public Criteria andBhpayLessThanOrEqualTo(Float value) {
            addCriterion("bhpay <=", value, "bhpay");
            return (Criteria) this;
        }

        public Criteria andBhpayIn(List<Float> values) {
            addCriterion("bhpay in", values, "bhpay");
            return (Criteria) this;
        }

        public Criteria andBhpayNotIn(List<Float> values) {
            addCriterion("bhpay not in", values, "bhpay");
            return (Criteria) this;
        }

        public Criteria andBhpayBetween(Float value1, Float value2) {
            addCriterion("bhpay between", value1, value2, "bhpay");
            return (Criteria) this;
        }

        public Criteria andBhpayNotBetween(Float value1, Float value2) {
            addCriterion("bhpay not between", value1, value2, "bhpay");
            return (Criteria) this;
        }

        public Criteria andBhpaymthIsNull() {
            addCriterion("bhpaymth is null");
            return (Criteria) this;
        }

        public Criteria andBhpaymthIsNotNull() {
            addCriterion("bhpaymth is not null");
            return (Criteria) this;
        }

        public Criteria andBhpaymthEqualTo(Integer value) {
            addCriterion("bhpaymth =", value, "bhpaymth");
            return (Criteria) this;
        }

        public Criteria andBhpaymthNotEqualTo(Integer value) {
            addCriterion("bhpaymth <>", value, "bhpaymth");
            return (Criteria) this;
        }

        public Criteria andBhpaymthGreaterThan(Integer value) {
            addCriterion("bhpaymth >", value, "bhpaymth");
            return (Criteria) this;
        }

        public Criteria andBhpaymthGreaterThanOrEqualTo(Integer value) {
            addCriterion("bhpaymth >=", value, "bhpaymth");
            return (Criteria) this;
        }

        public Criteria andBhpaymthLessThan(Integer value) {
            addCriterion("bhpaymth <", value, "bhpaymth");
            return (Criteria) this;
        }

        public Criteria andBhpaymthLessThanOrEqualTo(Integer value) {
            addCriterion("bhpaymth <=", value, "bhpaymth");
            return (Criteria) this;
        }

        public Criteria andBhpaymthIn(List<Integer> values) {
            addCriterion("bhpaymth in", values, "bhpaymth");
            return (Criteria) this;
        }

        public Criteria andBhpaymthNotIn(List<Integer> values) {
            addCriterion("bhpaymth not in", values, "bhpaymth");
            return (Criteria) this;
        }

        public Criteria andBhpaymthBetween(Integer value1, Integer value2) {
            addCriterion("bhpaymth between", value1, value2, "bhpaymth");
            return (Criteria) this;
        }

        public Criteria andBhpaymthNotBetween(Integer value1, Integer value2) {
            addCriterion("bhpaymth not between", value1, value2, "bhpaymth");
            return (Criteria) this;
        }

        public Criteria andPaybeginIsNull() {
            addCriterion("paybegin is null");
            return (Criteria) this;
        }

        public Criteria andPaybeginIsNotNull() {
            addCriterion("paybegin is not null");
            return (Criteria) this;
        }

        public Criteria andPaybeginEqualTo(Date value) {
            addCriterionForJDBCDate("paybegin =", value, "paybegin");
            return (Criteria) this;
        }

        public Criteria andPaybeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("paybegin <>", value, "paybegin");
            return (Criteria) this;
        }

        public Criteria andPaybeginGreaterThan(Date value) {
            addCriterionForJDBCDate("paybegin >", value, "paybegin");
            return (Criteria) this;
        }

        public Criteria andPaybeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("paybegin >=", value, "paybegin");
            return (Criteria) this;
        }

        public Criteria andPaybeginLessThan(Date value) {
            addCriterionForJDBCDate("paybegin <", value, "paybegin");
            return (Criteria) this;
        }

        public Criteria andPaybeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("paybegin <=", value, "paybegin");
            return (Criteria) this;
        }

        public Criteria andPaybeginIn(List<Date> values) {
            addCriterionForJDBCDate("paybegin in", values, "paybegin");
            return (Criteria) this;
        }

        public Criteria andPaybeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("paybegin not in", values, "paybegin");
            return (Criteria) this;
        }

        public Criteria andPaybeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("paybegin between", value1, value2, "paybegin");
            return (Criteria) this;
        }

        public Criteria andPaybeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("paybegin not between", value1, value2, "paybegin");
            return (Criteria) this;
        }

        public Criteria andPayxfIsNull() {
            addCriterion("payxf is null");
            return (Criteria) this;
        }

        public Criteria andPayxfIsNotNull() {
            addCriterion("payxf is not null");
            return (Criteria) this;
        }

        public Criteria andPayxfEqualTo(Float value) {
            addCriterion("payxf =", value, "payxf");
            return (Criteria) this;
        }

        public Criteria andPayxfNotEqualTo(Float value) {
            addCriterion("payxf <>", value, "payxf");
            return (Criteria) this;
        }

        public Criteria andPayxfGreaterThan(Float value) {
            addCriterion("payxf >", value, "payxf");
            return (Criteria) this;
        }

        public Criteria andPayxfGreaterThanOrEqualTo(Float value) {
            addCriterion("payxf >=", value, "payxf");
            return (Criteria) this;
        }

        public Criteria andPayxfLessThan(Float value) {
            addCriterion("payxf <", value, "payxf");
            return (Criteria) this;
        }

        public Criteria andPayxfLessThanOrEqualTo(Float value) {
            addCriterion("payxf <=", value, "payxf");
            return (Criteria) this;
        }

        public Criteria andPayxfIn(List<Float> values) {
            addCriterion("payxf in", values, "payxf");
            return (Criteria) this;
        }

        public Criteria andPayxfNotIn(List<Float> values) {
            addCriterion("payxf not in", values, "payxf");
            return (Criteria) this;
        }

        public Criteria andPayxfBetween(Float value1, Float value2) {
            addCriterion("payxf between", value1, value2, "payxf");
            return (Criteria) this;
        }

        public Criteria andPayxfNotBetween(Float value1, Float value2) {
            addCriterion("payxf not between", value1, value2, "payxf");
            return (Criteria) this;
        }

        public Criteria andFandescIsNull() {
            addCriterion("fandesc is null");
            return (Criteria) this;
        }

        public Criteria andFandescIsNotNull() {
            addCriterion("fandesc is not null");
            return (Criteria) this;
        }

        public Criteria andFandescEqualTo(String value) {
            addCriterion("fandesc =", value, "fandesc");
            return (Criteria) this;
        }

        public Criteria andFandescNotEqualTo(String value) {
            addCriterion("fandesc <>", value, "fandesc");
            return (Criteria) this;
        }

        public Criteria andFandescGreaterThan(String value) {
            addCriterion("fandesc >", value, "fandesc");
            return (Criteria) this;
        }

        public Criteria andFandescGreaterThanOrEqualTo(String value) {
            addCriterion("fandesc >=", value, "fandesc");
            return (Criteria) this;
        }

        public Criteria andFandescLessThan(String value) {
            addCriterion("fandesc <", value, "fandesc");
            return (Criteria) this;
        }

        public Criteria andFandescLessThanOrEqualTo(String value) {
            addCriterion("fandesc <=", value, "fandesc");
            return (Criteria) this;
        }

        public Criteria andFandescLike(String value) {
            addCriterion("fandesc like", value, "fandesc");
            return (Criteria) this;
        }

        public Criteria andFandescNotLike(String value) {
            addCriterion("fandesc not like", value, "fandesc");
            return (Criteria) this;
        }

        public Criteria andFandescIn(List<String> values) {
            addCriterion("fandesc in", values, "fandesc");
            return (Criteria) this;
        }

        public Criteria andFandescNotIn(List<String> values) {
            addCriterion("fandesc not in", values, "fandesc");
            return (Criteria) this;
        }

        public Criteria andFandescBetween(String value1, String value2) {
            addCriterion("fandesc between", value1, value2, "fandesc");
            return (Criteria) this;
        }

        public Criteria andFandescNotBetween(String value1, String value2) {
            addCriterion("fandesc not between", value1, value2, "fandesc");
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