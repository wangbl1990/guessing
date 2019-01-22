package com.mifan.guessing.dao.model;

public class Selection {
    private String id;

    private String selectionId;

    private String backOdds;

    private String lastBackOdds;

    private String maxStakeLimit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId == null ? null : selectionId.trim();
    }

    public String getBackOdds() {
        return backOdds;
    }

    public void setBackOdds(String backOdds) {
        this.backOdds = backOdds == null ? null : backOdds.trim();
    }

    public String getLastBackOdds() {
        return lastBackOdds;
    }

    public void setLastBackOdds(String lastBackOdds) {
        this.lastBackOdds = lastBackOdds == null ? null : lastBackOdds.trim();
    }

    public String getMaxStakeLimit() {
        return maxStakeLimit;
    }

    public void setMaxStakeLimit(String maxStakeLimit) {
        this.maxStakeLimit = maxStakeLimit == null ? null : maxStakeLimit.trim();
    }
}