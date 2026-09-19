package Part_Four.Files_Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args){

        String filePath = "C:\\Users\\fallb\\OneDrive\\Desktop\\link.txt";

        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))){
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
