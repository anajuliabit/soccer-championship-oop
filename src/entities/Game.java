package entities;

import java.time.LocalDate;

public class Game {
    protected LocalDate date;
    protected Team homeTeam;
    protected Team visitorTeam;
    protected Integer homeScoreboard;
    protected Integer visitorScoreboard;

    public Game(Team homeTeam, Team visitorTeam, LocalDate date) {
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
        this.date = date;
    }

    public void homeGoal() {
        this.homeScoreboard++;
    }

    public void visitorGoal() {
        this.visitorScoreboard++;
    }

    public String getScoreboard() {
        return "Home Team " + this.homeScoreboard + "Visitor Team " + this.visitorScoreboard;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(Team visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    public Integer getHomeScoreboard() {
        return homeScoreboard;
    }

    public void setHomeScoreboard(Integer homeScoreboard) {
        this.homeScoreboard = homeScoreboard;
    }

    public Integer getVisitorScoreboard() {
        return visitorScoreboard;
    }

    public void setVisitorScoreboard(Integer visitorScoreboard) {
        this.visitorScoreboard = visitorScoreboard;
    }
}
