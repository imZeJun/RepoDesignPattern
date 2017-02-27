package com.demo.zejun.repodesignpattern.creationalpattern.factorypattern;

import com.demo.zejun.repodesignpattern.creationalpattern.simplefactorypattern.Duck;

public abstract class CommonDuckFamily {

    public void perform() {
        Duck duck = createDuck();
        duck.sing();
        duck.dance();
    }

    public abstract Duck createDuck();

}
