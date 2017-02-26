package com.demo.zejun.repodesignpattern.abstractfactorypattern;

public class Duck {

    private Hat mHat;
    private Dress mDress;

    public Hat getHat() {
        return mHat;
    }

    public void setHat(Hat mHat) {
        this.mHat = mHat;
    }

    public Dress getDress() {
        return mDress;
    }

    public void setDress(Dress mDress) {
        this.mDress = mDress;
    }
}
