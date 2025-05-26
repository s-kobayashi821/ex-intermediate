package com.example.domain;

import java.util.Date;

public class Team {
    private  Integer id;
    private String leagueName;
    private  String headquarters;
    private Date inauguration;
    private String history;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public Date getInauguration() {
        return inauguration;
    }

    public void setInauguration(Date inauguration) {
        this.inauguration = inauguration;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", leagueName='" + leagueName + '\'' +
                ", headquarters='" + headquarters + '\'' +
                ", inauguration='" + inauguration + '\'' +
                ", history='" + history + '\'' +
                '}';
    }
}
