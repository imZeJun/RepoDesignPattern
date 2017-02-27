package com.demo.zejun.repodesignpattern.behavioralpattern.mediatorpattern;

public class ConcreteColleagueB extends Colleague {

    @Override
    public void change(int state) {
        getMediator().onColleagueBChanged(state);
    }

    @Override
    public void operation(String message) {
        System.out.println("ConcreteColleagueA received=" + message);
    }
}
