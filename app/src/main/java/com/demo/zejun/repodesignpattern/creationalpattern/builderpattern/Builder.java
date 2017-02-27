package com.demo.zejun.repodesignpattern.creationalpattern.builderpattern;


public interface Builder {
    public void addAMaterials(String materials);
    public void addBMaterials(String materials);
    public Product getProduct();
}
