package com.demo.zejun.repodesignpattern.structuralpattern.proxypattern;

public class RealSubject implements Subject {

    @Override
    public void operation() {
        System.out.println("RealSubject operation");
    }
}
