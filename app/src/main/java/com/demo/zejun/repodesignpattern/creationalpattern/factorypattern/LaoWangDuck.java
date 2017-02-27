package com.demo.zejun.repodesignpattern.creationalpattern.factorypattern;

import com.demo.zejun.repodesignpattern.creationalpattern.simplefactorypattern.Duck;

public class LaoWangDuck extends Duck{

    @Override
    public void sing() {
        System.out.println("LaoWangDuck sing");
    }

    @Override
    public void dance() {
        System.out.println("LaoWangDuck dance");
    }
}
