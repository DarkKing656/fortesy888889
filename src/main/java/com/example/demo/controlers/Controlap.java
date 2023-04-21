package com.example.demo.controlers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Api(description ="Контролер для главной")
@Controller
public class Controlap {
     @GetMapping("/")
     @ApiOperation("Отображение главной")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");


        return "home";
    }
}