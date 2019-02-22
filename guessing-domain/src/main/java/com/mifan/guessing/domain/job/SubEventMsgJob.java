package com.mifan.guessing.domain.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.mifan.guessing.domain.EventDomain;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * 订单关单定时
 */
@Configuration
public class SubEventMsgJob implements SimpleJob {

    private static Logger logger = LogManager.getLogger( SubEventMsgJob.class );

    @Autowired
    private EventDomain eventDomain;

    @Override
    public void execute(ShardingContext shardingContext) {
        logger.info("订阅短信定时start");
        eventDomain.sendSubscribeMsg();
    }
}
