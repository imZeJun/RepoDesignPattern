package com.demo.zejun.repodesignpattern.creationalpattern.singletonpattern;


public class Singleton {

    public static Singleton getInstance() {
        return Nested.singleton;
    }

    private Singleton() {}

    private static class Nested {
        public static Singleton singleton = new Singleton();
    }
}
