package com.demo.zejun.repodesignpattern.behavioralpattern.chainofresponsibilitypattern;

public class ConcreteHandlerA extends Handler{

    @Override
    public void handleRequest(int status) {
        if (status <= 1 || mSuccessor == null) {
            System.out.println("ConcreteHandlerA handleRequest");
        } else {
            mSuccessor.handleRequest(status);
        }
    }
}
