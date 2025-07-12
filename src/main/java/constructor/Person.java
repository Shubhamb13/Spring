package constructor;

import java.util.List;

public class Person {
 
    private String name;
    private int id;
    private Lap lap;
    private List<Integer> water;

    Person(String name, int id,Lap lap,List<Integer>water) {
        this.name = name;
        this.id = id;
        this.lap=lap;
        this.water=water;
    }

    public String toString(){

        return "name is "+name+" id is "+id+" lap name is "+lap +"water names"+water;
    }
}
