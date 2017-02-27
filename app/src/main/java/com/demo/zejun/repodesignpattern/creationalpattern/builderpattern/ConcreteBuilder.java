package com.demo.zejun.repodesignpattern.creationalpattern.builderpattern;


public class ConcreteBuilder implements Builder {

    private String mProductAPart;
    private String mProductBPart;

    @Override
    public void addAMaterials(String materials) {
        mProductAPart = materials + "with blue color";
    }

    @Override
    public void addBMaterials(String materials) {
        mProductBPart = materials + "with red color";
    }

    @Override
    public Product getProduct() {
        return new Product(mProductAPart, mProductBPart);
    }
}
