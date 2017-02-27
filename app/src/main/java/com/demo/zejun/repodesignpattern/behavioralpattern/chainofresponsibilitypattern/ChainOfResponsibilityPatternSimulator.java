package com.demo.zejun.repodesignpattern.behavioralpattern.chainofresponsibilitypattern;

public class ChainOfResponsibilityPatternSimulator {

    public static void run() {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();
        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);
        handlerA.handleRequest(0);
        handlerA.handleRequest(1);
        handlerA.handleRequest(2);
    }


}
