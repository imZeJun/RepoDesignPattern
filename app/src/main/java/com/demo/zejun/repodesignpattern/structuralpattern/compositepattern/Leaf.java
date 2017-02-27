package com.demo.zejun.repodesignpattern.structuralpattern.compositepattern;

public class Leaf implements Component{

    private String mNodeName;

    public Leaf(String nodeName) {
        mNodeName = nodeName;
    }

    @Override
    public void operation() {
        System.out.println("My node name is=" + mNodeName);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int index) {
        return null;
    }
}
