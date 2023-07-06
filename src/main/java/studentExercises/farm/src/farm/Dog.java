package studentExercises.farm.src.farm;

class Dog extends AbstractAnimal {
    private AnimalType type;
    public Dog(String gender, double weight) {
        super(gender, weight);
        this.type=AnimalType.Dog;
    }

    @Override
    public Dog mate(Animal partner) {
        if (partner instanceof Dog && !getGender().equals(partner.getGender())) {
            return new Dog(Utils.getRandomGender(), (getWeight() + partner.getWeight()) / 2.0);
        }
        return null;
    }
    public AnimalType getType()
    {
        return  AnimalType.Dog;
    }

    @Override
    public String toString() {
        return super.toString()+
                "type=" + type +
                '}'+'\n';
    }
}