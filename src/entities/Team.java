package entities;

import java.util.List;

public class Team {
    protected String name;
    protected List<Player> players;
    protected Integer wins;
    protected Integer defeats;
    protected Integer draws;

    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.defeats = 0;
        this.draws = 0;
    }

    public String getResults() {
        return "Wins: " + this.wins + ", Draws: " + this.draws + ", Defeats: " + this.defeats;
    }

    public List<Player> addPlayer(Player player) {
        this.players.add(player);
        return players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getDefeats() {
        return defeats;
    }

    public void setDefeats(Integer defeats) {
        this.defeats = defeats;
    }

    public Integer getDraws() {
        return draws;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }
}
