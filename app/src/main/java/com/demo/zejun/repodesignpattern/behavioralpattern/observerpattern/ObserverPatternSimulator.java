package com.demo.zejun.repodesignpattern.behavioralpattern.observerpattern;

public class ObserverPatternSimulator {

    public static void run() {
        DuckBroadcastStation station = new DuckBroadcastStation();
        Duck moneyDuck = new Duck();
        Duck foodDuck = new Duck();
        station.addMoneyObserver(moneyDuck);
        station.addFoodObserver(foodDuck);
        station.timeToDispatchFood();
        station.timeToDispatchMoney();
    }
}
