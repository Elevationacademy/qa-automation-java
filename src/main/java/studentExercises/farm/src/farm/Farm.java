package studentExercises.farm.src.farm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
 class Farm {
    private final List<Animal> animals;
    public Farm() {
        this.animals = new ArrayList<>();
        initializeFarm();
    }

    private void initializeFarm() {
        int numAnimals = ThreadLocalRandom.current().nextInt(10) + 1; // Randomly choose number of animals between 1 and 10

        for (int i = 0; i < numAnimals; i++) {
            int animalType = ThreadLocalRandom.current().nextInt(3); // Randomly choose animal type (0: Dog, 1: Cow, 2: Horse)
            String gender = ThreadLocalRandom.current().nextBoolean() ? "Male" : "Female";
            double weight = ThreadLocalRandom.current().nextDouble() * 100.0; // Random weight between 0 and 100

            switch (animalType) {
                case 0:
                    animals.add(new Dog(gender, weight));
                    break;
                case 1:
                    animals.add(new Cow(gender, weight));
                    break;
                case 2:
                    animals.add(new Horse(gender, weight));
                    break;
            }
        }
        
    }
    private Animal generateNewAnimal(AnimalType animalType) {
        String gender = getRandomGender();
        double weight = Math.random() * 100.0;

        switch (animalType) {
            case Dog:
                return new Dog(gender, weight);
            case Cow:
                return new Cow(gender, weight);
            case Horse:
                return new Horse(gender, weight);
        }

        return null;
    }

    private String getRandomGender() {
        return ThreadLocalRandom.current().nextBoolean() ? "Male" : "Female";
    }


    Animal acquire(AnimalType type)
    {
        for (int i=0;i<animals.size();i++)
        {
            if (animals.get(i).getType()==type)
            {
                for (int j = 0 ; j<animals.size();j++)
                {
                    Animal animal=animals.get(i).mate(animals.get(j));
                    if (animal!=null)
                        return animal;
                }
            }
        }
        return  generateNewAnimal(type);
    }
    Animal provideAnimal( AnimalType animalType) {
        for (int i=0;i<animals.size();i++)
        {
            if(animals.get(i).getType()==animalType)
            {
                Animal animal = animals.get(i);
                animals.remove(animal);
                return animal;
            }
        }

        Animal animal = acquire(animalType);
        return animal;
    }
}
