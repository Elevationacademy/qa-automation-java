package studentExercises.farm.src.farm;

import java.util.concurrent.ThreadLocalRandom;

class Utils {
    static String getRandomGender() {
        return ThreadLocalRandom.current().nextBoolean() ? "Male" : "Female";
    }
}
