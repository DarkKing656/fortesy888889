package com.example.demo.controlers;

//import com.example.demo.model.Cheaken;
import com.example.demo.model.CheakenHouse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Api(description ="Контролер для всех страниц 'Куриц'")
public class SecondPageControl {

    @GetMapping("/gpagecheak")
    @ApiOperation("Контролер для отображения страницы 'Курицы'")
    public String Fearures(Model model){


        return "cheaken";
    }

}
