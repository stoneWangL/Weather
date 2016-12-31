package com.example.stonewang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by stoneWang on 2016/12/28.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
