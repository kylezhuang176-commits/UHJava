package Part_Six.LongestInCollection;


import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public String toString() {
        return this.name + ": " + this.elements;
    }

    public int size() {
        return this.elements.size();
    }

    public String longest() {
        if(this.elements.isEmpty()){
            return null;
        }
        else{
            String longestWord = this.elements.get(0);
            for(String element : this.elements){
                if(longestWord.length() < element.length()){
                    longestWord = element;
                }
            }
            return longestWord;
        }
    }
}