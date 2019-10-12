package com.igeekhome.colloa.domain;

import java.util.ArrayList;
import java.util.List;

public class DepartmentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentInfoExample() {
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

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andDepaCodeIsNull() {
            addCriterion("depa_code is null");
            return (Criteria) this;
        }

        public Criteria andDepaCodeIsNotNull() {
            addCriterion("depa_code is not null");
            return (Criteria) this;
        }

        public Criteria andDepaCodeEqualTo(String value) {
            addCriterion("depa_code =", value, "depaCode");
            return (Criteria) this;
        }

        public Criteria andDepaCodeNotEqualTo(String value) {
            addCriterion("depa_code <>", value, "depaCode");
            return (Criteria) this;
        }

        public Criteria andDepaCodeGreaterThan(String value) {
            addCriterion("depa_code >", value, "depaCode");
            return (Criteria) this;
        }

        public Criteria andDepaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("depa_code >=", value, "depaCode");
            return (Criteria) this;
        }

        public Criteria andDepaCodeLessThan(String value) {
            addCriterion("depa_code <", value, "depaCode");
            return (Criteria) this;
        }

        public Criteria andDepaCodeLessThanOrEqualTo(String value) {
            addCriterion("depa_code <=", value, "depaCode");
            return (Criteria) this;
        }

        public Criteria andDepaCodeLike(String value) {
            addCriterion("depa_code like", value, "depaCode");
            return (Criteria) this;
        }

        public Criteria andDepaCodeNotLike(String value) {
            addCriterion("depa_code not like", value, "depaCode");
            return (Criteria) this;
        }

        public Criteria andDepaCodeIn(List<String> values) {
            addCriterion("depa_code in", values, "depaCode");
            return (Criteria) this;
        }

        public Criteria andDepaCodeNotIn(List<String> values) {
            addCriterion("depa_code not in", values, "depaCode");
            return (Criteria) this;
        }

        public Criteria andDepaCodeBetween(String value1, String value2) {
            addCriterion("depa_code between", value1, value2, "depaCode");
            return (Criteria) this;
        }

        public Criteria andDepaCodeNotBetween(String value1, String value2) {
            addCriterion("depa_code not between", value1, value2, "depaCode");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeIsNull() {
            addCriterion("director_code is null");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeIsNotNull() {
            addCriterion("director_code is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeEqualTo(String value) {
            addCriterion("director_code =", value, "directorCode");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeNotEqualTo(String value) {
            addCriterion("director_code <>", value, "directorCode");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeGreaterThan(String value) {
            addCriterion("director_code >", value, "directorCode");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("director_code >=", value, "directorCode");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeLessThan(String value) {
            addCriterion("director_code <", value, "directorCode");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeLessThanOrEqualTo(String value) {
            addCriterion("director_code <=", value, "directorCode");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeLike(String value) {
            addCriterion("director_code like", value, "directorCode");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeNotLike(String value) {
            addCriterion("director_code not like", value, "directorCode");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeIn(List<String> values) {
            addCriterion("director_code in", values, "directorCode");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeNotIn(List<String> values) {
            addCriterion("director_code not in", values, "directorCode");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeBetween(String value1, String value2) {
            addCriterion("director_code between", value1, value2, "directorCode");
            return (Criteria) this;
        }

        public Criteria andDirectorCodeNotBetween(String value1, String value2) {
            addCriterion("director_code not between", value1, value2, "directorCode");
            return (Criteria) this;
        }

        public Criteria andDepaNameIsNull() {
            addCriterion("depa_name is null");
            return (Criteria) this;
        }

        public Criteria andDepaNameIsNotNull() {
            addCriterion("depa_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepaNameEqualTo(String value) {
            addCriterion("depa_name =", value, "depaName");
            return (Criteria) this;
        }

        public Criteria andDepaNameNotEqualTo(String value) {
            addCriterion("depa_name <>", value, "depaName");
            return (Criteria) this;
        }

        public Criteria andDepaNameGreaterThan(String value) {
            addCriterion("depa_name >", value, "depaName");
            return (Criteria) this;
        }

        public Criteria andDepaNameGreaterThanOrEqualTo(String value) {
            addCriterion("depa_name >=", value, "depaName");
            return (Criteria) this;
        }

        public Criteria andDepaNameLessThan(String value) {
            addCriterion("depa_name <", value, "depaName");
            return (Criteria) this;
        }

        public Criteria andDepaNameLessThanOrEqualTo(String value) {
            addCriterion("depa_name <=", value, "depaName");
            return (Criteria) this;
        }

        public Criteria andDepaNameLike(String value) {
            addCriterion("depa_name like", value, "depaName");
            return (Criteria) this;
        }

        public Criteria andDepaNameNotLike(String value) {
            addCriterion("depa_name not like", value, "depaName");
            return (Criteria) this;
        }

        public Criteria andDepaNameIn(List<String> values) {
            addCriterion("depa_name in", values, "depaName");
            return (Criteria) this;
        }

        public Criteria andDepaNameNotIn(List<String> values) {
            addCriterion("depa_name not in", values, "depaName");
            return (Criteria) this;
        }

        public Criteria andDepaNameBetween(String value1, String value2) {
            addCriterion("depa_name between", value1, value2, "depaName");
            return (Criteria) this;
        }

        public Criteria andDepaNameNotBetween(String value1, String value2) {
            addCriterion("depa_name not between", value1, value2, "depaName");
            return (Criteria) this;
        }

        public Criteria andDepaDescIsNull() {
            addCriterion("depa_desc is null");
            return (Criteria) this;
        }

        public Criteria andDepaDescIsNotNull() {
            addCriterion("depa_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDepaDescEqualTo(String value) {
            addCriterion("depa_desc =", value, "depaDesc");
            return (Criteria) this;
        }

        public Criteria andDepaDescNotEqualTo(String value) {
            addCriterion("depa_desc <>", value, "depaDesc");
            return (Criteria) this;
        }

        public Criteria andDepaDescGreaterThan(String value) {
            addCriterion("depa_desc >", value, "depaDesc");
            return (Criteria) this;
        }

        public Criteria andDepaDescGreaterThanOrEqualTo(String value) {
            addCriterion("depa_desc >=", value, "depaDesc");
            return (Criteria) this;
        }

        public Criteria andDepaDescLessThan(String value) {
            addCriterion("depa_desc <", value, "depaDesc");
            return (Criteria) this;
        }

        public Criteria andDepaDescLessThanOrEqualTo(String value) {
            addCriterion("depa_desc <=", value, "depaDesc");
            return (Criteria) this;
        }

        public Criteria andDepaDescLike(String value) {
            addCriterion("depa_desc like", value, "depaDesc");
            return (Criteria) this;
        }

        public Criteria andDepaDescNotLike(String value) {
            addCriterion("depa_desc not like", value, "depaDesc");
            return (Criteria) this;
        }

        public Criteria andDepaDescIn(List<String> values) {
            addCriterion("depa_desc in", values, "depaDesc");
            return (Criteria) this;
        }

        public Criteria andDepaDescNotIn(List<String> values) {
            addCriterion("depa_desc not in", values, "depaDesc");
            return (Criteria) this;
        }

        public Criteria andDepaDescBetween(String value1, String value2) {
            addCriterion("depa_desc between", value1, value2, "depaDesc");
            return (Criteria) this;
        }

        public Criteria andDepaDescNotBetween(String value1, String value2) {
            addCriterion("depa_desc not between", value1, value2, "depaDesc");
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