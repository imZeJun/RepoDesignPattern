package com.demo.zejun.repodesignpattern.iteratorpattern;

public interface Aggregate {
    public void add(Object object);
    public void remove(Object object);
    public Iterator iterator();
}
