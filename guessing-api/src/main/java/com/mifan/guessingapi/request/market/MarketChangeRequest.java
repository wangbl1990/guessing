package com.mifan.guessingapi.request.market;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
