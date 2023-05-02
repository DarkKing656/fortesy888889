package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cheaken {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long idofcheakhouse;
    private String name;
    private int age;

    public Long getC_id() {
        return id;
    }

    public void setC_id(Long c_id) {
        id = c_id;
    }

    public Cheaken() {
    }

    public Cheaken(int age,Long idofcheakhouse,String name){
        this.age=age;
        this.idofcheakhouse=idofcheakhouse;
        this.name=name;
    }

    public Long getIdofcheakhouse() {
        return idofcheakhouse;
    }

    public void setIdofcheakhouse(Long idofcheakhouse) {
        this.idofcheakhouse = idofcheakhouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}