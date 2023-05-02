package com.example.demo.service.impl;

import com.example.demo.model.Cheaken;
import com.example.demo.model.CheakenHouse;
import com.example.demo.repositorii.ChickenRep;
import com.example.demo.service.ChickenService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChikenServiceImpl implements ChickenService {
    private ChickenRep chickenRep;

    public ChikenServiceImpl(ChickenRep chickenRep) {
        this.chickenRep = chickenRep;
    }

    @Override
    public List<Cheaken> getAllChikens(){
        Iterable<Cheaken>irc=chickenRep.findAll();
        List<Cheaken>lCH=new ArrayList<>();
        irc.forEach(lCH::add);

        return lCH;
    }
    @Override
    public  Cheaken saveC(Cheaken cheaken){
        return chickenRep.save(cheaken);
    }
    @Override
    public Cheaken getChikenById(Long id){
        return chickenRep.findById(id).get();
    }
    @Override
    public Cheaken updateChiken(Cheaken cheaken){
        return chickenRep.save(cheaken);
    }
    @Override
    public void deleteChikenById(Long id){
        chickenRep.deleteById(id);
    }
}


