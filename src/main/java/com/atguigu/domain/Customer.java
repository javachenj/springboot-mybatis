package com.atguigu.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    @Id//声明主键字段
    @GeneratedValue(strategy = GenerationType.IDENTITY)//声明主键的生成方式
    private Integer id;//OID,对象在内存中的id，具有唯一性，与表里的数据id进行对应
   // @Column(name = "username")
    private String username;
   // @Column(name = "name")
    private String name;
  // @Column(name = "password")
    private String password;
   // private  Integer age;
    public Customer(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
