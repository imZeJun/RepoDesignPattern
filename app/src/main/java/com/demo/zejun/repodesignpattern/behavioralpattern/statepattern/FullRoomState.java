package com.demo.zejun.repodesignpattern.behavioralpattern.statepattern;

public class FullRoomState extends RoomState {

    public FullRoomState(Room room) {
        super(room);
    }

    @Override
    public void checkIn() {
        System.out.println("Room is full");
    }

    @Override
    public void checkOut() {
        mRoom.setRoomState(mRoom.getFree());
        System.out.println("checkOut success");
    }
}
