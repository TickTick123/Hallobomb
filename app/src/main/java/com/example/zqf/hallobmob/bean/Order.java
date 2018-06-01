package com.example.zqf.hallobmob.bean;

import java.io.Serializable;
import java.util.List;

import cn.bmob.v3.BmobObject;

/**
 * Created by zqf on 6/1/2018.hallobmob*/
 public class Order extends BmobObject implements Serializable {
 private List<Good> goods;   //????
 private User user;   //???
 private String address;   //????
 private String state;   //?????????????????
 private String tips;   //??
 private String evaluate;   //??
 private Integer from;   //0:???1????2????3????4???
 private Float sum;//??

 public Float getSum() {
 return sum;
 }

 public void setSum(Float sum) {
 this.sum = sum;
 }

 public List<Good> getGoods() {
 return goods;
 }

 public void setGoods(List<Good> goods) {
 this.goods = goods;
 }

 public User getUser() {
 return user;
 }

 public void setUser(User user) {
 this.user = user;
 }

 public String getAddress() {
 return address;
 }

 public void setAddress(String address) {
 this.address = address;
 }

 public String getState() {
 return state;
 }

 public void setState(String state) {
 this.state = state;
 }

 public String getTips() {
 return tips;
 }

 public void setTips(String tips) {
 this.tips = tips;
 }

 public String getEvaluate() {
 return evaluate;
 }

 public void setEvaluate(String evaluate) {
 this.evaluate = evaluate;
 }

 public Integer getFrom() {
 return from;
 }

 public void setFrom(Integer from) {
 this.from = from;
 }
 }

