package com.demo.zejun.repodesignpattern.structuralpattern.facadepattern;

public class DuckFacade {

    private DuckHead mDuckHead;
    private DuckFoot mDuckFoot;

    public DuckFacade() {
        mDuckHead = new DuckHead();
        mDuckFoot = new DuckFoot();
    }

    public void dance() {
        mDuckHead.rotate();
        mDuckFoot.run();
    }
}
