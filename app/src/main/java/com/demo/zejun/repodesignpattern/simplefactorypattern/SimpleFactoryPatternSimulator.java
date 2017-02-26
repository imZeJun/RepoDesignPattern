package com.demo.zejun.repodesignpattern.simplefactorypattern;

public class SimpleFactoryPatternSimulator {

    public static void run() {
        DuckFamily duckFamily = new DuckFamily();
        duckFamily.perform(DuckFamily.MONDAY);
        duckFamily.perform(DuckFamily.FRIDAY);
    }
}
