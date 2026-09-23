package Part_Five.ObjectsReferences.HealthStation;

public class HealthStation {
    private int numberWeighings;

    public HealthStation(){
        this.numberWeighings = 0;
    }

    public int weigh(Person person) {
        this.numberWeighings++;
        return person.getWeight();

    }

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings(){
        return this.numberWeighings;
    }
}
