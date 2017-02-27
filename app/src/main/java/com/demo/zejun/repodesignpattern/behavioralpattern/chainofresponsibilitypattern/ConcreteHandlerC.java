package com.demo.zejun.repodesignpattern.behavioralpattern.chainofresponsibilitypattern;

public class ConcreteHandlerC extends Handler {

    @Override
    public void handleRequest(int status) {
        if (status <= 2 || mSuccessor == null) {
            System.out.println("ConcreteHandlerA handleRequest");
        } else {
            mSuccessor.handleRequest(status);
        }
    }
}
