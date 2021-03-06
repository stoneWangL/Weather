package com.example.stonewang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by stoneWang on 2016/12/28.
 */

public class Weather {
    public String status;//成功返回ok,失败返回具体原因
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
