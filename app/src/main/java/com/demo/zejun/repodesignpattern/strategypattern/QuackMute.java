package com.demo.zejun.repodesignpattern.strategypattern;

public class QuackMute implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("I cannot quack");
    }
}
