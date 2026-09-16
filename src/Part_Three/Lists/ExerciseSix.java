package Part_Three.Lists;

import java.util.ArrayList;
import java.util.Scanner;

/*
there is a program that reads inputs from the user
until an empty string is entered. Add the following
functionality to it: after reading the inputs one more
 string is requested from the user. The program then
 tell whether that string was found in the list or not.
 */
public class ExerciseSix {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String username;
        do{
            System.out.print("Enter a name: ");
            username = scanner.nextLine();
            if(!username.isEmpty()){
                names.add(username);
            }
        }while(!username.isEmpty());

        System.out.print("Search for? ");
        String nameSearch = scanner.nextLine();

        int found = 0;
        for(int i = 0; i < names.size(); i++){
            if(names.get(i).equals(nameSearch)){
                System.out.println(nameSearch + " is found!");
                found = 1;
            }
        }
        if(found==0){
            System.out.println(nameSearch + " was not found!");
        }



    }
}
