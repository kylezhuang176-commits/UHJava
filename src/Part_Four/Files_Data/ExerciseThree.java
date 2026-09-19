package Part_Four.Files_Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String userChoice = scanner.nextLine();
        if(userChoice.equals("song")){
            String filepath = "C:\\Users\\fallb\\OneDrive\\Desktop\\link.txt";
            try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
                String line;
                while((line = reader.readLine()) != null){
                    System.out.println(line);
                }
            }
            catch(FileNotFoundException e){
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error");
            }
        }else if(userChoice.equals("data")){
            String filepath = "C:\\Users\\fallb\\OneDrive\\Desktop\\data.txt";
            try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
                String line;
                while((line = reader.readLine()) != null){
                    System.out.println(line);
                }
            }
            catch(FileNotFoundException e){
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error");
            }
        }
        else{
            System.out.println("Error");
        }

    }
}
