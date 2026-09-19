package Part_Four.Files_Data;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userInput;
        int counter = 0;

        while(true) {
            System.out.print("");
            userInput = scanner.nextLine();

            if(userInput.equalsIgnoreCase("end")){
                break;
            }
            counter++;
        }
        System.out.println(counter);
    }
}
