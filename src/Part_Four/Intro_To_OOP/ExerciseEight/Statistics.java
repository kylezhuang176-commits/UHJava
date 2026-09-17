package Part_Four.Intro_To_OOP.ExerciseEight;

public class Statistics {
    private double count;
    private double totalSum = 0;
    private double addBy;
    private double evenNumSum;
    private double oddNumSum;

    public Statistics(int numberCount){
        this.count = numberCount;
    }
    public void addNumber(int number) {
        this.addBy = number;
        if(this.addBy%2 == 0){
            this.evenNumSum = this.evenNumSum + this.addBy;
        }
        else if(this.addBy%2 != 0){
            this.oddNumSum = this.oddNumSum + this.addBy;
        }
        totalSum = totalSum + this.addBy;
        this.count++;
    }
    public double getCount() {
        return this.count;
    }
    public double sum(){
        return totalSum;
    }
    public double average(){
        return this.totalSum/this.count;
    }
    public double evenSum(){
        return evenNumSum;
    }
    public double oddSum(){
        return oddNumSum;
    }
}

