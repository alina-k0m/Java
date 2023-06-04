package ex1;

import java.util.stream.Stream;

public class Animal {
    String name;
    String eats;
    boolean vegetarian;
    int numberOfLegs;
    Animal(){}

    public Animal(String eats, boolean vegetarian, int numberOfLegs) {
        this.eats = eats;
        this.vegetarian = vegetarian;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    void showAllData(){
        System.out.print("Название животного:"+name+
                ", травоядное: " + vegetarian + ", питается: "
                + eats + ",количество конечностей: "
                + numberOfLegs);
    }
}
