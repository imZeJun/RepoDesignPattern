package com.demo.zejun.repodesignpattern.structuralpattern.decoratorpattern;

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
