package com.demo.zejun.repodesignpattern.adapterpattern;

public class AdapterPattenSimulator {

    public static void run() {
        Duck duck = new BlueDuck();
        DuckAdapter duckAdapter = new DuckAdapter(duck);
        duckAdapter.perform();
        Duck redDuck = new RedDuck();
        duckAdapter = new DuckAdapter(redDuck);
        duckAdapter.perform();
    }
}
