package com.example.demo.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.controller.CargoController;
import com.example.demo.service.CargoService;

@Controller
@RequestMapping
public class listController {
    
    @Autowired
    CargoController cargoController;

    @Autowired
    CargoService cargoService;

    @GetMapping
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("cargos", cargoController.findAll());
        return modelAndView;
    }
}
