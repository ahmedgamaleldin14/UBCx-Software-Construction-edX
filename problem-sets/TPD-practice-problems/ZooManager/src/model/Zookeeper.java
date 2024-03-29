package model;


import java.util.ArrayList;
import java.util.List;

public class Zookeeper {

    private String name;
    private int age;
    private List<Animal> animalList;
    private Animal favourite;

    // TODO: follow the instructions on the webpage to implement this class
    public Zookeeper(String nm, int age) {
        name = nm;
        this.age = age;
        animalList = new ArrayList<>();
    }

    //getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public List<Animal> getAnimalList() { return animalList; }
    public Animal getFavourite() { return favourite; }

    //setters
    public void setFavourite(Animal a) {
        favourite = a;
    }

    public void addToList(Animal a) {
        animalList.add(a);
    }

    public void removeFromList(Animal a) {
        animalList.remove(a);
    }

}