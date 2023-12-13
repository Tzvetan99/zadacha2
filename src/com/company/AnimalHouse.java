package com.company;

public class AnimalHouse<T extends Animal> {
    private T animal;
    public AnimalHouse(T animal){
        this.animal = animal;
    }
    public void makeAnimalSound(){
        animal.makeSound();
    }
}
