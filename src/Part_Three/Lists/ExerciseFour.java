package Part_Three.Lists;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a program that reads numbers from the user.
 When number 9999 is entered, the reading process stops.
 After this the program will print the smallest number in the list,
 and also the indices where that number is found. Notice: the
 smallest number can appear multiple times in the list..
 */
public class ExerciseFour {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        int userNum;
        do{
            System.out.print("Enter a number: ");
            userNum = scanner.nextInt();

            if(userNum!=9999){
                num.add(userNum);
            }
        }while(userNum!=9999);

        int smallest = num.getFirst();
        int i;
        for(i = 0; i < num.size(); i++){
            if(smallest > num.get(i)){
                smallest = num.get(i);
            }
        }
        int index = i - 2;
        System.out.println("smallest number: " + smallest);
        System.out.println("Found at index " + index);
    }

}
