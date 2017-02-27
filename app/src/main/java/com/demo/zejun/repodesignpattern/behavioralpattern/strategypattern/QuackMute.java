package com.demo.zejun.repodesignpattern.behavioralpattern.strategypattern;

public class QuackMute implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("I cannot quack");
    }
}
