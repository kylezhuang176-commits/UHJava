package Part_Four.Intro_To_OOP.ExerciseNine;

public class PaymentCard {
    double openingBalance;

    public PaymentCard(double openingBalance){
        this.openingBalance = openingBalance;
    }

    public String toString(){
        return "The card has a balance of " + this.openingBalance + " dollars";
    }

    public void eatAffordably(){
        if(this.openingBalance - 2.60 >= 0){
            this.openingBalance = this.openingBalance - 2.60;
        }
    }

    public void eatHeartily(){
        if(this.openingBalance - 4.60 >= 0){
            this.openingBalance = this.openingBalance - 4.60;
        }
    }

    public double addMoney(double moneyAdded){
        if(moneyAdded < 0){
            return this.openingBalance;
        }
        if(this.openingBalance + moneyAdded <= 150){
            this.openingBalance = this.openingBalance + moneyAdded;
        }else{
            this.openingBalance = 150;
        }
        return this.openingBalance;
    }

}
