package Part_Three.Lists;

/*
Create the method public static void
printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit)
 in the exercise template. The method prints the numbers in the given
 list whose values are in the range [lowerLimit, upperLimit].
 */


import java.util.ArrayList;

public class ExerciseSeven {
    public static void main(String[] args){

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(5);
        numList.add(6);
        numList.add(9);

        System.out.println("The numbers between 4 and 9:");
        printNumbersInRange(numList, 4, 9);
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int number : numbers){
            if(number >= lowerLimit && number <= upperLimit){
                System.out.println(number);
            }
        }

    }
}
