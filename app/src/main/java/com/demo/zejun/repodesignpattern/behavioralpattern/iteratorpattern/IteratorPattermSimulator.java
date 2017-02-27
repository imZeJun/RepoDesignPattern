package com.demo.zejun.repodesignpattern.behavioralpattern.iteratorpattern;

public class IteratorPattermSimulator {
    public static void run() {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("li");
        aggregate.add("ze");
        aggregate.add("jun");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
    }
}
