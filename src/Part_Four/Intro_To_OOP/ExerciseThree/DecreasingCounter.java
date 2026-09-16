package Part_Four.Intro_To_OOP.ExerciseThree;

public class DecreasingCounter {
    private int value;
    private int initialValue;

    public DecreasingCounter(int value){
        this.value = value;
        this.initialValue = value;
    }

    public void printValue(){
        System.out.println("Value: " + this.value);
    }
    public void decrement(){
        if(value > 0){
            value = value - 1;
        }

    }
    public void reset(){
        value = initialValue;
    }
}
