package com.bat.mengfan.redis_demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class TokenUtil {
    public static String getToken(String userInfo){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("token-");
        System.out.println("454545454545");
        stringBuilder.append("PC-");
        stringBuilder.append(MD5.MD5_SHA(userInfo,"MD5"));
        stringBuilder.append(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        stringBuilder.append(UUID.randomUUID()
                .toString().substring(0,6));
        return stringBuilder.toString();

    }
}
