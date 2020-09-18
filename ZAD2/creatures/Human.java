package com.company.creatures;


import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human {

    public Animal pet;
    private Car myCar;
    Phone phone;


    Date date = new Date();

    public Human() {
    }

    public void addMyCar(Car car) {
        this.myCar = car;
    }

    public Animal getPet() {
        return pet;
    }

    public Car getMyCar() {
        return myCar;
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
