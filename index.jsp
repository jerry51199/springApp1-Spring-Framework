package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("nombre", "Gerardo Sánchez Muñoz");
        mv.addObject("matricula", "123456");
        mv.addObject("escuela", "Universidad XYZ");
        mv.addObject("materia", "Programación Web");
        mv.addObject("profesor", "Ing. Juan Pérez");
        return mv;
    }
}
