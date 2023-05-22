/*
Copyright (c) 2023 Ivanova Ekaterina Alexeevna (iceja.net). All rights reserved.
PROPRIETARY. For demo purposes only, not for redistribution or any commercial
use.
*/

package net.iceja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontPageController {

    @GetMapping(value = "/")
    //@ResponseBody
    String getMainPage( Model m){
        m.addAttribute("sender","TEST");
        m.addAttribute("text","TEST text");
        return "index";
    }
}
