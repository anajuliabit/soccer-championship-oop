import entities.DefenderPlayer;
import entities.ForwardPlayer;
import entities.GoalkeeperPlayer;
import entities.Team;

public class GenerateTeams {

     public static Team createHomeTeam() {
        DefenderPlayer romario = new DefenderPlayer("Romário", 30, 3, 5, 2);
        ForwardPlayer pele = new ForwardPlayer("Pelé", 40, 5, 5, 5);
        GoalkeeperPlayer davi = new GoalkeeperPlayer("Davi", 35, 4, 3, (float) 1.78);

        Team homeTeam = new Team("Corinthians");
        homeTeam.addDefenderPlayer(romario);
        homeTeam.addForwardPlayer(pele);
        homeTeam.addGoalkeeperPlayer(davi);
        return homeTeam;
    }

     public static Team createVisitorTeam() {
        DefenderPlayer joazinho = new DefenderPlayer("Joãozinho", 68, 3, 2, 4);
        ForwardPlayer marta = new ForwardPlayer("Marta", 38, 5, 5, 5);
        GoalkeeperPlayer alisson = new GoalkeeperPlayer("Alisson", 32, 3, 5, (float) 1.54);

        Team visitorTeam = new Team("Palmeiras");
        visitorTeam.addDefenderPlayer(joazinho);
        visitorTeam.addForwardPlayer(marta);
        visitorTeam.addGoalkeeperPlayer(alisson);
        return visitorTeam;
    }
}
