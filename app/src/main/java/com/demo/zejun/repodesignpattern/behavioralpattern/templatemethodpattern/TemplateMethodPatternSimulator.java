package com.demo.zejun.repodesignpattern.behavioralpattern.templatemethodpattern;

public class TemplateMethodPatternSimulator {
    public static void run() {
        Duck blueDuck = new BlueDuck();
        blueDuck.performShow();
        Duck whiteDuck = new WhiteDuck();
        whiteDuck.performShow();
    }
}
