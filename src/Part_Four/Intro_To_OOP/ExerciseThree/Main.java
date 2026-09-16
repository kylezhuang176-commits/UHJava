package Part_Four.Intro_To_OOP.ExerciseThree;

public class Main {
    public static void main(String[] args){
        DecreasingCounter counter = new DecreasingCounter(2);
        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.decrement();

        counter.reset();
        counter.printValue();

    }
}
