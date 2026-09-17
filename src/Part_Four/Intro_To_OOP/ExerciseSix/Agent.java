package Part_Four.Intro_To_OOP.ExerciseSix;

public class Agent {
    String firstName;
    String lastName;

    public Agent(String FName, String LName){
        this.firstName = FName;
        this.lastName = LName;
    }

    public String toString(){
        return "My name is " + lastName + ", " + firstName +  " " + lastName;
    }
}
