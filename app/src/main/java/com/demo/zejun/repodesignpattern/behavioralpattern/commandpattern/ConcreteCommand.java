package com.demo.zejun.repodesignpattern.behavioralpattern.commandpattern;

public class ConcreteCommand implements Command{

    private Receiver mReceiver;

    public ConcreteCommand(Receiver receiver) {
        mReceiver = receiver;
    }

    @Override
    public void execute() {
        mReceiver.action();
    }
}
