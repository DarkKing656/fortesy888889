package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cheaken {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long C_id;
    private Long idofcheakhouse;
    private String Cname;
    private int age;

    public Cheaken() {
    }

    public Cheaken(int age,Long idofcheakhouse,String name){
        this.age=age;
        this.idofcheakhouse=idofcheakhouse;
        this.Cname=name;
    }

    public Long getIdofcheakhouse() {
        return idofcheakhouse;
    }

    public void setIdofcheakhouse(Long idofcheakhouse) {
        this.idofcheakhouse = idofcheakhouse;
    }

    public String getName() {
        return Cname;
    }

    public void setName(String name) {
        this.Cname = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}