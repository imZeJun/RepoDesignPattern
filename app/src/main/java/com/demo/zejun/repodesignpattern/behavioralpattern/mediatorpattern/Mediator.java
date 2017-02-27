package com.demo.zejun.repodesignpattern.behavioralpattern.mediatorpattern;

public class Mediator {

    private ConcreteColleagueA mConcreteColleagueA;
    private ConcreteColleagueB mConcreteColleagueB;

    public Mediator(ConcreteColleagueA concreteColleagueA, ConcreteColleagueB concreteColleagueB) {
        mConcreteColleagueA = concreteColleagueA;
        mConcreteColleagueB = concreteColleagueB;
    }

    public void onColleagueAChanged(int state) {
        mConcreteColleagueB.operation(String.valueOf(state));
    }

    public void onColleagueBChanged(int state) {
        mConcreteColleagueA.operation(String.valueOf(state));
    }
}
