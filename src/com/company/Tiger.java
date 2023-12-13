package com.company;

public class Tiger extends Animal{
    public Tiger(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("I am" + getName());
    }
}
