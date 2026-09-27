package Part_Six.CargoHold;

import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;
    private int numOfItems;
    private int totalWeight;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.numOfItems = 0;
        this.totalWeight = 0;
    }

    public void addItem(Item item){
        for(Item object : items){
            totalWeight += object.getWeight();
        }
        if(totalWeight + item.getWeight() <= this.maxWeight){
            items.add(item);
            this.numOfItems++;
        }

    }

    public void printItems(){
        for(Item item : items){
            System.out.println(item);
        }
    }

    public int totalWeight(){
        int weight = 0;

        for (Item item : this.items) {
            weight += item.getWeight();
        }

        return weight;
    }

    public Item heaviestItem(){
        Item returnedObject = items.getFirst();
        for(Item item : items){
            if(returnedObject.getWeight() < item.getWeight()){
                returnedObject = item;
            }
        }
        return returnedObject;
    }

    public ArrayList<Item> getItems(){
        return items;
    }


    @Override
    public String toString(){
        int weight = 0;
        for(Item item : items){
            weight = weight + item.getWeight();
        }

        if(items.isEmpty()){
            return "no items (" + weight + "kg)";
        }
        else if(items.size() == 1){
            return this.numOfItems + " item (" + weight + "kg)";
        }
        else{
            return this.numOfItems + " items (" + weight + "kg)";
        }

    }
}
