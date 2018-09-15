package com.taobao.model;

import lombok.*;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
@Getter
@Setter
@ToString//(exclude = {"message","status"})
@EqualsAndHashCode//(exclude = "message")如果写了exclude=message，那么当message不相等，其他属性相等时，root和root1相等。
@XmlRootElement(name="weather")
public class Root {
    private  String date;
    private String message;
    private  String status;
    private  String city;
    private  String count;
    //   private  String data;
//DataBean data;
    com.taobao.model.Data data;
}
