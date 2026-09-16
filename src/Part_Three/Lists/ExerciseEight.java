package Part_Three.Lists;


import java.util.ArrayList;

/*
Create the method public static int
sum(ArrayList<Integer> numbers) in the
exercise template. The method is to return the
sum of the numbers in the parameter list.
 */
public class ExerciseEight {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(6);
        list.add(7);

        System.out.println(sum(list));
    }
    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        if(numbers.isEmpty()){
            return -1;
        }

        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
