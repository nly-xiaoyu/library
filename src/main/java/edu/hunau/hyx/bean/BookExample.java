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

        public Criteria andBnoIsNull() {
            addCriterion("bno is null");
            return (Criteria) this;
        }

        public Criteria andBnoIsNotNull() {
            addCriterion("bno is not null");
            return (Criteria) this;
        }

        public Criteria andBnoEqualTo(String value) {
            addCriterion("bno =", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotEqualTo(String value) {
            addCriterion("bno <>", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoGreaterThan(String value) {
            addCriterion("bno >", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoGreaterThanOrEqualTo(String value) {
            addCriterion("bno >=", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLessThan(String value) {
            addCriterion("bno <", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLessThanOrEqualTo(String value) {
            addCriterion("bno <=", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLike(String value) {
            addCriterion("bno like", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotLike(String value) {
            addCriterion("bno not like", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoIn(List<String> values) {
            addCriterion("bno in", values, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotIn(List<String> values) {
            addCriterion("bno not in", values, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoBetween(String value1, String value2) {
            addCriterion("bno between", value1, value2, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotBetween(String value1, String value2) {
            addCriterion("bno not between", value1, value2, "bno");
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

        public Criteria andBauthorIsNull() {
            addCriterion("bauthor is null");
            return (Criteria) this;
        }

        public Criteria andBauthorIsNotNull() {
            addCriterion("bauthor is not null");
            return (Criteria) this;
        }

        public Criteria andBauthorEqualTo(String value) {
            addCriterion("bauthor =", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorNotEqualTo(String value) {
            addCriterion("bauthor <>", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorGreaterThan(String value) {
            addCriterion("bauthor >", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorGreaterThanOrEqualTo(String value) {
            addCriterion("bauthor >=", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorLessThan(String value) {
            addCriterion("bauthor <", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorLessThanOrEqualTo(String value) {
            addCriterion("bauthor <=", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorLike(String value) {
            addCriterion("bauthor like", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorNotLike(String value) {
            addCriterion("bauthor not like", value, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorIn(List<String> values) {
            addCriterion("bauthor in", values, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorNotIn(List<String> values) {
            addCriterion("bauthor not in", values, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorBetween(String value1, String value2) {
            addCriterion("bauthor between", value1, value2, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBauthorNotBetween(String value1, String value2) {
            addCriterion("bauthor not between", value1, value2, "bauthor");
            return (Criteria) this;
        }

        public Criteria andBpriceIsNull() {
            addCriterion("bprice is null");
            return (Criteria) this;
        }

        public Criteria andBpriceIsNotNull() {
            addCriterion("bprice is not null");
            return (Criteria) this;
        }

        public Criteria andBpriceEqualTo(Double value) {
            addCriterion("bprice =", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceNotEqualTo(Double value) {
            addCriterion("bprice <>", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceGreaterThan(Double value) {
            addCriterion("bprice >", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("bprice >=", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceLessThan(Double value) {
            addCriterion("bprice <", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceLessThanOrEqualTo(Double value) {
            addCriterion("bprice <=", value, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceIn(List<Double> values) {
            addCriterion("bprice in", values, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceNotIn(List<Double> values) {
            addCriterion("bprice not in", values, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceBetween(Double value1, Double value2) {
            addCriterion("bprice between", value1, value2, "bprice");
            return (Criteria) this;
        }

        public Criteria andBpriceNotBetween(Double value1, Double value2) {
            addCriterion("bprice not between", value1, value2, "bprice");
            return (Criteria) this;
        }

        public Criteria andBnumIsNull() {
            addCriterion("bnum is null");
            return (Criteria) this;
        }

        public Criteria andBnumIsNotNull() {
            addCriterion("bnum is not null");
            return (Criteria) this;
        }

        public Criteria andBnumEqualTo(Integer value) {
            addCriterion("bnum =", value, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumNotEqualTo(Integer value) {
            addCriterion("bnum <>", value, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumGreaterThan(Integer value) {
            addCriterion("bnum >", value, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bnum >=", value, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumLessThan(Integer value) {
            addCriterion("bnum <", value, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumLessThanOrEqualTo(Integer value) {
            addCriterion("bnum <=", value, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumIn(List<Integer> values) {
            addCriterion("bnum in", values, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumNotIn(List<Integer> values) {
            addCriterion("bnum not in", values, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumBetween(Integer value1, Integer value2) {
            addCriterion("bnum between", value1, value2, "bnum");
            return (Criteria) this;
        }

        public Criteria andBnumNotBetween(Integer value1, Integer value2) {
            addCriterion("bnum not between", value1, value2, "bnum");
            return (Criteria) this;
        }

        public Criteria andBshelfIsNull() {
            addCriterion("bshelf is null");
            return (Criteria) this;
        }

        public Criteria andBshelfIsNotNull() {
            addCriterion("bshelf is not null");
            return (Criteria) this;
        }

        public Criteria andBshelfEqualTo(String value) {
            addCriterion("bshelf =", value, "bshelf");
            return (Criteria) this;
        }

        public Criteria andBshelfNotEqualTo(String value) {
            addCriterion("bshelf <>", value, "bshelf");
            return (Criteria) this;
        }

        public Criteria andBshelfGreaterThan(String value) {
            addCriterion("bshelf >", value, "bshelf");
            return (Criteria) this;
        }

        public Criteria andBshelfGreaterThanOrEqualTo(String value) {
            addCriterion("bshelf >=", value, "bshelf");
            return (Criteria) this;
        }

        public Criteria andBshelfLessThan(String value) {
            addCriterion("bshelf <", value, "bshelf");
            return (Criteria) this;
        }

        public Criteria andBshelfLessThanOrEqualTo(String value) {
            addCriterion("bshelf <=", value, "bshelf");
            return (Criteria) this;
        }

        public Criteria andBshelfLike(String value) {
            addCriterion("bshelf like", value, "bshelf");
            return (Criteria) this;
        }

        public Criteria andBshelfNotLike(String value) {
            addCriterion("bshelf not like", value, "bshelf");
            return (Criteria) this;
        }

        public Criteria andBshelfIn(List<String> values) {
            addCriterion("bshelf in", values, "bshelf");
            return (Criteria) this;
        }

        public Criteria andBshelfNotIn(List<String> values) {
            addCriterion("bshelf not in", values, "bshelf");
            return (Criteria) this;
        }

        public Criteria andBshelfBetween(String value1, String value2) {
            addCriterion("bshelf between", value1, value2, "bshelf");
            return (Criteria) this;
        }

        public Criteria andBshelfNotBetween(String value1, String value2) {
            addCriterion("bshelf not between", value1, value2, "bshelf");
            return (Criteria) this;
        }

        public Criteria andBremarkIsNull() {
            addCriterion("bremark is null");
            return (Criteria) this;
        }

        public Criteria andBremarkIsNotNull() {
            addCriterion("bremark is not null");
            return (Criteria) this;
        }

        public Criteria andBremarkEqualTo(String value) {
            addCriterion("bremark =", value, "bremark");
            return (Criteria) this;
        }

        public Criteria andBremarkNotEqualTo(String value) {
            addCriterion("bremark <>", value, "bremark");
            return (Criteria) this;
        }

        public Criteria andBremarkGreaterThan(String value) {
            addCriterion("bremark >", value, "bremark");
            return (Criteria) this;
        }

        public Criteria andBremarkGreaterThanOrEqualTo(String value) {
            addCriterion("bremark >=", value, "bremark");
            return (Criteria) this;
        }

        public Criteria andBremarkLessThan(String value) {
            addCriterion("bremark <", value, "bremark");
            return (Criteria) this;
        }

        public Criteria andBremarkLessThanOrEqualTo(String value) {
            addCriterion("bremark <=", value, "bremark");
            return (Criteria) this;
        }

        public Criteria andBremarkLike(String value) {
            addCriterion("bremark like", value, "bremark");
            return (Criteria) this;
        }

        public Criteria andBremarkNotLike(String value) {
            addCriterion("bremark not like", value, "bremark");
            return (Criteria) this;
        }

        public Criteria andBremarkIn(List<String> values) {
            addCriterion("bremark in", values, "bremark");
            return (Criteria) this;
        }

        public Criteria andBremarkNotIn(List<String> values) {
            addCriterion("bremark not in", values, "bremark");
            return (Criteria) this;
        }

        public Criteria andBremarkBetween(String value1, String value2) {
            addCriterion("bremark between", value1, value2, "bremark");
            return (Criteria) this;
        }

        public Criteria andBremarkNotBetween(String value1, String value2) {
            addCriterion("bremark not between", value1, value2, "bremark");
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