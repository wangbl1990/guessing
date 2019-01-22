package com.mifan.guessing.domain.model;

public class MarketSelection {

    private String selectionId;

    private String backOdds;

    private String lastBackOdds;

    private String maxStakeLimit;

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