package com.demo.zejun.repodesignpattern.behavioralpattern.mediatorpattern;


public class ConcreteColleagueA extends Colleague{

    @Override
    public void change(int state) {
        getMediator().onColleagueAChanged(state);
    }

    @Override
    public void operation(String message) {
        System.out.println("ConcreteColleagueA received=" + message);
    }
}
