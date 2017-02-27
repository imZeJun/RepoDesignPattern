package com.demo.zejun.repodesignpattern.behavioralpattern.statepattern;

public abstract class RoomState {

    protected Room mRoom;

    public RoomState(Room room) {
        mRoom = room;
    }

    public abstract void checkIn();
    public abstract void checkOut();

}
