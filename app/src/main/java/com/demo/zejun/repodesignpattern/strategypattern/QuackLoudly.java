package com.demo.zejun.repodesignpattern.strategypattern;

public class QuackLoudly implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I Quack loudly");
    }
}
