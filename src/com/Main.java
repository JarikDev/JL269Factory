package com;

import javafx.scene.control.ToggleGroup;

public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();
        Toyota toyota=(Toyota)factory.create("Toyota");
        Audi audi=(Audi)factory.create("Audi");
        toyota.drive();
        audi.drive();

    }
}

interface Car{
    void drive();
}
class Toyota implements Car{
    @Override
    public void drive() {
        System.out.println("Toyota drive");
    }
}
class Audi implements Car{
    @Override
    public void drive() {
        System.out.println("Audi drive");
    }
}

class Factory{
    public Car create(String typeOfCar){
        switch(typeOfCar){
            case "Toyota": return new Toyota();
            case "Audi": return new Audi();
            default:  return  null;
        }
    }
}