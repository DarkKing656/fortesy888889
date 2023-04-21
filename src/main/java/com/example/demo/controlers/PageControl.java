package com.example.demo.controlers;


import com.example.demo.model.Cheaken;
import com.example.demo.model.CheakenHouse;
import com.example.demo.repositorii.CheakenHouseRep;
//import com.example.demo.repositorii.ChickenRep;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
@Api(description ="Контролер для всех страниц 'Курятников'")
public class PageControl {
    @Autowired
    private com.example.demo.repositorii.CheakenHouseRep CheakenHouseRep;
    @GetMapping("/gcheak")
    @ApiOperation("Контолер для отображение Страницы 'Курятник' c использованием базы данных ")
    public String home(Model model) {

    Iterable<CheakenHouse> CheakenHouseNum= CheakenHouseRep.findAll();
    model.addAttribute("CheakenHo",CheakenHouseNum);
        return "cheakenhouse";
    }
    @GetMapping("/gcheak/add")
    @ApiOperation("Контролер для отобрадение страницы 'Добавления Курятника'")
    public String chekadd(Model model) {
        return "cheakenhouseadd";
    }
    @PostMapping("/gcheak/add")
    @ApiOperation("Контролер для считывание инфы со страницы 'Добавления Курятника'")
    public String chekrepadd(@RequestParam String name, Model model) {
        CheakenHouse cheakenHouse = new CheakenHouse(name);
        CheakenHouseRep.save(cheakenHouse);
        return "redirect:/";
    }
    @GetMapping("/gcheak/{id}")
    @ApiOperation("Контролер для отображения динамической стриницы для каждого курятника")
    public String chekdetails(@PathVariable(value = "id") long id, Model model) {
        if(!CheakenHouseRep.existsById(id)){
            return "redirect:/";
        }
        Optional<CheakenHouse> cheakenHouse=CheakenHouseRep.findById(id);
        ArrayList<CheakenHouse> res= new ArrayList<>();
        cheakenHouse.ifPresent(res :: add);
        model.addAttribute("cheakenHouse", res);
        return "cheakenhouse-details";
    }
    @GetMapping("/gcheak/{id}/edit")
    @ApiOperation("Контролер для отображения страницы изменения информации внутри строчки БД")
    public String chekedit(@PathVariable(value = "id") long id, Model model) {
        if(!CheakenHouseRep.existsById(id)){
            return "redirect:/";
        }
        Optional<CheakenHouse> cheakenHouse=CheakenHouseRep.findById(id);
        ArrayList<CheakenHouse> res= new ArrayList<>();
        cheakenHouse.ifPresent(res :: add);
        model.addAttribute("cheakenHouse", res);
        return "cheakenhouse-edit";
    }
    @PostMapping("/gcheak/{id}/edit")
    @ApiOperation("Контролер для  считывания инфы со страницы изменения информации внутри строчки БД")
    public String chekedupdate(@RequestParam String name,@PathVariable(value="id")long id, Model model) {
       CheakenHouse cheakrt=CheakenHouseRep.findById(id).orElseThrow();
       cheakrt.setName(name);
       CheakenHouseRep.save(cheakrt);
        return "redirect:/";
    }
    @PostMapping("/gcheak/{id}/remove")
    @ApiOperation("Контролер для удаления строчки из БД")
    public String chekeremove(@PathVariable(value="id")long id, Model model) {
        CheakenHouse cheakrt=CheakenHouseRep.findById(id).orElseThrow();
        CheakenHouseRep.delete(cheakrt);
        return "redirect:/";
    }

}
