package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class TeamController {

    @GetMapping("/")
    public  String index(){
        return "teamlist";
    }

    @GetMapping("/toDetail")
    public String toDetail(){
        return "teamdetail";
    }
}
