package com.mifan.guessing.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNull() {
            addCriterion("event_id is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("event_id is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(String value) {
            addCriterion("event_id =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(String value) {
            addCriterion("event_id <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(String value) {
            addCriterion("event_id >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(String value) {
            addCriterion("event_id >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(String value) {
            addCriterion("event_id <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(String value) {
            addCriterion("event_id <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLike(String value) {
            addCriterion("event_id like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotLike(String value) {
            addCriterion("event_id not like", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<String> values) {
            addCriterion("event_id in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<String> values) {
            addCriterion("event_id not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(String value1, String value2) {
            addCriterion("event_id between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(String value1, String value2) {
            addCriterion("event_id not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andMarketIdIsNull() {
            addCriterion("market_id is null");
            return (Criteria) this;
        }

        public Criteria andMarketIdIsNotNull() {
            addCriterion("market_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarketIdEqualTo(String value) {
            addCriterion("market_id =", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotEqualTo(String value) {
            addCriterion("market_id <>", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdGreaterThan(String value) {
            addCriterion("market_id >", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdGreaterThanOrEqualTo(String value) {
            addCriterion("market_id >=", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLessThan(String value) {
            addCriterion("market_id <", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLessThanOrEqualTo(String value) {
            addCriterion("market_id <=", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdLike(String value) {
            addCriterion("market_id like", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotLike(String value) {
            addCriterion("market_id not like", value, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdIn(List<String> values) {
            addCriterion("market_id in", values, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotIn(List<String> values) {
            addCriterion("market_id not in", values, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdBetween(String value1, String value2) {
            addCriterion("market_id between", value1, value2, "marketId");
            return (Criteria) this;
        }

        public Criteria andMarketIdNotBetween(String value1, String value2) {
            addCriterion("market_id not between", value1, value2, "marketId");
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

        public Criteria andRequestAmountIsNull() {
            addCriterion("request_amount is null");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIsNotNull() {
            addCriterion("request_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRequestAmountEqualTo(BigDecimal value) {
            addCriterion("request_amount =", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotEqualTo(BigDecimal value) {
            addCriterion("request_amount <>", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountGreaterThan(BigDecimal value) {
            addCriterion("request_amount >", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("request_amount >=", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountLessThan(BigDecimal value) {
            addCriterion("request_amount <", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("request_amount <=", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIn(List<BigDecimal> values) {
            addCriterion("request_amount in", values, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotIn(List<BigDecimal> values) {
            addCriterion("request_amount not in", values, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_amount between", value1, value2, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_amount not between", value1, value2, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestPriceIsNull() {
            addCriterion("request_price is null");
            return (Criteria) this;
        }

        public Criteria andRequestPriceIsNotNull() {
            addCriterion("request_price is not null");
            return (Criteria) this;
        }

        public Criteria andRequestPriceEqualTo(BigDecimal value) {
            addCriterion("request_price =", value, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceNotEqualTo(BigDecimal value) {
            addCriterion("request_price <>", value, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceGreaterThan(BigDecimal value) {
            addCriterion("request_price >", value, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("request_price >=", value, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceLessThan(BigDecimal value) {
            addCriterion("request_price <", value, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("request_price <=", value, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceIn(List<BigDecimal> values) {
            addCriterion("request_price in", values, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceNotIn(List<BigDecimal> values) {
            addCriterion("request_price not in", values, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_price between", value1, value2, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andRequestPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_price not between", value1, value2, "requestPrice");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeIsNull() {
            addCriterion("submitted_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeIsNotNull() {
            addCriterion("submitted_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeEqualTo(Date value) {
            addCriterion("submitted_time =", value, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeNotEqualTo(Date value) {
            addCriterion("submitted_time <>", value, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeGreaterThan(Date value) {
            addCriterion("submitted_time >", value, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submitted_time >=", value, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeLessThan(Date value) {
            addCriterion("submitted_time <", value, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeLessThanOrEqualTo(Date value) {
            addCriterion("submitted_time <=", value, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeIn(List<Date> values) {
            addCriterion("submitted_time in", values, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeNotIn(List<Date> values) {
            addCriterion("submitted_time not in", values, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeBetween(Date value1, Date value2) {
            addCriterion("submitted_time between", value1, value2, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andSubmittedTimeNotBetween(Date value1, Date value2) {
            addCriterion("submitted_time not between", value1, value2, "submittedTime");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNull() {
            addCriterion("event_type is null");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNotNull() {
            addCriterion("event_type is not null");
            return (Criteria) this;
        }

        public Criteria andEventTypeEqualTo(String value) {
            addCriterion("event_type =", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotEqualTo(String value) {
            addCriterion("event_type <>", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThan(String value) {
            addCriterion("event_type >", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThanOrEqualTo(String value) {
            addCriterion("event_type >=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThan(String value) {
            addCriterion("event_type <", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThanOrEqualTo(String value) {
            addCriterion("event_type <=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLike(String value) {
            addCriterion("event_type like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotLike(String value) {
            addCriterion("event_type not like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeIn(List<String> values) {
            addCriterion("event_type in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotIn(List<String> values) {
            addCriterion("event_type not in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeBetween(String value1, String value2) {
            addCriterion("event_type between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotBetween(String value1, String value2) {
            addCriterion("event_type not between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNull() {
            addCriterion("event_name is null");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNotNull() {
            addCriterion("event_name is not null");
            return (Criteria) this;
        }

        public Criteria andEventNameEqualTo(String value) {
            addCriterion("event_name =", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotEqualTo(String value) {
            addCriterion("event_name <>", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThan(String value) {
            addCriterion("event_name >", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThanOrEqualTo(String value) {
            addCriterion("event_name >=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThan(String value) {
            addCriterion("event_name <", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThanOrEqualTo(String value) {
            addCriterion("event_name <=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLike(String value) {
            addCriterion("event_name like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotLike(String value) {
            addCriterion("event_name not like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameIn(List<String> values) {
            addCriterion("event_name in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotIn(List<String> values) {
            addCriterion("event_name not in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameBetween(String value1, String value2) {
            addCriterion("event_name between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotBetween(String value1, String value2) {
            addCriterion("event_name not between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andPlacedResultIsNull() {
            addCriterion("placed_result is null");
            return (Criteria) this;
        }

        public Criteria andPlacedResultIsNotNull() {
            addCriterion("placed_result is not null");
            return (Criteria) this;
        }

        public Criteria andPlacedResultEqualTo(String value) {
            addCriterion("placed_result =", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultNotEqualTo(String value) {
            addCriterion("placed_result <>", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultGreaterThan(String value) {
            addCriterion("placed_result >", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultGreaterThanOrEqualTo(String value) {
            addCriterion("placed_result >=", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultLessThan(String value) {
            addCriterion("placed_result <", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultLessThanOrEqualTo(String value) {
            addCriterion("placed_result <=", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultLike(String value) {
            addCriterion("placed_result like", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultNotLike(String value) {
            addCriterion("placed_result not like", value, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultIn(List<String> values) {
            addCriterion("placed_result in", values, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultNotIn(List<String> values) {
            addCriterion("placed_result not in", values, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultBetween(String value1, String value2) {
            addCriterion("placed_result between", value1, value2, "placedResult");
            return (Criteria) this;
        }

        public Criteria andPlacedResultNotBetween(String value1, String value2) {
            addCriterion("placed_result not between", value1, value2, "placedResult");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameIsNull() {
            addCriterion("competition_name is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameIsNotNull() {
            addCriterion("competition_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameEqualTo(String value) {
            addCriterion("competition_name =", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameNotEqualTo(String value) {
            addCriterion("competition_name <>", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameGreaterThan(String value) {
            addCriterion("competition_name >", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameGreaterThanOrEqualTo(String value) {
            addCriterion("competition_name >=", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameLessThan(String value) {
            addCriterion("competition_name <", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameLessThanOrEqualTo(String value) {
            addCriterion("competition_name <=", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameLike(String value) {
            addCriterion("competition_name like", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameNotLike(String value) {
            addCriterion("competition_name not like", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameIn(List<String> values) {
            addCriterion("competition_name in", values, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameNotIn(List<String> values) {
            addCriterion("competition_name not in", values, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameBetween(String value1, String value2) {
            addCriterion("competition_name between", value1, value2, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameNotBetween(String value1, String value2) {
            addCriterion("competition_name not between", value1, value2, "competitionName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameIsNull() {
            addCriterion("season_name is null");
            return (Criteria) this;
        }

        public Criteria andSeasonNameIsNotNull() {
            addCriterion("season_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonNameEqualTo(String value) {
            addCriterion("season_name =", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotEqualTo(String value) {
            addCriterion("season_name <>", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameGreaterThan(String value) {
            addCriterion("season_name >", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameGreaterThanOrEqualTo(String value) {
            addCriterion("season_name >=", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameLessThan(String value) {
            addCriterion("season_name <", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameLessThanOrEqualTo(String value) {
            addCriterion("season_name <=", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameLike(String value) {
            addCriterion("season_name like", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotLike(String value) {
            addCriterion("season_name not like", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameIn(List<String> values) {
            addCriterion("season_name in", values, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotIn(List<String> values) {
            addCriterion("season_name not in", values, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameBetween(String value1, String value2) {
            addCriterion("season_name between", value1, value2, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotBetween(String value1, String value2) {
            addCriterion("season_name not between", value1, value2, "seasonName");
            return (Criteria) this;
        }

        public Criteria andRoundNameIsNull() {
            addCriterion("round_name is null");
            return (Criteria) this;
        }

        public Criteria andRoundNameIsNotNull() {
            addCriterion("round_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoundNameEqualTo(String value) {
            addCriterion("round_name =", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameNotEqualTo(String value) {
            addCriterion("round_name <>", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameGreaterThan(String value) {
            addCriterion("round_name >", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameGreaterThanOrEqualTo(String value) {
            addCriterion("round_name >=", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameLessThan(String value) {
            addCriterion("round_name <", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameLessThanOrEqualTo(String value) {
            addCriterion("round_name <=", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameLike(String value) {
            addCriterion("round_name like", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameNotLike(String value) {
            addCriterion("round_name not like", value, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameIn(List<String> values) {
            addCriterion("round_name in", values, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameNotIn(List<String> values) {
            addCriterion("round_name not in", values, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameBetween(String value1, String value2) {
            addCriterion("round_name between", value1, value2, "roundName");
            return (Criteria) this;
        }

        public Criteria andRoundNameNotBetween(String value1, String value2) {
            addCriterion("round_name not between", value1, value2, "roundName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameIsNull() {
            addCriterion("rule_type_name is null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameIsNotNull() {
            addCriterion("rule_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameEqualTo(String value) {
            addCriterion("rule_type_name =", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameNotEqualTo(String value) {
            addCriterion("rule_type_name <>", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameGreaterThan(String value) {
            addCriterion("rule_type_name >", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("rule_type_name >=", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameLessThan(String value) {
            addCriterion("rule_type_name <", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameLessThanOrEqualTo(String value) {
            addCriterion("rule_type_name <=", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameLike(String value) {
            addCriterion("rule_type_name like", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameNotLike(String value) {
            addCriterion("rule_type_name not like", value, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameIn(List<String> values) {
            addCriterion("rule_type_name in", values, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameNotIn(List<String> values) {
            addCriterion("rule_type_name not in", values, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameBetween(String value1, String value2) {
            addCriterion("rule_type_name between", value1, value2, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNameNotBetween(String value1, String value2) {
            addCriterion("rule_type_name not between", value1, value2, "ruleTypeName");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsIsNull() {
            addCriterion("selection_odds is null");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsIsNotNull() {
            addCriterion("selection_odds is not null");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsEqualTo(String value) {
            addCriterion("selection_odds =", value, "selectionOdds");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsNotEqualTo(String value) {
            addCriterion("selection_odds <>", value, "selectionOdds");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsGreaterThan(String value) {
            addCriterion("selection_odds >", value, "selectionOdds");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsGreaterThanOrEqualTo(String value) {
            addCriterion("selection_odds >=", value, "selectionOdds");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsLessThan(String value) {
            addCriterion("selection_odds <", value, "selectionOdds");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsLessThanOrEqualTo(String value) {
            addCriterion("selection_odds <=", value, "selectionOdds");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsLike(String value) {
            addCriterion("selection_odds like", value, "selectionOdds");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsNotLike(String value) {
            addCriterion("selection_odds not like", value, "selectionOdds");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsIn(List<String> values) {
            addCriterion("selection_odds in", values, "selectionOdds");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsNotIn(List<String> values) {
            addCriterion("selection_odds not in", values, "selectionOdds");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsBetween(String value1, String value2) {
            addCriterion("selection_odds between", value1, value2, "selectionOdds");
            return (Criteria) this;
        }

        public Criteria andSelectionOddsNotBetween(String value1, String value2) {
            addCriterion("selection_odds not between", value1, value2, "selectionOdds");
            return (Criteria) this;
        }

        public Criteria andEventTimeIsNull() {
            addCriterion("event_time is null");
            return (Criteria) this;
        }

        public Criteria andEventTimeIsNotNull() {
            addCriterion("event_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventTimeEqualTo(Date value) {
            addCriterion("event_time =", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotEqualTo(Date value) {
            addCriterion("event_time <>", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeGreaterThan(Date value) {
            addCriterion("event_time >", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("event_time >=", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeLessThan(Date value) {
            addCriterion("event_time <", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeLessThanOrEqualTo(Date value) {
            addCriterion("event_time <=", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeIn(List<Date> values) {
            addCriterion("event_time in", values, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotIn(List<Date> values) {
            addCriterion("event_time not in", values, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeBetween(Date value1, Date value2) {
            addCriterion("event_time between", value1, value2, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotBetween(Date value1, Date value2) {
            addCriterion("event_time not between", value1, value2, "eventTime");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameIsNull() {
            addCriterion("home_team_name is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameIsNotNull() {
            addCriterion("home_team_name is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEqualTo(String value) {
            addCriterion("home_team_name =", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameNotEqualTo(String value) {
            addCriterion("home_team_name <>", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameGreaterThan(String value) {
            addCriterion("home_team_name >", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("home_team_name >=", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameLessThan(String value) {
            addCriterion("home_team_name <", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameLessThanOrEqualTo(String value) {
            addCriterion("home_team_name <=", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameLike(String value) {
            addCriterion("home_team_name like", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameNotLike(String value) {
            addCriterion("home_team_name not like", value, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameIn(List<String> values) {
            addCriterion("home_team_name in", values, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameNotIn(List<String> values) {
            addCriterion("home_team_name not in", values, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameBetween(String value1, String value2) {
            addCriterion("home_team_name between", value1, value2, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameNotBetween(String value1, String value2) {
            addCriterion("home_team_name not between", value1, value2, "homeTeamName");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnIsNull() {
            addCriterion("home_team_name_en is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnIsNotNull() {
            addCriterion("home_team_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnEqualTo(String value) {
            addCriterion("home_team_name_en =", value, "homeTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnNotEqualTo(String value) {
            addCriterion("home_team_name_en <>", value, "homeTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnGreaterThan(String value) {
            addCriterion("home_team_name_en >", value, "homeTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("home_team_name_en >=", value, "homeTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnLessThan(String value) {
            addCriterion("home_team_name_en <", value, "homeTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnLessThanOrEqualTo(String value) {
            addCriterion("home_team_name_en <=", value, "homeTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnLike(String value) {
            addCriterion("home_team_name_en like", value, "homeTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnNotLike(String value) {
            addCriterion("home_team_name_en not like", value, "homeTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnIn(List<String> values) {
            addCriterion("home_team_name_en in", values, "homeTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnNotIn(List<String> values) {
            addCriterion("home_team_name_en not in", values, "homeTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnBetween(String value1, String value2) {
            addCriterion("home_team_name_en between", value1, value2, "homeTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNameEnNotBetween(String value1, String value2) {
            addCriterion("home_team_name_en not between", value1, value2, "homeTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameIsNull() {
            addCriterion("away_team_name is null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameIsNotNull() {
            addCriterion("away_team_name is not null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEqualTo(String value) {
            addCriterion("away_team_name =", value, "awayTeamName");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameNotEqualTo(String value) {
            addCriterion("away_team_name <>", value, "awayTeamName");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameGreaterThan(String value) {
            addCriterion("away_team_name >", value, "awayTeamName");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("away_team_name >=", value, "awayTeamName");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameLessThan(String value) {
            addCriterion("away_team_name <", value, "awayTeamName");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameLessThanOrEqualTo(String value) {
            addCriterion("away_team_name <=", value, "awayTeamName");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameLike(String value) {
            addCriterion("away_team_name like", value, "awayTeamName");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameNotLike(String value) {
            addCriterion("away_team_name not like", value, "awayTeamName");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameIn(List<String> values) {
            addCriterion("away_team_name in", values, "awayTeamName");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameNotIn(List<String> values) {
            addCriterion("away_team_name not in", values, "awayTeamName");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameBetween(String value1, String value2) {
            addCriterion("away_team_name between", value1, value2, "awayTeamName");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameNotBetween(String value1, String value2) {
            addCriterion("away_team_name not between", value1, value2, "awayTeamName");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnIsNull() {
            addCriterion("away_team_name_en is null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnIsNotNull() {
            addCriterion("away_team_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnEqualTo(String value) {
            addCriterion("away_team_name_en =", value, "awayTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnNotEqualTo(String value) {
            addCriterion("away_team_name_en <>", value, "awayTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnGreaterThan(String value) {
            addCriterion("away_team_name_en >", value, "awayTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("away_team_name_en >=", value, "awayTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnLessThan(String value) {
            addCriterion("away_team_name_en <", value, "awayTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnLessThanOrEqualTo(String value) {
            addCriterion("away_team_name_en <=", value, "awayTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnLike(String value) {
            addCriterion("away_team_name_en like", value, "awayTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnNotLike(String value) {
            addCriterion("away_team_name_en not like", value, "awayTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnIn(List<String> values) {
            addCriterion("away_team_name_en in", values, "awayTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnNotIn(List<String> values) {
            addCriterion("away_team_name_en not in", values, "awayTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnBetween(String value1, String value2) {
            addCriterion("away_team_name_en between", value1, value2, "awayTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNameEnNotBetween(String value1, String value2) {
            addCriterion("away_team_name_en not between", value1, value2, "awayTeamNameEn");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconIsNull() {
            addCriterion("home_team_icon is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconIsNotNull() {
            addCriterion("home_team_icon is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconEqualTo(String value) {
            addCriterion("home_team_icon =", value, "homeTeamIcon");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconNotEqualTo(String value) {
            addCriterion("home_team_icon <>", value, "homeTeamIcon");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconGreaterThan(String value) {
            addCriterion("home_team_icon >", value, "homeTeamIcon");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconGreaterThanOrEqualTo(String value) {
            addCriterion("home_team_icon >=", value, "homeTeamIcon");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconLessThan(String value) {
            addCriterion("home_team_icon <", value, "homeTeamIcon");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconLessThanOrEqualTo(String value) {
            addCriterion("home_team_icon <=", value, "homeTeamIcon");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconLike(String value) {
            addCriterion("home_team_icon like", value, "homeTeamIcon");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconNotLike(String value) {
            addCriterion("home_team_icon not like", value, "homeTeamIcon");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconIn(List<String> values) {
            addCriterion("home_team_icon in", values, "homeTeamIcon");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconNotIn(List<String> values) {
            addCriterion("home_team_icon not in", values, "homeTeamIcon");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconBetween(String value1, String value2) {
            addCriterion("home_team_icon between", value1, value2, "homeTeamIcon");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIconNotBetween(String value1, String value2) {
            addCriterion("home_team_icon not between", value1, value2, "homeTeamIcon");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconIsNull() {
            addCriterion("away_team_icon is null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconIsNotNull() {
            addCriterion("away_team_icon is not null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconEqualTo(String value) {
            addCriterion("away_team_icon =", value, "awayTeamIcon");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconNotEqualTo(String value) {
            addCriterion("away_team_icon <>", value, "awayTeamIcon");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconGreaterThan(String value) {
            addCriterion("away_team_icon >", value, "awayTeamIcon");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconGreaterThanOrEqualTo(String value) {
            addCriterion("away_team_icon >=", value, "awayTeamIcon");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconLessThan(String value) {
            addCriterion("away_team_icon <", value, "awayTeamIcon");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconLessThanOrEqualTo(String value) {
            addCriterion("away_team_icon <=", value, "awayTeamIcon");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconLike(String value) {
            addCriterion("away_team_icon like", value, "awayTeamIcon");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconNotLike(String value) {
            addCriterion("away_team_icon not like", value, "awayTeamIcon");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconIn(List<String> values) {
            addCriterion("away_team_icon in", values, "awayTeamIcon");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconNotIn(List<String> values) {
            addCriterion("away_team_icon not in", values, "awayTeamIcon");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconBetween(String value1, String value2) {
            addCriterion("away_team_icon between", value1, value2, "awayTeamIcon");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIconNotBetween(String value1, String value2) {
            addCriterion("away_team_icon not between", value1, value2, "awayTeamIcon");
            return (Criteria) this;
        }

        public Criteria andSelectionNameIsNull() {
            addCriterion("selection_name is null");
            return (Criteria) this;
        }

        public Criteria andSelectionNameIsNotNull() {
            addCriterion("selection_name is not null");
            return (Criteria) this;
        }

        public Criteria andSelectionNameEqualTo(String value) {
            addCriterion("selection_name =", value, "selectionName");
            return (Criteria) this;
        }

        public Criteria andSelectionNameNotEqualTo(String value) {
            addCriterion("selection_name <>", value, "selectionName");
            return (Criteria) this;
        }

        public Criteria andSelectionNameGreaterThan(String value) {
            addCriterion("selection_name >", value, "selectionName");
            return (Criteria) this;
        }

        public Criteria andSelectionNameGreaterThanOrEqualTo(String value) {
            addCriterion("selection_name >=", value, "selectionName");
            return (Criteria) this;
        }

        public Criteria andSelectionNameLessThan(String value) {
            addCriterion("selection_name <", value, "selectionName");
            return (Criteria) this;
        }

        public Criteria andSelectionNameLessThanOrEqualTo(String value) {
            addCriterion("selection_name <=", value, "selectionName");
            return (Criteria) this;
        }

        public Criteria andSelectionNameLike(String value) {
            addCriterion("selection_name like", value, "selectionName");
            return (Criteria) this;
        }

        public Criteria andSelectionNameNotLike(String value) {
            addCriterion("selection_name not like", value, "selectionName");
            return (Criteria) this;
        }

        public Criteria andSelectionNameIn(List<String> values) {
            addCriterion("selection_name in", values, "selectionName");
            return (Criteria) this;
        }

        public Criteria andSelectionNameNotIn(List<String> values) {
            addCriterion("selection_name not in", values, "selectionName");
            return (Criteria) this;
        }

        public Criteria andSelectionNameBetween(String value1, String value2) {
            addCriterion("selection_name between", value1, value2, "selectionName");
            return (Criteria) this;
        }

        public Criteria andSelectionNameNotBetween(String value1, String value2) {
            addCriterion("selection_name not between", value1, value2, "selectionName");
            return (Criteria) this;
        }

        public Criteria andSelectionValueIsNull() {
            addCriterion("selection_value is null");
            return (Criteria) this;
        }

        public Criteria andSelectionValueIsNotNull() {
            addCriterion("selection_value is not null");
            return (Criteria) this;
        }

        public Criteria andSelectionValueEqualTo(BigDecimal value) {
            addCriterion("selection_value =", value, "selectionValue");
            return (Criteria) this;
        }

        public Criteria andSelectionValueNotEqualTo(BigDecimal value) {
            addCriterion("selection_value <>", value, "selectionValue");
            return (Criteria) this;
        }

        public Criteria andSelectionValueGreaterThan(BigDecimal value) {
            addCriterion("selection_value >", value, "selectionValue");
            return (Criteria) this;
        }

        public Criteria andSelectionValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("selection_value >=", value, "selectionValue");
            return (Criteria) this;
        }

        public Criteria andSelectionValueLessThan(BigDecimal value) {
            addCriterion("selection_value <", value, "selectionValue");
            return (Criteria) this;
        }

        public Criteria andSelectionValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("selection_value <=", value, "selectionValue");
            return (Criteria) this;
        }

        public Criteria andSelectionValueIn(List<BigDecimal> values) {
            addCriterion("selection_value in", values, "selectionValue");
            return (Criteria) this;
        }

        public Criteria andSelectionValueNotIn(List<BigDecimal> values) {
            addCriterion("selection_value not in", values, "selectionValue");
            return (Criteria) this;
        }

        public Criteria andSelectionValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("selection_value between", value1, value2, "selectionValue");
            return (Criteria) this;
        }

        public Criteria andSelectionValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("selection_value not between", value1, value2, "selectionValue");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSettleIncomeLoseIsNull() {
            addCriterion("settle_income_lose is null");
            return (Criteria) this;
        }

        public Criteria andSettleIncomeLoseIsNotNull() {
            addCriterion("settle_income_lose is not null");
            return (Criteria) this;
        }

        public Criteria andSettleIncomeLoseEqualTo(BigDecimal value) {
            addCriterion("settle_income_lose =", value, "settleIncomeLose");
            return (Criteria) this;
        }

        public Criteria andSettleIncomeLoseNotEqualTo(BigDecimal value) {
            addCriterion("settle_income_lose <>", value, "settleIncomeLose");
            return (Criteria) this;
        }

        public Criteria andSettleIncomeLoseGreaterThan(BigDecimal value) {
            addCriterion("settle_income_lose >", value, "settleIncomeLose");
            return (Criteria) this;
        }

        public Criteria andSettleIncomeLoseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_income_lose >=", value, "settleIncomeLose");
            return (Criteria) this;
        }

        public Criteria andSettleIncomeLoseLessThan(BigDecimal value) {
            addCriterion("settle_income_lose <", value, "settleIncomeLose");
            return (Criteria) this;
        }

        public Criteria andSettleIncomeLoseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_income_lose <=", value, "settleIncomeLose");
            return (Criteria) this;
        }

        public Criteria andSettleIncomeLoseIn(List<BigDecimal> values) {
            addCriterion("settle_income_lose in", values, "settleIncomeLose");
            return (Criteria) this;
        }

        public Criteria andSettleIncomeLoseNotIn(List<BigDecimal> values) {
            addCriterion("settle_income_lose not in", values, "settleIncomeLose");
            return (Criteria) this;
        }

        public Criteria andSettleIncomeLoseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_income_lose between", value1, value2, "settleIncomeLose");
            return (Criteria) this;
        }

        public Criteria andSettleIncomeLoseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_income_lose not between", value1, value2, "settleIncomeLose");
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