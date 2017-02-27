package com.demo.zejun.repodesignpattern.structuralpattern.decoratorpattern;

public class RedHat extends DuckDecorator {

    private Duck mDuck;

    public RedHat(Duck duck) {
        mDuck = duck;
    }

    @Override
    public double getCost() {
        return mDuck.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return mDuck.getDescription() + ", RedHat";
    }
}
