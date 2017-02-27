package com.demo.zejun.repodesignpattern.structuralpattern.bridgepattern;

public class BridgePatternSimulator {

    public static void run() {
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();
    }
}
