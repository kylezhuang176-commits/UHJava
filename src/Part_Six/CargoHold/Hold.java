package Part_Six.CargoHold;

import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private int fullTotalWeight;
    private int suitcaseNum;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.fullTotalWeight = 0;
        this.suitcaseNum = 0;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if(this.fullTotalWeight + suitcase.totalWeight() <= this.maxWeight){
            this.suitcaseNum++;
            suitcases.add(suitcase);
            this.fullTotalWeight = this.fullTotalWeight + suitcase.totalWeight();
        }
    }

    public void printItems(){
        for(Suitcase suitcase : suitcases){
            for(Item item : suitcase.getItems()){
                System.out.println(item);
            }
        }
    }

    @Override
    public String toString(){
        return this.suitcaseNum + " suitcases (" + this.fullTotalWeight + " kg)";
    }
}