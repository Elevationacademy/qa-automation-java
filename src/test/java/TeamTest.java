import org.junit.jupiter.api.Test;
import studentExercises.ex2FootballTeam.src.Team;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TeamTest
{
    @Test
    public void testTeam(){
        List<String> nameDictionary1 = Arrays.asList("John", "Michael", "David", "Sarah", "Emma", "James", "Emily", "William", "Olivia", "Sophia", "Zoro");
        assertThrows(Exception.class,
                ()->{
            Team.createTeamWithFormation(nameDictionary1,1,10,4,2);
        });
    }

    @Test
    public void createTeam(){
        List<String> nameDictionary1 = Arrays.asList("John", "Michael", "David", "Sarah", "Emma", "James", "Emily", "William", "Olivia", "Sophia", "Zoro");
        Team team = Team.createTeamWithFormation(nameDictionary1,1,4,4,2);
                assertNotNull(team);
    }
}
