package Part_Three.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseOne{
    /*
    In the exercise template there is a program that reads integers
    from the user and adds them to a list. This ends when the user enters 0.
    The program then prints the first value on the list.
    Modify the program so that instead of the first value, the program prints
    the sum of the second and third numbers. The program is allowed to malfunction if
    there are fewer than three entries on the list, so you don't need to prepare for such
    an event at all!
     */
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int userNumber;
        do{
            System.out.print("Enter a number: ");
            userNumber = scanner.nextInt();

            if(userNumber!=0){
                numbers.add(userNumber);
            }

            System.out.println(numbers);
        }while(userNumber!=0);
        System.out.println(numbers.get(1) + numbers.get(2));

    }
}