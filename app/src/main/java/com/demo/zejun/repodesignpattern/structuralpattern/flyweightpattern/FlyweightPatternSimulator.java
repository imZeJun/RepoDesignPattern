package com.demo.zejun.repodesignpattern.structuralpattern.flyweightpattern;

public class FlyweightPatternSimulator {
    public static void run() {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweightA = flyweightFactory.factory(1);
        Flyweight flyweightB = flyweightFactory.factory(2);
        Flyweight flyweightC = flyweightFactory.factory(3);
        System.out.println("A equals B=" + (flyweightA == flyweightC) + ",A equals C=" + (flyweightA == flyweightC));

    }
}
