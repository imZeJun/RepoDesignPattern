package com.demo.zejun.repodesignpattern.factorypattern;

public class FactoryPatternSimulator {

    public static void run() {
        CommonDuckFamily commonDuckFamily = new LaoWangDuckFamily();
        commonDuckFamily.perform();
    }
}
