package com.demo.zejun.repodesignpattern.behavioralpattern.mementopattern;

public class Originator {

    private String mState;

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public Memento savaStateToMemento() {
        Memento memento = new Memento();
        memento.setState(mState);
        return memento;
    }

    public void getStateFromMemento(Memento memento) {
        mState = memento.getState();
    }
}
