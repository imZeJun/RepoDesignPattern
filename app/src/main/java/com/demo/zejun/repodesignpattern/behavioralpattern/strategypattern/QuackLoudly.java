package com.demo.zejun.repodesignpattern.behavioralpattern.strategypattern;

public class QuackLoudly implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I Quack loudly");
    }
}
