package com.company;

public class Compartment extends Van{
    public  Compartment() {
        super(36, 36, 20, "Вагон купе");
    }
    @Override
    public String toString(){
        return "Вагон купе:\nМест для пассажиров: " + getNumberOfSeats() + "\tКоличество вместимого багажа: " + getAmountOfLuggage() +
                "\tУровень комфорта: " + getComfortLevel();
    }
}
