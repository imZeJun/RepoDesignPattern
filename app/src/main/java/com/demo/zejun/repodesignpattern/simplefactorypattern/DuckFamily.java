package com.demo.zejun.repodesignpattern.simplefactorypattern;

public class DuckFamily {

    public static final String MONDAY = "MONDAY";
    public static final String FRIDAY = "FRIDAY";

    public void perform(String day) {
        DuckFactory duckFactory = new DuckFactory();
        Duck duck = duckFactory.createDuck(day);
        duck.dance();
        duck.sing();
    }
}
