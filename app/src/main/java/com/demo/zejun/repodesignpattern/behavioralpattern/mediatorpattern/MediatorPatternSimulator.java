package com.demo.zejun.repodesignpattern.behavioralpattern.mediatorpattern;

public class MediatorPatternSimulator {
    public static void run() {
        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA();
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB();
        Mediator mediator = new Mediator(concreteColleagueA, concreteColleagueB);
        concreteColleagueA.setMediator(mediator);
        concreteColleagueB.setMediator(mediator);
        concreteColleagueA.change(2);
        concreteColleagueB.change(1);
    }
}
