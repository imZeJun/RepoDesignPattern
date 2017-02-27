package com.demo.zejun.repodesignpattern.behavioralpattern.statepattern;

public class FreeRoomState extends RoomState {

    public FreeRoomState(Room room) {
        super(room);
    }

    @Override
    public void checkIn() {
        mRoom.setRoomState(mRoom.getFull());
        System.out.println("checkIn success");
    }

    @Override
    public void checkOut() {
        System.out.println("Room is free, can not checkOut");
    }
}
