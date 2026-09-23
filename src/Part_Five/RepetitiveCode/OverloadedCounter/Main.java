package Part_Five.RepetitiveCode.OverloadedCounter;

public class Main {
    public static void main(String[] args){
        Counter counter1 = new Counter(2);
        counter1.increase(5);

        System.out.println(counter1.getValue());
    }
}
