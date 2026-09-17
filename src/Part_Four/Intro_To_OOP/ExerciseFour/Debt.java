package Part_Four.Intro_To_OOP.ExerciseFour;

public class Debt {
    double balance;
    double interestRate;

    public Debt(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void printBalance(){
        System.out.println(this.balance);
    }
    public void waitOneYear(){
        this.balance *= this.interestRate;
    }
}
