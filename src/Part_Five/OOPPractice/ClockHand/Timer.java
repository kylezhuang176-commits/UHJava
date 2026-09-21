package Part_Five.OOPPractice.ClockHand;

public class Timer {
    private ClockHand second;
    private ClockHand hunSecond;

    public Timer(){
        this.second = new ClockHand(60);
        this.hunSecond = new ClockHand(100);
    }

    public void advance(){
        this.hunSecond.advance();

        if(this.hunSecond.value() == 0){
            this.second.advance();
        }
    }

    public String toString(){
        return second + ":" + hunSecond;
    }
}
