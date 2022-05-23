package com.yaner.lu.oo.exercise;

public class Room {
    private int roomNumber;
    private int roomArea;
    private String address;

    public String getDetails() {
        return "room number: " + roomNumber
                + " room area: " + roomArea
                + " address: " + address;
    }

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Room(int roomNumber, int roomArea) {
        this(roomNumber);
        this.roomArea = roomArea;
    }

    public Room(int roomNumber, int roomArea, String address) {
        this(roomNumber, roomArea);
        this.address = address;
    }

    public Room() {
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(int roomArea) {
        this.roomArea = roomArea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}