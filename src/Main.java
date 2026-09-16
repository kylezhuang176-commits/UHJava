import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String response;
        do{
            System.out.print("Enter a name: ");
            response = scanner.nextLine();

            if(!response.isEmpty()){
                names.add(response);
            }
            System.out.println(names);

        }while(!response.isEmpty());

        System.out.println(names.get(2));

    }
}
