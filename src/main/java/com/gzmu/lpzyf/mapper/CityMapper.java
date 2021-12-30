package com.gzmu.lpzyf.mapper;

import com.gzmu.lpzyf.bean.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CityMapper {
    List<City> findAll();
    void insert(City city);
}
