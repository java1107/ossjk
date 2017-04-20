package com.jkoss.pojo.oa;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmpkaoqinExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    public EmpkaoqinExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
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

        public Criteria andEkqidIsNull() {
            addCriterion("ekqid is null");
            return (Criteria) this;
        }

        public Criteria andEkqidIsNotNull() {
            addCriterion("ekqid is not null");
            return (Criteria) this;
        }

        public Criteria andEkqidEqualTo(Integer value) {
            addCriterion("ekqid =", value, "ekqid");
            return (Criteria) this;
        }

        public Criteria andEkqidNotEqualTo(Integer value) {
            addCriterion("ekqid <>", value, "ekqid");
            return (Criteria) this;
        }

        public Criteria andEkqidGreaterThan(Integer value) {
            addCriterion("ekqid >", value, "ekqid");
            return (Criteria) this;
        }

        public Criteria andEkqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ekqid >=", value, "ekqid");
            return (Criteria) this;
        }

        public Criteria andEkqidLessThan(Integer value) {
            addCriterion("ekqid <", value, "ekqid");
            return (Criteria) this;
        }

        public Criteria andEkqidLessThanOrEqualTo(Integer value) {
            addCriterion("ekqid <=", value, "ekqid");
            return (Criteria) this;
        }

        public Criteria andEkqidIn(List<Integer> values) {
            addCriterion("ekqid in", values, "ekqid");
            return (Criteria) this;
        }

        public Criteria andEkqidNotIn(List<Integer> values) {
            addCriterion("ekqid not in", values, "ekqid");
            return (Criteria) this;
        }

        public Criteria andEkqidBetween(Integer value1, Integer value2) {
            addCriterion("ekqid between", value1, value2, "ekqid");
            return (Criteria) this;
        }

        public Criteria andEkqidNotBetween(Integer value1, Integer value2) {
            addCriterion("ekqid not between", value1, value2, "ekqid");
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

        public Criteria andT_e_eidIsNull() {
            addCriterion("t_e_eid is null");
            return (Criteria) this;
        }

        public Criteria andT_e_eidIsNotNull() {
            addCriterion("t_e_eid is not null");
            return (Criteria) this;
        }

        public Criteria andT_e_eidEqualTo(Integer value) {
            addCriterion("t_e_eid =", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidNotEqualTo(Integer value) {
            addCriterion("t_e_eid <>", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidGreaterThan(Integer value) {
            addCriterion("t_e_eid >", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_e_eid >=", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidLessThan(Integer value) {
            addCriterion("t_e_eid <", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidLessThanOrEqualTo(Integer value) {
            addCriterion("t_e_eid <=", value, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidIn(List<Integer> values) {
            addCriterion("t_e_eid in", values, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidNotIn(List<Integer> values) {
            addCriterion("t_e_eid not in", values, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidBetween(Integer value1, Integer value2) {
            addCriterion("t_e_eid between", value1, value2, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andT_e_eidNotBetween(Integer value1, Integer value2) {
            addCriterion("t_e_eid not between", value1, value2, "t_e_eid");
            return (Criteria) this;
        }

        public Criteria andEkqmthIsNull() {
            addCriterion("ekqmth is null");
            return (Criteria) this;
        }

        public Criteria andEkqmthIsNotNull() {
            addCriterion("ekqmth is not null");
            return (Criteria) this;
        }

        public Criteria andEkqmthEqualTo(Date value) {
            addCriterionForJDBCDate("ekqmth =", value, "ekqmth");
            return (Criteria) this;
        }

        public Criteria andEkqmthNotEqualTo(Date value) {
            addCriterionForJDBCDate("ekqmth <>", value, "ekqmth");
            return (Criteria) this;
        }

        public Criteria andEkqmthGreaterThan(Date value) {
            addCriterionForJDBCDate("ekqmth >", value, "ekqmth");
            return (Criteria) this;
        }

        public Criteria andEkqmthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ekqmth >=", value, "ekqmth");
            return (Criteria) this;
        }

        public Criteria andEkqmthLessThan(Date value) {
            addCriterionForJDBCDate("ekqmth <", value, "ekqmth");
            return (Criteria) this;
        }

        public Criteria andEkqmthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ekqmth <=", value, "ekqmth");
            return (Criteria) this;
        }

        public Criteria andEkqmthIn(List<Date> values) {
            addCriterionForJDBCDate("ekqmth in", values, "ekqmth");
            return (Criteria) this;
        }

        public Criteria andEkqmthNotIn(List<Date> values) {
            addCriterionForJDBCDate("ekqmth not in", values, "ekqmth");
            return (Criteria) this;
        }

        public Criteria andEkqmthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ekqmth between", value1, value2, "ekqmth");
            return (Criteria) this;
        }

        public Criteria andEkqmthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ekqmth not between", value1, value2, "ekqmth");
            return (Criteria) this;
        }

        public Criteria andEkqneedcountIsNull() {
            addCriterion("ekqneedcount is null");
            return (Criteria) this;
        }

        public Criteria andEkqneedcountIsNotNull() {
            addCriterion("ekqneedcount is not null");
            return (Criteria) this;
        }

        public Criteria andEkqneedcountEqualTo(Integer value) {
            addCriterion("ekqneedcount =", value, "ekqneedcount");
            return (Criteria) this;
        }

        public Criteria andEkqneedcountNotEqualTo(Integer value) {
            addCriterion("ekqneedcount <>", value, "ekqneedcount");
            return (Criteria) this;
        }

        public Criteria andEkqneedcountGreaterThan(Integer value) {
            addCriterion("ekqneedcount >", value, "ekqneedcount");
            return (Criteria) this;
        }

        public Criteria andEkqneedcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ekqneedcount >=", value, "ekqneedcount");
            return (Criteria) this;
        }

        public Criteria andEkqneedcountLessThan(Integer value) {
            addCriterion("ekqneedcount <", value, "ekqneedcount");
            return (Criteria) this;
        }

        public Criteria andEkqneedcountLessThanOrEqualTo(Integer value) {
            addCriterion("ekqneedcount <=", value, "ekqneedcount");
            return (Criteria) this;
        }

        public Criteria andEkqneedcountIn(List<Integer> values) {
            addCriterion("ekqneedcount in", values, "ekqneedcount");
            return (Criteria) this;
        }

        public Criteria andEkqneedcountNotIn(List<Integer> values) {
            addCriterion("ekqneedcount not in", values, "ekqneedcount");
            return (Criteria) this;
        }

        public Criteria andEkqneedcountBetween(Integer value1, Integer value2) {
            addCriterion("ekqneedcount between", value1, value2, "ekqneedcount");
            return (Criteria) this;
        }

        public Criteria andEkqneedcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ekqneedcount not between", value1, value2, "ekqneedcount");
            return (Criteria) this;
        }

        public Criteria andEkqcountIsNull() {
            addCriterion("ekqcount is null");
            return (Criteria) this;
        }

        public Criteria andEkqcountIsNotNull() {
            addCriterion("ekqcount is not null");
            return (Criteria) this;
        }

        public Criteria andEkqcountEqualTo(Integer value) {
            addCriterion("ekqcount =", value, "ekqcount");
            return (Criteria) this;
        }

        public Criteria andEkqcountNotEqualTo(Integer value) {
            addCriterion("ekqcount <>", value, "ekqcount");
            return (Criteria) this;
        }

        public Criteria andEkqcountGreaterThan(Integer value) {
            addCriterion("ekqcount >", value, "ekqcount");
            return (Criteria) this;
        }

        public Criteria andEkqcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ekqcount >=", value, "ekqcount");
            return (Criteria) this;
        }

        public Criteria andEkqcountLessThan(Integer value) {
            addCriterion("ekqcount <", value, "ekqcount");
            return (Criteria) this;
        }

        public Criteria andEkqcountLessThanOrEqualTo(Integer value) {
            addCriterion("ekqcount <=", value, "ekqcount");
            return (Criteria) this;
        }

        public Criteria andEkqcountIn(List<Integer> values) {
            addCriterion("ekqcount in", values, "ekqcount");
            return (Criteria) this;
        }

        public Criteria andEkqcountNotIn(List<Integer> values) {
            addCriterion("ekqcount not in", values, "ekqcount");
            return (Criteria) this;
        }

        public Criteria andEkqcountBetween(Integer value1, Integer value2) {
            addCriterion("ekqcount between", value1, value2, "ekqcount");
            return (Criteria) this;
        }

        public Criteria andEkqcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ekqcount not between", value1, value2, "ekqcount");
            return (Criteria) this;
        }

        public Criteria andEkqjinjiaIsNull() {
            addCriterion("ekqjinjia is null");
            return (Criteria) this;
        }

        public Criteria andEkqjinjiaIsNotNull() {
            addCriterion("ekqjinjia is not null");
            return (Criteria) this;
        }

        public Criteria andEkqjinjiaEqualTo(Integer value) {
            addCriterion("ekqjinjia =", value, "ekqjinjia");
            return (Criteria) this;
        }

        public Criteria andEkqjinjiaNotEqualTo(Integer value) {
            addCriterion("ekqjinjia <>", value, "ekqjinjia");
            return (Criteria) this;
        }

        public Criteria andEkqjinjiaGreaterThan(Integer value) {
            addCriterion("ekqjinjia >", value, "ekqjinjia");
            return (Criteria) this;
        }

        public Criteria andEkqjinjiaGreaterThanOrEqualTo(Integer value) {
            addCriterion("ekqjinjia >=", value, "ekqjinjia");
            return (Criteria) this;
        }

        public Criteria andEkqjinjiaLessThan(Integer value) {
            addCriterion("ekqjinjia <", value, "ekqjinjia");
            return (Criteria) this;
        }

        public Criteria andEkqjinjiaLessThanOrEqualTo(Integer value) {
            addCriterion("ekqjinjia <=", value, "ekqjinjia");
            return (Criteria) this;
        }

        public Criteria andEkqjinjiaIn(List<Integer> values) {
            addCriterion("ekqjinjia in", values, "ekqjinjia");
            return (Criteria) this;
        }

        public Criteria andEkqjinjiaNotIn(List<Integer> values) {
            addCriterion("ekqjinjia not in", values, "ekqjinjia");
            return (Criteria) this;
        }

        public Criteria andEkqjinjiaBetween(Integer value1, Integer value2) {
            addCriterion("ekqjinjia between", value1, value2, "ekqjinjia");
            return (Criteria) this;
        }

        public Criteria andEkqjinjiaNotBetween(Integer value1, Integer value2) {
            addCriterion("ekqjinjia not between", value1, value2, "ekqjinjia");
            return (Criteria) this;
        }

        public Criteria andEkqkilljinjiaIsNull() {
            addCriterion("ekqkilljinjia is null");
            return (Criteria) this;
        }

        public Criteria andEkqkilljinjiaIsNotNull() {
            addCriterion("ekqkilljinjia is not null");
            return (Criteria) this;
        }

        public Criteria andEkqkilljinjiaEqualTo(Integer value) {
            addCriterion("ekqkilljinjia =", value, "ekqkilljinjia");
            return (Criteria) this;
        }

        public Criteria andEkqkilljinjiaNotEqualTo(Integer value) {
            addCriterion("ekqkilljinjia <>", value, "ekqkilljinjia");
            return (Criteria) this;
        }

        public Criteria andEkqkilljinjiaGreaterThan(Integer value) {
            addCriterion("ekqkilljinjia >", value, "ekqkilljinjia");
            return (Criteria) this;
        }

        public Criteria andEkqkilljinjiaGreaterThanOrEqualTo(Integer value) {
            addCriterion("ekqkilljinjia >=", value, "ekqkilljinjia");
            return (Criteria) this;
        }

        public Criteria andEkqkilljinjiaLessThan(Integer value) {
            addCriterion("ekqkilljinjia <", value, "ekqkilljinjia");
            return (Criteria) this;
        }

        public Criteria andEkqkilljinjiaLessThanOrEqualTo(Integer value) {
            addCriterion("ekqkilljinjia <=", value, "ekqkilljinjia");
            return (Criteria) this;
        }

        public Criteria andEkqkilljinjiaIn(List<Integer> values) {
            addCriterion("ekqkilljinjia in", values, "ekqkilljinjia");
            return (Criteria) this;
        }

        public Criteria andEkqkilljinjiaNotIn(List<Integer> values) {
            addCriterion("ekqkilljinjia not in", values, "ekqkilljinjia");
            return (Criteria) this;
        }

        public Criteria andEkqkilljinjiaBetween(Integer value1, Integer value2) {
            addCriterion("ekqkilljinjia between", value1, value2, "ekqkilljinjia");
            return (Criteria) this;
        }

        public Criteria andEkqkilljinjiaNotBetween(Integer value1, Integer value2) {
            addCriterion("ekqkilljinjia not between", value1, value2, "ekqkilljinjia");
            return (Criteria) this;
        }

        public Criteria andEkqdescIsNull() {
            addCriterion("ekqdesc is null");
            return (Criteria) this;
        }

        public Criteria andEkqdescIsNotNull() {
            addCriterion("ekqdesc is not null");
            return (Criteria) this;
        }

        public Criteria andEkqdescEqualTo(String value) {
            addCriterion("ekqdesc =", value, "ekqdesc");
            return (Criteria) this;
        }

        public Criteria andEkqdescNotEqualTo(String value) {
            addCriterion("ekqdesc <>", value, "ekqdesc");
            return (Criteria) this;
        }

        public Criteria andEkqdescGreaterThan(String value) {
            addCriterion("ekqdesc >", value, "ekqdesc");
            return (Criteria) this;
        }

        public Criteria andEkqdescGreaterThanOrEqualTo(String value) {
            addCriterion("ekqdesc >=", value, "ekqdesc");
            return (Criteria) this;
        }

        public Criteria andEkqdescLessThan(String value) {
            addCriterion("ekqdesc <", value, "ekqdesc");
            return (Criteria) this;
        }

        public Criteria andEkqdescLessThanOrEqualTo(String value) {
            addCriterion("ekqdesc <=", value, "ekqdesc");
            return (Criteria) this;
        }

        public Criteria andEkqdescLike(String value) {
            addCriterion("ekqdesc like", value, "ekqdesc");
            return (Criteria) this;
        }

        public Criteria andEkqdescNotLike(String value) {
            addCriterion("ekqdesc not like", value, "ekqdesc");
            return (Criteria) this;
        }

        public Criteria andEkqdescIn(List<String> values) {
            addCriterion("ekqdesc in", values, "ekqdesc");
            return (Criteria) this;
        }

        public Criteria andEkqdescNotIn(List<String> values) {
            addCriterion("ekqdesc not in", values, "ekqdesc");
            return (Criteria) this;
        }

        public Criteria andEkqdescBetween(String value1, String value2) {
            addCriterion("ekqdesc between", value1, value2, "ekqdesc");
            return (Criteria) this;
        }

        public Criteria andEkqdescNotBetween(String value1, String value2) {
            addCriterion("ekqdesc not between", value1, value2, "ekqdesc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_empkaoqin
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_empkaoqin
     *
     * @mbggenerated
     */
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