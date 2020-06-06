package entities;

import java.time.LocalDate;

public class Game {
    protected LocalDate date;
    protected Team homeTeam;
    protected Team visitorTeam;
    protected Integer homeScoreboard;
    protected Integer visitorScoreboard;

    public Game(Team homeTeam, Team visitorTeam) {
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
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

}
