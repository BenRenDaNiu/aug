package com.taobao.model;

import lombok.*;

/*@EqualsAndHashCode(exclude = {"name","address"})
@Getter
@Setter*/

//@ToString(exclude = {"name","sex"})

/*@Data*/
/*@Builder*/
/*@ToString(exclude = "name")*/

/*
@NoArgsConstructor //用于生成一个无参构造方法
@RequiredArgsConstructor //生成一个包含了被@NotNull表示的变量的构造
// 方法，同样可以设置生成构造方法的权限，使用access参数进行设置
@AllArgsConstructor //生成一个包含所有变量，同时如果变量使用
// 了@NotNull，会进行是否为空的校验
*/
/*@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)*/

//@Value
//相当于finally只提供

public class User {

     private  String name;
  private  int age;//指定访问权限
    private  String sex;
           private  String phone;
           private  transient String address;
           private  String createtime;


}
