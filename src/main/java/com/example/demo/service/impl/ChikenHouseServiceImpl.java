package com.example.demo.service.impl;
import java.util.ArrayList;
import java.util.List;
import com.example.demo.model.CheakenHouse;
import com.example.demo.repositorii.CheakenHouseRep;
import com.example.demo.service.CheakenHouseService;
import org.springframework.stereotype.Service;
import java.lang.Iterable;
@Service
public class ChikenHouseServiceImpl implements CheakenHouseService {
    private CheakenHouseRep cheakenHouseRep;
    @Override
    public List<CheakenHouse> getAllChikenHouses(){
        Iterable<CheakenHouse>irc=cheakenHouseRep.findAll();
        List<CheakenHouse>lCH=new ArrayList<>();
        irc.forEach(lCH::add);
        
        return lCH;
    }

    public ChikenHouseServiceImpl(CheakenHouseRep cheakenHouseRep) {
        super();
        this.cheakenHouseRep = cheakenHouseRep;
    }
    @Override
    public  CheakenHouse saveCH(CheakenHouse cheakenHouse){
        return cheakenHouseRep.save(cheakenHouse);
    }
    @Override
    public CheakenHouse getChikenHouseById(Long id){
        return cheakenHouseRep.findById(id).get();
    }
    @Override
    public CheakenHouse updateChikenHouse(CheakenHouse cheakenHouse){
        return cheakenHouseRep.save(cheakenHouse);
    }
    @Override
    public void deleteChikenHouseById(Long id){
        cheakenHouseRep.deleteById(id);
    }
}
