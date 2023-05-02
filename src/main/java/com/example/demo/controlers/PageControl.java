package com.example.demo.controlers;


import com.example.demo.model.Cheaken;
import com.example.demo.model.CheakenHouse;
import com.example.demo.repositorii.CheakenHouseRep;
//import com.example.demo.repositorii.ChickenRep;
import com.example.demo.repositorii.ChickenRep;
import com.example.demo.service.CheakenHouseService;
import com.example.demo.service.ChickenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller
@Api(description ="Контролер для всех страниц 'Курятников'")
public class PageControl {
    private CheakenHouseService cheakenHouseService;
    private ChickenService chickenService;
    @Autowired
    private com.example.demo.repositorii.CheakenHouseRep CheakenHouseRep;
    private com.example.demo.repositorii.ChickenRep ChickenRep;
    public PageControl(CheakenHouseService cheakenHouseService){
        super();
        this.cheakenHouseService=cheakenHouseService;
    }
    @GetMapping("/gcheak")
    @ApiOperation("Контолер для отображение Страницы 'Курятник' c использованием базы данных ")
    public String listCheakenHouses(Model model) {
        model.addAttribute("CheakenHo",cheakenHouseService.getAllChikenHouses());
        return "cheakenhouse";
    }
    @GetMapping("/gcheak/add")
    @ApiOperation("Контролер для отобрадение страницы 'Добавления Курятника'")
    public String chekadd(Model model) {
        CheakenHouse cheakenhouse = new CheakenHouse();
        model.addAttribute("cheakenhouse",cheakenhouse);
        return "cheakenhouseadd";
    }
    @PostMapping("/gcheak/add")
    @ApiOperation("Контролер для считывание инфы со страницы 'Добавления Курятника'")
    public String chekrepadd(@ModelAttribute("cheakenhouse") CheakenHouse cheakenHouse) {

        cheakenHouseService.saveCH(cheakenHouse);
        return "redirect:/";
    }
    @GetMapping("/gcheak/{id}")
    @ApiOperation("Контролер для отображения динамической стриницы для каждого курятника")
    public String chekdetails(@PathVariable(value = "id") long id, Model model) {
        if(!CheakenHouseRep.existsById(id)){
            return "redirect:/";
        }


        model.addAttribute("cheakenHouse", cheakenHouseService.getChikenHouseById(id));
        return "cheakenhouse-details";
    }
    @GetMapping("/gcheak/{id}/edit")
    @ApiOperation("Контролер для отображения страницы изменения информации внутри строчки БД")
    public String chekedit(@PathVariable(value = "id") long id, Model model) {
        if(!CheakenHouseRep.existsById(id)){
            return "redirect:/";
        }

        model.addAttribute("cheakenHouse", cheakenHouseService.getChikenHouseById(id));
        return "cheakenhouse-edit";
    }
    @PostMapping("/gcheak/{id}/edit")
    @ApiOperation("Контролер для  считывания инфы со страницы изменения информации внутри строчки БД")
    public String chekedupdate(@ModelAttribute("student") CheakenHouse cheakenHouse,@PathVariable(value="id")long id, Model model) {
       CheakenHouse existingCH=cheakenHouseService.getChikenHouseById(id);
       existingCH.setId(id);
       existingCH.setName(cheakenHouse.getName());
       cheakenHouseService.updateChikenHouse(existingCH);
        return "redirect:/";
    }
    @PostMapping("/gcheak/{id}/remove")
    @ApiOperation("Контролер для удаления строчки из БД")
    public String chekeremove(@PathVariable(value="id")long id, Model model) {
        cheakenHouseService.deleteChikenHouseById(id);
        return "redirect:/";
    }

}
