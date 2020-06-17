package com.wildcodeschool.disco_project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DiscoProjectController {
    private String appMode;

    @Autowired
    public DiscoProjectController(Environment environment){
        appMode = environment.getProperty("app-mode");
    }

    @RequestMapping("/")
    public String index(Model model){
//        model.addAttribute("datetime", new Date());
        model.addAttribute("teamName", "Player team");
        model.addAttribute("projectName", "TEAM PLAYER");

        model.addAttribute("mode", appMode);

        return "index";
    }
}
