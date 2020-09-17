package com.company.creatures;


import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human {

    public Animal pet;
    Phone phone;


    Date date = new Date();

    public Human() {
    }

    public Animal getPet() {
        return pet;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

}
