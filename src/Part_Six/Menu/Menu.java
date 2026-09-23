package Part_Six.Menu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu(){
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        boolean duplicate = false;
        for(String dish : meals){
            if(meal.equals(dish)){
                duplicate = true;
            }
        }
        if(!duplicate){
            this.meals.add(meal);
        }
    }

    public void printMeals(){
        for(String dish : meals){
            System.out.println(dish);
        }
    }

    public void clearMenu(){
        meals.clear();
    }

}