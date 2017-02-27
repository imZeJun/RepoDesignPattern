package com.demo.zejun.repodesignpattern.structuralpattern.facadepattern;

public class FacedePatternSimulator {
    public static void run() {
        DuckFacade duckFacade = new DuckFacade();
        duckFacade.dance();
    }
}
