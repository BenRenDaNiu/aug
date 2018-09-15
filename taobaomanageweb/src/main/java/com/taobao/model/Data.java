package com.taobao.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement(name="data")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Data {

        private String shidu;
        private String pm25;
        private String pm10;
        private String quality;
        private String wendu;
        private String ganmao;
        //  private String yesterday;//yesterdayBean yesterday
        Yesterday yesterday;
        //List《YESTERDABEA》  FORCAST
        List<Yesterday> forecast;
}
