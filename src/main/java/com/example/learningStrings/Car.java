package com.example.learningStrings;

public class Car {


    //Data Members
    private int horsePower;
    private int wheelNum;
    private String color;
    private String model;
    private String make;
    private int year;
    private int topSpeed;

    public Car(int horsePower, int wheelNum, String color, String model, String make, int year, int topSpeed) {
        this.horsePower = horsePower;
        this.wheelNum = wheelNum;
        this.color = color;
        this.model = model;
        this.make = make;
        this.year = year;
        this.topSpeed = topSpeed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }


    public int getWheelNum() {
        return wheelNum;
    }

    public void setWheelNum(int wheelNum) {
        this.wheelNum = wheelNum;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

}
