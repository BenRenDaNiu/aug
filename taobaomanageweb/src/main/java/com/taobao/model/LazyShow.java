package com.taobao.model;

import lombok.Getter;

public class LazyShow {
@Getter(lazy=true)    private  final  double[] show=test();
    private double[] test(){
        double[] result =new double[1000];
        for (int i = 0; i < result.length; i++) {
            result[i]=Math.asin(i);
        }
        return result;
    }
}
