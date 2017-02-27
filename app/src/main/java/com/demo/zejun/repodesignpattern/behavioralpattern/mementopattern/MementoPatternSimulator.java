package com.demo.zejun.repodesignpattern.behavioralpattern.mementopattern;

public class MementoPatternSimulator {
    public static void run() {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        originator.setState("State 1");
        careTaker.add(originator.savaStateToMemento());
        originator.setState("State 2");
        careTaker.add(originator.savaStateToMemento());
        originator.setState("State 3");
        Memento memento = careTaker.get();
        if (memento != null) {
            originator.getStateFromMemento(memento);
            System.out.println("state 1=" + originator.getState());
        }
        memento = careTaker.get();
        if (memento != null) {
            originator.getStateFromMemento(memento);
            System.out.println("state 2=" + originator.getState());
        }
    }
}
