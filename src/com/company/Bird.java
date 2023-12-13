package com.company;

public class Bird extends Animal{

    public double highOfFlight;
    public Bird(String name, double highOfFlight) {
        super(name);
        this.highOfFlight = highOfFlight;
    }


    public double getHighOfFlight() {
        return highOfFlight;
    }

    @Override
    public void makeSound() {
        System.out.println("I am" + getName() + " " + highOfFlight);
    }
}
