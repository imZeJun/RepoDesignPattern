package com.demo.zejun.repodesignpattern.behavioralpattern.commandpattern;

public class CommandPatternSimulator {
    public static void run() {
        Invoker invoker = new Invoker();
        invoker.setCommand(new ConcreteCommand(new ConcreteReceiver()));
        invoker.action();
    }
}
