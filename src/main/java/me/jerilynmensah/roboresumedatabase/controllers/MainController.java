package me.jerilynmensah.roboresumedatabase.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

public class MainController {

    //This is the home page

    @GetMapping("/index")
    public String showIndex(Model model) {
        String myMessage = "Welcome to the Invoice App";
        model.addAttribute("message", myMessage);
        return "index";
    }

    @PostMapping("/index")
    public String showIndexPost(@Valid @ModelAttribute())

}
