package Part_Four.Intro_To_OOP.ExerciseTwo;

public class Product {
    double price;
    int quantity;
    String name;

    public Product(double price, int quantity, String name){
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + "pcs");
    }
}
