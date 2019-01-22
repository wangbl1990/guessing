package com.mifan.guessing.domain;

import com.mifan.guessing.dao.mapper.MarketMapper;
import com.mifan.guessing.dao.mapper.SelectionMapper;
import com.mifan.guessing.dao.model.Selection;
import com.mifan.guessing.dao.model.SelectionExample;
import com.mifan.guessing.domain.manager.RollingBallManager;
import com.mifan.guessing.domain.model.EventMarket;
import com.mifan.guessingapi.request.market.MarketChangeRequest;
import com.mifan.guessingapi.request.market.MarketChangeSelectionRequest;
import com.mifan.guessingapi.request.market.MarketListRequest;
import com.mifan.guessingapi.response.market.MarketListResponse;
import com.mifan.guessingutils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Component
public class MarketDomain {

    @Autowired
    private MarketMapper marketMapper;
    @Autowired
    private RollingBallManager rollingBallManager;
    @Autowired
    private SelectionMapper selectionMapper;

    /**
     * 市场列表
     * @param marketListRequest
     * @return
     */
    public List<MarketListResponse> marketList(MarketListRequest marketListRequest) {
        List<EventMarket> eventMarkets = rollingBallManager.eventMarket(marketListRequest.getEnvetId());
        return BeanMapper.mapList(eventMarkets,MarketListResponse.class);
    }


    /**
     * 更新 市场赔率变化
     * @param marketChangeRequest
     */
    public void EventMarketsChanged(MarketChangeRequest marketChangeRequest){

        List<MarketChangeSelectionRequest> list = marketChangeRequest.getMarketChangeSelectionRequestList();
        for (MarketChangeSelectionRequest selectionRequest:list){
            SelectionExample example = new SelectionExample();
            example.createCriteria().andSelectionIdEqualTo(selectionRequest.getSelectionId());
            Selection selection = new Selection();
            selection.setBackOdds(selectionRequest.getBackOdds());
            selection.setLastBackOdds(selectionRequest.getLastBackOdds());
            selection.setMaxStakeLimit(selectionRequest.getMaxStakeLimit());
            selectionMapper.updateByExample(selection,example);
        }
    }
}
