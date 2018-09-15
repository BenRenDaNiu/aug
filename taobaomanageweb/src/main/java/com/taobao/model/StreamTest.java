package com.taobao.model;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.*;

public class StreamTest {
    @SneakyThrows//自动接收异常减产
    public static void main(String[] args)  {
       /* InputStream in=null;
        OutputStream out=null;*/
        /*try {*/
     @Cleanup InputStream in=new FileInputStream("F:/test/test.txt");
    @Cleanup  OutputStream out=new FileOutputStream("F:/test/ttt.txt");
            byte[] b=new byte[1024];
            while (true){
                int count =in.read(b);
                if (count==-1)break;
                out.write(b,0,count);

            }

      /*  }*//* catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*//* finally{
            try {
                if(in!=null)
                in.close();
                if (out!=null)
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }*/
    }
}
