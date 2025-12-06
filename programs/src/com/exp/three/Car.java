package com.exp.three;

public class Car {
    String make;
    String color;

    public Car(String color, String make){
        this.make = make;
        this.color = color;
    }

    public String start(){
        return "The " + color + " " + make + " car is starting.";
    }

    static void main() {
        Car car1 = new Car("Red", "Skoda");
        Car car2 = new Car("White", "Toyota");

        System.out.println(car1.start());
        System.out.println(car2.start());
    }
}
