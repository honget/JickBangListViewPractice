package com.example.jickbanglistviewpractice.datas;

import java.io.Serializable;

public class Room implements Serializable {

    private int deposit;
    private int monthlyRent;

    private  int floor;

    private String addr;

    private String roomType;
    private String roomInfo;

    private String imgSrc;

    public Room(int deposit, int monthlyRent, int floor, String addr, String roomType, String roomInfo, String imgSrc) {
        this.deposit = deposit;
        this.monthlyRent = monthlyRent;
        this.floor = floor;
        this.addr = addr;
        this.roomType = roomType;
        this.roomInfo = roomInfo;
        this.imgSrc = imgSrc;
    }

    public int getDeposit() {
        return deposit;
    }

    public int getMonthlyRent() {
        return monthlyRent;
    }

    public int getFloor() {
        return floor;
    }

    public String getAddr() {
        return addr;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getRoomInfo() {
        return roomInfo;
    }

    public String getImgSrc() {
        return imgSrc;
    }
}
