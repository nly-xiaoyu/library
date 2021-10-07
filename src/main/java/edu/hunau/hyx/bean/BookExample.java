package edu.hunau.hyx.bean;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("bname is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("bname is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("bname =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("bname <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("bname >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("bname >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("bname <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("bname <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("bname like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("bname not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("bname in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("bname not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("bname between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("bname not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnoIsNull() {
            addCriterion("bno is null");
            return (Criteria) this;
        }

        public Criteria andBnoIsNotNull() {
            addCriterion("bno is not null");
            return (Criteria) this;
        }

        public Criteria andBnoEqualTo(Integer value) {
            addCriterion("bno =", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotEqualTo(Integer value) {
            addCriterion("bno <>", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoGreaterThan(Integer value) {
            addCriterion("bno >", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("bno >=", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLessThan(Integer value) {
            addCriterion("bno <", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLessThanOrEqualTo(Integer value) {
            addCriterion("bno <=", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoIn(List<Integer> values) {
            addCriterion("bno in", values, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotIn(List<Integer> values) {
            addCriterion("bno not in", values, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoBetween(Integer value1, Integer value2) {
            addCriterion("bno between", value1, value2, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotBetween(Integer value1, Integer value2) {
            addCriterion("bno not between", value1, value2, "bno");
            return (Criteria) this;
        }

        public Criteria andAuthoeIsNull() {
            addCriterion("authoe is null");
            return (Criteria) this;
        }

        public Criteria andAuthoeIsNotNull() {
            addCriterion("authoe is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoeEqualTo(String value) {
            addCriterion("authoe =", value, "authoe");
            return (Criteria) this;
        }

        public Criteria andAuthoeNotEqualTo(String value) {
            addCriterion("authoe <>", value, "authoe");
            return (Criteria) this;
        }

        public Criteria andAuthoeGreaterThan(String value) {
            addCriterion("authoe >", value, "authoe");
            return (Criteria) this;
        }

        public Criteria andAuthoeGreaterThanOrEqualTo(String value) {
            addCriterion("authoe >=", value, "authoe");
            return (Criteria) this;
        }

        public Criteria andAuthoeLessThan(String value) {
            addCriterion("authoe <", value, "authoe");
            return (Criteria) this;
        }

        public Criteria andAuthoeLessThanOrEqualTo(String value) {
            addCriterion("authoe <=", value, "authoe");
            return (Criteria) this;
        }

        public Criteria andAuthoeLike(String value) {
            addCriterion("authoe like", value, "authoe");
            return (Criteria) this;
        }

        public Criteria andAuthoeNotLike(String value) {
            addCriterion("authoe not like", value, "authoe");
            return (Criteria) this;
        }

        public Criteria andAuthoeIn(List<String> values) {
            addCriterion("authoe in", values, "authoe");
            return (Criteria) this;
        }

        public Criteria andAuthoeNotIn(List<String> values) {
            addCriterion("authoe not in", values, "authoe");
            return (Criteria) this;
        }

        public Criteria andAuthoeBetween(String value1, String value2) {
            addCriterion("authoe between", value1, value2, "authoe");
            return (Criteria) this;
        }

        public Criteria andAuthoeNotBetween(String value1, String value2) {
            addCriterion("authoe not between", value1, value2, "authoe");
            return (Criteria) this;
        }

        public Criteria andBclassIsNull() {
            addCriterion("bclass is null");
            return (Criteria) this;
        }

        public Criteria andBclassIsNotNull() {
            addCriterion("bclass is not null");
            return (Criteria) this;
        }

        public Criteria andBclassEqualTo(String value) {
            addCriterion("bclass =", value, "bclass");
            return (Criteria) this;
        }

        public Criteria andBclassNotEqualTo(String value) {
            addCriterion("bclass <>", value, "bclass");
            return (Criteria) this;
        }

        public Criteria andBclassGreaterThan(String value) {
            addCriterion("bclass >", value, "bclass");
            return (Criteria) this;
        }

        public Criteria andBclassGreaterThanOrEqualTo(String value) {
            addCriterion("bclass >=", value, "bclass");
            return (Criteria) this;
        }

        public Criteria andBclassLessThan(String value) {
            addCriterion("bclass <", value, "bclass");
            return (Criteria) this;
        }

        public Criteria andBclassLessThanOrEqualTo(String value) {
            addCriterion("bclass <=", value, "bclass");
            return (Criteria) this;
        }

        public Criteria andBclassLike(String value) {
            addCriterion("bclass like", value, "bclass");
            return (Criteria) this;
        }

        public Criteria andBclassNotLike(String value) {
            addCriterion("bclass not like", value, "bclass");
            return (Criteria) this;
        }

        public Criteria andBclassIn(List<String> values) {
            addCriterion("bclass in", values, "bclass");
            return (Criteria) this;
        }

        public Criteria andBclassNotIn(List<String> values) {
            addCriterion("bclass not in", values, "bclass");
            return (Criteria) this;
        }

        public Criteria andBclassBetween(String value1, String value2) {
            addCriterion("bclass between", value1, value2, "bclass");
            return (Criteria) this;
        }

        public Criteria andBclassNotBetween(String value1, String value2) {
            addCriterion("bclass not between", value1, value2, "bclass");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andLocnumIsNull() {
            addCriterion("locnum is null");
            return (Criteria) this;
        }

        public Criteria andLocnumIsNotNull() {
            addCriterion("locnum is not null");
            return (Criteria) this;
        }

        public Criteria andLocnumEqualTo(Integer value) {
            addCriterion("locnum =", value, "locnum");
            return (Criteria) this;
        }

        public Criteria andLocnumNotEqualTo(Integer value) {
            addCriterion("locnum <>", value, "locnum");
            return (Criteria) this;
        }

        public Criteria andLocnumGreaterThan(Integer value) {
            addCriterion("locnum >", value, "locnum");
            return (Criteria) this;
        }

        public Criteria andLocnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("locnum >=", value, "locnum");
            return (Criteria) this;
        }

        public Criteria andLocnumLessThan(Integer value) {
            addCriterion("locnum <", value, "locnum");
            return (Criteria) this;
        }

        public Criteria andLocnumLessThanOrEqualTo(Integer value) {
            addCriterion("locnum <=", value, "locnum");
            return (Criteria) this;
        }

        public Criteria andLocnumIn(List<Integer> values) {
            addCriterion("locnum in", values, "locnum");
            return (Criteria) this;
        }

        public Criteria andLocnumNotIn(List<Integer> values) {
            addCriterion("locnum not in", values, "locnum");
            return (Criteria) this;
        }

        public Criteria andLocnumBetween(Integer value1, Integer value2) {
            addCriterion("locnum between", value1, value2, "locnum");
            return (Criteria) this;
        }

        public Criteria andLocnumNotBetween(Integer value1, Integer value2) {
            addCriterion("locnum not between", value1, value2, "locnum");
            return (Criteria) this;
        }

        public Criteria andLocareaIsNull() {
            addCriterion("locarea is null");
            return (Criteria) this;
        }

        public Criteria andLocareaIsNotNull() {
            addCriterion("locarea is not null");
            return (Criteria) this;
        }

        public Criteria andLocareaEqualTo(String value) {
            addCriterion("locarea =", value, "locarea");
            return (Criteria) this;
        }

        public Criteria andLocareaNotEqualTo(String value) {
            addCriterion("locarea <>", value, "locarea");
            return (Criteria) this;
        }

        public Criteria andLocareaGreaterThan(String value) {
            addCriterion("locarea >", value, "locarea");
            return (Criteria) this;
        }

        public Criteria andLocareaGreaterThanOrEqualTo(String value) {
            addCriterion("locarea >=", value, "locarea");
            return (Criteria) this;
        }

        public Criteria andLocareaLessThan(String value) {
            addCriterion("locarea <", value, "locarea");
            return (Criteria) this;
        }

        public Criteria andLocareaLessThanOrEqualTo(String value) {
            addCriterion("locarea <=", value, "locarea");
            return (Criteria) this;
        }

        public Criteria andLocareaLike(String value) {
            addCriterion("locarea like", value, "locarea");
            return (Criteria) this;
        }

        public Criteria andLocareaNotLike(String value) {
            addCriterion("locarea not like", value, "locarea");
            return (Criteria) this;
        }

        public Criteria andLocareaIn(List<String> values) {
            addCriterion("locarea in", values, "locarea");
            return (Criteria) this;
        }

        public Criteria andLocareaNotIn(List<String> values) {
            addCriterion("locarea not in", values, "locarea");
            return (Criteria) this;
        }

        public Criteria andLocareaBetween(String value1, String value2) {
            addCriterion("locarea between", value1, value2, "locarea");
            return (Criteria) this;
        }

        public Criteria andLocareaNotBetween(String value1, String value2) {
            addCriterion("locarea not between", value1, value2, "locarea");
            return (Criteria) this;
        }

        public Criteria andRamarkIsNull() {
            addCriterion("ramark is null");
            return (Criteria) this;
        }

        public Criteria andRamarkIsNotNull() {
            addCriterion("ramark is not null");
            return (Criteria) this;
        }

        public Criteria andRamarkEqualTo(String value) {
            addCriterion("ramark =", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkNotEqualTo(String value) {
            addCriterion("ramark <>", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkGreaterThan(String value) {
            addCriterion("ramark >", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkGreaterThanOrEqualTo(String value) {
            addCriterion("ramark >=", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkLessThan(String value) {
            addCriterion("ramark <", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkLessThanOrEqualTo(String value) {
            addCriterion("ramark <=", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkLike(String value) {
            addCriterion("ramark like", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkNotLike(String value) {
            addCriterion("ramark not like", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkIn(List<String> values) {
            addCriterion("ramark in", values, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkNotIn(List<String> values) {
            addCriterion("ramark not in", values, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkBetween(String value1, String value2) {
            addCriterion("ramark between", value1, value2, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkNotBetween(String value1, String value2) {
            addCriterion("ramark not between", value1, value2, "ramark");
            return (Criteria) this;
        }

        public Criteria andBstatusIsNull() {
            addCriterion("bstatus is null");
            return (Criteria) this;
        }

        public Criteria andBstatusIsNotNull() {
            addCriterion("bstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBstatusEqualTo(Integer value) {
            addCriterion("bstatus =", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotEqualTo(Integer value) {
            addCriterion("bstatus <>", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusGreaterThan(Integer value) {
            addCriterion("bstatus >", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bstatus >=", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusLessThan(Integer value) {
            addCriterion("bstatus <", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusLessThanOrEqualTo(Integer value) {
            addCriterion("bstatus <=", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusIn(List<Integer> values) {
            addCriterion("bstatus in", values, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotIn(List<Integer> values) {
            addCriterion("bstatus not in", values, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusBetween(Integer value1, Integer value2) {
            addCriterion("bstatus between", value1, value2, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("bstatus not between", value1, value2, "bstatus");
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