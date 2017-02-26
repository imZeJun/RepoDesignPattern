package com.demo.zejun.repodesignpattern.facadepattern;

public class FacedePatternSimulator {
    public static void run() {
        DuckFacade duckFacade = new DuckFacade();
        duckFacade.dance();
    }
}
