package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

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
        
        Human human = new Human();
        System.out.println("...............................................");


        System.out.println(human.toString());
        System.out.println(animal.toString());


        System.out.println("...............................................");


        Device device = new Phone();

        device.turnOn();

        Phone phone = new Phone();
        phone.setModel("ajfon ");
        
        System.out.println("^^^^^^^^^^^^^^^");
        

        System.out.println(Phone.adres);


    }
}
