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
        mv.addObject("matricula", "TC05056424");
        mv.addObject("escuela", "Universidad TECMILENIO");
        mv.addObject("materia", "COMPUTACION AVANZADA EN JAVA");
        mv.addObject("profesor", "JOSE ALFREDO JIMENEZ");
        return mv;
    }
}
