package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;

public class Main {

    public static void main(String[] args) {


        Animal animal = new Pet();
        animal.feed();
        animal.takeForAWalk();
        animal.feed();
        animal.feed();
        animal.feed();
        animal.feed();

        Animal animal_1 = new FarmAnimal("dog",9.0);

        Car pasat = new Disel();
        pasat.setColour("blue");
        pasat.setModel("B5");
        pasat.setPrice(22745);
        pasat.setProducer("Pasat");
        
        Human human = new Human();
        human.addMyCar(pasat);
        System.out.println("...............................................");


        System.out.println(human.toString());
        System.out.println(pasat.toString());
        System.out.println(animal.toString());


        System.out.println("...............................................");
        

        Phone phone = new Phone();
        phone.setModel("ajfon ");
        
        System.out.println("^^^^^^^^^^^^^^^");


    }
}
