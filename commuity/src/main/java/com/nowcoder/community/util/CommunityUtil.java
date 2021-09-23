package com.nowcoder.community.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;


import org.springframework.util.DigestUtils;

import java.util.Map;
import java.util.UUID;

public class CommunityUtil {

    // 生成随机字符串
    public static String generateUUID ()  {
        return UUID.randomUUID().toString().replaceAll("-","");

    }

    //  MD5加密
    //  hello   ->  abc123  只能加密无法解密，且只能变成这串字符
    //  hello   +   3e4a8 ->    abc123ef456bc   加上salt，让字符串难以破解
    public  static   String  md5(String key) {
            if(StringUtils.isBlank(key))    {
                return null;
            }
            return DigestUtils.md5DigestAsHex(key.getBytes());
    }

    public static String getJSONString(int code, String msg) {
        return getJSONString(code, msg, null);
    }

    public static String getJSONString(int code) {
        return getJSONString(code, null, null);
    }
    public static String getJSONString(int code, String msg, Map<String, Object> map) {
        JSONObject json = new JSONObject();
        json.put("code", code);
        json.put("msg", msg);
        if (map != null) {
            for (String key : map.keySet()) {
                json.put(key, map.get(key));
            }
        }
        return json.toJSONString();
    }


}
