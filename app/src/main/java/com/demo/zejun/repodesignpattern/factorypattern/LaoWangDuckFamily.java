package com.demo.zejun.repodesignpattern.factorypattern;

import com.demo.zejun.repodesignpattern.simplefactorypattern.Duck;

public class LaoWangDuckFamily extends CommonDuckFamily{

    @Override
    public Duck createDuck() {
        return new LaoWangDuck();
    }
}
