package com.demo.zejun.repodesignpattern.factorypattern;

import com.demo.zejun.repodesignpattern.simplefactorypattern.Duck;

public abstract class CommonDuckFamily {

    public void perform() {
        Duck duck = createDuck();
        duck.sing();
        duck.dance();
    }

    public abstract Duck createDuck();

}
