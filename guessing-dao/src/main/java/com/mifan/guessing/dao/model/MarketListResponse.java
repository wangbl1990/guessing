package com.mifan.guessing.dao.model;

public class MarketListResponse {
    private String id;

    private String marketId;

    private String ruleType;

    private String periodType;

    private String periodValue;

    private String periodBegin;

    private String periodEnd;

    private String quotaAppetite;

    private String bettingDelay;

    private String openResult;

    private String verifyResult;

    private String settledResult;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId == null ? null : marketId.trim();
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType == null ? null : ruleType.trim();
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType == null ? null : periodType.trim();
    }

    public String getPeriodValue() {
        return periodValue;
    }

    public void setPeriodValue(String periodValue) {
        this.periodValue = periodValue == null ? null : periodValue.trim();
    }

    public String getPeriodBegin() {
        return periodBegin;
    }

    public void setPeriodBegin(String periodBegin) {
        this.periodBegin = periodBegin == null ? null : periodBegin.trim();
    }

    public String getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd == null ? null : periodEnd.trim();
    }

    public String getQuotaAppetite() {
        return quotaAppetite;
    }

    public void setQuotaAppetite(String quotaAppetite) {
        this.quotaAppetite = quotaAppetite == null ? null : quotaAppetite.trim();
    }

    public String getBettingDelay() {
        return bettingDelay;
    }

    public void setBettingDelay(String bettingDelay) {
        this.bettingDelay = bettingDelay == null ? null : bettingDelay.trim();
    }

    public String getOpenResult() {
        return openResult;
    }

    public void setOpenResult(String openResult) {
        this.openResult = openResult == null ? null : openResult.trim();
    }

    public String getVerifyResult() {
        return verifyResult;
    }

    public void setVerifyResult(String verifyResult) {
        this.verifyResult = verifyResult == null ? null : verifyResult.trim();
    }

    public String getSettledResult() {
        return settledResult;
    }

    public void setSettledResult(String settledResult) {
        this.settledResult = settledResult == null ? null : settledResult.trim();
    }
}