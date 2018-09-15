package com.taobao.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class TestJAXB2 {

    public static void main(String[] args) {
        File xmlFile = new File("F:/test/weather1.xml");
        JAXBContext context;
        try {
            context = JAXBContext.newInstance(Root.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Root root = (Root) unmarshaller.unmarshal(xmlFile);
            Root root1 = (Root) unmarshaller.unmarshal(xmlFile);

            System.out.println(root);
            System.out.println(root.equals(root1));
        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }
}
