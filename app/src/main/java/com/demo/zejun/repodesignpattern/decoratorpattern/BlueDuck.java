package com.demo.zejun.repodesignpattern.decoratorpattern;

public class BlueDuck extends Duck {

    @Override
    public String getDescription() {
        return "BlueDuck";
    }

    @Override
    public double getCost() {
        return 2;
    }
}
