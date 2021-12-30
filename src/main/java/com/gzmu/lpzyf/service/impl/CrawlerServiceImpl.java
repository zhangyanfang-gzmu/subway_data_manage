package com.gzmu.lpzyf.service.impl;

import com.gzmu.lpzyf.bean.City;
import com.gzmu.lpzyf.crawler.CrawlerGetSubwayData;
import com.gzmu.lpzyf.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrawlerServiceImpl implements CrawlerService{
    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private CrawlerGetSubwayData crawlerGetSubwayData;

    @Override
    public List<String> getSubwayData() {
        List<City> allCities = cityMapper.findAll();
        List<String> subwayData = crawlerGetSubwayData.getSubwayData(allCities);
        return subwayData;
    }
}
