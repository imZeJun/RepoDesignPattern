package com.demo.zejun.repodesignpattern.abstractfactorypattern;

public class LaoWangClothesFactory implements ClothesFactory {

    @Override
    public Dress createDress() {
        return new BlueDress();
    }

    @Override
    public Hat createHat() {
        return new BlueHat();
    }
}
