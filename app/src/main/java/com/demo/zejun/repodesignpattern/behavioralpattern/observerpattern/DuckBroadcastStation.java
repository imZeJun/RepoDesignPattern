package com.demo.zejun.repodesignpattern.behavioralpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

class DuckBroadcastStation {

    public static final String MONEY_MSG = "money";
    public static final String FOOD_MSG = "food";


    private List<DuckObserver> mMoneyObservers = new ArrayList<>();
    private List<DuckObserver> mFoodObservers = new ArrayList<>();

    public void addFoodObserver(DuckObserver duckObserver) {
        mFoodObservers.add(duckObserver);
    }

    private void notifyFoodObserver() {
        for (DuckObserver duckObserver : mFoodObservers) {
            duckObserver.onReceive(FOOD_MSG);
        }
    }

    public void addMoneyObserver(DuckObserver duckObserver) {
        mMoneyObservers.add(duckObserver);
    }

    private void notifyMoneyObserver() {
        for (DuckObserver duckObserver : mMoneyObservers) {
            duckObserver.onReceive(MONEY_MSG);
        }
    }

    public void timeToDispatchMoney() {
        notifyMoneyObserver();
    }

    public void timeToDispatchFood() {
        notifyFoodObserver();
    }
}
