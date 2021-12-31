package com.gzmu.lpzyf.crawler;

import com.alibaba.fastjson.JSON;
import com.gzmu.lpzyf.bean.City;
import com.gzmu.lpzyf.bean.crawler.CitySubway;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Component
public class CrawlerGetSubwayData {
    public List<String> getSubwayData(List<City> allCities){
        List<String> result = new LinkedList<>();
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet;
        for (City city : allCities) {
            Date timestamp = new Date();
            httpGet = new HttpGet("http://map.amap.com/service/subway?_"+timestamp.getTime()+"&srhdata="+city.getId()+"_drw_"+city.getNameEn()+".json");
            try {
                CloseableHttpResponse response = httpClient.execute(httpGet);
                if (response.getStatusLine().getStatusCode()==200){
                    HttpEntity entity = response.getEntity();
                    String content = EntityUtils.toString(entity, "utf-8");
                    CitySubway citySubway = JSON.toJavaObject(JSON.parseObject(content),CitySubway.class);
                    System.out.println(citySubway);
                    result.add(JSON.toJSONString(content));
                }else{
                    throw new RuntimeException("数据爬取失败");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
