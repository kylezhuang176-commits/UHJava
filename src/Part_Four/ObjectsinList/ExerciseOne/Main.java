package Part_Four.ObjectsinList.ExerciseOne;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<String> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Type a name: ");
            String userInput = scanner.nextLine();
            if(userInput.isEmpty()){
                break;
            }

            items.add(userInput);
        }
        System.out.println(items);

    }
}
