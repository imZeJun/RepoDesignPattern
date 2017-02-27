package com.demo.zejun.repodesignpattern.structuralpattern.proxypattern;

public class ProxySubject implements Subject {

    private Subject mSubject;

    public ProxySubject(Subject subject) {
        mSubject = subject;
    }

    @Override
    public void operation() {
        mSubject.operation();
    }
}
