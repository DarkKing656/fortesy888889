package com.example.demo.service;

import com.example.demo.model.Cheaken;
import com.example.demo.model.CheakenHouse;

import java.util.List;

public interface ChickenService {
    List<Cheaken> getAllChikens();
    Cheaken saveC(Cheaken cheaken);
    Cheaken getChikenById(Long id);
    Cheaken updateChiken(Cheaken cheaken);
    void deleteChikenById(Long id);

}
