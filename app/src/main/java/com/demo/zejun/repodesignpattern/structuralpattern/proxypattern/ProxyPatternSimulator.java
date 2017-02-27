package com.demo.zejun.repodesignpattern.structuralpattern.proxypattern;


public class ProxyPatternSimulator {

    public static void run() {
        Subject proxy = new ProxySubject(new RealSubject());
        proxy.operation();
    }
}
