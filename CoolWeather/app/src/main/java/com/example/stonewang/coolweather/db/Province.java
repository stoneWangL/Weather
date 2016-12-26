package com.example.stonewang.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by stoneWang on 2016/12/26.
 */

public class Province extends DataSupport {
    private int id;//每个实体都有的字段名
    private String provinceName;//省名
    private int provinceCode;//省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
