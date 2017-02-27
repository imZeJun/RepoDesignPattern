package com.demo.zejun.repodesignpattern.creationalpattern.simplefactorypattern;

public class BlackDuck extends Duck {

    @Override
    public void dance() {
        System.out.println("BlackDuck dance");
    }

    @Override
    public void sing() {
        System.out.println("BlackDuck sing");
    }
}
