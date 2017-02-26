package com.demo.zejun.repodesignpattern.strategypattern;


public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}