package com.mifan.guessing.domain;

import com.alibaba.fastjson.JSONObject;
import com.mifan.guessing.dao.mapper.MarketMapper;
import com.mifan.guessing.dao.mapper.SelectionMapper;
import com.mifan.guessing.dao.model.Selection;
import com.mifan.guessing.dao.model.SelectionExample;
import com.mifan.guessing.domain.manager.RollingBallManager;
import com.mifan.guessing.domain.model.EventMarket;
import com.mifan.guessingapi.exception.GuessingErrorCode;
import com.mifan.guessingapi.exception.GuessingRunTimeException;
import com.mifan.guessingapi.request.market.MarketChangeRequest;
import com.mifan.guessingapi.request.market.MarketChangeSelectionRequest;
import com.mifan.guessingapi.request.market.MarketListRequest;
import com.mifan.guessingapi.response.market.MarketListResponse;
import com.mifan.guessingutils.BeanMapper;
import com.mifan.guessingutils.SocketUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.mifan.guessing.domain.manager.RollingBallRequestUrl.eventMarkets;

/**
 * @auther wangbinlei
 * @create 2018/12/4
 */
@Component
public class MarketDomain {

    private static Logger logger = LogManager.getLogger( MarketDomain.class );
    @Autowired
    private SelectionMapper selectionMapper;

    /**
     * 市场列表
     * @param marketListRequest
     * @return
     */
    public String marketList(MarketListRequest marketListRequest) {

        String resultData = "";
        String dataStr = SocketUtils.getData(marketListRequest.getEnvetId());
        JSONObject jsonObject = JSONObject.parseObject(dataStr);
        if("0".equals(jsonObject.get("errno").toString())){
            resultData = (String)jsonObject.get("data");
        }else{
            logger.error("赛事列表查询失败"+dataStr);
            throw new GuessingRunTimeException(GuessingErrorCode.SYSTEM_ERROR);
        }
        return resultData;
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
