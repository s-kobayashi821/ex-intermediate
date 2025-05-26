package com.example.repository;

import com.example.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeamRepository {
    @Autowired
    private NamedParameterJdbcTemplate template;

    public static RowMapper<Team> TEAM_ROW_MAPPER = (rs, rowNum) ->{
        Team team = new Team();
        team.setId(rs.getInt("id"));
        team.setLeagueName(rs.getString("league_name"));
        team.setHeadquarters(rs.getString("headquarters"));
        team.setInauguration(rs.getDate("inauguration"));
        team.setHistory(rs.getString("history"));
    };

    
    public List<Team> findAll(){
        String sql = "SELECT id, league_name, team_name, headquarters, inauguration, history FROM teams ORDER BY inauguration;";
        List<Team> teamList = template.query(sql, TEAM_ROW_MAPPER);
        return  teamList;
    }


    public  Team findById(int id){
        String sql = "SELECT id, league_name, team_name, headquarters, inauguration, history FROM teams WHERE id=:id;";
        SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
        Team team = template.queryForObject(sql, param, TEAM_ROW_MAPPER);
        return  team;
    }
}
