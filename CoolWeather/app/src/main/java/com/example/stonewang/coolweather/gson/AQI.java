package com.example.stonewang.coolweather.gson;

/**
 * Created by stoneWang on 2016/12/28.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
