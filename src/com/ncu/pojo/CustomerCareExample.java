package com.ncu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerCareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerCareExample() {
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

        public Criteria andCareIdIsNull() {
            addCriterion("care_id is null");
            return (Criteria) this;
        }

        public Criteria andCareIdIsNotNull() {
            addCriterion("care_id is not null");
            return (Criteria) this;
        }

        public Criteria andCareIdEqualTo(Integer value) {
            addCriterion("care_id =", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdNotEqualTo(Integer value) {
            addCriterion("care_id <>", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdGreaterThan(Integer value) {
            addCriterion("care_id >", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("care_id >=", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdLessThan(Integer value) {
            addCriterion("care_id <", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdLessThanOrEqualTo(Integer value) {
            addCriterion("care_id <=", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdIn(List<Integer> values) {
            addCriterion("care_id in", values, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdNotIn(List<Integer> values) {
            addCriterion("care_id not in", values, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdBetween(Integer value1, Integer value2) {
            addCriterion("care_id between", value1, value2, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdNotBetween(Integer value1, Integer value2) {
            addCriterion("care_id not between", value1, value2, "careId");
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

        public Criteria andCareThemeIsNull() {
            addCriterion("care_theme is null");
            return (Criteria) this;
        }

        public Criteria andCareThemeIsNotNull() {
            addCriterion("care_theme is not null");
            return (Criteria) this;
        }

        public Criteria andCareThemeEqualTo(String value) {
            addCriterion("care_theme =", value, "careTheme");
            return (Criteria) this;
        }

        public Criteria andCareThemeNotEqualTo(String value) {
            addCriterion("care_theme <>", value, "careTheme");
            return (Criteria) this;
        }

        public Criteria andCareThemeGreaterThan(String value) {
            addCriterion("care_theme >", value, "careTheme");
            return (Criteria) this;
        }

        public Criteria andCareThemeGreaterThanOrEqualTo(String value) {
            addCriterion("care_theme >=", value, "careTheme");
            return (Criteria) this;
        }

        public Criteria andCareThemeLessThan(String value) {
            addCriterion("care_theme <", value, "careTheme");
            return (Criteria) this;
        }

        public Criteria andCareThemeLessThanOrEqualTo(String value) {
            addCriterion("care_theme <=", value, "careTheme");
            return (Criteria) this;
        }

        public Criteria andCareThemeLike(String value) {
            addCriterion("care_theme like", value, "careTheme");
            return (Criteria) this;
        }

        public Criteria andCareThemeNotLike(String value) {
            addCriterion("care_theme not like", value, "careTheme");
            return (Criteria) this;
        }

        public Criteria andCareThemeIn(List<String> values) {
            addCriterion("care_theme in", values, "careTheme");
            return (Criteria) this;
        }

        public Criteria andCareThemeNotIn(List<String> values) {
            addCriterion("care_theme not in", values, "careTheme");
            return (Criteria) this;
        }

        public Criteria andCareThemeBetween(String value1, String value2) {
            addCriterion("care_theme between", value1, value2, "careTheme");
            return (Criteria) this;
        }

        public Criteria andCareThemeNotBetween(String value1, String value2) {
            addCriterion("care_theme not between", value1, value2, "careTheme");
            return (Criteria) this;
        }

        public Criteria andCareWayIsNull() {
            addCriterion("care_way is null");
            return (Criteria) this;
        }

        public Criteria andCareWayIsNotNull() {
            addCriterion("care_way is not null");
            return (Criteria) this;
        }

        public Criteria andCareWayEqualTo(String value) {
            addCriterion("care_way =", value, "careWay");
            return (Criteria) this;
        }

        public Criteria andCareWayNotEqualTo(String value) {
            addCriterion("care_way <>", value, "careWay");
            return (Criteria) this;
        }

        public Criteria andCareWayGreaterThan(String value) {
            addCriterion("care_way >", value, "careWay");
            return (Criteria) this;
        }

        public Criteria andCareWayGreaterThanOrEqualTo(String value) {
            addCriterion("care_way >=", value, "careWay");
            return (Criteria) this;
        }

        public Criteria andCareWayLessThan(String value) {
            addCriterion("care_way <", value, "careWay");
            return (Criteria) this;
        }

        public Criteria andCareWayLessThanOrEqualTo(String value) {
            addCriterion("care_way <=", value, "careWay");
            return (Criteria) this;
        }

        public Criteria andCareWayLike(String value) {
            addCriterion("care_way like", value, "careWay");
            return (Criteria) this;
        }

        public Criteria andCareWayNotLike(String value) {
            addCriterion("care_way not like", value, "careWay");
            return (Criteria) this;
        }

        public Criteria andCareWayIn(List<String> values) {
            addCriterion("care_way in", values, "careWay");
            return (Criteria) this;
        }

        public Criteria andCareWayNotIn(List<String> values) {
            addCriterion("care_way not in", values, "careWay");
            return (Criteria) this;
        }

        public Criteria andCareWayBetween(String value1, String value2) {
            addCriterion("care_way between", value1, value2, "careWay");
            return (Criteria) this;
        }

        public Criteria andCareWayNotBetween(String value1, String value2) {
            addCriterion("care_way not between", value1, value2, "careWay");
            return (Criteria) this;
        }

        public Criteria andCareTimeIsNull() {
            addCriterion("care_time is null");
            return (Criteria) this;
        }

        public Criteria andCareTimeIsNotNull() {
            addCriterion("care_time is not null");
            return (Criteria) this;
        }

        public Criteria andCareTimeEqualTo(Date value) {
            addCriterion("care_time =", value, "careTime");
            return (Criteria) this;
        }

        public Criteria andCareTimeNotEqualTo(Date value) {
            addCriterion("care_time <>", value, "careTime");
            return (Criteria) this;
        }

        public Criteria andCareTimeGreaterThan(Date value) {
            addCriterion("care_time >", value, "careTime");
            return (Criteria) this;
        }

        public Criteria andCareTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("care_time >=", value, "careTime");
            return (Criteria) this;
        }

        public Criteria andCareTimeLessThan(Date value) {
            addCriterion("care_time <", value, "careTime");
            return (Criteria) this;
        }

        public Criteria andCareTimeLessThanOrEqualTo(Date value) {
            addCriterion("care_time <=", value, "careTime");
            return (Criteria) this;
        }

        public Criteria andCareTimeIn(List<Date> values) {
            addCriterion("care_time in", values, "careTime");
            return (Criteria) this;
        }

        public Criteria andCareTimeNotIn(List<Date> values) {
            addCriterion("care_time not in", values, "careTime");
            return (Criteria) this;
        }

        public Criteria andCareTimeBetween(Date value1, Date value2) {
            addCriterion("care_time between", value1, value2, "careTime");
            return (Criteria) this;
        }

        public Criteria andCareTimeNotBetween(Date value1, Date value2) {
            addCriterion("care_time not between", value1, value2, "careTime");
            return (Criteria) this;
        }

        public Criteria andCareRemarkIsNull() {
            addCriterion("care_remark is null");
            return (Criteria) this;
        }

        public Criteria andCareRemarkIsNotNull() {
            addCriterion("care_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCareRemarkEqualTo(String value) {
            addCriterion("care_remark =", value, "careRemark");
            return (Criteria) this;
        }

        public Criteria andCareRemarkNotEqualTo(String value) {
            addCriterion("care_remark <>", value, "careRemark");
            return (Criteria) this;
        }

        public Criteria andCareRemarkGreaterThan(String value) {
            addCriterion("care_remark >", value, "careRemark");
            return (Criteria) this;
        }

        public Criteria andCareRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("care_remark >=", value, "careRemark");
            return (Criteria) this;
        }

        public Criteria andCareRemarkLessThan(String value) {
            addCriterion("care_remark <", value, "careRemark");
            return (Criteria) this;
        }

        public Criteria andCareRemarkLessThanOrEqualTo(String value) {
            addCriterion("care_remark <=", value, "careRemark");
            return (Criteria) this;
        }

        public Criteria andCareRemarkLike(String value) {
            addCriterion("care_remark like", value, "careRemark");
            return (Criteria) this;
        }

        public Criteria andCareRemarkNotLike(String value) {
            addCriterion("care_remark not like", value, "careRemark");
            return (Criteria) this;
        }

        public Criteria andCareRemarkIn(List<String> values) {
            addCriterion("care_remark in", values, "careRemark");
            return (Criteria) this;
        }

        public Criteria andCareRemarkNotIn(List<String> values) {
            addCriterion("care_remark not in", values, "careRemark");
            return (Criteria) this;
        }

        public Criteria andCareRemarkBetween(String value1, String value2) {
            addCriterion("care_remark between", value1, value2, "careRemark");
            return (Criteria) this;
        }

        public Criteria andCareRemarkNotBetween(String value1, String value2) {
            addCriterion("care_remark not between", value1, value2, "careRemark");
            return (Criteria) this;
        }

        public Criteria andCareNexttimeIsNull() {
            addCriterion("care_nexttime is null");
            return (Criteria) this;
        }

        public Criteria andCareNexttimeIsNotNull() {
            addCriterion("care_nexttime is not null");
            return (Criteria) this;
        }

        public Criteria andCareNexttimeEqualTo(Date value) {
            addCriterion("care_nexttime =", value, "careNexttime");
            return (Criteria) this;
        }

        public Criteria andCareNexttimeNotEqualTo(Date value) {
            addCriterion("care_nexttime <>", value, "careNexttime");
            return (Criteria) this;
        }

        public Criteria andCareNexttimeGreaterThan(Date value) {
            addCriterion("care_nexttime >", value, "careNexttime");
            return (Criteria) this;
        }

        public Criteria andCareNexttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("care_nexttime >=", value, "careNexttime");
            return (Criteria) this;
        }

        public Criteria andCareNexttimeLessThan(Date value) {
            addCriterion("care_nexttime <", value, "careNexttime");
            return (Criteria) this;
        }

        public Criteria andCareNexttimeLessThanOrEqualTo(Date value) {
            addCriterion("care_nexttime <=", value, "careNexttime");
            return (Criteria) this;
        }

        public Criteria andCareNexttimeIn(List<Date> values) {
            addCriterion("care_nexttime in", values, "careNexttime");
            return (Criteria) this;
        }

        public Criteria andCareNexttimeNotIn(List<Date> values) {
            addCriterion("care_nexttime not in", values, "careNexttime");
            return (Criteria) this;
        }

        public Criteria andCareNexttimeBetween(Date value1, Date value2) {
            addCriterion("care_nexttime between", value1, value2, "careNexttime");
            return (Criteria) this;
        }

        public Criteria andCareNexttimeNotBetween(Date value1, Date value2) {
            addCriterion("care_nexttime not between", value1, value2, "careNexttime");
            return (Criteria) this;
        }

        public Criteria andCarePeopleIsNull() {
            addCriterion("care_people is null");
            return (Criteria) this;
        }

        public Criteria andCarePeopleIsNotNull() {
            addCriterion("care_people is not null");
            return (Criteria) this;
        }

        public Criteria andCarePeopleEqualTo(String value) {
            addCriterion("care_people =", value, "carePeople");
            return (Criteria) this;
        }

        public Criteria andCarePeopleNotEqualTo(String value) {
            addCriterion("care_people <>", value, "carePeople");
            return (Criteria) this;
        }

        public Criteria andCarePeopleGreaterThan(String value) {
            addCriterion("care_people >", value, "carePeople");
            return (Criteria) this;
        }

        public Criteria andCarePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("care_people >=", value, "carePeople");
            return (Criteria) this;
        }

        public Criteria andCarePeopleLessThan(String value) {
            addCriterion("care_people <", value, "carePeople");
            return (Criteria) this;
        }

        public Criteria andCarePeopleLessThanOrEqualTo(String value) {
            addCriterion("care_people <=", value, "carePeople");
            return (Criteria) this;
        }

        public Criteria andCarePeopleLike(String value) {
            addCriterion("care_people like", value, "carePeople");
            return (Criteria) this;
        }

        public Criteria andCarePeopleNotLike(String value) {
            addCriterion("care_people not like", value, "carePeople");
            return (Criteria) this;
        }

        public Criteria andCarePeopleIn(List<String> values) {
            addCriterion("care_people in", values, "carePeople");
            return (Criteria) this;
        }

        public Criteria andCarePeopleNotIn(List<String> values) {
            addCriterion("care_people not in", values, "carePeople");
            return (Criteria) this;
        }

        public Criteria andCarePeopleBetween(String value1, String value2) {
            addCriterion("care_people between", value1, value2, "carePeople");
            return (Criteria) this;
        }

        public Criteria andCarePeopleNotBetween(String value1, String value2) {
            addCriterion("care_people not between", value1, value2, "carePeople");
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