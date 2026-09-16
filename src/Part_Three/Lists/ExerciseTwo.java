package Part_Three.Lists;

import java.util.ArrayList;
import java.util.Scanner;


public class ExerciseTwo {
    /*
    In the exercise template there is a program that reads inputs from
    the user and adds them to a list.
    Reading is stopped once the user enters an empty string.
    Modify the program to print all values of the list.
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        String userName;

        do{
            System.out.print("Enter a name: ");
            userName = scanner.nextLine();

            if(!userName.isEmpty()){
                names.add(userName);
            }

        }while(!userName.isEmpty());

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }



    }
}
