package com.demo.zejun.repodesignpattern.creationalpattern.abstractfactorypattern;

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
