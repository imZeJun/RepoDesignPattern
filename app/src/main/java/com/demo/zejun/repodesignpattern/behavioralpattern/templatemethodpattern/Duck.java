package com.demo.zejun.repodesignpattern.behavioralpattern.templatemethodpattern;

public abstract class Duck {

    public final void performShow() {
        dance();
        quack();
        fly();
    }

    public final void dance() {
        System.out.println("start To dance");
    }

    public final void quack() {
        System.out.println("start To quack");
    }

    public abstract void fly();

}
