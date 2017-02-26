package com.demo.zejun.repodesignpattern.simplefactorypattern;

public class RedDuck extends Duck {

    @Override
    public void dance() {
        System.out.println("RedDuck dance");
    }

    @Override
    public void sing() {
        System.out.println("RedDuck sing");
    }
}
