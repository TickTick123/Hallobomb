package com.example.zqf.hallobmob.bean;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;

/**
 * Created by zqf on 6/1/2018.
 */

public class User extends BmobUser {
    // ??????????
    // private String objectid;
    // private String username;??????????
    // private String password;
    // private String mobilePhoneNumber  ??????????
    // private String email;??????????
    private String nicName;             //??
    private List<String> address=new ArrayList<>();           //????
    private String state; 		     // ??
    private BmobFile picUser; 	// ??
    private String sex;          //??

    public String getSex() { return sex; }

    public void setSex(String sex) { this.sex = sex;  }

    public String getnicName() { return nicName; }

    public void setNicName(String nicName) { this.nicName = nicName; }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) { this.address = address; }

    public String getState() {
        return state;
    }

    public void setState(String state) { this.state = state; }

    public BmobFile getPicUser() { return picUser; }

    public void setPicUser(BmobFile picUser) {
        this.picUser = picUser;
    }

}
