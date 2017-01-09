package com.packt.webportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by tomek on 09.01.17.
 */
@Controller
public class HomeController {

    @RequestMapping("/webstore/")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Witaj Bro w sklepie internetowym!");
        model.addAttribute("tagline", "Wyjątkowym i jedynym sklepie internetowym");

        return "welcome";
    }
}
