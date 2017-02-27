package com.demo.zejun.repodesignpattern.structuralpattern.bridgepattern;

public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        if (mImplementor != null) {
            mImplementor.operationImpl();
        }
        System.out.println("Do something after implementor");
    }
}
