package com.company;

public class Baggage  extends Van{
    public Baggage() {
        super(4, 80, 4, "Багажный вагон");
    }
    @Override
    public String toString(){
        return "Багажный вагон:\nМест для пассажиров: " + getNumberOfSeats() + "\tКоличество вместимого багажа: " + getAmountOfLuggage() +
                "\tУровень комфорта: " + getComfortLevel();
    }
}
