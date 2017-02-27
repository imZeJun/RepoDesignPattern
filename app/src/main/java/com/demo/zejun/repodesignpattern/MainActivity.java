package com.demo.zejun.repodesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.demo.zejun.repodesignpattern.behavioralpattern.chainofresponsibilitypattern.ChainOfResponsibilityPatternSimulator;
import com.demo.zejun.repodesignpattern.behavioralpattern.commandpattern.CommandPatternSimulator;
import com.demo.zejun.repodesignpattern.behavioralpattern.mediatorpattern.MediatorPatternSimulator;
import com.demo.zejun.repodesignpattern.behavioralpattern.mementopattern.MementoPatternSimulator;
import com.demo.zejun.repodesignpattern.behavioralpattern.statepattern.StatePatternSimulator;
import com.demo.zejun.repodesignpattern.creationalpattern.abstractfactorypattern.AbstractFactoryPatternSimulator;
import com.demo.zejun.repodesignpattern.creationalpattern.prototypepattern.PrototypeSimulator;
import com.demo.zejun.repodesignpattern.structuralpattern.adapterpattern.AdapterPattenSimulator;
import com.demo.zejun.repodesignpattern.creationalpattern.builderpattern.BuilderPatternSimulator;
import com.demo.zejun.repodesignpattern.structuralpattern.bridgepattern.BridgePatternSimulator;
import com.demo.zejun.repodesignpattern.structuralpattern.compositepattern.CompositeSimulator;
import com.demo.zejun.repodesignpattern.structuralpattern.decoratorpattern.DecoratorPatternSimulator;
import com.demo.zejun.repodesignpattern.creationalpattern.factorypattern.FactoryPatternSimulator;
import com.demo.zejun.repodesignpattern.behavioralpattern.iteratorpattern.IteratorPattermSimulator;
import com.demo.zejun.repodesignpattern.behavioralpattern.observerpattern.ObserverPatternSimulator;
import com.demo.zejun.repodesignpattern.creationalpattern.simplefactorypattern.SimpleFactoryPatternSimulator;
import com.demo.zejun.repodesignpattern.behavioralpattern.strategypattern.StrategyPatternSimulator;
import com.demo.zejun.repodesignpattern.behavioralpattern.templatemethodpattern.TemplateMethodPatternSimulator;
import com.demo.zejun.repodesignpattern.structuralpattern.flyweightpattern.FlyweightPatternSimulator;
import com.demo.zejun.repodesignpattern.structuralpattern.proxypattern.ProxyPatternSimulator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void strategyPattern(View view) {
        StrategyPatternSimulator.run();
    }

    public void observerPattern(View view) {
        ObserverPatternSimulator.run();
    }

    public void decoratorPattern(View view) {
        DecoratorPatternSimulator.run();
    }

    public void simpleFactoryPattern(View view) {
        SimpleFactoryPatternSimulator.run();
    }

    public void factoryPattern(View view) {
        FactoryPatternSimulator.run();
    }

    public void abstractFactoryPattern(View view) {
        AbstractFactoryPatternSimulator.run();
    }

    public void adapterPattern(View view) {
        AdapterPattenSimulator.run();
    }

    public void facadePattern(View view) {
        FactoryPatternSimulator.run();
    }

    public void templateMethodPattern(View view) {
        TemplateMethodPatternSimulator.run();
    }

    public void iteratorPattern(View view) {
        IteratorPattermSimulator.run();
    }

    public void builderPattern(View view) {
        BuilderPatternSimulator.run();
    }

    public void prototypePattern(View view) {
        PrototypeSimulator.run();
    }

    public void proxyPattern(View view) {
        ProxyPatternSimulator.run();
    }

    public void bridgePattern(View view) {
        BridgePatternSimulator.run();
    }

    public void compositePattern(View view) {
        CompositeSimulator.run();
    }

    public void flyweightPattern(View view) {
        FlyweightPatternSimulator.run();
    }

    public void chainOfResponsibilityPattern(View view) {
        ChainOfResponsibilityPatternSimulator.run();
    }

    public void commandPattern(View view) {
        CommandPatternSimulator.run();
    }

    public void mementoPattern(View view) {
        MementoPatternSimulator.run();
    }

    public void mediatorPattern(View view) {
        MediatorPatternSimulator.run();
    }

    public void statePattern(View view) {
        StatePatternSimulator.run();
    }
}
