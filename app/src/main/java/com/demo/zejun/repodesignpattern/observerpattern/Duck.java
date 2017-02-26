package com.demo.zejun.repodesignpattern.observerpattern;

class Duck implements DuckObserver {

    @Override
    public void onReceive(String message) {
        switch (message) {
            case DuckBroadcastStation.MONEY_MSG:
                System.out.println("I have money, I can buy something");
                break;
            case DuckBroadcastStation.FOOD_MSG:
                System.out.println("I have food, I can eat something");
                break;
            default:
                break;
        }
    }
}
