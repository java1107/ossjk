package com.jkoss.pojo.oa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OssqqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OssqqExample() {
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

        public Criteria andQqeidIsNull() {
            addCriterion("qqeid is null");
            return (Criteria) this;
        }

        public Criteria andQqeidIsNotNull() {
            addCriterion("qqeid is not null");
            return (Criteria) this;
        }

        public Criteria andQqeidEqualTo(Integer value) {
            addCriterion("qqeid =", value, "qqeid");
            return (Criteria) this;
        }

        public Criteria andQqeidNotEqualTo(Integer value) {
            addCriterion("qqeid <>", value, "qqeid");
            return (Criteria) this;
        }

        public Criteria andQqeidGreaterThan(Integer value) {
            addCriterion("qqeid >", value, "qqeid");
            return (Criteria) this;
        }

        public Criteria andQqeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qqeid >=", value, "qqeid");
            return (Criteria) this;
        }

        public Criteria andQqeidLessThan(Integer value) {
            addCriterion("qqeid <", value, "qqeid");
            return (Criteria) this;
        }

        public Criteria andQqeidLessThanOrEqualTo(Integer value) {
            addCriterion("qqeid <=", value, "qqeid");
            return (Criteria) this;
        }

        public Criteria andQqeidIn(List<Integer> values) {
            addCriterion("qqeid in", values, "qqeid");
            return (Criteria) this;
        }

        public Criteria andQqeidNotIn(List<Integer> values) {
            addCriterion("qqeid not in", values, "qqeid");
            return (Criteria) this;
        }

        public Criteria andQqeidBetween(Integer value1, Integer value2) {
            addCriterion("qqeid between", value1, value2, "qqeid");
            return (Criteria) this;
        }

        public Criteria andQqeidNotBetween(Integer value1, Integer value2) {
            addCriterion("qqeid not between", value1, value2, "qqeid");
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

        public Criteria andQqenameIsNull() {
            addCriterion("qqename is null");
            return (Criteria) this;
        }

        public Criteria andQqenameIsNotNull() {
            addCriterion("qqename is not null");
            return (Criteria) this;
        }

        public Criteria andQqenameEqualTo(String value) {
            addCriterion("qqename =", value, "qqename");
            return (Criteria) this;
        }

        public Criteria andQqenameNotEqualTo(String value) {
            addCriterion("qqename <>", value, "qqename");
            return (Criteria) this;
        }

        public Criteria andQqenameGreaterThan(String value) {
            addCriterion("qqename >", value, "qqename");
            return (Criteria) this;
        }

        public Criteria andQqenameGreaterThanOrEqualTo(String value) {
            addCriterion("qqename >=", value, "qqename");
            return (Criteria) this;
        }

        public Criteria andQqenameLessThan(String value) {
            addCriterion("qqename <", value, "qqename");
            return (Criteria) this;
        }

        public Criteria andQqenameLessThanOrEqualTo(String value) {
            addCriterion("qqename <=", value, "qqename");
            return (Criteria) this;
        }

        public Criteria andQqenameLike(String value) {
            addCriterion("qqename like", value, "qqename");
            return (Criteria) this;
        }

        public Criteria andQqenameNotLike(String value) {
            addCriterion("qqename not like", value, "qqename");
            return (Criteria) this;
        }

        public Criteria andQqenameIn(List<String> values) {
            addCriterion("qqename in", values, "qqename");
            return (Criteria) this;
        }

        public Criteria andQqenameNotIn(List<String> values) {
            addCriterion("qqename not in", values, "qqename");
            return (Criteria) this;
        }

        public Criteria andQqenameBetween(String value1, String value2) {
            addCriterion("qqename between", value1, value2, "qqename");
            return (Criteria) this;
        }

        public Criteria andQqenameNotBetween(String value1, String value2) {
            addCriterion("qqename not between", value1, value2, "qqename");
            return (Criteria) this;
        }

        public Criteria andQqesexIsNull() {
            addCriterion("qqesex is null");
            return (Criteria) this;
        }

        public Criteria andQqesexIsNotNull() {
            addCriterion("qqesex is not null");
            return (Criteria) this;
        }

        public Criteria andQqesexEqualTo(Integer value) {
            addCriterion("qqesex =", value, "qqesex");
            return (Criteria) this;
        }

        public Criteria andQqesexNotEqualTo(Integer value) {
            addCriterion("qqesex <>", value, "qqesex");
            return (Criteria) this;
        }

        public Criteria andQqesexGreaterThan(Integer value) {
            addCriterion("qqesex >", value, "qqesex");
            return (Criteria) this;
        }

        public Criteria andQqesexGreaterThanOrEqualTo(Integer value) {
            addCriterion("qqesex >=", value, "qqesex");
            return (Criteria) this;
        }

        public Criteria andQqesexLessThan(Integer value) {
            addCriterion("qqesex <", value, "qqesex");
            return (Criteria) this;
        }

        public Criteria andQqesexLessThanOrEqualTo(Integer value) {
            addCriterion("qqesex <=", value, "qqesex");
            return (Criteria) this;
        }

        public Criteria andQqesexIn(List<Integer> values) {
            addCriterion("qqesex in", values, "qqesex");
            return (Criteria) this;
        }

        public Criteria andQqesexNotIn(List<Integer> values) {
            addCriterion("qqesex not in", values, "qqesex");
            return (Criteria) this;
        }

        public Criteria andQqesexBetween(Integer value1, Integer value2) {
            addCriterion("qqesex between", value1, value2, "qqesex");
            return (Criteria) this;
        }

        public Criteria andQqesexNotBetween(Integer value1, Integer value2) {
            addCriterion("qqesex not between", value1, value2, "qqesex");
            return (Criteria) this;
        }

        public Criteria andQqeuseIsNull() {
            addCriterion("qqeuse is null");
            return (Criteria) this;
        }

        public Criteria andQqeuseIsNotNull() {
            addCriterion("qqeuse is not null");
            return (Criteria) this;
        }

        public Criteria andQqeuseEqualTo(String value) {
            addCriterion("qqeuse =", value, "qqeuse");
            return (Criteria) this;
        }

        public Criteria andQqeuseNotEqualTo(String value) {
            addCriterion("qqeuse <>", value, "qqeuse");
            return (Criteria) this;
        }

        public Criteria andQqeuseGreaterThan(String value) {
            addCriterion("qqeuse >", value, "qqeuse");
            return (Criteria) this;
        }

        public Criteria andQqeuseGreaterThanOrEqualTo(String value) {
            addCriterion("qqeuse >=", value, "qqeuse");
            return (Criteria) this;
        }

        public Criteria andQqeuseLessThan(String value) {
            addCriterion("qqeuse <", value, "qqeuse");
            return (Criteria) this;
        }

        public Criteria andQqeuseLessThanOrEqualTo(String value) {
            addCriterion("qqeuse <=", value, "qqeuse");
            return (Criteria) this;
        }

        public Criteria andQqeuseLike(String value) {
            addCriterion("qqeuse like", value, "qqeuse");
            return (Criteria) this;
        }

        public Criteria andQqeuseNotLike(String value) {
            addCriterion("qqeuse not like", value, "qqeuse");
            return (Criteria) this;
        }

        public Criteria andQqeuseIn(List<String> values) {
            addCriterion("qqeuse in", values, "qqeuse");
            return (Criteria) this;
        }

        public Criteria andQqeuseNotIn(List<String> values) {
            addCriterion("qqeuse not in", values, "qqeuse");
            return (Criteria) this;
        }

        public Criteria andQqeuseBetween(String value1, String value2) {
            addCriterion("qqeuse between", value1, value2, "qqeuse");
            return (Criteria) this;
        }

        public Criteria andQqeuseNotBetween(String value1, String value2) {
            addCriterion("qqeuse not between", value1, value2, "qqeuse");
            return (Criteria) this;
        }

        public Criteria andQqepwdIsNull() {
            addCriterion("qqepwd is null");
            return (Criteria) this;
        }

        public Criteria andQqepwdIsNotNull() {
            addCriterion("qqepwd is not null");
            return (Criteria) this;
        }

        public Criteria andQqepwdEqualTo(String value) {
            addCriterion("qqepwd =", value, "qqepwd");
            return (Criteria) this;
        }

        public Criteria andQqepwdNotEqualTo(String value) {
            addCriterion("qqepwd <>", value, "qqepwd");
            return (Criteria) this;
        }

        public Criteria andQqepwdGreaterThan(String value) {
            addCriterion("qqepwd >", value, "qqepwd");
            return (Criteria) this;
        }

        public Criteria andQqepwdGreaterThanOrEqualTo(String value) {
            addCriterion("qqepwd >=", value, "qqepwd");
            return (Criteria) this;
        }

        public Criteria andQqepwdLessThan(String value) {
            addCriterion("qqepwd <", value, "qqepwd");
            return (Criteria) this;
        }

        public Criteria andQqepwdLessThanOrEqualTo(String value) {
            addCriterion("qqepwd <=", value, "qqepwd");
            return (Criteria) this;
        }

        public Criteria andQqepwdLike(String value) {
            addCriterion("qqepwd like", value, "qqepwd");
            return (Criteria) this;
        }

        public Criteria andQqepwdNotLike(String value) {
            addCriterion("qqepwd not like", value, "qqepwd");
            return (Criteria) this;
        }

        public Criteria andQqepwdIn(List<String> values) {
            addCriterion("qqepwd in", values, "qqepwd");
            return (Criteria) this;
        }

        public Criteria andQqepwdNotIn(List<String> values) {
            addCriterion("qqepwd not in", values, "qqepwd");
            return (Criteria) this;
        }

        public Criteria andQqepwdBetween(String value1, String value2) {
            addCriterion("qqepwd between", value1, value2, "qqepwd");
            return (Criteria) this;
        }

        public Criteria andQqepwdNotBetween(String value1, String value2) {
            addCriterion("qqepwd not between", value1, value2, "qqepwd");
            return (Criteria) this;
        }

        public Criteria andQqelastuppIsNull() {
            addCriterion("qqelastupp is null");
            return (Criteria) this;
        }

        public Criteria andQqelastuppIsNotNull() {
            addCriterion("qqelastupp is not null");
            return (Criteria) this;
        }

        public Criteria andQqelastuppEqualTo(Date value) {
            addCriterion("qqelastupp =", value, "qqelastupp");
            return (Criteria) this;
        }

        public Criteria andQqelastuppNotEqualTo(Date value) {
            addCriterion("qqelastupp <>", value, "qqelastupp");
            return (Criteria) this;
        }

        public Criteria andQqelastuppGreaterThan(Date value) {
            addCriterion("qqelastupp >", value, "qqelastupp");
            return (Criteria) this;
        }

        public Criteria andQqelastuppGreaterThanOrEqualTo(Date value) {
            addCriterion("qqelastupp >=", value, "qqelastupp");
            return (Criteria) this;
        }

        public Criteria andQqelastuppLessThan(Date value) {
            addCriterion("qqelastupp <", value, "qqelastupp");
            return (Criteria) this;
        }

        public Criteria andQqelastuppLessThanOrEqualTo(Date value) {
            addCriterion("qqelastupp <=", value, "qqelastupp");
            return (Criteria) this;
        }

        public Criteria andQqelastuppIn(List<Date> values) {
            addCriterion("qqelastupp in", values, "qqelastupp");
            return (Criteria) this;
        }

        public Criteria andQqelastuppNotIn(List<Date> values) {
            addCriterion("qqelastupp not in", values, "qqelastupp");
            return (Criteria) this;
        }

        public Criteria andQqelastuppBetween(Date value1, Date value2) {
            addCriterion("qqelastupp between", value1, value2, "qqelastupp");
            return (Criteria) this;
        }

        public Criteria andQqelastuppNotBetween(Date value1, Date value2) {
            addCriterion("qqelastupp not between", value1, value2, "qqelastupp");
            return (Criteria) this;
        }

        public Criteria andLastfpIsNull() {
            addCriterion("lastfp is null");
            return (Criteria) this;
        }

        public Criteria andLastfpIsNotNull() {
            addCriterion("lastfp is not null");
            return (Criteria) this;
        }

        public Criteria andLastfpEqualTo(Date value) {
            addCriterion("lastfp =", value, "lastfp");
            return (Criteria) this;
        }

        public Criteria andLastfpNotEqualTo(Date value) {
            addCriterion("lastfp <>", value, "lastfp");
            return (Criteria) this;
        }

        public Criteria andLastfpGreaterThan(Date value) {
            addCriterion("lastfp >", value, "lastfp");
            return (Criteria) this;
        }

        public Criteria andLastfpGreaterThanOrEqualTo(Date value) {
            addCriterion("lastfp >=", value, "lastfp");
            return (Criteria) this;
        }

        public Criteria andLastfpLessThan(Date value) {
            addCriterion("lastfp <", value, "lastfp");
            return (Criteria) this;
        }

        public Criteria andLastfpLessThanOrEqualTo(Date value) {
            addCriterion("lastfp <=", value, "lastfp");
            return (Criteria) this;
        }

        public Criteria andLastfpIn(List<Date> values) {
            addCriterion("lastfp in", values, "lastfp");
            return (Criteria) this;
        }

        public Criteria andLastfpNotIn(List<Date> values) {
            addCriterion("lastfp not in", values, "lastfp");
            return (Criteria) this;
        }

        public Criteria andLastfpBetween(Date value1, Date value2) {
            addCriterion("lastfp between", value1, value2, "lastfp");
            return (Criteria) this;
        }

        public Criteria andLastfpNotBetween(Date value1, Date value2) {
            addCriterion("lastfp not between", value1, value2, "lastfp");
            return (Criteria) this;
        }

        public Criteria andQqenoteIsNull() {
            addCriterion("qqenote is null");
            return (Criteria) this;
        }

        public Criteria andQqenoteIsNotNull() {
            addCriterion("qqenote is not null");
            return (Criteria) this;
        }

        public Criteria andQqenoteEqualTo(String value) {
            addCriterion("qqenote =", value, "qqenote");
            return (Criteria) this;
        }

        public Criteria andQqenoteNotEqualTo(String value) {
            addCriterion("qqenote <>", value, "qqenote");
            return (Criteria) this;
        }

        public Criteria andQqenoteGreaterThan(String value) {
            addCriterion("qqenote >", value, "qqenote");
            return (Criteria) this;
        }

        public Criteria andQqenoteGreaterThanOrEqualTo(String value) {
            addCriterion("qqenote >=", value, "qqenote");
            return (Criteria) this;
        }

        public Criteria andQqenoteLessThan(String value) {
            addCriterion("qqenote <", value, "qqenote");
            return (Criteria) this;
        }

        public Criteria andQqenoteLessThanOrEqualTo(String value) {
            addCriterion("qqenote <=", value, "qqenote");
            return (Criteria) this;
        }

        public Criteria andQqenoteLike(String value) {
            addCriterion("qqenote like", value, "qqenote");
            return (Criteria) this;
        }

        public Criteria andQqenoteNotLike(String value) {
            addCriterion("qqenote not like", value, "qqenote");
            return (Criteria) this;
        }

        public Criteria andQqenoteIn(List<String> values) {
            addCriterion("qqenote in", values, "qqenote");
            return (Criteria) this;
        }

        public Criteria andQqenoteNotIn(List<String> values) {
            addCriterion("qqenote not in", values, "qqenote");
            return (Criteria) this;
        }

        public Criteria andQqenoteBetween(String value1, String value2) {
            addCriterion("qqenote between", value1, value2, "qqenote");
            return (Criteria) this;
        }

        public Criteria andQqenoteNotBetween(String value1, String value2) {
            addCriterion("qqenote not between", value1, value2, "qqenote");
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