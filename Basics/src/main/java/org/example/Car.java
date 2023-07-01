package org.example;

public class Car {

        int noOfSeats;
        String color;
        int maxSpeedKMH;

        //default constructor
        Car(){
            this.noOfSeats = 4;
            this.color = "Red";
            this.maxSpeedKMH = 120;
        }

        //parameterised constructor
        Car(int noOfSeats, String color, int maxSpeedKMH){
            this.noOfSeats = noOfSeats;
            this.color = color;
            this.maxSpeedKMH = maxSpeedKMH;
        }

    @Override
    public String toString() {
        return String.format("Your car has a maximum speed of %d km/h with %d seats and is %s in color.",maxSpeedKMH, noOfSeats, color);
    }

    public static void main(String[]args){
            //init constructor and create an instance of class Car
            Car myCar = new Car();
            System.out.println(myCar);
        }
}
