package model;

public class Room implements IRoom{
        private String roomNumber;
        private Double price;
        private RoomType roomType;
        private boolean isFree;

        @Override
        public String getRoomNumber(){
                return roomNumber;
        }

        @Override
        public Double getRoomPrice(){
                return price;
        }

        @Override
        public RoomType getRoomType(){
                return roomType;
        }

        @Override
        public boolean isFree(){
                return isFree;
        }

        @Override
        public String toString(){
                return "Room{" +
                "roomNumber='" + roomNumber +
                        ", roomPrice=" + price +
                        ", roomType=" + roomType +
                        ", isFree=" + isFree +
                        '}';
        }
}
