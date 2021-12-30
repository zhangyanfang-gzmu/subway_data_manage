package com.gzmu.lpzyf.bean.crawler;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CitySubway {
    //城市名
    private String s;
    //城市id
    private String i;

    //线路
    private List<SubwayLine> l;
}
