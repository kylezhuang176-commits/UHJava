package Part_Three.Lists;


import java.util.ArrayList;
import java.util.Scanner;

/*
The exercise template contains a base that reads
numbers from the user and adds them to a list.
 Reading is stopped once the user enters the number -1.
Modify the program so that after reading the numbers it
 calculates and prints the sum of the numbers in the list.
 */
public class ExerciseFive {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int userNum;
        do{
            System.out.print("Enter a number: ");
            userNum = scanner.nextInt();

            if(userNum != -1){
                nums.add(userNum);
            }
        }while(userNum!=-1);

        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        System.out.println(sum);
    }
}
