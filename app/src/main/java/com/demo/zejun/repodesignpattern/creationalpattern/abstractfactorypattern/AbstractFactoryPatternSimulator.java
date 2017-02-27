package com.demo.zejun.repodesignpattern.creationalpattern.abstractfactorypattern;

public class AbstractFactoryPatternSimulator {
    public static void run() {
        ClothesFactory clothesFactory = new LaoWangClothesFactory();
        Duck duck = new Duck();
        duck.setDress(clothesFactory.createDress());
        duck.setHat(clothesFactory.createHat());
        System.out.println("Duck dress=" + duck.getDress().getName() + ",hat=" + duck.getHat().getName());
    }
}
