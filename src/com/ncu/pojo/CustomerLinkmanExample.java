package com.ncu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerLinkmanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerLinkmanExample() {
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

        public Criteria andLinkmanIdIsNull() {
            addCriterion("linkman_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdIsNotNull() {
            addCriterion("linkman_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdEqualTo(Integer value) {
            addCriterion("linkman_id =", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotEqualTo(Integer value) {
            addCriterion("linkman_id <>", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdGreaterThan(Integer value) {
            addCriterion("linkman_id >", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("linkman_id >=", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdLessThan(Integer value) {
            addCriterion("linkman_id <", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdLessThanOrEqualTo(Integer value) {
            addCriterion("linkman_id <=", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdIn(List<Integer> values) {
            addCriterion("linkman_id in", values, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotIn(List<Integer> values) {
            addCriterion("linkman_id not in", values, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdBetween(Integer value1, Integer value2) {
            addCriterion("linkman_id between", value1, value2, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("linkman_id not between", value1, value2, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameIsNull() {
            addCriterion("linkman_name is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameIsNotNull() {
            addCriterion("linkman_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameEqualTo(String value) {
            addCriterion("linkman_name =", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotEqualTo(String value) {
            addCriterion("linkman_name <>", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameGreaterThan(String value) {
            addCriterion("linkman_name >", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_name >=", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameLessThan(String value) {
            addCriterion("linkman_name <", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameLessThanOrEqualTo(String value) {
            addCriterion("linkman_name <=", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameLike(String value) {
            addCriterion("linkman_name like", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotLike(String value) {
            addCriterion("linkman_name not like", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameIn(List<String> values) {
            addCriterion("linkman_name in", values, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotIn(List<String> values) {
            addCriterion("linkman_name not in", values, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameBetween(String value1, String value2) {
            addCriterion("linkman_name between", value1, value2, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotBetween(String value1, String value2) {
            addCriterion("linkman_name not between", value1, value2, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexIsNull() {
            addCriterion("linkman_sex is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexIsNotNull() {
            addCriterion("linkman_sex is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexEqualTo(String value) {
            addCriterion("linkman_sex =", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexNotEqualTo(String value) {
            addCriterion("linkman_sex <>", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexGreaterThan(String value) {
            addCriterion("linkman_sex >", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_sex >=", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexLessThan(String value) {
            addCriterion("linkman_sex <", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexLessThanOrEqualTo(String value) {
            addCriterion("linkman_sex <=", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexLike(String value) {
            addCriterion("linkman_sex like", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexNotLike(String value) {
            addCriterion("linkman_sex not like", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexIn(List<String> values) {
            addCriterion("linkman_sex in", values, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexNotIn(List<String> values) {
            addCriterion("linkman_sex not in", values, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexBetween(String value1, String value2) {
            addCriterion("linkman_sex between", value1, value2, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexNotBetween(String value1, String value2) {
            addCriterion("linkman_sex not between", value1, value2, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobIsNull() {
            addCriterion("linkman_job is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobIsNotNull() {
            addCriterion("linkman_job is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobEqualTo(String value) {
            addCriterion("linkman_job =", value, "linkmanJob");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobNotEqualTo(String value) {
            addCriterion("linkman_job <>", value, "linkmanJob");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobGreaterThan(String value) {
            addCriterion("linkman_job >", value, "linkmanJob");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_job >=", value, "linkmanJob");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobLessThan(String value) {
            addCriterion("linkman_job <", value, "linkmanJob");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobLessThanOrEqualTo(String value) {
            addCriterion("linkman_job <=", value, "linkmanJob");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobLike(String value) {
            addCriterion("linkman_job like", value, "linkmanJob");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobNotLike(String value) {
            addCriterion("linkman_job not like", value, "linkmanJob");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobIn(List<String> values) {
            addCriterion("linkman_job in", values, "linkmanJob");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobNotIn(List<String> values) {
            addCriterion("linkman_job not in", values, "linkmanJob");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobBetween(String value1, String value2) {
            addCriterion("linkman_job between", value1, value2, "linkmanJob");
            return (Criteria) this;
        }

        public Criteria andLinkmanJobNotBetween(String value1, String value2) {
            addCriterion("linkman_job not between", value1, value2, "linkmanJob");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileIsNull() {
            addCriterion("linkman_mobile is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileIsNotNull() {
            addCriterion("linkman_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileEqualTo(String value) {
            addCriterion("linkman_mobile =", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotEqualTo(String value) {
            addCriterion("linkman_mobile <>", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileGreaterThan(String value) {
            addCriterion("linkman_mobile >", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_mobile >=", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileLessThan(String value) {
            addCriterion("linkman_mobile <", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileLessThanOrEqualTo(String value) {
            addCriterion("linkman_mobile <=", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileLike(String value) {
            addCriterion("linkman_mobile like", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotLike(String value) {
            addCriterion("linkman_mobile not like", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileIn(List<String> values) {
            addCriterion("linkman_mobile in", values, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotIn(List<String> values) {
            addCriterion("linkman_mobile not in", values, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileBetween(String value1, String value2) {
            addCriterion("linkman_mobile between", value1, value2, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotBetween(String value1, String value2) {
            addCriterion("linkman_mobile not between", value1, value2, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanAgeIsNull() {
            addCriterion("linkman_age is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanAgeIsNotNull() {
            addCriterion("linkman_age is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanAgeEqualTo(Integer value) {
            addCriterion("linkman_age =", value, "linkmanAge");
            return (Criteria) this;
        }

        public Criteria andLinkmanAgeNotEqualTo(Integer value) {
            addCriterion("linkman_age <>", value, "linkmanAge");
            return (Criteria) this;
        }

        public Criteria andLinkmanAgeGreaterThan(Integer value) {
            addCriterion("linkman_age >", value, "linkmanAge");
            return (Criteria) this;
        }

        public Criteria andLinkmanAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("linkman_age >=", value, "linkmanAge");
            return (Criteria) this;
        }

        public Criteria andLinkmanAgeLessThan(Integer value) {
            addCriterion("linkman_age <", value, "linkmanAge");
            return (Criteria) this;
        }

        public Criteria andLinkmanAgeLessThanOrEqualTo(Integer value) {
            addCriterion("linkman_age <=", value, "linkmanAge");
            return (Criteria) this;
        }

        public Criteria andLinkmanAgeIn(List<Integer> values) {
            addCriterion("linkman_age in", values, "linkmanAge");
            return (Criteria) this;
        }

        public Criteria andLinkmanAgeNotIn(List<Integer> values) {
            addCriterion("linkman_age not in", values, "linkmanAge");
            return (Criteria) this;
        }

        public Criteria andLinkmanAgeBetween(Integer value1, Integer value2) {
            addCriterion("linkman_age between", value1, value2, "linkmanAge");
            return (Criteria) this;
        }

        public Criteria andLinkmanAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("linkman_age not between", value1, value2, "linkmanAge");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationIsNull() {
            addCriterion("linkman_relation is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationIsNotNull() {
            addCriterion("linkman_relation is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationEqualTo(String value) {
            addCriterion("linkman_relation =", value, "linkmanRelation");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationNotEqualTo(String value) {
            addCriterion("linkman_relation <>", value, "linkmanRelation");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationGreaterThan(String value) {
            addCriterion("linkman_relation >", value, "linkmanRelation");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_relation >=", value, "linkmanRelation");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationLessThan(String value) {
            addCriterion("linkman_relation <", value, "linkmanRelation");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationLessThanOrEqualTo(String value) {
            addCriterion("linkman_relation <=", value, "linkmanRelation");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationLike(String value) {
            addCriterion("linkman_relation like", value, "linkmanRelation");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationNotLike(String value) {
            addCriterion("linkman_relation not like", value, "linkmanRelation");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationIn(List<String> values) {
            addCriterion("linkman_relation in", values, "linkmanRelation");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationNotIn(List<String> values) {
            addCriterion("linkman_relation not in", values, "linkmanRelation");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationBetween(String value1, String value2) {
            addCriterion("linkman_relation between", value1, value2, "linkmanRelation");
            return (Criteria) this;
        }

        public Criteria andLinkmanRelationNotBetween(String value1, String value2) {
            addCriterion("linkman_relation not between", value1, value2, "linkmanRelation");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNull() {
            addCriterion("is_used is null");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNotNull() {
            addCriterion("is_used is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsedEqualTo(String value) {
            addCriterion("is_used =", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotEqualTo(String value) {
            addCriterion("is_used <>", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThan(String value) {
            addCriterion("is_used >", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThanOrEqualTo(String value) {
            addCriterion("is_used >=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThan(String value) {
            addCriterion("is_used <", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThanOrEqualTo(String value) {
            addCriterion("is_used <=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLike(String value) {
            addCriterion("is_used like", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotLike(String value) {
            addCriterion("is_used not like", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedIn(List<String> values) {
            addCriterion("is_used in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotIn(List<String> values) {
            addCriterion("is_used not in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedBetween(String value1, String value2) {
            addCriterion("is_used between", value1, value2, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotBetween(String value1, String value2) {
            addCriterion("is_used not between", value1, value2, "isUsed");
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