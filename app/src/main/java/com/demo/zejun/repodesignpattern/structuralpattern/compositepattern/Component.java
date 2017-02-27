package com.demo.zejun.repodesignpattern.structuralpattern.compositepattern;

public interface Component {
    public abstract void operation();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public Component getChild(int index);
}
