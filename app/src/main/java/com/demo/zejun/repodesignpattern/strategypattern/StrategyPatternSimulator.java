package com.demo.zejun.repodesignpattern.strategypattern;


public class StrategyPatternSimulator {

    public static void run() {
        //刚出生的鸭子，不会飞，不会叫。
        Duck birthDuck = new Duck();
        birthDuck.performFly();
        birthDuck.performFly();
        //幼年鸭子，只会叫，不会飞。
        Duck childDuck = new Duck();
        childDuck.setQuackBehavior(new QuackLoudly());
        childDuck.performFly();
        childDuck.performQuack();
        //成年鸭子，既会叫，也会飞。
        Duck youngDuck = new Duck();
        youngDuck.setFlyBehavior(new FlyWithWings());
        youngDuck.setQuackBehavior(new QuackLoudly());
        youngDuck.performFly();
        youngDuck.performQuack();
    }
}
