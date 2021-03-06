package com.igeekhome.colloa.domain;

import java.util.ArrayList;
import java.util.List;

public class ExternalCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExternalCategoryExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNull() {
            addCriterion("category_code is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNotNull() {
            addCriterion("category_code is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo(String value) {
            addCriterion("category_code =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotEqualTo(String value) {
            addCriterion("category_code <>", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThan(String value) {
            addCriterion("category_code >", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("category_code >=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThan(String value) {
            addCriterion("category_code <", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("category_code <=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLike(String value) {
            addCriterion("category_code like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotLike(String value) {
            addCriterion("category_code not like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIn(List<String> values) {
            addCriterion("category_code in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotIn(List<String> values) {
            addCriterion("category_code not in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeBetween(String value1, String value2) {
            addCriterion("category_code between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("category_code not between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameIsNull() {
            addCriterion("catetory_name is null");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameIsNotNull() {
            addCriterion("catetory_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameEqualTo(String value) {
            addCriterion("catetory_name =", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameNotEqualTo(String value) {
            addCriterion("catetory_name <>", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameGreaterThan(String value) {
            addCriterion("catetory_name >", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("catetory_name >=", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameLessThan(String value) {
            addCriterion("catetory_name <", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameLessThanOrEqualTo(String value) {
            addCriterion("catetory_name <=", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameLike(String value) {
            addCriterion("catetory_name like", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameNotLike(String value) {
            addCriterion("catetory_name not like", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameIn(List<String> values) {
            addCriterion("catetory_name in", values, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameNotIn(List<String> values) {
            addCriterion("catetory_name not in", values, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameBetween(String value1, String value2) {
            addCriterion("catetory_name between", value1, value2, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameNotBetween(String value1, String value2) {
            addCriterion("catetory_name not between", value1, value2, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescIsNull() {
            addCriterion("catetory_desc is null");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescIsNotNull() {
            addCriterion("catetory_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescEqualTo(String value) {
            addCriterion("catetory_desc =", value, "catetoryDesc");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescNotEqualTo(String value) {
            addCriterion("catetory_desc <>", value, "catetoryDesc");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescGreaterThan(String value) {
            addCriterion("catetory_desc >", value, "catetoryDesc");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescGreaterThanOrEqualTo(String value) {
            addCriterion("catetory_desc >=", value, "catetoryDesc");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescLessThan(String value) {
            addCriterion("catetory_desc <", value, "catetoryDesc");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescLessThanOrEqualTo(String value) {
            addCriterion("catetory_desc <=", value, "catetoryDesc");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescLike(String value) {
            addCriterion("catetory_desc like", value, "catetoryDesc");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescNotLike(String value) {
            addCriterion("catetory_desc not like", value, "catetoryDesc");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescIn(List<String> values) {
            addCriterion("catetory_desc in", values, "catetoryDesc");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescNotIn(List<String> values) {
            addCriterion("catetory_desc not in", values, "catetoryDesc");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescBetween(String value1, String value2) {
            addCriterion("catetory_desc between", value1, value2, "catetoryDesc");
            return (Criteria) this;
        }

        public Criteria andCatetoryDescNotBetween(String value1, String value2) {
            addCriterion("catetory_desc not between", value1, value2, "catetoryDesc");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
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