package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device  {


    public String model;
    public String producer;
    public String colour;
    public int price = 300;

    public String toString() {

        return model + " " + price + " " + colour + " " + producer;
    }

    @Override
    public boolean turnOn() {
        System.out.println("włączone");
        return true;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public String getColour() {
        return colour;
    }
}
