package com.mifan.guessing.dao.model;

import java.util.Date;

public class Event {
    private String id;

    private String eventId;

    private String sportId;

    private String eventName;

    private Date eventTime;

    private String competitionName;

    private String seasonName;

    private String roundName;

    private String homeTeamName;

    private String awayTeamName;

    private String homeTeamNameEn;

    private String awayTeamNameEn;

    private String score;

    private String state;

    private String hot;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId == null ? null : sportId.trim();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName == null ? null : competitionName.trim();
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName == null ? null : seasonName.trim();
    }

    public String getRoundName() {
        return roundName;
    }

    public void setRoundName(String roundName) {
        this.roundName = roundName == null ? null : roundName.trim();
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName == null ? null : homeTeamName.trim();
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName == null ? null : awayTeamName.trim();
    }

    public String getHomeTeamNameEn() {
        return homeTeamNameEn;
    }

    public void setHomeTeamNameEn(String homeTeamNameEn) {
        this.homeTeamNameEn = homeTeamNameEn == null ? null : homeTeamNameEn.trim();
    }

    public String getAwayTeamNameEn() {
        return awayTeamNameEn;
    }

    public void setAwayTeamNameEn(String awayTeamNameEn) {
        this.awayTeamNameEn = awayTeamNameEn == null ? null : awayTeamNameEn.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getHot() {
        return hot;
    }

    public void setHot(String hot) {
        this.hot = hot == null ? null : hot.trim();
    }
}