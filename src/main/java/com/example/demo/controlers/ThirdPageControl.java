package com.example.demo.controlers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Api(description ="Контролер для всех страниц 'Яйц'")
public class ThirdPageControl {
    @GetMapping("/gegg")
    @ApiOperation("Контролер для всех страниц 'Яйца'")
    public String Fearures(Model model){
        return "egg";
    }

}
