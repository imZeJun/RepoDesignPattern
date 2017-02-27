package com.demo.zejun.repodesignpattern.behavioralpattern.statepattern;

public class Room {

    private RoomState mFreeState;
    private RoomState mFullState;
    private RoomState mRoomState;

    public Room() {
        mFreeState = new FreeRoomState(this);
        mFullState = new FullRoomState(this);
        mRoomState = mFreeState;
    }

    public void checkIn() {
        mRoomState.checkIn();
    }

    public void checkOut() {
        mRoomState.checkOut();
    }

    public RoomState getFree() {
        return mFreeState;
    }

    public RoomState getFull() {
        return mFullState;
    }

    public void setRoomState(RoomState roomState) {
        mRoomState = roomState;
    }
}
