package Part_Six.SimpleDictionary;

import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String userCommand = scanner.nextLine();

            if(userCommand.equalsIgnoreCase("end")){
                break;
            }else if(userCommand.equalsIgnoreCase("add")){
                System.out.print("Word: ");
                String userWord = scanner.nextLine();
                System.out.print("Translation: ");
                String wordTranslation = scanner.nextLine();

                simpleDictionary.add(userWord, wordTranslation);
            }else if(userCommand.equalsIgnoreCase("search")){
                System.out.print("To be translated: ");
                String wordToBeTrans = scanner.nextLine();
                if(simpleDictionary.translate(wordToBeTrans) == null){
                    System.out.println("Word not found");
                }else {
                    System.out.println("Translation: " + simpleDictionary.translate(wordToBeTrans));
                }
            }
            else{
                System.out.println("Unknown command");
            }
        }
        System.out.println("cya");



    }
}
