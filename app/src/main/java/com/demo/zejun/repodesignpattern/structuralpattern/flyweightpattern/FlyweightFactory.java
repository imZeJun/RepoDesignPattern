package com.demo.zejun.repodesignpattern.structuralpattern.flyweightpattern;

import java.util.HashMap;

public class FlyweightFactory {

    private HashMap<Integer, Flyweight> mFiles = new HashMap<>();

    public Flyweight factory(int intrinsicState) {
        if (mFiles.get(intrinsicState) != null) {
            return mFiles.get(intrinsicState);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(intrinsicState);
            mFiles.put(intrinsicState, flyweight);
            return flyweight;
        }
    }
}
