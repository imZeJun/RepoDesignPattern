package com.demo.zejun.repodesignpattern.creationalpattern.simplefactorypattern;

public class DuckFactory {

    public Duck createDuck(String day) {
        switch (day) {
            case DuckFamily.MONDAY:
                return new BlueDuck();
            case DuckFamily.FRIDAY:
                return new RedDuck();
            default:
                return new BlackDuck();
        }
    }
}
