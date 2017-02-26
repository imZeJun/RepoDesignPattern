package com.demo.zejun.repodesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.demo.zejun.repodesignpattern.abstractfactorypattern.AbstractFactoryPatternSimulator;
import com.demo.zejun.repodesignpattern.adapterpattern.AdapterPattenSimulator;
import com.demo.zejun.repodesignpattern.decoratorpattern.DecoratorPatternSimulator;
import com.demo.zejun.repodesignpattern.factorypattern.FactoryPatternSimulator;
import com.demo.zejun.repodesignpattern.iteratorpattern.IteratorPattermSimulator;
import com.demo.zejun.repodesignpattern.observerpattern.ObserverPatternSimulator;
import com.demo.zejun.repodesignpattern.simplefactorypattern.SimpleFactoryPatternSimulator;
import com.demo.zejun.repodesignpattern.strategypattern.StrategyPatternSimulator;
import com.demo.zejun.repodesignpattern.templatemethodpattern.TemplateMethodPatternSimulator;

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
}
