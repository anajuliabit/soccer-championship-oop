import entities.DefenderPlayer;
import entities.ForwardPlayer;
import entities.GoalkeeperPlayer;
import entities.Team;

public class GenerateTeams {

     public static Team createHomeTeam() {
        DefenderPlayer romario = new DefenderPlayer("Romário", 30, 80, 50, 60);
        ForwardPlayer pele = new ForwardPlayer("Pelé", 40, 50, 62, 88);
        GoalkeeperPlayer davi = new GoalkeeperPlayer("Davi", 35, 40, 35, (float) 1.78);

        Team homeTeam = new Team("Corinthians");
        homeTeam.addDefenderPlayer(romario);
        homeTeam.addForwardPlayer(pele);
        homeTeam.addGoalkeeperPlayer(davi);
        return homeTeam;
    }

     public static Team createVisitorTeam() {
        DefenderPlayer joazinho = new DefenderPlayer("Joãozinho", 68, 90, 40, 60);
        ForwardPlayer marta = new ForwardPlayer("Marta", 38, 67, 87, 35);
        GoalkeeperPlayer alisson = new GoalkeeperPlayer("Alisson", 32, 45, 65, (float) 1.74);

        Team visitorTeam = new Team("Palmeiras");
        visitorTeam.addDefenderPlayer(joazinho);
        visitorTeam.addForwardPlayer(marta);
        visitorTeam.addGoalkeeperPlayer(alisson);
        return visitorTeam;
    }
}
