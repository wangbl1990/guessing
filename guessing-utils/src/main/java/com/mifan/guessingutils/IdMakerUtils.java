package com.mifan.guessingutils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class IdMakerUtils implements Serializable{

    public static long workerId=0;

    public static long dataCenterId=0;

    //存放不同表或实体对应的id生成器，（生成器生成id是线程同步安全的，如果多表共用一个生成器可能会降低性能）
    private static Map<String,SnowflakeIdMaker> idWorkerMap=new HashMap<String,SnowflakeIdMaker>();

    /**
     * 全局公用的id，如果支付订单，在微信和支付宝支付的时候，需要保证订单号唯一。
     *
     * @return
     */
    public static String getOrderId( ){
        return getId("ARIVN_ORDER");
    }

    /**
     * 根据实体名或表明，生成id
     *
     * @param type
     * @return
     */
    public static String getId(String type) {
        SnowflakeIdMaker idWorker = null;
        if (!idWorkerMap.containsKey(type)) {
            //安全创建id生成器
            synchronized (idWorkerMap) {
                if (!idWorkerMap.containsKey(type)) {
                    idWorker = new SnowflakeIdMaker(dataCenterId, workerId);
                    idWorkerMap.put(type, idWorker);
                } else {
                    idWorker = idWorkerMap.get(type);
                }
            }
        } else {
            idWorker = idWorkerMap.get(type);
        }
        //生成id
        return idWorker.nextId() + "";
    }

    /**
     * 重载
     *
     * @param classType
     * @return
     */
    public static String getId(Class classType){
        String type=classType.getSimpleName();
        return getId(type);
    }
}
