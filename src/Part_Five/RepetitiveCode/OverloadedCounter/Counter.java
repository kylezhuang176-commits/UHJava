package Part_Five.RepetitiveCode.OverloadedCounter;

public class Counter {
    private int startValue;

    public Counter(int startValue){
        this.startValue = startValue;
    }

    public Counter(){
        this.startValue = 0;
    }

    public int getValue(){
        return this.startValue;
    }

    public void increase(){
        this.startValue += 1;
    }

    public void increase(int increaseBy){
        this.startValue += increaseBy;
    }

    public void decrease(int decreaseBy){
        this.startValue += decreaseBy;
    }

    public void decrease(){
        this.startValue -= 1;
    }
}
