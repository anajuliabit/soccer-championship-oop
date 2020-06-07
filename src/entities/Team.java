package entities;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;
    private List<DefenderPlayer> defenderPlayers;
    private List<GoalkeeperPlayer> goalkeeperPlayers;
    private List<ForwardPlayer> forwardPlayers;
    private Integer wins;
    private Integer defeats;
    private Integer losses;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.defenderPlayers = new ArrayList<>();
        this.goalkeeperPlayers = new ArrayList<>();
        this.forwardPlayers = new ArrayList<>();
        this.wins = 0;
        this.defeats = 0;
        this.losses = 0;
    }

    public String getResults() {
        return "Wins: " + this.wins + ", Draws: " + this.losses + ", Defeats: " + this.defeats;
    }

    public void addDefenderPlayer(DefenderPlayer defenderPlayer) {
        this.defenderPlayers.add(defenderPlayer);
        this.addPlayer(defenderPlayer);
    }

    public void addGoalkeeperPlayer(GoalkeeperPlayer goalkeeperPlayer) {
        this.goalkeeperPlayers.add(goalkeeperPlayer);
        this.addPlayer(goalkeeperPlayer);
    }

    public void addForwardPlayer(ForwardPlayer forwardPlayer) {
        this.forwardPlayers.add(forwardPlayer);
        this.addPlayer(forwardPlayer);
    }

    public String printPlayers() {
        String result = "";
        for (Player player : players ) {
            result += player.printPlayer() + "\n";
        }
        return result;
    }

    public Integer getTotalDefenderSkills() {
        return defenderPlayers.stream().map(player -> player.getSkill()).reduce(0, Integer::sum);
    }

    public Integer getTotalGoalkeeperSkills() {
        return goalkeeperPlayers.stream().map(player -> player.getSkill()).reduce(0, Integer::sum);
    }

    public Integer getTotalForwardSkills() {
        return forwardPlayers.stream().map(player -> player.getSkill()).reduce(0, Integer::sum);
    }

    public Integer getTotalSkillsTeam() {
        return players.stream().map(player -> player.getSkill()).reduce(0, Integer::sum);
    }

    public void sumWin() {
        this.wins++;
    }

    public void sumLosses() {
        this.defeats++;
    }

    public void sumDraws() {
        this.losses++;
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

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public List<DefenderPlayer> getDefenderPlayers() {
        return defenderPlayers;
    }

    public void setDefenderPlayers(List<DefenderPlayer> defenderPlayers) {
        this.defenderPlayers = defenderPlayers;
    }

    public List<GoalkeeperPlayer> getGoalkeeperPlayers() {
        return goalkeeperPlayers;
    }

    public void setGoalkeeperPlayers(List<GoalkeeperPlayer> goalkeeperPlayers) {
        this.goalkeeperPlayers = goalkeeperPlayers;
    }

    public List<ForwardPlayer> getForwardPlayers() {
        return forwardPlayers;
    }

    public void setForwardPlayers(List<ForwardPlayer> forwardPlayers) {
        this.forwardPlayers = forwardPlayers;
    }

    private void addPlayer(Player player) {
        this.players.add(player);
    }
}
