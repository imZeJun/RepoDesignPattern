package com.demo.zejun.repodesignpattern.structuralpattern.flyweightpattern;

public class ConcreteFlyweight implements Flyweight {

    public int mIntrinsicState;

    public ConcreteFlyweight(int intrinsicState) {
        mIntrinsicState = intrinsicState;
    }

    @Override
    public void operation() {
        System.out.println("my intrinsicState is=" + mIntrinsicState);
    }
}
