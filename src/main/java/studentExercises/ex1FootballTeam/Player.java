package studentExercises.ex1FootballTeam;


public class Player {
    private String name;
    private int jerseyNumber;
    private int grade;
    private Position position;

    public enum Position {
        GOAL_KEEPER, DEFENDER, MIDFIELDER, ATTACKER
    }

    public Player(String name, int jerseyNumber, int grade, Position position) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.grade = grade;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public int getGrade() {
        return grade;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "________" + "\n" +
                "name='" + name + '\'' + "\n" +
                "jerseyNumber=" + jerseyNumber +"\n" +
                "grade=" + grade +"\n" +
                "position=" + position
                ;
    }
}
