package com.demo.zejun.repodesignpattern.structuralpattern.adapterpattern;

public class DuckAdapter {

    public Duck mDuck;

    public DuckAdapter(Duck duck) {
        mDuck = duck;
    }

    public void perform() {
        mDuck.sing();
    }
}
