package com.feri.juhe.joker.util;/**
 * @author Feri
 */

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *@program: Joker
 *@description:
 *@author: Feri
 *@create: 2019-08-06 16:25
 */
public class HttpUtil {
    public static String getStr(String url){
        try {
            //1、创建连接对象
            URL myUrl=new URL(url);
            //2、获取连接对象
            HttpURLConnection huc=(HttpURLConnection)myUrl.openConnection();
            //3、设置请求信息
            huc.setRequestMethod("GET");
            huc.setConnectTimeout(5000);
            //4、发起请求
            huc.connect();
            //5、验证响应状态码
            if(huc.getResponseCode()==200){
                //6、获取响应接口
                InputStream is=huc.getInputStream();
                byte[] data=new byte[1024];
                int len;
                StringBuffer buffer=new StringBuffer();
                while ((len=is.read(data))!=-1){
                    buffer.append(new String(data,0,len));
                }
                //7、销毁
                is.close();
                huc.disconnect();
                return buffer.toString();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
