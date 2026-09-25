package Part_Six.Height_Order;

import java.util.ArrayList;

public class Room {

    private ArrayList<Person> people;

    public Room(){
        this.people = new ArrayList<Person>();
    }

    public void add(Person person){
        this.people.add(person);
    }

    public boolean isEmpty(){
        if(this.people.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public ArrayList<Person> getPersons(){
        return this.people;
    }

    public Person shortest(){
        if(this.people.isEmpty()){
            return null;
        }else{
            Person shortestPerson = this.people.get(0);
            for(Person person : this.people){
                if(shortestPerson.getHeight() > person.getHeight()){
                    shortestPerson = person;
                }
            }
            return shortestPerson;
        }
    }

    public Person take(){
        if(this.people.isEmpty()){
            return null;
        }
        Person shortestPerson = shortest();
        this.people.remove(shortestPerson);

        return shortestPerson;
    }
}
