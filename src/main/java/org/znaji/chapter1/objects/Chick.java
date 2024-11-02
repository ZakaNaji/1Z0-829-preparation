package org.znaji.chapter1.objects;

public class Chick {
    private String name = "Fluffy"; // 1st
    {
        System.out.println("Initialisation block");//second
    }

    public Chick() {
        System.out.println("Inside the constructor");// third
        name = "Snowy";
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name); //Snowy
    }

}
