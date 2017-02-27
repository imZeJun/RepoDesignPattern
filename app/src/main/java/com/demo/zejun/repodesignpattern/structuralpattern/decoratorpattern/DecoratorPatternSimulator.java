package com.demo.zejun.repodesignpattern.structuralpattern.decoratorpattern;

public class DecoratorPatternSimulator {

    public static void run() {
        //带着红帽子的蓝鸭子。
        Duck blueDuckWearRedHat = new BlueDuck();
        blueDuckWearRedHat = new RedHat(blueDuckWearRedHat);
        System.out.println("Des=" + blueDuckWearRedHat.getDescription() + ",getCost=" + blueDuckWearRedHat.getCost());
        //带着红帽子，穿着红裙子的蓝鸭子。
        Duck blueDuckWearRedHatDress = new BlueDuck();
        blueDuckWearRedHatDress = new RedHat(blueDuckWearRedHatDress);
        blueDuckWearRedHatDress = new RedDress(blueDuckWearRedHatDress);
        System.out.println("Des=" + blueDuckWearRedHatDress.getDescription() + ",getCost=" + blueDuckWearRedHatDress.getCost());
    }
}
