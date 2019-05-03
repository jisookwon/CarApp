package com.company;

public class Car {
    private String color;
    private String carName;

    // default constructor
    public Car() {
    }

    // overloaded constructor
    public Car(String color, String carName) {
        setColor(color);
        this.carName = carName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String accelerating(){
        return " is accelerating";
    }

    public String starting(){
        return " is starting";
    }

    public String stopped(){
        return " is stopped";
    }

    public String setSpeed(int speed){
        return " is going " + speed + " mph";
    }
    public String displayText(){
        return "The " + getColor() + " " + getCarName();
    }
}
