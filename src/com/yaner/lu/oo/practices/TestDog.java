package com.yaner.lu.oo.practices;

public class TestDog {
    public static void main(String[] args) {
        /* practice 2
        Dog dog = new Dog();
        dog.name = "Doudou";
        dog.age = 12;
        dog.weight = 5.3;
        System.out.println(dog.say());
         */

        // practice 3
        Dog dogOne = new Dog();
        Dog dogTwo = new Dog();

        System.out.println(dogOne.say());
        System.out.println(dogTwo.say());

        dogOne.name = "Jiojio";
        dogTwo.name = "Jennie";
        dogTwo.weight = 8D;

        System.out.println(dogOne.say());
        System.out.println(dogTwo.say());
    }
}
