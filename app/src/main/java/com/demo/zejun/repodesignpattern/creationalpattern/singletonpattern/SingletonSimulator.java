package com.demo.zejun.repodesignpattern.creationalpattern.singletonpattern;

public class SingletonSimulator {

    public static void run() {
        Singleton aSingleton = Singleton.getInstance();
        Singleton bSingleton = Singleton.getInstance();
        System.out.println("equals=" + (aSingleton == bSingleton));
    }
}
