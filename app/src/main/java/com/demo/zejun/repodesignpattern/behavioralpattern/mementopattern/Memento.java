package com.demo.zejun.repodesignpattern.behavioralpattern.mementopattern;

public class Memento {

    private String mState;

    public void setState(String state) {
        mState = state;
    }

    public String getState() {
        return mState;
    }
}
