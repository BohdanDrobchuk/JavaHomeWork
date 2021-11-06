package com.pb.drobchuk.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println(animal.getName() + " ест " + animal.getFood() + ".");
        System.out.println(animal.getName() + " живет " + animal.getLocation() + ".");
    }
}
