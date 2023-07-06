package studentExercises.farm.src.farm;

class Cow extends AbstractAnimal {
    private AnimalType type;
    public Cow(String gender, double weight) {
        super(gender, weight);
        this.type=AnimalType.Cow;
    }

    @Override
    public Animal mate(Animal partner) {
        if (partner instanceof Cow && !getGender().equals(partner.getGender())) {
            return new Cow(Utils.getRandomGender(), (getWeight() + partner.getWeight()) / 2.0);
        }
        return null;
    }
    public AnimalType getType()
    {
        return  AnimalType.Cow;
    }
    @Override
    public String toString() {
        return super.toString()+
                "type=" + type +
                '}'+'\n';
    }


}
