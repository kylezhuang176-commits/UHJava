package Part_Seven.LiquidContainers;

import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The two containers
        int first = 0;
        int second = 0;

        while (true) {

            // Print the current amounts
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            // Read a command
            String input = scanner.nextLine();

            // Stop the program
            if (input.equals("quit")) {
                break;
            }

            // Separate the command from the amount
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // Handle the command
            if (command.equals("add")) {

                first += amount;
                if(first > 100){
                    first = 100;
                }

            } else if (command.equals("move")) {

                first -= amount;
                second += amount;
                if(second > 100){
                    second = 100;
                }

            } else if (command.equals("remove")) {

                second -= amount;
                if(second < 0){
                    second = 0;
                }
            }
        }
    }
}