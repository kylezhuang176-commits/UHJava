package Part_Four.Intro_To_OOP.ExerciseFour;

public class Main {
    public static void main(String[] args){

        Debt mortgage = new Debt(120000, 1.01);
        mortgage.printBalance();
        mortgage.waitOneYear();
        mortgage.printBalance();
        mortgage.waitOneYear();
        mortgage.printBalance();
    }
}
