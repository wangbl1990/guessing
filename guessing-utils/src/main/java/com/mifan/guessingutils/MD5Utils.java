package com.mifan.guessingutils;

import java.security.MessageDigest;

/**
 * @Author:Starry
 * @Description:
 * @Date:Created in 9:46 2018/4/13
 * Modified By:
 */
public class MD5Utils {

    private static final String hexDigIts[] = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};

    private static final String charsetname = "UTF-8";
    /**
     * MD5加密
     * @param origin 字符
     * @return
     */
    public static String encode(String origin){
        String resultString = null;
        try{
            origin = new StringBuilder( origin ).reverse().toString();
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(resultString.getBytes("UTF-8"));
            resultString = byteArrayToHexString(md.digest());
        }catch (Exception e){
        }
        return resultString;
    }


    public static String byteArrayToHexString(byte b[]){
        StringBuffer resultSb = new StringBuffer();
        for(int i = 0; i < b.length; i++){
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    public static String byteToHexString(byte b){
        int n = b;
        if(n < 0){
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigIts[d1] + hexDigIts[d2];
    }
}
