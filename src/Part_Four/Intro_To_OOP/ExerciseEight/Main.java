package Part_Four.Intro_To_OOP.ExerciseEight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Statistics statistics = new Statistics(0);
        Scanner scanner = new Scanner(System.in);

        int userNum;
        do{
            System.out.print("Enter a number: ");
            userNum = scanner.nextInt();

            if(userNum!=-1){
                statistics.addNumber(userNum);
                statistics.sum();
            }
        }while(userNum!=-1);

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics.evenSum());
        System.out.println("Sum of odd numbers: " + statistics.oddSum());
    }
}
