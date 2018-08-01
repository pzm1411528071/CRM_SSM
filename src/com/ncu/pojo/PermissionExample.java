package com.ncu.pojo;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPSourceIsNull() {
            addCriterion("p_source is null");
            return (Criteria) this;
        }

        public Criteria andPSourceIsNotNull() {
            addCriterion("p_source is not null");
            return (Criteria) this;
        }

        public Criteria andPSourceEqualTo(String value) {
            addCriterion("p_source =", value, "pSource");
            return (Criteria) this;
        }

        public Criteria andPSourceNotEqualTo(String value) {
            addCriterion("p_source <>", value, "pSource");
            return (Criteria) this;
        }

        public Criteria andPSourceGreaterThan(String value) {
            addCriterion("p_source >", value, "pSource");
            return (Criteria) this;
        }

        public Criteria andPSourceGreaterThanOrEqualTo(String value) {
            addCriterion("p_source >=", value, "pSource");
            return (Criteria) this;
        }

        public Criteria andPSourceLessThan(String value) {
            addCriterion("p_source <", value, "pSource");
            return (Criteria) this;
        }

        public Criteria andPSourceLessThanOrEqualTo(String value) {
            addCriterion("p_source <=", value, "pSource");
            return (Criteria) this;
        }

        public Criteria andPSourceLike(String value) {
            addCriterion("p_source like", value, "pSource");
            return (Criteria) this;
        }

        public Criteria andPSourceNotLike(String value) {
            addCriterion("p_source not like", value, "pSource");
            return (Criteria) this;
        }

        public Criteria andPSourceIn(List<String> values) {
            addCriterion("p_source in", values, "pSource");
            return (Criteria) this;
        }

        public Criteria andPSourceNotIn(List<String> values) {
            addCriterion("p_source not in", values, "pSource");
            return (Criteria) this;
        }

        public Criteria andPSourceBetween(String value1, String value2) {
            addCriterion("p_source between", value1, value2, "pSource");
            return (Criteria) this;
        }

        public Criteria andPSourceNotBetween(String value1, String value2) {
            addCriterion("p_source not between", value1, value2, "pSource");
            return (Criteria) this;
        }

        public Criteria andPIsparentIsNull() {
            addCriterion("p_isparent is null");
            return (Criteria) this;
        }

        public Criteria andPIsparentIsNotNull() {
            addCriterion("p_isparent is not null");
            return (Criteria) this;
        }

        public Criteria andPIsparentEqualTo(Byte value) {
            addCriterion("p_isparent =", value, "pIsparent");
            return (Criteria) this;
        }

        public Criteria andPIsparentNotEqualTo(Byte value) {
            addCriterion("p_isparent <>", value, "pIsparent");
            return (Criteria) this;
        }

        public Criteria andPIsparentGreaterThan(Byte value) {
            addCriterion("p_isparent >", value, "pIsparent");
            return (Criteria) this;
        }

        public Criteria andPIsparentGreaterThanOrEqualTo(Byte value) {
            addCriterion("p_isparent >=", value, "pIsparent");
            return (Criteria) this;
        }

        public Criteria andPIsparentLessThan(Byte value) {
            addCriterion("p_isparent <", value, "pIsparent");
            return (Criteria) this;
        }

        public Criteria andPIsparentLessThanOrEqualTo(Byte value) {
            addCriterion("p_isparent <=", value, "pIsparent");
            return (Criteria) this;
        }

        public Criteria andPIsparentIn(List<Byte> values) {
            addCriterion("p_isparent in", values, "pIsparent");
            return (Criteria) this;
        }

        public Criteria andPIsparentNotIn(List<Byte> values) {
            addCriterion("p_isparent not in", values, "pIsparent");
            return (Criteria) this;
        }

        public Criteria andPIsparentBetween(Byte value1, Byte value2) {
            addCriterion("p_isparent between", value1, value2, "pIsparent");
            return (Criteria) this;
        }

        public Criteria andPIsparentNotBetween(Byte value1, Byte value2) {
            addCriterion("p_isparent not between", value1, value2, "pIsparent");
            return (Criteria) this;
        }

        public Criteria andPParentidIsNull() {
            addCriterion("p_parentid is null");
            return (Criteria) this;
        }

        public Criteria andPParentidIsNotNull() {
            addCriterion("p_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andPParentidEqualTo(Integer value) {
            addCriterion("p_parentid =", value, "pParentid");
            return (Criteria) this;
        }

        public Criteria andPParentidNotEqualTo(Integer value) {
            addCriterion("p_parentid <>", value, "pParentid");
            return (Criteria) this;
        }

        public Criteria andPParentidGreaterThan(Integer value) {
            addCriterion("p_parentid >", value, "pParentid");
            return (Criteria) this;
        }

        public Criteria andPParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_parentid >=", value, "pParentid");
            return (Criteria) this;
        }

        public Criteria andPParentidLessThan(Integer value) {
            addCriterion("p_parentid <", value, "pParentid");
            return (Criteria) this;
        }

        public Criteria andPParentidLessThanOrEqualTo(Integer value) {
            addCriterion("p_parentid <=", value, "pParentid");
            return (Criteria) this;
        }

        public Criteria andPParentidIn(List<Integer> values) {
            addCriterion("p_parentid in", values, "pParentid");
            return (Criteria) this;
        }

        public Criteria andPParentidNotIn(List<Integer> values) {
            addCriterion("p_parentid not in", values, "pParentid");
            return (Criteria) this;
        }

        public Criteria andPParentidBetween(Integer value1, Integer value2) {
            addCriterion("p_parentid between", value1, value2, "pParentid");
            return (Criteria) this;
        }

        public Criteria andPParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("p_parentid not between", value1, value2, "pParentid");
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