package com.console.log.console.log.models;


import com.console.log.console.log.enums.CenterType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Center {
    @Id
    private Long centerId;
    private Integer cityCode;
    private Integer regionCode;
    private CenterType centerType;
    private Double opArea;
    private String name;
    @OneToMany(mappedBy = "center")
    private List<WeeklyDemand> weeklyDemandList;

    public Center() {
    }

    public Center(Long centerId, Integer cityCode, Integer regionCode, CenterType centerType, Double opArea, String name) {
        this.centerId = centerId;
        this.cityCode = cityCode;
        this.regionCode = regionCode;
        this.centerType = centerType;
        this.opArea = opArea;
        this.name = name;
    }

    public Long getCenterId() {
        return centerId;
    }

    public void setCenterId(Long centerId) {
        this.centerId = centerId;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(Integer regionCode) {
        this.regionCode = regionCode;
    }

    public CenterType getCenterType() {
        return centerType;
    }

    public void setCenterType(CenterType centerType) {
        this.centerType = centerType;
    }

    public Double getOpArea() {
        return opArea;
    }

    public void setOpArea(Double opArea) {
        this.opArea = opArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
