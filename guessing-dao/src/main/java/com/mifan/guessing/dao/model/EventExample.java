package com.mifan.guessing.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventExample() {
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

        public Criteria andSportIdIsNull() {
            addCriterion("sport_id is null");
            return (Criteria) this;
        }

        public Criteria andSportIdIsNotNull() {
            addCriterion("sport_id is not null");
            return (Criteria) this;
        }

        public Criteria andSportIdEqualTo(String value) {
            addCriterion("sport_id =", value, "sportId");
            return (Criteria) this;
        }

        public Criteria andSportIdNotEqualTo(String value) {
            addCriterion("sport_id <>", value, "sportId");
            return (Criteria) this;
        }

        public Criteria andSportIdGreaterThan(String value) {
            addCriterion("sport_id >", value, "sportId");
            return (Criteria) this;
        }

        public Criteria andSportIdGreaterThanOrEqualTo(String value) {
            addCriterion("sport_id >=", value, "sportId");
            return (Criteria) this;
        }

        public Criteria andSportIdLessThan(String value) {
            addCriterion("sport_id <", value, "sportId");
            return (Criteria) this;
        }

        public Criteria andSportIdLessThanOrEqualTo(String value) {
            addCriterion("sport_id <=", value, "sportId");
            return (Criteria) this;
        }

        public Criteria andSportIdLike(String value) {
            addCriterion("sport_id like", value, "sportId");
            return (Criteria) this;
        }

        public Criteria andSportIdNotLike(String value) {
            addCriterion("sport_id not like", value, "sportId");
            return (Criteria) this;
        }

        public Criteria andSportIdIn(List<String> values) {
            addCriterion("sport_id in", values, "sportId");
            return (Criteria) this;
        }

        public Criteria andSportIdNotIn(List<String> values) {
            addCriterion("sport_id not in", values, "sportId");
            return (Criteria) this;
        }

        public Criteria andSportIdBetween(String value1, String value2) {
            addCriterion("sport_id between", value1, value2, "sportId");
            return (Criteria) this;
        }

        public Criteria andSportIdNotBetween(String value1, String value2) {
            addCriterion("sport_id not between", value1, value2, "sportId");
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

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andHotIsNull() {
            addCriterion("hot is null");
            return (Criteria) this;
        }

        public Criteria andHotIsNotNull() {
            addCriterion("hot is not null");
            return (Criteria) this;
        }

        public Criteria andHotEqualTo(String value) {
            addCriterion("hot =", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotEqualTo(String value) {
            addCriterion("hot <>", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThan(String value) {
            addCriterion("hot >", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThanOrEqualTo(String value) {
            addCriterion("hot >=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThan(String value) {
            addCriterion("hot <", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThanOrEqualTo(String value) {
            addCriterion("hot <=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLike(String value) {
            addCriterion("hot like", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotLike(String value) {
            addCriterion("hot not like", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotIn(List<String> values) {
            addCriterion("hot in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotIn(List<String> values) {
            addCriterion("hot not in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotBetween(String value1, String value2) {
            addCriterion("hot between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotBetween(String value1, String value2) {
            addCriterion("hot not between", value1, value2, "hot");
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