package com.mywebapp.webapp.util;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

public class ReadProperties {
    public String getUrlValue(String urlName) {
        String url = null;
        Properties prop = new Properties();
        try {
            ClassLoader classLoader = ReadProperties.class.getClassLoader();// 读取属性文件xxxxx.properties
            InputStream in = classLoader.getResourceAsStream("application.properties");
            prop.load(in); /// 加载属性列表
            Iterator<String> it = prop.stringPropertyNames().iterator();
            while (it.hasNext()) {
                if (it.next().equals(urlName)) {
                    url = prop.getProperty(urlName);
                }
            }
            in.close();
        } catch (Exception e) {

        }
        return url;
    }
}
