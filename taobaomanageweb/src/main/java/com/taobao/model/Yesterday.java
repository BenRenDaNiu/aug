package com.taobao.model;

import lombok.*;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="yesterday")
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Yesterday {

        private String date;
        private String sunrise;
        private String high;
        private String low;
        private String sunset;
        private String aqi;
        private String fx;
        private String fl;
        private String type;
        private String notice;
}
