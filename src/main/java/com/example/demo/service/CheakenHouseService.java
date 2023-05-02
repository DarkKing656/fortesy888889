package com.example.demo.service;

import com.example.demo.model.CheakenHouse;

import java.util.List;

public interface CheakenHouseService {
    List<CheakenHouse> getAllChikenHouses();
    CheakenHouse saveCH(CheakenHouse cheakenHouse);
    CheakenHouse getChikenHouseById(Long id);
    CheakenHouse updateChikenHouse(CheakenHouse cheakenHouse);
    void deleteChikenHouseById(Long id);
}
