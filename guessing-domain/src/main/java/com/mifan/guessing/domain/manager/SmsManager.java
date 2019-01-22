package com.mifan.guessing.domain.manager;

import com.cloopen.rest.sdk.CCPRestSDK;
import tv.zhangyu.util.JacksonUtil;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * <p>Title:容联国内短信</p>
 * <p>Description:暂无。</p>
 * @author hongwei.zhang
 * @version 2016-1-12 12:36:03
 */
public class SmsManager {

    private static CCPRestSDK restAPI = new CCPRestSDK();

    
    private static final Logger LOGGER = Logger.getLogger(SmsManager.class.getSimpleName());
    
    static {
        restAPI.init("sandboxapp.cloopen.com", "8883");// 初始化服务器地址和端口，格式如下，服务器地址不需要写https://
        restAPI.setAccount("8a48b5514c982bdb014c98da425c0132", "d8218b57820442139bb406b218def354");// 初始化主帐号名称和主帐号令牌
        restAPI.setAppId("8a48b5514c9d9c05014ca23f9555039a");// 初始化应用ID
    }



    //发送短信
    public static boolean sendSms(String mobile,String content){
        boolean flag = false;
        HashMap<String, Object> result = null;
        try {
            result = restAPI.sendSMS(mobile, content);
            if ("000000".equals(result.get("statusCode"))) {
                flag = true;
            } else {
                flag = false;
            }
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        LOGGER.log(Level.INFO, "sendSms flag:{0}, mobile:{1}, result:{2}", new Object[]{flag, mobile, JacksonUtil.toJson(result)});
        return flag;
    }


}
