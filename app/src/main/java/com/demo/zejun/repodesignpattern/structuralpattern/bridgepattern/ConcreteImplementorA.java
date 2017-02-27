package com.demo.zejun.repodesignpattern.structuralpattern.bridgepattern;

public class ConcreteImplementorA implements Implementor{

    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorA do something");
    }
}
