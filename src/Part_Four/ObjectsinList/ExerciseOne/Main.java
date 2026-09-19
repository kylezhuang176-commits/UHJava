package Part_Four.ObjectsinList.ExerciseOne;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Items> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Items item = new Items(name);
            items.add(item);
            //items.add(new Items(name));
        }

        for (Items item : items) {
            System.out.println(item);
        }
    }
}
