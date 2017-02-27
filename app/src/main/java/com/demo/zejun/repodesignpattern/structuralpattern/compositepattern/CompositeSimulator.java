package com.demo.zejun.repodesignpattern.structuralpattern.compositepattern;

public class CompositeSimulator {

    public static void run() {
        Component groupA = new Composite("groupA");
        Component groupB = new Composite("groupB");
        Component groupC = new Composite("groupC");
        Component leafA = new Leaf("LeafA");
        Component leafB = new Leaf("LeafB");
        Component leafC = new Leaf("LeafC");
        groupB.add(leafA);
        groupB.add(leafB);
        groupC.add(leafC);
        groupA.add(groupB);
        groupA.add(groupC);;
        groupA.operation();
    }
}
