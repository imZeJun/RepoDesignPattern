package com.demo.zejun.repodesignpattern.behavioralpattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreateAggregate implements Aggregate {

    private List<Object> mData = new ArrayList<>();

    @Override
    public void add(Object object) {
        mData.add(object);
    }

    @Override
    public void remove(Object object) {
        mData.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(mData);
    }
}
