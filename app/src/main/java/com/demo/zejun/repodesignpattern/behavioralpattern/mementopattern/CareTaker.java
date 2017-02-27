package com.demo.zejun.repodesignpattern.behavioralpattern.mementopattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    public List<Memento> mMementos = new ArrayList<>();

    public void add(Memento memento) {
        mMementos.add(memento);
    }

    public Memento get() {
        if (mMementos.size() > 0) {
            return mMementos.remove(mMementos.size() - 1);
        } else {
            return null;
        }
    }
}
