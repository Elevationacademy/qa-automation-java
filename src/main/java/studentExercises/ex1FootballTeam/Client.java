package studentExercises.ex1FootballTeam;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Player> team = TeamGenerator.generateTeam();
        TeamGenerator.printTeam(team);
    }
}
