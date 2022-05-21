package com.yaner.lu.encapsulation;

public class Main {
    public static void main(String[] args) {
        // practice 1
        Animal animal = new Animal();
//        animal.name = "Elephant";
        animal.setName("Elephant");
//        animal.legs = 4;
//        animal.setLegs(9);
        animal.setLegs(8);
        System.out.println(animal.getName() + " has " + animal.getLegs() + " legs.");

    }
}
    /* practice 1
    Even though a setting method has been set for property 'legs', users are still able to set an invalid value
    for 'legs' by calling `.legs` straightaway.
     */
class Animal {
    private String name;
    // practice 2: set property legs as private
    private int legs;
    public void setLegs(int i) {
        if (i > 0 && i % 2 == 0) {
            legs = i;
        }
   }
   // practice 2: a getter method is needed for a private property to be accessed.
   public int getLegs() {
        return legs;
   }

   public void setName(String name) {
        this.name = name;
   }

   public String getName() {
        return name;
   }
}