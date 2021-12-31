package com.gzmu.lpzyf.bean;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MetroStation {
    //站点id
    private String id;
    //站点名
    private String name;
    //站点英文名
    private String nameEn;
    //站点经度
    private String longitude;
    //站点伟度
    private String latitude;
}
