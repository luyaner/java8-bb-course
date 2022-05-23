package com.yaner.lu.oo.exercise;

public class TestRoom {
    public static void main(String[] args) {
        Room room1 = new Room();
//        System.out.println(room1);
        System.out.println(room1.getDetails());
        Room room2 = new Room(1);
        System.out.println(room2.getDetails());
//        System.out.println("RoomNumber: " + room2.getRoomNumber());
        Room room3 = new Room(2, 100);
        System.out.println(room3.getDetails());
//        System.out.println("RoomNumber: " + room3.getRoomNumber() + ", RoomArea: " + room3.getRoomArea());
        Room room4 = new Room(3, 100, "Eastwood");
       System.out.println(room4.getDetails());
//        System.out.println("RoomNumber: " + room4.getRoomNumber() + ", RoomArea: " + room4.getRoomArea() + ", Address: " + room4.getAddress());
    }
}
