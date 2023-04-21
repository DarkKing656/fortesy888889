package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.util.ArrayList;
import java.util.List;



@Entity
public class CheakenHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
   



    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public CheakenHouse(String name){this.name=name;}
    public CheakenHouse(){};


}
