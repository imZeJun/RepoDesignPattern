package com.demo.zejun.repodesignpattern.behavioralpattern.mediatorpattern;

public abstract class Colleague {

    private Mediator mMediator;

    public void setMediator(Mediator mMediator) {
        this.mMediator = mMediator;
    }

    public Mediator getMediator() {
        return mMediator;
    }

    public abstract void change(int state);

    public abstract void operation(String message);

}
