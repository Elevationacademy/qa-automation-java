package streams;

import java.util.ArrayList;
import java.util.List;

public class TearDownManager {
    List<Runnable> tasks = new ArrayList<>();

    public void addTask(Runnable task){
        tasks.add(task);
    }

    public void runAll(){
        tasks.forEach(Runnable::run);
    }
}
