package com.company;

public class Main {

    public static void main(String[] args) {
	 Tiger tiger = new Tiger("Rich Paar");
     Bird bird = new Bird("Zazo", 100);
     AnimalHouse<Tiger> tigerHouse = new AnimalHouse<>(tiger);
     AnimalHouse<Bird> birdHouse = new AnimalHouse<>(bird);
     tigerHouse.makeAnimalSound();
     birdHouse.makeAnimalSound();
    }
}
