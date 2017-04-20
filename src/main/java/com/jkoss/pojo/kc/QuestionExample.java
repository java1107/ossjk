package com.jkoss.pojo.kc;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQidIsNull() {
            addCriterion("qid is null");
            return (Criteria) this;
        }

        public Criteria andQidIsNotNull() {
            addCriterion("qid is not null");
            return (Criteria) this;
        }

        public Criteria andQidEqualTo(Integer value) {
            addCriterion("qid =", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotEqualTo(Integer value) {
            addCriterion("qid <>", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThan(Integer value) {
            addCriterion("qid >", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qid >=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThan(Integer value) {
            addCriterion("qid <", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThanOrEqualTo(Integer value) {
            addCriterion("qid <=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidIn(List<Integer> values) {
            addCriterion("qid in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotIn(List<Integer> values) {
            addCriterion("qid not in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidBetween(Integer value1, Integer value2) {
            addCriterion("qid between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotBetween(Integer value1, Integer value2) {
            addCriterion("qid not between", value1, value2, "qid");
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

        public Criteria andKcmdelidIsNull() {
            addCriterion("kcmdelid is null");
            return (Criteria) this;
        }

        public Criteria andKcmdelidIsNotNull() {
            addCriterion("kcmdelid is not null");
            return (Criteria) this;
        }

        public Criteria andKcmdelidEqualTo(Integer value) {
            addCriterion("kcmdelid =", value, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidNotEqualTo(Integer value) {
            addCriterion("kcmdelid <>", value, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidGreaterThan(Integer value) {
            addCriterion("kcmdelid >", value, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kcmdelid >=", value, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidLessThan(Integer value) {
            addCriterion("kcmdelid <", value, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidLessThanOrEqualTo(Integer value) {
            addCriterion("kcmdelid <=", value, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidIn(List<Integer> values) {
            addCriterion("kcmdelid in", values, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidNotIn(List<Integer> values) {
            addCriterion("kcmdelid not in", values, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidBetween(Integer value1, Integer value2) {
            addCriterion("kcmdelid between", value1, value2, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andKcmdelidNotBetween(Integer value1, Integer value2) {
            addCriterion("kcmdelid not between", value1, value2, "kcmdelid");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIsNull() {
            addCriterion("questionName is null");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIsNotNull() {
            addCriterion("questionName is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionNameEqualTo(String value) {
            addCriterion("questionName =", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotEqualTo(String value) {
            addCriterion("questionName <>", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameGreaterThan(String value) {
            addCriterion("questionName >", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameGreaterThanOrEqualTo(String value) {
            addCriterion("questionName >=", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLessThan(String value) {
            addCriterion("questionName <", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLessThanOrEqualTo(String value) {
            addCriterion("questionName <=", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLike(String value) {
            addCriterion("questionName like", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotLike(String value) {
            addCriterion("questionName not like", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIn(List<String> values) {
            addCriterion("questionName in", values, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotIn(List<String> values) {
            addCriterion("questionName not in", values, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameBetween(String value1, String value2) {
            addCriterion("questionName between", value1, value2, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotBetween(String value1, String value2) {
            addCriterion("questionName not between", value1, value2, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIsNull() {
            addCriterion("questiontype is null");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIsNotNull() {
            addCriterion("questiontype is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeEqualTo(Integer value) {
            addCriterion("questiontype =", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeNotEqualTo(Integer value) {
            addCriterion("questiontype <>", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeGreaterThan(Integer value) {
            addCriterion("questiontype >", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("questiontype >=", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeLessThan(Integer value) {
            addCriterion("questiontype <", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeLessThanOrEqualTo(Integer value) {
            addCriterion("questiontype <=", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIn(List<Integer> values) {
            addCriterion("questiontype in", values, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeNotIn(List<Integer> values) {
            addCriterion("questiontype not in", values, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeBetween(Integer value1, Integer value2) {
            addCriterion("questiontype between", value1, value2, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("questiontype not between", value1, value2, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQselectAIsNull() {
            addCriterion("qselectA is null");
            return (Criteria) this;
        }

        public Criteria andQselectAIsNotNull() {
            addCriterion("qselectA is not null");
            return (Criteria) this;
        }

        public Criteria andQselectAEqualTo(String value) {
            addCriterion("qselectA =", value, "qselectA");
            return (Criteria) this;
        }

        public Criteria andQselectANotEqualTo(String value) {
            addCriterion("qselectA <>", value, "qselectA");
            return (Criteria) this;
        }

        public Criteria andQselectAGreaterThan(String value) {
            addCriterion("qselectA >", value, "qselectA");
            return (Criteria) this;
        }

        public Criteria andQselectAGreaterThanOrEqualTo(String value) {
            addCriterion("qselectA >=", value, "qselectA");
            return (Criteria) this;
        }

        public Criteria andQselectALessThan(String value) {
            addCriterion("qselectA <", value, "qselectA");
            return (Criteria) this;
        }

        public Criteria andQselectALessThanOrEqualTo(String value) {
            addCriterion("qselectA <=", value, "qselectA");
            return (Criteria) this;
        }

        public Criteria andQselectALike(String value) {
            addCriterion("qselectA like", value, "qselectA");
            return (Criteria) this;
        }

        public Criteria andQselectANotLike(String value) {
            addCriterion("qselectA not like", value, "qselectA");
            return (Criteria) this;
        }

        public Criteria andQselectAIn(List<String> values) {
            addCriterion("qselectA in", values, "qselectA");
            return (Criteria) this;
        }

        public Criteria andQselectANotIn(List<String> values) {
            addCriterion("qselectA not in", values, "qselectA");
            return (Criteria) this;
        }

        public Criteria andQselectABetween(String value1, String value2) {
            addCriterion("qselectA between", value1, value2, "qselectA");
            return (Criteria) this;
        }

        public Criteria andQselectANotBetween(String value1, String value2) {
            addCriterion("qselectA not between", value1, value2, "qselectA");
            return (Criteria) this;
        }

        public Criteria andQselectBIsNull() {
            addCriterion("qselectB is null");
            return (Criteria) this;
        }

        public Criteria andQselectBIsNotNull() {
            addCriterion("qselectB is not null");
            return (Criteria) this;
        }

        public Criteria andQselectBEqualTo(String value) {
            addCriterion("qselectB =", value, "qselectB");
            return (Criteria) this;
        }

        public Criteria andQselectBNotEqualTo(String value) {
            addCriterion("qselectB <>", value, "qselectB");
            return (Criteria) this;
        }

        public Criteria andQselectBGreaterThan(String value) {
            addCriterion("qselectB >", value, "qselectB");
            return (Criteria) this;
        }

        public Criteria andQselectBGreaterThanOrEqualTo(String value) {
            addCriterion("qselectB >=", value, "qselectB");
            return (Criteria) this;
        }

        public Criteria andQselectBLessThan(String value) {
            addCriterion("qselectB <", value, "qselectB");
            return (Criteria) this;
        }

        public Criteria andQselectBLessThanOrEqualTo(String value) {
            addCriterion("qselectB <=", value, "qselectB");
            return (Criteria) this;
        }

        public Criteria andQselectBLike(String value) {
            addCriterion("qselectB like", value, "qselectB");
            return (Criteria) this;
        }

        public Criteria andQselectBNotLike(String value) {
            addCriterion("qselectB not like", value, "qselectB");
            return (Criteria) this;
        }

        public Criteria andQselectBIn(List<String> values) {
            addCriterion("qselectB in", values, "qselectB");
            return (Criteria) this;
        }

        public Criteria andQselectBNotIn(List<String> values) {
            addCriterion("qselectB not in", values, "qselectB");
            return (Criteria) this;
        }

        public Criteria andQselectBBetween(String value1, String value2) {
            addCriterion("qselectB between", value1, value2, "qselectB");
            return (Criteria) this;
        }

        public Criteria andQselectBNotBetween(String value1, String value2) {
            addCriterion("qselectB not between", value1, value2, "qselectB");
            return (Criteria) this;
        }

        public Criteria andQselectCIsNull() {
            addCriterion("qselectC is null");
            return (Criteria) this;
        }

        public Criteria andQselectCIsNotNull() {
            addCriterion("qselectC is not null");
            return (Criteria) this;
        }

        public Criteria andQselectCEqualTo(String value) {
            addCriterion("qselectC =", value, "qselectC");
            return (Criteria) this;
        }

        public Criteria andQselectCNotEqualTo(String value) {
            addCriterion("qselectC <>", value, "qselectC");
            return (Criteria) this;
        }

        public Criteria andQselectCGreaterThan(String value) {
            addCriterion("qselectC >", value, "qselectC");
            return (Criteria) this;
        }

        public Criteria andQselectCGreaterThanOrEqualTo(String value) {
            addCriterion("qselectC >=", value, "qselectC");
            return (Criteria) this;
        }

        public Criteria andQselectCLessThan(String value) {
            addCriterion("qselectC <", value, "qselectC");
            return (Criteria) this;
        }

        public Criteria andQselectCLessThanOrEqualTo(String value) {
            addCriterion("qselectC <=", value, "qselectC");
            return (Criteria) this;
        }

        public Criteria andQselectCLike(String value) {
            addCriterion("qselectC like", value, "qselectC");
            return (Criteria) this;
        }

        public Criteria andQselectCNotLike(String value) {
            addCriterion("qselectC not like", value, "qselectC");
            return (Criteria) this;
        }

        public Criteria andQselectCIn(List<String> values) {
            addCriterion("qselectC in", values, "qselectC");
            return (Criteria) this;
        }

        public Criteria andQselectCNotIn(List<String> values) {
            addCriterion("qselectC not in", values, "qselectC");
            return (Criteria) this;
        }

        public Criteria andQselectCBetween(String value1, String value2) {
            addCriterion("qselectC between", value1, value2, "qselectC");
            return (Criteria) this;
        }

        public Criteria andQselectCNotBetween(String value1, String value2) {
            addCriterion("qselectC not between", value1, value2, "qselectC");
            return (Criteria) this;
        }

        public Criteria andQselectDIsNull() {
            addCriterion("qselectD is null");
            return (Criteria) this;
        }

        public Criteria andQselectDIsNotNull() {
            addCriterion("qselectD is not null");
            return (Criteria) this;
        }

        public Criteria andQselectDEqualTo(String value) {
            addCriterion("qselectD =", value, "qselectD");
            return (Criteria) this;
        }

        public Criteria andQselectDNotEqualTo(String value) {
            addCriterion("qselectD <>", value, "qselectD");
            return (Criteria) this;
        }

        public Criteria andQselectDGreaterThan(String value) {
            addCriterion("qselectD >", value, "qselectD");
            return (Criteria) this;
        }

        public Criteria andQselectDGreaterThanOrEqualTo(String value) {
            addCriterion("qselectD >=", value, "qselectD");
            return (Criteria) this;
        }

        public Criteria andQselectDLessThan(String value) {
            addCriterion("qselectD <", value, "qselectD");
            return (Criteria) this;
        }

        public Criteria andQselectDLessThanOrEqualTo(String value) {
            addCriterion("qselectD <=", value, "qselectD");
            return (Criteria) this;
        }

        public Criteria andQselectDLike(String value) {
            addCriterion("qselectD like", value, "qselectD");
            return (Criteria) this;
        }

        public Criteria andQselectDNotLike(String value) {
            addCriterion("qselectD not like", value, "qselectD");
            return (Criteria) this;
        }

        public Criteria andQselectDIn(List<String> values) {
            addCriterion("qselectD in", values, "qselectD");
            return (Criteria) this;
        }

        public Criteria andQselectDNotIn(List<String> values) {
            addCriterion("qselectD not in", values, "qselectD");
            return (Criteria) this;
        }

        public Criteria andQselectDBetween(String value1, String value2) {
            addCriterion("qselectD between", value1, value2, "qselectD");
            return (Criteria) this;
        }

        public Criteria andQselectDNotBetween(String value1, String value2) {
            addCriterion("qselectD not between", value1, value2, "qselectD");
            return (Criteria) this;
        }

        public Criteria andAnwsIsNull() {
            addCriterion("anws is null");
            return (Criteria) this;
        }

        public Criteria andAnwsIsNotNull() {
            addCriterion("anws is not null");
            return (Criteria) this;
        }

        public Criteria andAnwsEqualTo(String value) {
            addCriterion("anws =", value, "anws");
            return (Criteria) this;
        }

        public Criteria andAnwsNotEqualTo(String value) {
            addCriterion("anws <>", value, "anws");
            return (Criteria) this;
        }

        public Criteria andAnwsGreaterThan(String value) {
            addCriterion("anws >", value, "anws");
            return (Criteria) this;
        }

        public Criteria andAnwsGreaterThanOrEqualTo(String value) {
            addCriterion("anws >=", value, "anws");
            return (Criteria) this;
        }

        public Criteria andAnwsLessThan(String value) {
            addCriterion("anws <", value, "anws");
            return (Criteria) this;
        }

        public Criteria andAnwsLessThanOrEqualTo(String value) {
            addCriterion("anws <=", value, "anws");
            return (Criteria) this;
        }

        public Criteria andAnwsLike(String value) {
            addCriterion("anws like", value, "anws");
            return (Criteria) this;
        }

        public Criteria andAnwsNotLike(String value) {
            addCriterion("anws not like", value, "anws");
            return (Criteria) this;
        }

        public Criteria andAnwsIn(List<String> values) {
            addCriterion("anws in", values, "anws");
            return (Criteria) this;
        }

        public Criteria andAnwsNotIn(List<String> values) {
            addCriterion("anws not in", values, "anws");
            return (Criteria) this;
        }

        public Criteria andAnwsBetween(String value1, String value2) {
            addCriterion("anws between", value1, value2, "anws");
            return (Criteria) this;
        }

        public Criteria andAnwsNotBetween(String value1, String value2) {
            addCriterion("anws not between", value1, value2, "anws");
            return (Criteria) this;
        }

        public Criteria andHardIsNull() {
            addCriterion("hard is null");
            return (Criteria) this;
        }

        public Criteria andHardIsNotNull() {
            addCriterion("hard is not null");
            return (Criteria) this;
        }

        public Criteria andHardEqualTo(Integer value) {
            addCriterion("hard =", value, "hard");
            return (Criteria) this;
        }

        public Criteria andHardNotEqualTo(Integer value) {
            addCriterion("hard <>", value, "hard");
            return (Criteria) this;
        }

        public Criteria andHardGreaterThan(Integer value) {
            addCriterion("hard >", value, "hard");
            return (Criteria) this;
        }

        public Criteria andHardGreaterThanOrEqualTo(Integer value) {
            addCriterion("hard >=", value, "hard");
            return (Criteria) this;
        }

        public Criteria andHardLessThan(Integer value) {
            addCriterion("hard <", value, "hard");
            return (Criteria) this;
        }

        public Criteria andHardLessThanOrEqualTo(Integer value) {
            addCriterion("hard <=", value, "hard");
            return (Criteria) this;
        }

        public Criteria andHardIn(List<Integer> values) {
            addCriterion("hard in", values, "hard");
            return (Criteria) this;
        }

        public Criteria andHardNotIn(List<Integer> values) {
            addCriterion("hard not in", values, "hard");
            return (Criteria) this;
        }

        public Criteria andHardBetween(Integer value1, Integer value2) {
            addCriterion("hard between", value1, value2, "hard");
            return (Criteria) this;
        }

        public Criteria andHardNotBetween(Integer value1, Integer value2) {
            addCriterion("hard not between", value1, value2, "hard");
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