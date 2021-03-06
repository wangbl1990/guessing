package com.mifan.guessing.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubscribeEventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubscribeEventExample() {
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameIsNull() {
            addCriterion("competitionName is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameIsNotNull() {
            addCriterion("competitionName is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameEqualTo(String value) {
            addCriterion("competitionName =", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameNotEqualTo(String value) {
            addCriterion("competitionName <>", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameGreaterThan(String value) {
            addCriterion("competitionName >", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameGreaterThanOrEqualTo(String value) {
            addCriterion("competitionName >=", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameLessThan(String value) {
            addCriterion("competitionName <", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameLessThanOrEqualTo(String value) {
            addCriterion("competitionName <=", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameLike(String value) {
            addCriterion("competitionName like", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameNotLike(String value) {
            addCriterion("competitionName not like", value, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameIn(List<String> values) {
            addCriterion("competitionName in", values, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameNotIn(List<String> values) {
            addCriterion("competitionName not in", values, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameBetween(String value1, String value2) {
            addCriterion("competitionName between", value1, value2, "competitionname");
            return (Criteria) this;
        }

        public Criteria andCompetitionnameNotBetween(String value1, String value2) {
            addCriterion("competitionName not between", value1, value2, "competitionname");
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

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(String value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(String value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(String value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(String value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(String value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(String value) {
            addCriterion("client_id like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(String value) {
            addCriterion("client_id not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<String> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<String> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(String value1, String value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(String value1, String value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
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