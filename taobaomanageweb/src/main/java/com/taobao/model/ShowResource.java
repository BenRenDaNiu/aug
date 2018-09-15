package com.taobao.model;

import lombok.Synchronized;

public class ShowResource {
    private  final  Object readLock=new Object();
    @Synchronized
    public static  void show(){
        System.out.println("哈哈哈哈" +
                "");

    }
    @Synchronized
    public static  void read() {
        System.out.println("个额呵呵巨额经济而可口可乐" +
                "");
    }
    }
