package com.demo.zejun.repodesignpattern.strategypattern;


public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can fly with Wings");
    }
}
