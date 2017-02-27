package com.demo.zejun.repodesignpattern.behavioralpattern.strategypattern;

public class Duck {

    protected FlyBehavior mFlyBehavior;
    protected QuackBehavior mQuackBehavior;

    public Duck() {
        mFlyBehavior = new FlyNoWay();
        mQuackBehavior = new QuackMute();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }

    public void performFly() {
        if (mFlyBehavior != null) {
            mFlyBehavior.fly();
        }
    }

    public void performQuack() {
        if (mQuackBehavior != null) {
            mQuackBehavior.quack();
        }
    }

}
