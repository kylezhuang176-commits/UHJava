package Part_Five.ObjectsReferences.DumbCard;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {

        this.money += 2.5;
        if(payment < 2.5){
            return payment;
        }
        else{
            this.affordableMeals++;
            return payment - 2.5;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if(card.balance() >= 2.5){
            card.takeMoney(2.5);
            return true;
        }
        else{
            this.affordableMeals++;
            return false;
        }

    }

    public boolean eatHeartily(PaymentCard card) {
        if(card.balance() >= 4.3){
            card.takeMoney(4.3);
            return true;
        }
        else{
            this.heartyMeals++;
            return false;
        }

    }

    public double eatHeartily(double payment) {

        this.money += 4.3;
        if(payment < 4.3){
            return payment;
        }
        else{
            this.heartyMeals++;
            return payment - 2.5;
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}