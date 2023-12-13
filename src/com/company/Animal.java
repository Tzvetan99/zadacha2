package com.company;

public abstract class Animal {
    public String name;

    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract void makeSound();
}
