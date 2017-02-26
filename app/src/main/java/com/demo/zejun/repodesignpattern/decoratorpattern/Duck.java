package com.demo.zejun.repodesignpattern.decoratorpattern;

public abstract class Duck {
    private String mDescription = "Duck";

    public String getDescription() {
        return mDescription;
    }

    public abstract double getCost();
}
