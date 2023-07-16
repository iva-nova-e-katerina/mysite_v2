/*
Copyright (c) 2023 Ivanova Ekaterina Alexeevna (iceja.net). All rights reserved.
PROPRIETARY. For demo purposes only, not for redistribution or any commercial
use.
*/

package net.iceja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;

@Controller
public class FrontPageController {

    @GetMapping(value = "/")
    //@ResponseBody
    String getMainPage(MainForm m){
    //    m.addAttribute("sender","TEST");
    //    m.addAttribute("text","TEST text");
        m.setSender("test1");
        m.setText("test2");

        return "index";
    }


    @PostMapping(value = "/")
    public String send(@Valid MainForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            System.exit(0);
        }

        personForm.setSender("test1");
        personForm.setText("test2");

        return "index";
        
    }
}
