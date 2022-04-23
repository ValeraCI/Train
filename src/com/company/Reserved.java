package com.company;

public class Reserved extends Van{
    public  Reserved() {
        super(54, 54, 12, "Плацкартный вагон");
    }
    @Override
    public String toString(){
        return "Плацкартный вагон:\nМест для пассажиров: " + getNumberOfSeats() + "\tКоличество вместимого багажа: " + getAmountOfLuggage() +
                "\tУровень комфорта: " + getComfortLevel();
    }
}
