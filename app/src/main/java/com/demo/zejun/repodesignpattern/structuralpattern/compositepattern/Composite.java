package com.demo.zejun.repodesignpattern.structuralpattern.compositepattern;

import java.util.List;

public class Composite implements Component {

    private List<Component> mComponents;
    private String mNodeName;

    public Composite(String nodeName) {
        mNodeName = nodeName;
    }

    @Override
    public void operation() {
        System.out.println("My node name is=" + mNodeName);
        for (int i = 0; i < mComponents.size(); i++) {
            Component component = getChild(i);
            component.operation();
        }
    }

    @Override
    public void add(Component component) {
        mComponents.add(component);
    }

    @Override
    public void remove(Component component) {
        mComponents.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return null;
    }
}
