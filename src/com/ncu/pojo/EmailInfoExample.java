package com.ncu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmailInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmailInfoExample() {
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

        public Criteria andEmailIdIsNull() {
            addCriterion("email_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailIdIsNotNull() {
            addCriterion("email_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailIdEqualTo(Integer value) {
            addCriterion("email_id =", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotEqualTo(Integer value) {
            addCriterion("email_id <>", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThan(Integer value) {
            addCriterion("email_id >", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_id >=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThan(Integer value) {
            addCriterion("email_id <", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThanOrEqualTo(Integer value) {
            addCriterion("email_id <=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdIn(List<Integer> values) {
            addCriterion("email_id in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotIn(List<Integer> values) {
            addCriterion("email_id not in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdBetween(Integer value1, Integer value2) {
            addCriterion("email_id between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("email_id not between", value1, value2, "emailId");
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andEmailContentIsNull() {
            addCriterion("email_content is null");
            return (Criteria) this;
        }

        public Criteria andEmailContentIsNotNull() {
            addCriterion("email_content is not null");
            return (Criteria) this;
        }

        public Criteria andEmailContentEqualTo(String value) {
            addCriterion("email_content =", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotEqualTo(String value) {
            addCriterion("email_content <>", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentGreaterThan(String value) {
            addCriterion("email_content >", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentGreaterThanOrEqualTo(String value) {
            addCriterion("email_content >=", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentLessThan(String value) {
            addCriterion("email_content <", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentLessThanOrEqualTo(String value) {
            addCriterion("email_content <=", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentLike(String value) {
            addCriterion("email_content like", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotLike(String value) {
            addCriterion("email_content not like", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentIn(List<String> values) {
            addCriterion("email_content in", values, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotIn(List<String> values) {
            addCriterion("email_content not in", values, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentBetween(String value1, String value2) {
            addCriterion("email_content between", value1, value2, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotBetween(String value1, String value2) {
            addCriterion("email_content not between", value1, value2, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailTimeIsNull() {
            addCriterion("email_time is null");
            return (Criteria) this;
        }

        public Criteria andEmailTimeIsNotNull() {
            addCriterion("email_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmailTimeEqualTo(Date value) {
            addCriterion("email_time =", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeNotEqualTo(Date value) {
            addCriterion("email_time <>", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeGreaterThan(Date value) {
            addCriterion("email_time >", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("email_time >=", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeLessThan(Date value) {
            addCriterion("email_time <", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeLessThanOrEqualTo(Date value) {
            addCriterion("email_time <=", value, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeIn(List<Date> values) {
            addCriterion("email_time in", values, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeNotIn(List<Date> values) {
            addCriterion("email_time not in", values, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeBetween(Date value1, Date value2) {
            addCriterion("email_time between", value1, value2, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailTimeNotBetween(Date value1, Date value2) {
            addCriterion("email_time not between", value1, value2, "emailTime");
            return (Criteria) this;
        }

        public Criteria andEmailStateIsNull() {
            addCriterion("email_state is null");
            return (Criteria) this;
        }

        public Criteria andEmailStateIsNotNull() {
            addCriterion("email_state is not null");
            return (Criteria) this;
        }

        public Criteria andEmailStateEqualTo(String value) {
            addCriterion("email_state =", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotEqualTo(String value) {
            addCriterion("email_state <>", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateGreaterThan(String value) {
            addCriterion("email_state >", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateGreaterThanOrEqualTo(String value) {
            addCriterion("email_state >=", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateLessThan(String value) {
            addCriterion("email_state <", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateLessThanOrEqualTo(String value) {
            addCriterion("email_state <=", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateLike(String value) {
            addCriterion("email_state like", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotLike(String value) {
            addCriterion("email_state not like", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateIn(List<String> values) {
            addCriterion("email_state in", values, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotIn(List<String> values) {
            addCriterion("email_state not in", values, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateBetween(String value1, String value2) {
            addCriterion("email_state between", value1, value2, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotBetween(String value1, String value2) {
            addCriterion("email_state not between", value1, value2, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailThemeIsNull() {
            addCriterion("email_theme is null");
            return (Criteria) this;
        }

        public Criteria andEmailThemeIsNotNull() {
            addCriterion("email_theme is not null");
            return (Criteria) this;
        }

        public Criteria andEmailThemeEqualTo(String value) {
            addCriterion("email_theme =", value, "emailTheme");
            return (Criteria) this;
        }

        public Criteria andEmailThemeNotEqualTo(String value) {
            addCriterion("email_theme <>", value, "emailTheme");
            return (Criteria) this;
        }

        public Criteria andEmailThemeGreaterThan(String value) {
            addCriterion("email_theme >", value, "emailTheme");
            return (Criteria) this;
        }

        public Criteria andEmailThemeGreaterThanOrEqualTo(String value) {
            addCriterion("email_theme >=", value, "emailTheme");
            return (Criteria) this;
        }

        public Criteria andEmailThemeLessThan(String value) {
            addCriterion("email_theme <", value, "emailTheme");
            return (Criteria) this;
        }

        public Criteria andEmailThemeLessThanOrEqualTo(String value) {
            addCriterion("email_theme <=", value, "emailTheme");
            return (Criteria) this;
        }

        public Criteria andEmailThemeLike(String value) {
            addCriterion("email_theme like", value, "emailTheme");
            return (Criteria) this;
        }

        public Criteria andEmailThemeNotLike(String value) {
            addCriterion("email_theme not like", value, "emailTheme");
            return (Criteria) this;
        }

        public Criteria andEmailThemeIn(List<String> values) {
            addCriterion("email_theme in", values, "emailTheme");
            return (Criteria) this;
        }

        public Criteria andEmailThemeNotIn(List<String> values) {
            addCriterion("email_theme not in", values, "emailTheme");
            return (Criteria) this;
        }

        public Criteria andEmailThemeBetween(String value1, String value2) {
            addCriterion("email_theme between", value1, value2, "emailTheme");
            return (Criteria) this;
        }

        public Criteria andEmailThemeNotBetween(String value1, String value2) {
            addCriterion("email_theme not between", value1, value2, "emailTheme");
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