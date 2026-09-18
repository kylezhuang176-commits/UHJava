package Part_Four.Intro_To_OOP.ExerciseNine;

public class Main {
    public static void main(String[] args){
        PaymentCard card = new PaymentCard(10);
        System.out.println("Paul: " + card);
        card.addMoney(-15);
        System.out.println("Paul: " + card);
    }
}
