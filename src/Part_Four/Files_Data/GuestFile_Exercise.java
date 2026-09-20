package Part_Four.Files_Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//
public class GuestFile_Exercise {
    public static void main(String[] args){

        String filePath = "C:\\Users\\fallb\\OneDrive\\Desktop\\Guestlist.txt";

            Scanner scanner = new Scanner(System.in);
            String name;

            do{
                System.out.println("Enter names, an empty line quits.");
                name = scanner.nextLine();

                if(name.isEmpty()){
                    break;
                }

                int counter = 0;

                try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    String line = reader.readLine();

                    while(line != null){
                        if(line.contains(name)) {
                            System.out.println("This name is on the list.");
                            counter++;
                        }
                        line = reader.readLine();
                    }
                    if(counter == 0){
                        System.out.println("This name is not on the list.");
                    }
                }
                catch(IOException e){
                    System.out.println("Error");
                }
            }while(true);

        }
    }