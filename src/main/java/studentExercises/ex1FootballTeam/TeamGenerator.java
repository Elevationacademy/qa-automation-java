package studentExercises.ex1FootballTeam;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class TeamGenerator {

    private static final List<String> NAMES = Arrays.asList(
            "John", "David", "Michael", "James", "Robert", "Daniel",
            "Christopher", "Matthew", "Joseph", "Thomas", "Anthony", "Paul",
            "Mark", "Andrew", "Steven", "Kevin", "Brian", "George", "Edward", "Richard", "Tim", "Bob"
    );


    private static Player createPlayer(List<Player> team, Player.Position pos){
        String name = getRandomName(team);
        int jerseyNumber = getRandomJerseyNumber(team);
        int grade = ThreadLocalRandom.current().nextInt(50) + 1;
        return new Player(name, jerseyNumber, grade, pos);
    }
    public static List<Player> generateTeam() {
        List<Player> team = new ArrayList<>();
        // 1 goal keeper
        Player player1 = createPlayer(team, Player.Position.GOAL_KEEPER);
        team.add(player1);

        // 2 defenders
        for (int i = 0; i < 2; i++) {
            Player defender = createPlayer(team, Player.Position.DEFENDER);
            team.add(defender);
            Player midfielder = createPlayer(team, Player.Position.MIDFIELDER);
            team.add(midfielder);
            Player attacker = createPlayer(team, Player.Position.ATTACKER);
            team.add(attacker);
        }

        // 4 players
        for (int i = 0; i < 4; i++) {
            Player.Position position = getRandomPosition(ThreadLocalRandom.current());
            Player player = createPlayer(team, position);
            team.add(player);
        }

        return team;
    }

    private static String getRandomName(List<Player> team) {
        String name = NAMES.get(ThreadLocalRandom.current().nextInt(NAMES.size()));
        while (isNameTaken(team, name)) {
            name = NAMES.get(ThreadLocalRandom.current().nextInt(NAMES.size()));
        }
        return name;
    }

    private static boolean isNameTaken(List<Player> team, String name) {
        for (Player player : team) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private static int getRandomJerseyNumber(List<Player> team) {
        int jerseyNumber;
        jerseyNumber = ThreadLocalRandom.current().nextInt(11) + 1;
        while (isJerseyNumberTaken(team, jerseyNumber)) {
            jerseyNumber = ThreadLocalRandom.current().nextInt(11) + 1;
        }
        return jerseyNumber;
    }

    private static boolean isJerseyNumberTaken(List<Player> team, int jerseyNumber) {
        for (Player player : team) {
            if (player.getJerseyNumber() == jerseyNumber) {
                return true;
            }
        }
        return false;
    }

    private static Player.Position getRandomPosition(Random random) {
        Player.Position p = Player.Position.values()[random.nextInt(Player.Position.values().length)];
        while (p == Player.Position.GOAL_KEEPER) {
            p = Player.Position.values()[random.nextInt(Player.Position.values().length)];
        }
        return p;
    }

    public static void printTeam(List<Player> team) {
        for (Player player : team) {
            System.out.println(player);
        }
    }
}
