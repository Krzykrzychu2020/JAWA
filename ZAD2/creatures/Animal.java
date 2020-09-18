package com.company.creatures;


import com.company.Salleable;

public abstract class Animal implements Feedable {

    String species = "dog";
    private Double weight;

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    public Animal() {
        this.weight = 9.0;
    }

   public void feed() {

       if(weight<18) {
           weight += 3;
           System.out.println("przytył o 3 kg");

           System.out.println("My weight="+weight);
       }else{
           System.out.println("wyprowadz mnie bo sie roztyje");
       }
    }

  public   void takeForAWalk() {

      if(weight>0) {
          weight -= 3;
          System.out.println("stracil 3 kg ");

          System.out.println("My weight="+weight);
      }else{
          System.out.println("dostarcz jedzenie ");
        }
    }

    public String toString() {
        return species + " " + weight;
    }
}
