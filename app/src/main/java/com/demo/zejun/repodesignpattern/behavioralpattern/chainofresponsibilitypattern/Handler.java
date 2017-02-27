package com.demo.zejun.repodesignpattern.behavioralpattern.chainofresponsibilitypattern;

public abstract class Handler {

    protected Handler mSuccessor;

    public abstract void handleRequest(int status);

    public void setSuccessor(Handler successor) {
        mSuccessor = successor;
    }

}
