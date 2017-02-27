package com.demo.zejun.repodesignpattern.creationalpattern.factorypattern;

import com.demo.zejun.repodesignpattern.creationalpattern.simplefactorypattern.Duck;

public class LaoWangDuckFamily extends CommonDuckFamily{

    @Override
    public Duck createDuck() {
        return new LaoWangDuck();
    }
}
