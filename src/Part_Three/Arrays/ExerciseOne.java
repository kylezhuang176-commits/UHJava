package Part_Three.Arrays;

import java.util.Scanner;

/*
The exercise template already contains a program,
 that creates an array and prints the values of the array twice.
 Modify the program to do following: After the first printing,
 the program should ask for two indices from the user. The values
 in these two indices should be swapped, and in the end the values
 of the array should be printed once again.
 */
public class ExerciseOne {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 9;

        print(intArray);
        System.out.println("Give first index to swap:" );
        int firstValue = scanner.nextInt();

        System.out.println("Give second index to swap:" );
        int secondValue = scanner.nextInt();

        int helper = intArray[firstValue];
        intArray[firstValue] = intArray[secondValue];
        intArray[secondValue] = helper;

        print(intArray);
    }
    public static void print(int[] printArray){
        for(int element : printArray){
            System.out.println(element);
        }
    }
}
