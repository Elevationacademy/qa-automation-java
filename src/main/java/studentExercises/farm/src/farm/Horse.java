package studentExercises.farm.src.farm;

class Horse extends AbstractAnimal {
    private AnimalType type;
    public Horse(String gender, double weight) {
        super(gender, weight);
        this.type=AnimalType.Horse;
    }

    @Override
    public Animal mate(Animal partner) {
        if (partner instanceof Horse && !getGender().equals(partner.getGender())) {
            return new Horse(Utils.getRandomGender(), (getWeight() + partner.getWeight()) / 2.0);
        }
        return null;
    }
    public AnimalType getType()
    {
        return  type;
    }
    @Override
    public String toString() {
        return super.toString()+
                "type=" + type +
                '}'+'\n';
    }



}