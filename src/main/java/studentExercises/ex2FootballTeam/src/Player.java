package studentExercises.ex2FootballTeam.src;

public class Player {

    private String mName;
    private int mGrade;
    private Position mPos;
    private int mNumber;

    /**
     * Constructor to create player object
     * @param aName
     * @param aGrade
     * @param position
     * @param aNumber
     */
    private Player(String aName, int aGrade, Position position, int aNumber){
        this.mName = aName;
        this.mGrade = aGrade;
        this.mPos = position;
        this.mNumber = aNumber;
    }

    public static Player newPlayer(String aName, int aGrade, Position position, int aNumber){
        return new Player(aName,aGrade,position,aNumber);
    }
    /**
     * Add static factory methods to the Player class to enable creating different type of players.
     * @param name
     * @param grade
     * @param number
     * @return
     */
    public static Player createGoalKeeper(String name, int grade, int number) {
        return new Player(name, grade, Position.GOALKEEPER, number);
    }

    public static Player createDefender(String name, int grade, int number) {
        return new Player(name, grade, Position.DEFENDER, number);
    }

    public static Player createMidfielder(String name, int grade, int number) {
        return new Player(name, grade, Position.MIDFIELDER, number);
    }

    public static Player createAttacker(String name, int grade, int number) {
        return new Player(name, grade, Position.ATTACKER, number);
    }

    /**
     * getters and setters
     */
    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public int getGrade() {
        return mGrade;
    }

    public void setGrade(int mGrade) {
        this.mGrade = mGrade;
    }

    public Position getPos() {
        return mPos;
    }

    public void setPos(Position mPos) {
        this.mPos = mPos;
    }
    public int getNumber() {
        return mNumber;
    }

    public void setNumber(int mNumber) {
        this.mNumber = mNumber;
    }

}
