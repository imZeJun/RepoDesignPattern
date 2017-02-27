package com.demo.zejun.repodesignpattern.creationalpattern.builderpattern;


public class Director {

    private Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public Product createProduct(String aPartMaterials, String bPartMaterials) {
        mBuilder.addAMaterials(aPartMaterials);
        mBuilder.addAMaterials(bPartMaterials);
        return mBuilder.getProduct();
    }
}
