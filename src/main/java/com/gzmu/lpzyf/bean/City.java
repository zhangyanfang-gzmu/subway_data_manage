package com.gzmu.lpzyf.bean;


public class City {
    private Integer id;
    private String nameCn;
    private String nameEn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", nameCn='" + nameCn + '\'' +
                ", nameEn='" + nameEn + '\'' +
                '}';
    }

    public City(Integer id, String nameCn, String nameEn) {
        this.id = id;
        this.nameCn = nameCn;
        this.nameEn = nameEn;
    }

    public City() {
    }
}
