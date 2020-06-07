package entities;

import java.time.LocalDate;

public class Game {
    private LocalDate date;
    private Team homeTeam;
    private Team visitorTeam;
    private Integer homeScoreboard;
    private Integer visitorScoreboard;
    private Team winner;
    private Stadium stadium;

    public Game(Team homeTeam, Team visitorTeam, LocalDate date, Stadium stadium) {
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
        this.stadium = stadium;
        this.date = date;
        this.homeScoreboard = 0;
        this.visitorScoreboard = 0;
    }

    public void start() {
        // Aqui estamos gerando a quantidade de chutes a gol de ambos os times aleatoriamente,
        // porém defini que terá entre 5 a 15 chutes ao gol para ficar mais realista
        final Integer totalGoalKicksHomeTeam = getRandomGoalKicks(5, 15);
        final Integer totalGoalKicksVisitorTeam = getRandomGoalKicks(5, 15);

        // Abaixo, a cada chute a gol é feito a seguinte lógica: Se a soma das habilidades de ataque do time atacante vezes um número randomico
        // for maior que a soma das habilidades de defesa do time defensor vezes um número randomico o gol foi marcado.
        for (int i = 0; i < totalGoalKicksHomeTeam; i++) {
            if(attemptedGoalKick(homeTeam, visitorTeam)) {
                homeScoreboard++;
                System.out.println(homeTeam.getName() + " marcou um gol!");
            };
        }
        for (int i = 0; i < totalGoalKicksVisitorTeam; i++) {
            if(attemptedGoalKick(visitorTeam, homeTeam)) {
                visitorScoreboard++;
                System.out.println(visitorTeam.getName() + " marcou um gol!");
            };
        }

        if(homeScoreboard > visitorScoreboard) {
            homeTeam.sumWin();
            visitorTeam.sumLosses();
            winner = homeTeam;
        } else if(visitorScoreboard> homeScoreboard){
            visitorTeam.sumWin();
            homeTeam.sumLosses();
            winner = visitorTeam;
        } else {
            visitorTeam.sumDraws();
            homeTeam.sumDraws();
        }

        System.out.println("=============================\nTOTAL CHUTES AO GOL\n" + homeTeam.getName() + ": " + totalGoalKicksHomeTeam
                            + "\n" + visitorTeam.getName() + ": " + totalGoalKicksVisitorTeam);
    }


    public void homeGoal() {
        this.homeScoreboard++;
    }

    public void visitorGoal() {
        this.visitorScoreboard++;
    }

    public String getScoreboard() {
        return "=============================\nPLACAR\n" + this.homeTeam.getName() + ": " + this.homeScoreboard
                + "\n" +this.visitorTeam.getName() + ": " + this.visitorScoreboard + "\n=============================";
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

    public Team getWinner() {
        return winner;
    }

    private Integer getRandomGoalKicks(Integer min, Integer max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    private Boolean attemptedGoalKick(Team attacker, Team defender) {
        Integer totalForwardSkills = attacker.getTotalForwardSkills();
        Integer totalDefenderSkills = defender.getTotalDefenderSkills();

        Double attack = Math.random() * totalForwardSkills;
        Double defense = Math.random() * totalDefenderSkills;

        return attack > defense;
    }
}
