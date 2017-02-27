package com.demo.zejun.repodesignpattern.behavioralpattern.statepattern;

public class StatePatternSimulator {
    public static void run() {
        Room room = new Room();
        room.checkIn();
        room.checkIn();
        room.checkOut();
        room.checkOut();
    }
}
