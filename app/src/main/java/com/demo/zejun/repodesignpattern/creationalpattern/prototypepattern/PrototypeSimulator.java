package com.demo.zejun.repodesignpattern.creationalpattern.prototypepattern;

public class PrototypeSimulator {

    public static void run() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setmAge(27);
        concretePrototype.setmName("Tony");
        ConcretePrototype clone = concretePrototype.clone();
        System.out.println("equals=" + (concretePrototype == clone) + ",age=" + clone.getmAge() + ",name=" + clone.getmName());

    }
}
