package com.mifan.guessingapi.request.market;

import java.io.Serializable;
import java.util.List;

public class MarketChangeRequest implements Serializable {

    private static final long serialVersionUID = 1L;

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
    private List<MarketChangeSelectionRequest> MarketChangeSelectionRequestList;

    public List<MarketChangeSelectionRequest> getMarketChangeSelectionRequestList() {
        return MarketChangeSelectionRequestList;
    }

    public void setMarketChangeSelectionRequestList(List<MarketChangeSelectionRequest> marketChangeSelectionRequestList) {
        MarketChangeSelectionRequestList = marketChangeSelectionRequestList;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public String getPeriodValue() {
        return periodValue;
    }

    public void setPeriodValue(String periodValue) {
        this.periodValue = periodValue;
    }

    public String getPeriodBegin() {
        return periodBegin;
    }

    public void setPeriodBegin(String periodBegin) {
        this.periodBegin = periodBegin;
    }

    public String getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }

    public String getQuotaAppetite() {
        return quotaAppetite;
    }

    public void setQuotaAppetite(String quotaAppetite) {
        this.quotaAppetite = quotaAppetite;
    }

    public String getBettingDelay() {
        return bettingDelay;
    }

    public void setBettingDelay(String bettingDelay) {
        this.bettingDelay = bettingDelay;
    }

    public String getOpenResult() {
        return openResult;
    }

    public void setOpenResult(String openResult) {
        this.openResult = openResult;
    }

    public String getVerifyResult() {
        return verifyResult;
    }

    public void setVerifyResult(String verifyResult) {
        this.verifyResult = verifyResult;
    }

    public String getSettledResult() {
        return settledResult;
    }

    public void setSettledResult(String settledResult) {
        this.settledResult = settledResult;
    }
}
