package com.example.zqf.hallobmob.bean;

import java.io.Serializable;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;

/**
 * Created by zqf on 6/1/2018.
 */

public class Good extends BmobObject implements Serializable {
    private String name;  //????
    private String type;  //????
    private Float price;  //????
    private String describe;  //????
    private BmobFile PicGood;  //????
    private Integer number;       //??
    private String masterneme;  //????????(?????????)
    private String masterphone;  //?????????(?????????)
    private String masterQQ;  //??????QQ(?????????)


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public BmobFile getPicGood() {
        return PicGood;
    }

    public void setPicGood(BmobFile picGood) {
        PicGood = picGood;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getMasterneme() {
        return masterneme;
    }

    public void setMasterneme(String masterneme) {
        this.masterneme = masterneme;
    }

    public String getMasterphone() {
        return masterphone;
    }

    public void setMasterphone(String masterphone) {
        this.masterphone = masterphone;
    }

    public String getMasterQQ() {
        return masterQQ;
    }

    public void setMasterQQ(String masterQQ) {
        this.masterQQ = masterQQ;
    }
}
