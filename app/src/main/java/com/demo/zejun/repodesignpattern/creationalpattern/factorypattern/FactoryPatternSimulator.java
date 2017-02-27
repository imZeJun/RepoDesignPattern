package com.demo.zejun.repodesignpattern.creationalpattern.factorypattern;

public class FactoryPatternSimulator {

    public static void run() {
        CommonDuckFamily commonDuckFamily = new LaoWangDuckFamily();
        commonDuckFamily.perform();
    }
}
