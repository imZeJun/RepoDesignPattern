package com.demo.zejun.repodesignpattern.structuralpattern.bridgepattern;

public abstract class Abstraction {

    Implementor mImplementor;

    public void setImplementor(Implementor mImplementor) {
        this.mImplementor = mImplementor;
    }

    public abstract void operation();
}
