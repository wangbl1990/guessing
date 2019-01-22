package com.mifan.guessing.dao.model;

import java.util.ArrayList;
import java.util.List;

public class MarketListResponseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketListResponseExample() {
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

        public Criteria andRuleTypeIsNull() {
            addCriterion("rule_type is null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNotNull() {
            addCriterion("rule_type is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeEqualTo(String value) {
            addCriterion("rule_type =", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotEqualTo(String value) {
            addCriterion("rule_type <>", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThan(String value) {
            addCriterion("rule_type >", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rule_type >=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThan(String value) {
            addCriterion("rule_type <", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThanOrEqualTo(String value) {
            addCriterion("rule_type <=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLike(String value) {
            addCriterion("rule_type like", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotLike(String value) {
            addCriterion("rule_type not like", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIn(List<String> values) {
            addCriterion("rule_type in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotIn(List<String> values) {
            addCriterion("rule_type not in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeBetween(String value1, String value2) {
            addCriterion("rule_type between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotBetween(String value1, String value2) {
            addCriterion("rule_type not between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIsNull() {
            addCriterion("period_type is null");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIsNotNull() {
            addCriterion("period_type is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeEqualTo(String value) {
            addCriterion("period_type =", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotEqualTo(String value) {
            addCriterion("period_type <>", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeGreaterThan(String value) {
            addCriterion("period_type >", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("period_type >=", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLessThan(String value) {
            addCriterion("period_type <", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLessThanOrEqualTo(String value) {
            addCriterion("period_type <=", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLike(String value) {
            addCriterion("period_type like", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotLike(String value) {
            addCriterion("period_type not like", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIn(List<String> values) {
            addCriterion("period_type in", values, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotIn(List<String> values) {
            addCriterion("period_type not in", values, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeBetween(String value1, String value2) {
            addCriterion("period_type between", value1, value2, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotBetween(String value1, String value2) {
            addCriterion("period_type not between", value1, value2, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodValueIsNull() {
            addCriterion("period_value is null");
            return (Criteria) this;
        }

        public Criteria andPeriodValueIsNotNull() {
            addCriterion("period_value is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodValueEqualTo(String value) {
            addCriterion("period_value =", value, "periodValue");
            return (Criteria) this;
        }

        public Criteria andPeriodValueNotEqualTo(String value) {
            addCriterion("period_value <>", value, "periodValue");
            return (Criteria) this;
        }

        public Criteria andPeriodValueGreaterThan(String value) {
            addCriterion("period_value >", value, "periodValue");
            return (Criteria) this;
        }

        public Criteria andPeriodValueGreaterThanOrEqualTo(String value) {
            addCriterion("period_value >=", value, "periodValue");
            return (Criteria) this;
        }

        public Criteria andPeriodValueLessThan(String value) {
            addCriterion("period_value <", value, "periodValue");
            return (Criteria) this;
        }

        public Criteria andPeriodValueLessThanOrEqualTo(String value) {
            addCriterion("period_value <=", value, "periodValue");
            return (Criteria) this;
        }

        public Criteria andPeriodValueLike(String value) {
            addCriterion("period_value like", value, "periodValue");
            return (Criteria) this;
        }

        public Criteria andPeriodValueNotLike(String value) {
            addCriterion("period_value not like", value, "periodValue");
            return (Criteria) this;
        }

        public Criteria andPeriodValueIn(List<String> values) {
            addCriterion("period_value in", values, "periodValue");
            return (Criteria) this;
        }

        public Criteria andPeriodValueNotIn(List<String> values) {
            addCriterion("period_value not in", values, "periodValue");
            return (Criteria) this;
        }

        public Criteria andPeriodValueBetween(String value1, String value2) {
            addCriterion("period_value between", value1, value2, "periodValue");
            return (Criteria) this;
        }

        public Criteria andPeriodValueNotBetween(String value1, String value2) {
            addCriterion("period_value not between", value1, value2, "periodValue");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginIsNull() {
            addCriterion("period_begin is null");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginIsNotNull() {
            addCriterion("period_begin is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginEqualTo(String value) {
            addCriterion("period_begin =", value, "periodBegin");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginNotEqualTo(String value) {
            addCriterion("period_begin <>", value, "periodBegin");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginGreaterThan(String value) {
            addCriterion("period_begin >", value, "periodBegin");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginGreaterThanOrEqualTo(String value) {
            addCriterion("period_begin >=", value, "periodBegin");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginLessThan(String value) {
            addCriterion("period_begin <", value, "periodBegin");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginLessThanOrEqualTo(String value) {
            addCriterion("period_begin <=", value, "periodBegin");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginLike(String value) {
            addCriterion("period_begin like", value, "periodBegin");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginNotLike(String value) {
            addCriterion("period_begin not like", value, "periodBegin");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginIn(List<String> values) {
            addCriterion("period_begin in", values, "periodBegin");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginNotIn(List<String> values) {
            addCriterion("period_begin not in", values, "periodBegin");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginBetween(String value1, String value2) {
            addCriterion("period_begin between", value1, value2, "periodBegin");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginNotBetween(String value1, String value2) {
            addCriterion("period_begin not between", value1, value2, "periodBegin");
            return (Criteria) this;
        }

        public Criteria andPeriodEndIsNull() {
            addCriterion("period_end is null");
            return (Criteria) this;
        }

        public Criteria andPeriodEndIsNotNull() {
            addCriterion("period_end is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEndEqualTo(String value) {
            addCriterion("period_end =", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndNotEqualTo(String value) {
            addCriterion("period_end <>", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndGreaterThan(String value) {
            addCriterion("period_end >", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndGreaterThanOrEqualTo(String value) {
            addCriterion("period_end >=", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndLessThan(String value) {
            addCriterion("period_end <", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndLessThanOrEqualTo(String value) {
            addCriterion("period_end <=", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndLike(String value) {
            addCriterion("period_end like", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndNotLike(String value) {
            addCriterion("period_end not like", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndIn(List<String> values) {
            addCriterion("period_end in", values, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndNotIn(List<String> values) {
            addCriterion("period_end not in", values, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndBetween(String value1, String value2) {
            addCriterion("period_end between", value1, value2, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndNotBetween(String value1, String value2) {
            addCriterion("period_end not between", value1, value2, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteIsNull() {
            addCriterion("quota_appetite is null");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteIsNotNull() {
            addCriterion("quota_appetite is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteEqualTo(String value) {
            addCriterion("quota_appetite =", value, "quotaAppetite");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteNotEqualTo(String value) {
            addCriterion("quota_appetite <>", value, "quotaAppetite");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteGreaterThan(String value) {
            addCriterion("quota_appetite >", value, "quotaAppetite");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteGreaterThanOrEqualTo(String value) {
            addCriterion("quota_appetite >=", value, "quotaAppetite");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteLessThan(String value) {
            addCriterion("quota_appetite <", value, "quotaAppetite");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteLessThanOrEqualTo(String value) {
            addCriterion("quota_appetite <=", value, "quotaAppetite");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteLike(String value) {
            addCriterion("quota_appetite like", value, "quotaAppetite");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteNotLike(String value) {
            addCriterion("quota_appetite not like", value, "quotaAppetite");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteIn(List<String> values) {
            addCriterion("quota_appetite in", values, "quotaAppetite");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteNotIn(List<String> values) {
            addCriterion("quota_appetite not in", values, "quotaAppetite");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteBetween(String value1, String value2) {
            addCriterion("quota_appetite between", value1, value2, "quotaAppetite");
            return (Criteria) this;
        }

        public Criteria andQuotaAppetiteNotBetween(String value1, String value2) {
            addCriterion("quota_appetite not between", value1, value2, "quotaAppetite");
            return (Criteria) this;
        }

        public Criteria andBettingDelayIsNull() {
            addCriterion("betting_delay is null");
            return (Criteria) this;
        }

        public Criteria andBettingDelayIsNotNull() {
            addCriterion("betting_delay is not null");
            return (Criteria) this;
        }

        public Criteria andBettingDelayEqualTo(String value) {
            addCriterion("betting_delay =", value, "bettingDelay");
            return (Criteria) this;
        }

        public Criteria andBettingDelayNotEqualTo(String value) {
            addCriterion("betting_delay <>", value, "bettingDelay");
            return (Criteria) this;
        }

        public Criteria andBettingDelayGreaterThan(String value) {
            addCriterion("betting_delay >", value, "bettingDelay");
            return (Criteria) this;
        }

        public Criteria andBettingDelayGreaterThanOrEqualTo(String value) {
            addCriterion("betting_delay >=", value, "bettingDelay");
            return (Criteria) this;
        }

        public Criteria andBettingDelayLessThan(String value) {
            addCriterion("betting_delay <", value, "bettingDelay");
            return (Criteria) this;
        }

        public Criteria andBettingDelayLessThanOrEqualTo(String value) {
            addCriterion("betting_delay <=", value, "bettingDelay");
            return (Criteria) this;
        }

        public Criteria andBettingDelayLike(String value) {
            addCriterion("betting_delay like", value, "bettingDelay");
            return (Criteria) this;
        }

        public Criteria andBettingDelayNotLike(String value) {
            addCriterion("betting_delay not like", value, "bettingDelay");
            return (Criteria) this;
        }

        public Criteria andBettingDelayIn(List<String> values) {
            addCriterion("betting_delay in", values, "bettingDelay");
            return (Criteria) this;
        }

        public Criteria andBettingDelayNotIn(List<String> values) {
            addCriterion("betting_delay not in", values, "bettingDelay");
            return (Criteria) this;
        }

        public Criteria andBettingDelayBetween(String value1, String value2) {
            addCriterion("betting_delay between", value1, value2, "bettingDelay");
            return (Criteria) this;
        }

        public Criteria andBettingDelayNotBetween(String value1, String value2) {
            addCriterion("betting_delay not between", value1, value2, "bettingDelay");
            return (Criteria) this;
        }

        public Criteria andOpenResultIsNull() {
            addCriterion("open_result is null");
            return (Criteria) this;
        }

        public Criteria andOpenResultIsNotNull() {
            addCriterion("open_result is not null");
            return (Criteria) this;
        }

        public Criteria andOpenResultEqualTo(String value) {
            addCriterion("open_result =", value, "openResult");
            return (Criteria) this;
        }

        public Criteria andOpenResultNotEqualTo(String value) {
            addCriterion("open_result <>", value, "openResult");
            return (Criteria) this;
        }

        public Criteria andOpenResultGreaterThan(String value) {
            addCriterion("open_result >", value, "openResult");
            return (Criteria) this;
        }

        public Criteria andOpenResultGreaterThanOrEqualTo(String value) {
            addCriterion("open_result >=", value, "openResult");
            return (Criteria) this;
        }

        public Criteria andOpenResultLessThan(String value) {
            addCriterion("open_result <", value, "openResult");
            return (Criteria) this;
        }

        public Criteria andOpenResultLessThanOrEqualTo(String value) {
            addCriterion("open_result <=", value, "openResult");
            return (Criteria) this;
        }

        public Criteria andOpenResultLike(String value) {
            addCriterion("open_result like", value, "openResult");
            return (Criteria) this;
        }

        public Criteria andOpenResultNotLike(String value) {
            addCriterion("open_result not like", value, "openResult");
            return (Criteria) this;
        }

        public Criteria andOpenResultIn(List<String> values) {
            addCriterion("open_result in", values, "openResult");
            return (Criteria) this;
        }

        public Criteria andOpenResultNotIn(List<String> values) {
            addCriterion("open_result not in", values, "openResult");
            return (Criteria) this;
        }

        public Criteria andOpenResultBetween(String value1, String value2) {
            addCriterion("open_result between", value1, value2, "openResult");
            return (Criteria) this;
        }

        public Criteria andOpenResultNotBetween(String value1, String value2) {
            addCriterion("open_result not between", value1, value2, "openResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultIsNull() {
            addCriterion("verify_result is null");
            return (Criteria) this;
        }

        public Criteria andVerifyResultIsNotNull() {
            addCriterion("verify_result is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyResultEqualTo(String value) {
            addCriterion("verify_result =", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultNotEqualTo(String value) {
            addCriterion("verify_result <>", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultGreaterThan(String value) {
            addCriterion("verify_result >", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultGreaterThanOrEqualTo(String value) {
            addCriterion("verify_result >=", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultLessThan(String value) {
            addCriterion("verify_result <", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultLessThanOrEqualTo(String value) {
            addCriterion("verify_result <=", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultLike(String value) {
            addCriterion("verify_result like", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultNotLike(String value) {
            addCriterion("verify_result not like", value, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultIn(List<String> values) {
            addCriterion("verify_result in", values, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultNotIn(List<String> values) {
            addCriterion("verify_result not in", values, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultBetween(String value1, String value2) {
            addCriterion("verify_result between", value1, value2, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifyResultNotBetween(String value1, String value2) {
            addCriterion("verify_result not between", value1, value2, "verifyResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultIsNull() {
            addCriterion("settled_result is null");
            return (Criteria) this;
        }

        public Criteria andSettledResultIsNotNull() {
            addCriterion("settled_result is not null");
            return (Criteria) this;
        }

        public Criteria andSettledResultEqualTo(String value) {
            addCriterion("settled_result =", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultNotEqualTo(String value) {
            addCriterion("settled_result <>", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultGreaterThan(String value) {
            addCriterion("settled_result >", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultGreaterThanOrEqualTo(String value) {
            addCriterion("settled_result >=", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultLessThan(String value) {
            addCriterion("settled_result <", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultLessThanOrEqualTo(String value) {
            addCriterion("settled_result <=", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultLike(String value) {
            addCriterion("settled_result like", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultNotLike(String value) {
            addCriterion("settled_result not like", value, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultIn(List<String> values) {
            addCriterion("settled_result in", values, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultNotIn(List<String> values) {
            addCriterion("settled_result not in", values, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultBetween(String value1, String value2) {
            addCriterion("settled_result between", value1, value2, "settledResult");
            return (Criteria) this;
        }

        public Criteria andSettledResultNotBetween(String value1, String value2) {
            addCriterion("settled_result not between", value1, value2, "settledResult");
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