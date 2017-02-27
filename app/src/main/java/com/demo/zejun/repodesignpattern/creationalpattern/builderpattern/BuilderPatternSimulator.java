package com.demo.zejun.repodesignpattern.creationalpattern.builderpattern;

public class BuilderPatternSimulator {

    public static void run() {
        Builder builder = new ConcreteBuilder();
        builder.addAMaterials("Iron");
        builder.addBMaterials("Wood");
        Product product = builder.getProduct();
        System.out.print("Product APart=" + product.getmPartA() + ",BPart=" + product.getmPartB());
    }
}
