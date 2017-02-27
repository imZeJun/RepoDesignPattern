package com.demo.zejun.repodesignpattern.creationalpattern.builderpattern;


public class Product {

    private String mPartA;
    private String mPartB;

    public Product(String partA, String partB) {
        mPartA = partA;
        mPartB = partB;
    }

    public String getmPartA() {
        return mPartA;
    }

    public String getmPartB() {
        return mPartB;
    }
}
