package com.example.demo.controlers;

//import com.example.demo.model.Cheaken;
import com.example.demo.model.Cheaken;
import com.example.demo.model.CheakenHouse;
import com.example.demo.service.ChickenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(description ="Контролер для всех страниц 'Куриц'")
public class SecondPageControl {
    private ChickenService chickenService;
    @Autowired
    private com.example.demo.repositorii.ChickenRep ChickenRep;
    public SecondPageControl(ChickenService chickenService){
        super();
        this.chickenService=chickenService;
    }

    @GetMapping("/gpagecheak")
    @ApiOperation("Контролер для отображения страницы 'Курицы'")
    public String Fearures(Model model){
        model.addAttribute("Cheaken",chickenService.getAllChikens());

        return "cheaken";
    }
    @GetMapping("/gpagecheak/add")
    @ApiOperation(" Контролер для добавления куриц")
    public String ChickenAdd(Model model){
        Cheaken cheaken = new Cheaken();
        model.addAttribute("cheaken",cheaken);
        return "cheakenadd";
    }
    @PostMapping("/gpagecheak/add")
    public String cheakepadd(@ModelAttribute("cheaken") Cheaken cheaken) {

        chickenService.saveC(cheaken);
        return "redirect:/";
    }

    @GetMapping("/gpagecheak/{idofcheakhouse}/{id}")
    @ApiOperation("Контролер для отображения динамической стриницы для каждого курятника")
    public String cheksdetails(@PathVariable(value = "id") long id, @PathVariable(value = "idofcheakhouse") long idofcheakhouse, Model model) {
        if (!ChickenRep.existsById(id)) {
            return "redirect:/";
        }
        model.addAttribute("cheaken", chickenService.getChikenById(id));
        model.addAttribute("idofcheakhouse", idofcheakhouse);
        return "chiken-details";
    }

    }


