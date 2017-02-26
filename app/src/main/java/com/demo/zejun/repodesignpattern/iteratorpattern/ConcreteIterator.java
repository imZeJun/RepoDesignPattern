package com.demo.zejun.repodesignpattern.iteratorpattern;

import java.util.List;

public class ConcreteIterator implements Iterator {

    private List mList;
    private int mIndex;

    public ConcreteIterator(List list) {
        mList = list;
    }

    @Override
    public boolean hasNext() {
        if (mIndex == mList.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return mList.get(mIndex++);
        }
        return null;
    }
}
