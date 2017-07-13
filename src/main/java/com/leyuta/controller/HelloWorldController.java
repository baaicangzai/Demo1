package com.leyuta.controller;

import com.leyuta.entity.Hero;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by  listen on 2017/7/12
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController
{
    @GetMapping("/index.html")
    public String index(Model model)
    {
        model.addAttribute("hero", new Hero("ashe", 450));
        return "index";
    }

}
