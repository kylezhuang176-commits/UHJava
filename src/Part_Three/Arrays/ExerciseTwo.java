package Part_Three.Arrays;

import java.util.Scanner;

/*
The exercise template already has an array containing numbers.
 Complete the program so that it asks the user for a number to
  search in the array. If the array contains the given number,
  the program tells the index containing the number. If the array doesn't
  contain the given number, the program will advise that the number wasn't found.
 */
public class ExerciseTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 3;
        numbers[2] = 7;
        numbers[3] = 8;
        numbers[4] = 1;

        System.out.print("Search for? ");
        int findNum = scanner.nextInt();

        int findSuccess = 0;
        for(int i = 0; i < numbers.length; i++){
            if(findNum == numbers[i]){
                System.out.println(findNum + " is at index " + i);
                findSuccess = 1;
            }
        }
        if(findSuccess == 0){
            System.out.println(findNum + " was not found.");
        }

    }
}
