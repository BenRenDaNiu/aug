package com.taobao.model;

import lombok.NonNull;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
/*@Log4j2*/
@Log
/*@Slf4j
@XSlf4j*/
public class TestUser {
    public static void main(String[] args) {
        User user=new User();
      /*  user.setName("张三");
        user.setAge(18);
        user.setSex("男");
        user.setPhone("123456789");
        user.setAddress("安徽马鞍山aa1");
        user.setCreatetime("2018-08-23");*/
        User user1=new User();
       /* user1.setName("张三");
        user1.setAge(18);
        user1.setSex("男");
        user1.setPhone("123456789");
        user1.setAddress("安徽马鞍山");
        user1.setCreatetime("2018-08-23");*/
        System.out.println(user1);
        System.out.println(user.equals(user1));

        System.out.println(user);
        log.info("测试信息");
    /* log.*/
    /*    user1.builder().name("s").age(18).address("xxx");*/
   /*  User user3=null;

        new TestUser().show(user3);*/

    }
   /* public  void show(@NonNull User user){
     *//*   if (user == null){
            thorow New
        }*//*
        System.out.println(user.getName());

    }*/
}
