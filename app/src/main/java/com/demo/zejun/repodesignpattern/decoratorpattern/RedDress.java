package com.demo.zejun.repodesignpattern.decoratorpattern;

public class RedDress extends DuckDecorator {

    private Duck mDuck;

    public RedDress(Duck duck) {
        mDuck = duck;
    }

    @Override
    public double getCost() {
        return mDuck.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return mDuck.getDescription() + ", RedDress";
    }
}
