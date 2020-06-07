import entities.*;

import java.time.LocalDate;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Team homeTeam = GenerateTeams.createHomeTeam();
        Team visitorTeam = GenerateTeams.createVisitorTeam();

        startGame(homeTeam, visitorTeam);

    }

    public static void startGame(Team homeTeam, Team visitorTeam) {
        Game game = new Game(homeTeam, visitorTeam, LocalDate.now());
        System.out.println("A partida vai começar!\n=============================");
        game.start();
        System.out.println(game.getScoreboard());
        if(Objects.nonNull(game.getWinner())) {
            System.out.println("O time vencedor foi: " + game.getWinner().getName());
        } else {
            System.out.println("Empate!");
        }
    }

}
