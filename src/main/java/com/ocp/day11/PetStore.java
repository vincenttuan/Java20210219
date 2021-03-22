package com.ocp.day11;

import java.util.stream.Stream;

public class PetStore {
    public static void main(String[] args) {
        System.out.println(Animal.name);
        Dog dog = new Dog();
        Pig pig = new Pig();
        Bird bird = new Bird();
        playSound(dog, pig, bird);
    }
    public static void playSound(Animal... animals) {
        Stream.of(animals).forEach(a -> a.sound());
    }
}
