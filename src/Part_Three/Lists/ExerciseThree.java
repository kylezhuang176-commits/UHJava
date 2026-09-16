package Part_Three.Lists;

import java.util.ArrayList;
import java.util.Scanner;
/*
The exercise template contains a base that reads numbers from the user and adds them to a list.
Reading is stopped once the user enters the number -1.
Expand the program to ask for a start and end indices once it has finished asking for numbers.
After this the program shall print all the numbers in the list that fall in the specified range
(between the indices given by the user, inclusive). You may assume that the user gives indices
 that match some numbers in the list.
 */
public class ExerciseThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        int userNum;
        do{
            System.out.print("Enter a number: ");
            userNum = scanner.nextInt();

            if(userNum!=-1){
                num.add(userNum);
            }
        }while(userNum!=-1);

        System.out.print("From where? ");
        int boundOne = scanner.nextInt();
        System.out.print("To where? ");
        int boundTwo = scanner.nextInt();

        for(int i = 0; i < num.size(); i++){
            if(i >= boundOne && i <= boundTwo){
                System.out.println(num.get(i));
            }
        }
    }
}
