package model;

public class FreeRoom extends Room{
    public FreeRoom(String roomNumber, RoomType roomType){ super(roomNumber, roomType, (double) 0);}

    @Override
    public final String toString(){return super.toString();}



}
