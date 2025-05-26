package com.example.controller;

import com.example.domain.Team;
import com.example.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * チーム情報を管理するコントローラ
 *
 */
@Controller
@RequestMapping("/ex01")
public class TeamController {

    @Autowired
    private TeamService service;

    @GetMapping("")
    public  String teamList(Model model){
        List<Team> teamList = service.getAllTeam();
        model.addAttribute("teamList", teamList);
//        System.out.println(teamList);
        return "teamlist";
    }

    @GetMapping("/Detail")
    public String Detail(String id, Model model){
        System.out.println("id=" + id);
        Team team = service.getTeamById(Integer.valueOf(id));
        model.addAttribute("team", team);
        System.out.println(team);
        return "teamdetail";
    }
}
