package com.demo.zejun.repodesignpattern.behavioralpattern.commandpattern;

public class ConcreteReceiver implements Receiver {

    @Override
    public void action() {
        System.out.println("ConcreteReceiver");
    }
}
