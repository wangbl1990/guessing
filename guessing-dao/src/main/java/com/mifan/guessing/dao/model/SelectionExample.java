package com.mifan.guessing.dao.model;

import java.util.ArrayList;
import java.util.List;

public class SelectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SelectionExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSelectionIdIsNull() {
            addCriterion("selection_id is null");
            return (Criteria) this;
        }

        public Criteria andSelectionIdIsNotNull() {
            addCriterion("selection_id is not null");
            return (Criteria) this;
        }

        public Criteria andSelectionIdEqualTo(String value) {
            addCriterion("selection_id =", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdNotEqualTo(String value) {
            addCriterion("selection_id <>", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdGreaterThan(String value) {
            addCriterion("selection_id >", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdGreaterThanOrEqualTo(String value) {
            addCriterion("selection_id >=", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdLessThan(String value) {
            addCriterion("selection_id <", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdLessThanOrEqualTo(String value) {
            addCriterion("selection_id <=", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdLike(String value) {
            addCriterion("selection_id like", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdNotLike(String value) {
            addCriterion("selection_id not like", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdIn(List<String> values) {
            addCriterion("selection_id in", values, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdNotIn(List<String> values) {
            addCriterion("selection_id not in", values, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdBetween(String value1, String value2) {
            addCriterion("selection_id between", value1, value2, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdNotBetween(String value1, String value2) {
            addCriterion("selection_id not between", value1, value2, "selectionId");
            return (Criteria) this;
        }

        public Criteria andBackOddsIsNull() {
            addCriterion("back_odds is null");
            return (Criteria) this;
        }

        public Criteria andBackOddsIsNotNull() {
            addCriterion("back_odds is not null");
            return (Criteria) this;
        }

        public Criteria andBackOddsEqualTo(String value) {
            addCriterion("back_odds =", value, "backOdds");
            return (Criteria) this;
        }

        public Criteria andBackOddsNotEqualTo(String value) {
            addCriterion("back_odds <>", value, "backOdds");
            return (Criteria) this;
        }

        public Criteria andBackOddsGreaterThan(String value) {
            addCriterion("back_odds >", value, "backOdds");
            return (Criteria) this;
        }

        public Criteria andBackOddsGreaterThanOrEqualTo(String value) {
            addCriterion("back_odds >=", value, "backOdds");
            return (Criteria) this;
        }

        public Criteria andBackOddsLessThan(String value) {
            addCriterion("back_odds <", value, "backOdds");
            return (Criteria) this;
        }

        public Criteria andBackOddsLessThanOrEqualTo(String value) {
            addCriterion("back_odds <=", value, "backOdds");
            return (Criteria) this;
        }

        public Criteria andBackOddsLike(String value) {
            addCriterion("back_odds like", value, "backOdds");
            return (Criteria) this;
        }

        public Criteria andBackOddsNotLike(String value) {
            addCriterion("back_odds not like", value, "backOdds");
            return (Criteria) this;
        }

        public Criteria andBackOddsIn(List<String> values) {
            addCriterion("back_odds in", values, "backOdds");
            return (Criteria) this;
        }

        public Criteria andBackOddsNotIn(List<String> values) {
            addCriterion("back_odds not in", values, "backOdds");
            return (Criteria) this;
        }

        public Criteria andBackOddsBetween(String value1, String value2) {
            addCriterion("back_odds between", value1, value2, "backOdds");
            return (Criteria) this;
        }

        public Criteria andBackOddsNotBetween(String value1, String value2) {
            addCriterion("back_odds not between", value1, value2, "backOdds");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsIsNull() {
            addCriterion("last_back_odds is null");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsIsNotNull() {
            addCriterion("last_back_odds is not null");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsEqualTo(String value) {
            addCriterion("last_back_odds =", value, "lastBackOdds");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsNotEqualTo(String value) {
            addCriterion("last_back_odds <>", value, "lastBackOdds");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsGreaterThan(String value) {
            addCriterion("last_back_odds >", value, "lastBackOdds");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsGreaterThanOrEqualTo(String value) {
            addCriterion("last_back_odds >=", value, "lastBackOdds");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsLessThan(String value) {
            addCriterion("last_back_odds <", value, "lastBackOdds");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsLessThanOrEqualTo(String value) {
            addCriterion("last_back_odds <=", value, "lastBackOdds");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsLike(String value) {
            addCriterion("last_back_odds like", value, "lastBackOdds");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsNotLike(String value) {
            addCriterion("last_back_odds not like", value, "lastBackOdds");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsIn(List<String> values) {
            addCriterion("last_back_odds in", values, "lastBackOdds");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsNotIn(List<String> values) {
            addCriterion("last_back_odds not in", values, "lastBackOdds");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsBetween(String value1, String value2) {
            addCriterion("last_back_odds between", value1, value2, "lastBackOdds");
            return (Criteria) this;
        }

        public Criteria andLastBackOddsNotBetween(String value1, String value2) {
            addCriterion("last_back_odds not between", value1, value2, "lastBackOdds");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitIsNull() {
            addCriterion("max_stake_limit is null");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitIsNotNull() {
            addCriterion("max_stake_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitEqualTo(String value) {
            addCriterion("max_stake_limit =", value, "maxStakeLimit");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitNotEqualTo(String value) {
            addCriterion("max_stake_limit <>", value, "maxStakeLimit");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitGreaterThan(String value) {
            addCriterion("max_stake_limit >", value, "maxStakeLimit");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitGreaterThanOrEqualTo(String value) {
            addCriterion("max_stake_limit >=", value, "maxStakeLimit");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitLessThan(String value) {
            addCriterion("max_stake_limit <", value, "maxStakeLimit");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitLessThanOrEqualTo(String value) {
            addCriterion("max_stake_limit <=", value, "maxStakeLimit");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitLike(String value) {
            addCriterion("max_stake_limit like", value, "maxStakeLimit");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitNotLike(String value) {
            addCriterion("max_stake_limit not like", value, "maxStakeLimit");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitIn(List<String> values) {
            addCriterion("max_stake_limit in", values, "maxStakeLimit");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitNotIn(List<String> values) {
            addCriterion("max_stake_limit not in", values, "maxStakeLimit");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitBetween(String value1, String value2) {
            addCriterion("max_stake_limit between", value1, value2, "maxStakeLimit");
            return (Criteria) this;
        }

        public Criteria andMaxStakeLimitNotBetween(String value1, String value2) {
            addCriterion("max_stake_limit not between", value1, value2, "maxStakeLimit");
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