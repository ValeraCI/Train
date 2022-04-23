package com.company;

public class VIP extends Van{
    public VIP() {
        super(10, 10, 50, "VIP вагон");
    }
    @Override
    public String toString(){
        return "VIP вагон:\nМест для пассажиров: " + getNumberOfSeats() + "\tКоличество вместимого багажа: " + getAmountOfLuggage() +
                "\tУровень комфорта: " + getComfortLevel();
    }
}
